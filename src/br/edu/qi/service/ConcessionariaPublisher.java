package br.edu.qi.service;

import javax.xml.ws.Endpoint;
import br.edu.qi.service.ConcessionariaWs;

public class ConcessionariaPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/concessionariaWS", new ConcessionariaWs());
	}
}
