package br.edu.qi.service;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.edu.qi.dao.ConcessionariaDao;
import br.edu.qi.dto.Carro;

@WebService(endpointInterface = "br.edu.qi.service.IConcessionariaDao")
public class ConcessionariaWs implements IConcessionariaDao {

	public ConcessionariaWs() {};

	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Override
	public boolean gravar(String nome, String marca, String modelo, String placa, float preco, String montadora,
			String status) {

		try {

			Carro carro = new Carro(nome, marca, modelo, placa, preco, montadora, status);
			ConcessionariaDao dao = ConcessionariaDao.getInstante();
			return dao.gravar(carro);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Override
	public boolean vender(String placa) {

		try {

			List<Carro> carros = ConcessionariaDao.getInstante().getCarros();

			for (Carro carro : carros) {
				if (placa.equals(carro.getPlaca())) {
					if (("disponivel").equals(carro.getStatus())) {
						carro.setStatus("indisponivel");
						System.out.println(carro.getStatus());
						return true;
					}

				}
			}

			return false;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Override
	public void consultar(String consulta) {

		List<Carro> carros = ConcessionariaDao.getInstante().getCarros();

		for (Carro carro : carros) {
			if (consulta.equals(carro.getMarca()) || consulta.equals(carro.getModelo())) {
				System.out
						.println("Preço: " + String.format("%.2f", carro.getPreco()) + " Status: " + carro.getStatus());
			}

		}
	}
}
