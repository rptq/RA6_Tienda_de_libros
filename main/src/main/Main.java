/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.*;
import model.*;

/**
 *
 * @author robert terol
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static ArrayList <Book> libros = new ArrayList();
    public static HashMap<String, Book> bookInventory = new HashMap<>();
    
    public static void main(String[] args) {
        
            menu();
        
    }
    
    public static void menu(){
        
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("""
                               1- Crear libro
                               2- Actualizar libro
                               3- Eliminar libro
                               
                               0- Salir""");
            
            switch (sc.nextLine()) {
                case "1":
                    createBook();
                    break;
                    
                case "2":

                    break;
                    
                case "3":

                    break;
                    
                case "0":
                    break;
                default:
                    throw new AssertionError();
            }
        }while (sc.nextLine().equals("0"));
    }
    
    public static void createBook(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola como se llama tu libro");
        String title = sc.nextLine();
        System.out.println("Hola cual es el precio del libro en euros ");
        double price = sc.nextDouble();
        System.out.println("Hola cuantos libros tienes");
        int amount = sc.nextInt();
        System.out.println("Cual es el isbn?");
        String isbn = sc.nextLine();
        
        Book bk = new Book(title, price, amount);
        
        //iterador con un while next arraylist comparar todos 
        boolean exists = true;
        Iterator it = bookInventory.keySet().iterator();

        while (it.hasNext()) {
        
        if (it.next().equals(bk)) {
            exists = true;
            break;
        }
        else{
        exists = false;
        
        }
        
        }
        
        if (!exists) {
        System.out.println("El libro ya existe");  
        }
        else{
        libros.add(bk);
        bookInventory.put(isbn, bk);
        updatefile
        }
    }
    
}
