package Resources;


import java.io.File;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dagyus
 */
public class Utilities {
    
    public static void makeDirectory(String nombreDir){
        File file = new File(nombreDir);
        if (!file.exists()){
            file.mkdir();
        }
    }
    
    public static void copyFile(String filepath){
        File file = new File(filepath);
    }
}
