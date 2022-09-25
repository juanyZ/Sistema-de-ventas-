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
public class NombreProyectoUsadoException extends Exception{
    
    public NombreProyectoUsadoException(){
        super("El nombre de proyecto ya ha sido utilizado.");
    }
}
