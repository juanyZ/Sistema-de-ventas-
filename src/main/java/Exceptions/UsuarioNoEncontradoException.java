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
public class UsuarioNoEncontradoException extends Exception{
    
    public UsuarioNoEncontradoException(){
        super("No se ha encontrado el usuario.");
    }
}
