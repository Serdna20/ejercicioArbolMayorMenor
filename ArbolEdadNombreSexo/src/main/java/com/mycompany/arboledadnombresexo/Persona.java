package com.mycompany.arboledadnombresexo;

public class Persona {
    
    public int getAge() {
        return age;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getSexo() {
        return sexo;
    }
    
    private String nombre;
    private int age;   
    private String sexo;

    public Persona(String nombre, int age, String sexo) {
        this.age = age;
        this.nombre = nombre;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " - Edad: " + age + " - Sexo: " + sexo;
    }
    
}
