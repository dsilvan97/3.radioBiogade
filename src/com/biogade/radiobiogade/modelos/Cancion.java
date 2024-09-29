package com.biogade.radiobiogade.modelos;

public class Cancion extends Audio {
    private String artista;
    private String genero;
    private String album;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public int getClasificacion() {
        if (getTotalMeGusta() > 5000){
            return 8;
        }else {
            return 4;
        }
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Canción:");
        System.out.println("El artista de esta canción es: " + this.getArtista());
        System.out.println("El género de esta canción es: " + this.getGenero());
        System.out.println("El álbum de esta canción se llama: " + this.getAlbum());
        super.mostrarInfo();
    }


}
