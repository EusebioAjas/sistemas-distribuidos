package org.me.calculator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author eusebioajas
 */
@WebService(serviceName = "CalculatorWS")
@Stateless()
public class CalculatorWS {

    @WebMethod(operationName = "add")
    public int add(@WebParam(name = "number1") int number1, @WebParam(name = "number2") int number2) {
	int result = number1 + number2;
	return result;
    }
}
