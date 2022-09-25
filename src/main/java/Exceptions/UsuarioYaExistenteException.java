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
public class UsuarioYaExistenteException extends Exception{
    
    public UsuarioYaExistenteException(){
        super("El usuario que desea ingresar ya existe.");
    }
}
