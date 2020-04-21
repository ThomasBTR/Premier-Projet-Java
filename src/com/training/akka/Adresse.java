package com.training.akka;

public class Adresse {
    private int numeroRue;
    private String nomRue;
    private String ville;

///////////////////////////////


    public void setNumeroRue(int numeroRue) {
        this.numeroRue = numeroRue;
    }

    public void setNomRue(String nomRue) {
        this.nomRue = nomRue;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    ////////////////////////////
    public Adresse(int numeroRue, String nomRue, String ville) {
        this.numeroRue = numeroRue;
        this.nomRue = nomRue;
        this.ville = ville;
    }

    ///////////////////////////
    //////////////////////////////////////////////////////////////
    public String concatener(){
        return (this.numeroRue+" "+this.nomRue+",\n "+this.ville +".");

    }

    public void cetteAdresse(int i, String rue_du_beau_regard, String s) {

    }
}