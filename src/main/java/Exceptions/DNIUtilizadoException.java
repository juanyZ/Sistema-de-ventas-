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
public class DNIUtilizadoException extends Exception{
    public DNIUtilizadoException(){
        super("El DNI ya fue cargado anteriormente.");
    } 
}
