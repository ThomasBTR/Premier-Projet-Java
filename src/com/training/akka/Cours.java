package com.training.akka;

public class Cours {
    String nomCours;
    int nombreHeure;
    int annéeCours;
    Eleve eleve;

    public Cours(String nomCours, int nombreHeure, int annéeCours, Eleve eleve) {
        if (annéeCours != eleve.anneeCoursEleve)


        this.nomCours = nomCours;
        this.nombreHeure = nombreHeure;
        this.annéeCours = annéeCours;
        this.eleve = eleve;
    }
}
