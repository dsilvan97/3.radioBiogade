package com.biogade.radiobiogade.principal;

import com.biogade.radiobiogade.calculos.MisFavoritos;
import com.biogade.radiobiogade.modelos.*;

public class Principal {
    public static void main(String[] args) {

        System.out.println("Bienvenido a tu reproductor de sonido AUDIO-BIOGADE!!");

        Cancion cancion1 = new Cancion();

        cancion1.setTitulo("Siempre estoy pa ti.");
        cancion1.setDuracion(3.5);
        cancion1.setArtista("Ed Maverick");

        for (int i = 0; i < 100; i++) {
            cancion1.meGusta();
        }

        for (int i = 0; i < 2000; i++) {
            cancion1.reproducir();
        }

        System.out.println("""
        
        ---------------------------------------------------------
        """);

        cancion1.setGenero("Alternativa/Independiente.");
        cancion1.setAlbum("Transiciones.");

        MisFavoritos favoritos = new MisFavoritos();

        cancion1.mostrarInfo();
        favoritos.adiciona(cancion1);
        System.out.println("""
        
        ---------------------------------------------------------
        """);

        Podcast podcast1 = new Podcast();

        podcast1.setTitulo("Tony Hawk's Pro Skater y la Música de la Subcultura Skateboarding.");
        podcast1.setHost("Ivan García");
        podcast1.setTema("Bandas Sonoras de Videojuegos.");
        podcast1.setDuracion(63.98);

        for (int i = 0; i < 100; i++) {
            podcast1.meGusta();
        }

        for (int i = 0; i < 8000; i++) {
            podcast1.reproducir();
        }

        podcast1.setDescripcion("""
                
                Antes de escuchar este programa os recomiendo que agarréis bien vuestro skate y os preparéis para un auténtico flip musical
                porque hoy hablamos de uno de los soundtracks licenciados más importantes de todos los tiempos: el de Tony Hawk`s Pro
                Skater (Neversoft, 1999) y, de rebote, del de su segunda parte (Nerversoft, 2000). Porque el soundtrack de las franquicias
                del famoso patinador de San Diego supusieron algo más que un bonito adorno para un juego mítico; de hecho, diversos medios
                apuntan hacia ellas como la guinda del pastel de un imaginario musical de la subcultura skateboarding que se venía cocinando
                desde, atención, principios de la década de 1970. En este programa hablaremos de la historia de algunos de los géneros que
                condujeron a lo que, más tarde, se denominó “skate-punk”; en concreto, el ska y el punk, estilos muy dispares que se unieron
                hacia finales de la década de 1980 para consagrarse como emblema musical de la subcultura skateboarding. Y esto es solo una
                mínima parte de un panorama súper complejo y heterogéneo que fue desarrollando multitud de componentes estilísticos de esa
                subcultura, con marcas de ropa, revistas, canales de televisión y videojuegos (otros) que fueron sellando los elementos
                distintivos de ese movimiento. Programa cortito pero intenso.
                
                Y encima llega Pablo Naop con un Covermanía que mezcla Kirby y ska.
                
                En fin, ¿qué más se puede pedir?
                
                
                ¡Sube a tu skate y acompáñanos!
                """);

        podcast1.mostrarInfo();
        favoritos.adiciona(podcast1);


        }
    }
