package com.biogade.radiobiogade.modelos;

public class Podcast extends Audio{

    private String host;
    private String tema;
    private String descripcion;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int getClasificacion() {
        if (getTotalDeReproducciones() >= 2000){
            return 9;
        }else {
            return 2;
        }
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Podcast:");
        System.out.println("El host de este Podcast es: " + this.getHost());
        System.out.println("El tema de este Podcast es: " + this.getTema());
        super.mostrarInfo();
        System.out.println("Descripción: " + this.getDescripcion());
        System.out.println("----------------------------------------------------------------");
    }
}
