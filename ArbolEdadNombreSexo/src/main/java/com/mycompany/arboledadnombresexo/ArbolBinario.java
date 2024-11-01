package com.mycompany.arboledadnombresexo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArbolBinario {
    Nodo raiz;
    
    public ArbolBinario() {
        raiz = new Nodo(new Persona("INICIO", 999999999, "Masculino"));
    }
    
    public void insertar(Persona persona) {
        raiz = insertarRecursivo(raiz, persona);
    }

    private Nodo insertarRecursivo(Nodo actual, Persona persona) {
        if (actual == null) {
            return new Nodo(persona);
        }
        
        if (actual == raiz) {
            if (persona.getAge() < 18) {
                actual.der = insertarRecursivo(actual.der, persona);
            }
            else {
                actual.izq = insertarRecursivo(actual.izq, persona);
            }            
        }
        else {
            if (persona.getAge() < actual.getPersona().getAge()) {
                actual.der = insertarRecursivo(actual.der, persona);
            } else if (persona.getAge() > actual.getPersona().getAge()) {
                actual.izq = insertarRecursivo(actual.izq, persona);
            } else {                
                if (persona.getAge() < 18) {
                    actual.der = insertarRecursivo(actual.der, persona);
                } else {
                    actual.izq = insertarRecursivo(actual.izq, persona);
                }                
            }
        }

        return actual;
    }

    public void recorrerInOrden() {
        ArrayList<String> arrPrint = new ArrayList();
        arrPrint.add("Mayores:");
        recorrerInOrdenRecursivo(raiz, arrPrint);
        
        String output = "";
        
        for (String string : arrPrint) {
            output += string + "\n";
        }
        
        JOptionPane.showMessageDialog(null, output);
    }

    private void recorrerInOrdenRecursivo(Nodo nodo, ArrayList<String> arrPrint) {        
        if (nodo != null) {
            recorrerInOrdenRecursivo(nodo.izq, arrPrint);
            if (nodo != raiz) {
                arrPrint.add(nodo.getPersona().toString());
            } else {
                arrPrint.add("");
                arrPrint.add("Menores:");
            }
            recorrerInOrdenRecursivo(nodo.der, arrPrint);
        }
    }
    
}
