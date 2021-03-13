package matematica;

import jakarta.xml.ws.Endpoint;

public class CalculadoraService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint endPoint = Endpoint.publish("http://localhost:8080/Calculadora", new Calculadora());
	}

}
