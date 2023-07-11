package juegoDeCartas;

import java.util.*;

public class CardGame {
    private Set<Carta> cartas;

    public CardGame() {
        cartas = new HashSet<>();
    }

    public void agregarCarta(Carta carta) {
        cartas.add(carta);
    }

    public void barajeaCartas() {
        List<Carta> cartasListado = new ArrayList<>(cartas);
        Collections.shuffle(cartasListado);
        cartas = new LinkedHashSet<>(cartasListado);
    }

    public void reparteCartas(Jugador player1, Jugador player2) {
        int cartasParaJugador = 5;
        Iterator<Carta> iterando = cartas.iterator();

        for (int i = 0; i < cartasParaJugador; i++) {
            if (iterando.hasNext()) {
                Carta carta = iterando.next();
                player1.agregarCarta(carta);
                iterando.remove();
            }
        }

        for (int i = 0; i < cartasParaJugador; i++) {
            if (iterando.hasNext()) {
                Carta carta = iterando.next();
                player2.agregarCarta(carta);
                iterando.remove();
            }
        }
    }

    public void muestraCartas() {
        System.out.println("Cartas en la mesa:");
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }
}
