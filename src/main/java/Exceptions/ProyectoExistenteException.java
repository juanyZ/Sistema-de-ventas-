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
public class ProyectoExistenteException extends Exception{
    
    public ProyectoExistenteException(){
        super("El proyecto ya existe.");
    }
}
