/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilascolaslistas;

/**
 *
 * @author User
 */
public class Nodo {
    private Nodo nodoSgte;
    private int dato;
    
    public Nodo(int dato){
        this.dato = dato;
    }

    public Nodo getNodoSgte() {
        return nodoSgte;
    }

    public void setNodoSgte(Nodo nodoSgte) {
        this.nodoSgte = nodoSgte;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
    
    
    
}
