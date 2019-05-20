package br.edu.qi.dao;

import java.util.ArrayList;

import br.edu.qi.dto.Carro;

public class ConcessionariaDao {

	private static ConcessionariaDao instance = null;

	private ArrayList<Carro> carros = new ArrayList<Carro>();

	private ConcessionariaDao() {}

	public ArrayList<Carro> getCarros() {
		
		return this.carros;
		
	}

	public boolean gravar(Carro obj) throws Exception {

		return carros.add(obj);

	}

	public static ConcessionariaDao getInstante() {

		if (instance == null) {
			instance = new ConcessionariaDao();
		}
		return instance;
	}
}
