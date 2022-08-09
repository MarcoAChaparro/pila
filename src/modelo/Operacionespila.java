/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author marco.chaparro
 */
public class Operacionespila {
    
   public static <T extends Base> Pila<T> pilaDuplicada(Pila<T> pilaOriginal) {

        Pila<T> piladuplicada = new Pila<>();
        Pila<T> pilaaux = new Pila<>();

        while (!pilaOriginal.estavacia()) {
            T elemento = pilaOriginal.desapilar();
            pilaaux.apilar(elemento);

        }
        while (!pilaaux.estavacia()) {
            T elemento = pilaaux.desapilar();
            T copiaelemento = (T) elemento.copy();

            pilaOriginal.apilar(elemento);
            piladuplicada.apilar(copiaelemento);
        }
        return piladuplicada;
    }
    public static <T extends Base> Pila<T> pilaInvertida(Pila<T> pilaOriginal) {
        Pila<T> piladuplicada = pilaDuplicada(pilaOriginal);
        Pila<T> pilaInvertida = new Pila<>();
        
        while (!piladuplicada.estavacia()){
            pilaInvertida.apilar(piladuplicada.desapilar());
            
        }
        return pilaInvertida;
    }
}
