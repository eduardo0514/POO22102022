/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composicion;
import Componentes.Autor;
import Componentes.Editorial;
import libro.Libro;
/**
 *
 * @author lenovo
 */
public class Composicion {
    public static void main(String[] args) {
    
   Libro libro=new Libro();
        libro.setTituloLibro("cien años de soledad");
        libro.setAautor(new Autor("Gabriel García Márquez", 87));
        libro.setEeditorial(new Editorial("Textosmexicanos", 2020));
        
        System.out.println(libro);
    }
   
   
   
   
}
