/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grandprix6;

/**
 *
 * @author federico,giorgio,razvan
 */
public class GiudiceDiGara extends Thread {

    private String nome;
    private String cognome;

    public GiudiceDiGara(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public void printInizio() {
        System.out.println("La gara e' iniziata");
    }

    public void printFine() {
        System.out.println("La gara e' finita");
    }

    public void printVincitore() {
        System.out.println("Il vincitore del GrandPrix e'"); //Vedere file CSV
    }

    public void classifica() {
        System.out.println("La classifica e' composta da:"); //aggiungere un file csv per aggiornare man mano le posizioni
    }

    public void checkGara() {

    }

    public void checkIncidenti() {
// inserire un if dove in qualche modo si riesca a capire l'avvenimento di un'incidente
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
