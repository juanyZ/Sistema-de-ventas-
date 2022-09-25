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
public class NoSeleccionoPermisosException extends Exception{
    
    public NoSeleccionoPermisosException(){
        super("No seleccionó ningún permiso asociado a este usuario.");
    }
}
