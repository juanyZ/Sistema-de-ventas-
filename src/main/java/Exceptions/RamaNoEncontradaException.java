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
public class RamaNoEncontradaException extends Exception{
    
    public RamaNoEncontradaException(){
        super("Rama no encontrada.\nContactese con administrador.");
    }
}
