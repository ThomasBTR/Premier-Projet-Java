package com.training.akka;

public class Societe {

/////////////////////////////////

    private String nom;
    public Adresse adressePostale;

    public Societe(String nom, Adresse adressePostale) {
        this.nom = nom;
        this.adressePostale = adressePostale;
    }

/////////////////////////////////////

    /*


     */




    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Adresse getAdressePostale() {
        return adressePostale;
    }

    public void setAdressePostale(Adresse newAdresse) {
        this.adressePostale = newAdresse;
    }

/////////////////////////



    public void affiche(){
        System.out.println("Nom de la société : "+this.nom+"\n Adresse de la société : "+this.adressePostale.concatener());
    }
}
