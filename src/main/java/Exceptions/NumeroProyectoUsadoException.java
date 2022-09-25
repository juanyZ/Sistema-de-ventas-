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
public class NumeroProyectoUsadoException extends Exception{
    
    public NumeroProyectoUsadoException(){
        super("El numero de proyecto ya ha sido utilizado.");
    }
}
