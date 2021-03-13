package matematica;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;

@WebService 
public class Calculadora {

	@WebMethod(operationName = "sumarWS")
	public int sumar(@WebParam(name = "primerValorSuma") int primerEnteroSuma,@WebParam(name = "segundoValorSuma") int segundoEnteroSuma) {
		return primerEnteroSuma+segundoEnteroSuma;
	}
	
	@WebMethod(operationName = "restarWS")
	public int restar(@WebParam(name = "primerValorResta") int primerEnteroResta,@WebParam(name = "segundoValorResta") int segundoEnteroResta) {
		return primerEnteroResta-segundoEnteroResta;
	}
	
	@WebMethod(operationName = "multiplicarWS")
	public int multiplicar(@WebParam(name = "primerValorMultiplicar") int primerEnteroMultiplicar,@WebParam(name = "segundoValorMultiplicar") int segundoEnteroMultiplicar) {
		return primerEnteroMultiplicar*segundoEnteroMultiplicar;
	}
	
	@WebMethod(operationName = "dividirWS")
	public double dividir(@WebParam(name = "primerValorDividir") double primerEnteroDividir,@WebParam(name = "segundoValorDividir") double segundoEnteroDividir) {
		try{
			return primerEnteroDividir/segundoEnteroDividir;
		}
		catch(ArithmeticException e){
			return 0;
		}
	}
	
}
