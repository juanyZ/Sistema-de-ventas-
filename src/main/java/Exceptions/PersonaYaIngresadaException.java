/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author dagyus
 */
public class PersonaYaIngresadaException extends Exception{
    public PersonaYaIngresadaException(){
        super("La persona ya fue ingresada.");
    }
}
