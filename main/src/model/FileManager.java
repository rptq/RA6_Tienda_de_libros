/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import javax.xml.transform.Source;

/**
 *
 * @author robert terol
 */
public class FileManager {
    
    
    public String mainrute = System.getProperty("user.dir");
    
    String separator = File.separator;
    
    String routefile = mainrute + separator + "archivopolla.txt";
    
    File archivo = new File(routefile);
    
    
    public static void initFiles(){
    archivo.createNewFile();
    }
    
    
}
