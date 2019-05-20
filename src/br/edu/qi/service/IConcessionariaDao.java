package br.edu.qi.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import br.edu.qi.dto.Carro;

@WebService
@SOAPBinding(style = Style.RPC)
public interface IConcessionariaDao {

	@WebMethod
	public boolean gravar(
		String 	nome,
		String 	marca, 
		String 	modelo, 
		String 	placa, 
		float 	preco,
		String	montadora,
		String 	status
	);

	@WebMethod
	public boolean vender(String placa);

	@WebMethod
	public void consultar(String consulta);
}
