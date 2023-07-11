package juegoDeCartas;

import java.util.*;

public class Jugador {
    private String nombre;
    private Set<Carta> mano;

    public Jugador(String nombre) {
        this.nombre = nombre;
        mano = new HashSet<>();
    }

    public void agregarCarta(Carta carta) {
        mano.add(carta);
    }

    public void manoCartas() {
        System.out.println("Mano de cartas de: " + nombre);
        for (Carta carta : mano) {
            System.out.println(carta);
        }
    }
}

