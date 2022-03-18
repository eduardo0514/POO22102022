/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libro;


import Componentes.Autor;
import Componentes.Editorial;
/**
 *
 * @author lenovo
 */
public class Libro {
    private String tituloLibro;
    private Autor aautor; 
    private Editorial eeditorial;

    public Libro() {
    }

    public Libro(String tituloLibro, Autor aautor, Editorial eeditorial) {
        this.tituloLibro = tituloLibro;
        this.aautor = aautor;
        this.eeditorial = eeditorial;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public Autor getAautor() {
        return aautor;
    }

    public void setAautor(Autor aautor) {
        this.aautor = aautor;
    }

    public Editorial getEeditorial() {
        return eeditorial;
    }

    public void setEeditorial(Editorial eeditorial) {
        this.eeditorial = eeditorial;
    }

    public void abrir(){
        System.out.println("Abriendo libro...");
    }

    @Override
    public String toString() {
        return "Libro{" + "tituloLibro=" + tituloLibro + ", aautor=" + aautor + ", eeditorial=" + eeditorial + '}';
    }
     
    
   
}
