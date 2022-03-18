/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes;

/**
 *
 * @author lenovo
 */
public class Editorial {
    private String nombre;
    private int anodepublicacion;

    public Editorial() {
    }

    public Editorial(String nombre, int anodepublicacion) {
        this.nombre = nombre;
        this.anodepublicacion = anodepublicacion;
    }

 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnodepublicacion() {
        return anodepublicacion;
    }

    public void setAnodepublicacion(int anodepublicacion) {
        this.anodepublicacion = anodepublicacion;
    }
    
   public void publicar(){
        System.out.println("Publicando titulo");
  }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", anodepublicacion=" + anodepublicacion + '}';
    }
  
  
    
}
