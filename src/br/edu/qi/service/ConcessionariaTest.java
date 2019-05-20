package br.edu.qi.service;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class ConcessionariaTest {

	public static void main(String[] args) {
		try {

			URL url = new URL("http://localhost:8080/concessionariaWS?wsdl");
			QName qname = new QName("http://service.qi.edu.br/", "ConcessionariaWsService");
			Service ws = Service.create(url, qname);
			IConcessionariaDao ConcessionariaWs = ws.getPort(IConcessionariaDao.class);
			
			ConcessionariaWs.gravar("Gol", "Volks", "1000", "ILX1566", (float) 15000.23, "Vagem", "disponivel");
			
			ConcessionariaWs.gravar("Corsa", "Chev", "GL", "ILX7944", (float) 16587.23, "Gravataí", "disponivel");
			
			ConcessionariaWs.vender("ILX1566");
			
			ConcessionariaWs.consultar("Volks");
			
			ConcessionariaWs.consultar("GL");
						
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
