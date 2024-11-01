package com.mycompany.arboledadnombresexo;

public class Nodo {
    
    public Persona getPersona() {
        return persona;
    }
    
    public Nodo(Persona persona) {
        this.persona = persona;
        izq = null;
        der = null;
    }
    
    private Persona persona;
    Nodo izq;
    Nodo der;
    
    
}
