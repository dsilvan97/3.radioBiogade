package com.biogade.radiobiogade.calculos;

import com.biogade.radiobiogade.modelos.Audio;

public class MisFavoritos {

    public void adiciona(Audio audio){
        if (audio.getClasificacion() >= 8){
            System.out.println(audio.getTitulo() + " es uno de los favoritos del momento.");
        }else {
            System.out.println(audio.getTitulo() + " También es uno de los favoritos.");
        }
    }
}
