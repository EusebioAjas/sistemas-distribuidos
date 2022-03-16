
package org.me.calculator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para add complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="add">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="number1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="number2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "add", propOrder = {
    "number1",
    "number2"
})
public class Add {

    protected int number1;
    protected int number2;

    /**
     * Obtiene el valor de la propiedad number1.
     * 
     */
    public int getNumber1() {
        return number1;
    }

    /**
     * Define el valor de la propiedad number1.
     * 
     */
    public void setNumber1(int value) {
        this.number1 = value;
    }

    /**
     * Obtiene el valor de la propiedad number2.
     * 
     */
    public int getNumber2() {
        return number2;
    }

    /**
     * Define el valor de la propiedad number2.
     * 
     */
    public void setNumber2(int value) {
        this.number2 = value;
    }

}
