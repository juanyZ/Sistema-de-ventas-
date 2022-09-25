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
public class ActividadNoEncontradaException extends Exception{
    
    public ActividadNoEncontradaException(){
        super("Actividad no encontrada.\nContactese con administrador.");
    }
}
