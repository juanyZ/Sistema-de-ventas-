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
public class RolNoEncontradoException extends Exception{
    
    public RolNoEncontradoException(){
        super("Rol de usuario no encontrado.\nContactese con administrador.");
    }
}
