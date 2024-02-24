/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grandprix6;

import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author federico,giorgio,razvan
 */
/**
 *
 * @author federico,giorgio,razvan
 */
public class Giocatore extends Thread {
//capire un modo per far comunicare il giocatore con tutte le altre classi
//inserire dati del giocatore in un CSV

    private String nickname;
    private String password;
    GiudiceDiGara GDC;
    Circuito circ;
    Pilota pil[];
    Auto aut;
    Scanner scelta = new Scanner(System.in);

    public Giocatore(String nickname, String password) {
        this.nickname = nickname;
        this.password = password;

    }

    @Override
    public void run() { //run sostituisce il metodo gara nell'UML
        int n = 0;
        while (n < 2) {
            System.out.println("Inserisca il numero di macchine:");
            int nMacchine = scelta.nextInt();
            if (nMacchine < 2) {
                System.out.println("Inserisca almeno 2 macchine");
            } else {
                n = 2;
                scegliNAuto(nMacchine);
                for (int i = 0; i < nMacchine; i++) {
                    System.out.println("Inserisca il nome del pilota:");
                    pil[i].setNome(scelta.nextLine());
                    System.out.println("Inserisca il cognome del pilota:");
                    pil[i].setCognome(scelta.nextLine());
                    System.out.println("Inserisca la nazionalita' del pilota:");
                    pil[i].setNazionalita(scelta.nextLine());
                    System.out.println("Inserisca il numero del pilota:");
                    pil[i].setNumeroMacchina(scelta.nextInt());
                    System.out.println("Inserisca la marca della sua auto:");
                    pil[i].auto[i].setMarca(scelta.nextLine());
                    System.out.println("Inserisca il modello della macchina:");
                    pil[i].auto[i].setModello(scelta.nextLine());
                    pil[i].auto[i].setVelocitaRand();
                    System.out.println("La macchina andra' a" + pil[i].auto[i].getVelocita() + "Km/h");
                }
            }
        }
        n = 0;
        while (n < 1) {
            System.out.println("Inserisca la lunghezza del circuito:");
            n = scelta.nextInt();

            circ.setLunghezza(n);
            int lungh = n;
            if (lungh < 1) {
                System.out.println("La lunghezza minima del circuito e' di almeno 1 KM");
            } else {
                n = 2;
            }
        }
        n = 0;
        while (n < 1) {
            System.out.println("Inserisca il numero di giri:");
            n = scelta.nextInt();
            circ.setGiri(n);
            int laps = n;
            if (laps < 1) {
                System.out.println("La gara dovra' durare almeno 1 giro");
            } else {
                n = 2;
            }
        }
        n = -1;
        while (n < 0) {
            System.out.println("Inserisca il numero di pit stop:");
            int pit = scelta.nextInt();
            if (pit < 0) {
                System.out.println("La gara potra' avere come minimo 0 pit stop ");
            } else {
                n = 1;
            }
        }
        System.out.println("Configurazione gara terminata");
    }

    public void cheat() {
        System.out.println("Seleziona il numero della macchina da truccare");
        int x = scelta.nextInt();
        for (int i = 0; i < Auto.contaOggetti ; i++) {
            if (pil[i].getNumeroMacchina() == x) {
                pil[i].auto[i].setVelocita(400);
            }
            System.out.println("Auto truccata con successo");

        }
    }

    public void safety() {
        int cambioMediaVelocita=0;
        System.out.println("Safety car in pista");
        for (int i = 0; i < Auto.contaOggetti ; i++) {
            cambioMediaVelocita=pil[i].auto[i].getVelocita()- 35;
            pil[i].auto[i].setVelocita(cambioMediaVelocita);
        }
        System.out.println("Cambio media velocita' eseguito");
        System.out.println("Bandiera verde");
    }

    public void cifra() {

    }

    public void decifra() {

    }

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void scegliNAuto(int macchine) {
        Pilota.MAX_AUTO_IN_GRIGLIA = macchine;
    }
}
