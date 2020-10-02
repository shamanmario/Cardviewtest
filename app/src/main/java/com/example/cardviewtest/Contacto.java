package com.example.cardviewtest;

public class Contacto {

    private String nombre;
    private String texto;
    private int foto;

    public Contacto() {
        this.nombre = "Contacto de prueba";
        this.texto = "texto de prueba";
        this.foto = 0;
    }

    public Contacto(String nombre, String texto, int foto) {
        this.nombre = nombre;
        this.texto = texto;
        this.foto = foto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
