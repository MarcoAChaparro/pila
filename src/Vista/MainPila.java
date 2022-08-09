/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import datos.Productos;
import modelo.Operacionespila;
import modelo.Pila;

/**
 *
 * @author marco.chaparro
 */
public class MainPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pila<Productos> pilaP=new Pila<>();
        pilaP.apilar(new Productos("arroz", 2, 5000));
        pilaP.apilar(new Productos("frijol", 7, 3000));
        pilaP.apilar(new Productos("pan", 3, 4000));
        pilaP.apilar(new Productos("pollo", 2, 14500));
        pilaP.apilar(new Productos("cebolla", 8, 1800));
        
        System.out.println("pila \n"+pilaP.toString());
        
        pilaP.desapilar();
        System.out.println("pila \n"+pilaP.toString());
        
        Pila<Productos> pd= Operacionespila.pilaDuplicada(pilaP);
        System.out.println("Pilas Duplicadas\n" + pd.toString());
        
        Pila<Productos> pi= Operacionespila.pilaInvertida(pilaP);
        System.out.println("Pilas Invertidas\n" + pi.toString());
    }
    
    
}
