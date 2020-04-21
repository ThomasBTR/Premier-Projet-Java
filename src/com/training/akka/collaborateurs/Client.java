package com.training.akka.collaborateurs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Client {

    String nom;
    String prenom;
    String numero;



    public void maFonction (String test, int... e){

        System.out.println("************ DEBUT ************************");

        System.out.println("++++ Programme de "+ test +" ++++");

        for (int i = 0; i< e.length; i++){
            System.out.println("La valeur actuelle est -->" + e[i]);
        }
        System.out.println("************ FIN ************************");



    }

    public void exo6 (){
        int i=0;
        Scanner scanner = new Scanner(System.in);
        int sommeEntierPositif = 0;
        int test = 0;

        System.out.println("Entrez 50 entiers :");
        do{
            test = scanner.nextInt();
            if(test>=0){
                sommeEntierPositif += test;
            }
            i++;
        }while (i<10);
        System.out.println(" Somme des entiers positifs = "+sommeEntierPositif);
    }

    public void exo7(){

        int nbEleve, i = 0;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Saisir le nombre d'Eleves :");
        nbEleve = scanner.nextInt();

        String nomEleve[]= new String[(nbEleve)];
        String admis ="", nonAdmis = "";
        int noteSaisie = 0;
        int sommeNote= 0, noteMax = 0, noteMin = 0 ;
        double moyenne =0;


        while(i<nbEleve){
            System.out.println("Saisir le nom de l'élève "+(i+1)+" : ");
            nomEleve[i] = scanner.next();
            System.out.println("Saisir la note de "+nomEleve[i]+" : ");
            noteSaisie = scanner.nextInt();

            sommeNote += noteSaisie;

            if(noteSaisie<noteMin){
                noteMin = noteSaisie;
            }

            if(noteSaisie>noteMax){
                noteMax = noteSaisie;
            }

            if(noteSaisie>=10){
                admis += (nomEleve[i]+" - ");
            }
            else{
                nonAdmis += (nomEleve[i]+" - ");
            }
            i++;
        }

        moyenne = (double) sommeNote / nbEleve;

        System.out.println(" LEs élèves admis sont : "+admis);
        System.out.println("----------------------------------------");
        System.out.println(" Les élèves non admis sont : "+nonAdmis);
        System.out.println("----------------------------------------");
        System.out.println("La moyenne est de : "+moyenne+", la note la plus basse est de : "+noteMin+", et la note la plus haute est de : "+noteMax);

    }
}
