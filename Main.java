package juegoDeCartas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CardGame cardGame = new CardGame();

        for (int i = 2; i < 11; i++) {
        	cardGame.agregarCarta(new Carta("♥", i));
        }
        for (int i = 2; i < 11; i++) {
        	cardGame.agregarCarta(new Carta("♦", i));
        }
        for (int i = 2; i < 11; i++) {
        	cardGame.agregarCarta(new Carta("♠", i));
        }
        for (int i = 2; i < 11; i++) {
        	cardGame.agregarCarta(new Carta("♣", i));
        }
        
        cardGame.barajeaCartas();
 
        Scanner sc = new Scanner(System.in);
        System.out.println("NOMBRE DEL JUGADOR 1: ");
        String jugador1 = sc.nextLine();
        Jugador player1 = new Jugador(jugador1);
        System.out.println("NOMBRE DEL JUGADOR 2: ");
        String jugador2 = sc.nextLine();        
        Jugador player2 = new Jugador(jugador2);
       
        cardGame.reparteCartas(player1, player2);

        cardGame.muestraCartas();

        player1.manoCartas();
        player2.manoCartas();
        sc.close();	
    }
}

