/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentahabiente;

/**
 *
 * @author lenovo
 */
public class PruebaEjemplo {
    
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Cuentahabiente[] cliente = new Cuentahabiente[5];
    cliente[0] = new Cuentahabiente(1405,"Malvaez Cruz", 80000);
    cliente[1] = new Cuentahabiente(2710, "Malvaez Alejandro", 60000);
    cliente[2] = new Cuentahabiente(2512, "Juarez Andrea", 64500);
    cliente[3] = new Cuentahabiente(5687, "Gonzalez Jose", 47800);
    cliente[4] = new Cuentahabiente(3469,"Martinez Jaime" , 35400);
    
    
    for (int i = 0; i < cliente.length; i++) {
    
    if(cliente[i].getBalance()<=50000){
        System.out.println("La cuenta de " +cliente[i]);
        System.out.println(" es REGULAR");  
    }else{
          System.out.println("La cuenta de " +cliente[i]);
          System.out.println(" es PREMIUM");
                }
   
    }
    }
}   
        
       