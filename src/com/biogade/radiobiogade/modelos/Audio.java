package com.biogade.radiobiogade.modelos;

public class Audio {

    private String titulo;
    private double duracion;
    private int totalDeReproducciones;
    private int totalMeGusta;
    private int clasificacion;

    public void meGusta() {
       this.totalMeGusta++;
    }

    public void reproducir() {
        this.totalDeReproducciones++;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracion() {
        return this.duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getTotalDeReproducciones() {
        return this.totalDeReproducciones;
    }

    public int getClasificacion(){
        return this.clasificacion;
    }

    public int getTotalMeGusta() {
        return this.totalMeGusta;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + this.getTitulo());
        System.out.println("La duración de este audio en minutos es de: " + this.getDuracion() + " minutos.");
        System.out.println("Tiene un total de reproducciones de: " + this.getTotalDeReproducciones() + ".");
        System.out.println("Tiene un total de me gustas de: " + this.getTotalMeGusta() + ".");
    }

}
