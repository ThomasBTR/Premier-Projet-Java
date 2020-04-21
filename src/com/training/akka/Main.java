package com.training.akka;

import com.training.akka.collaborateurs.Client;

import java.io.SequenceInputStream;
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Adresse adresseSoc = new Adresse(4, "Rue du beau regard", "Lyon");

        Societe soc = new Societe("AKKA",adresseSoc);

        Societe soc2 = new Societe("Alten", adresseSoc);

        Societe soc3= new Societe("Altran", adresseSoc);

        soc.affiche();
        soc2.affiche();

        Adresse adresseSoc2 = new Adresse(5,"Rue du Rebour","Lyon");

        // Numéro de rue de 4 --> 25
        adresseSoc.setNumeroRue(25);
 //       soc2.setAdressePostale(adresseSoc);

        soc.affiche();
        soc2.affiche();



        /*

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer un prix HT d'un article en euros: ");
        float prixHT = scanner.nextFloat();
        System.out.println("Entrer le nombre d'article souhaité : ");
        int nbArticle = scanner.nextInt();
        System.out.println("Entrer la TVA applicable en % : ");
        float tva = scanner.nextFloat();

        float resultat = (prixHT*nbArticle)*(1+(tva/100));

        System.out.println("---> "+nbArticle+" articles \n prix HT unitaire  --> "+prixHT+" €\nTVA ---> "+tva+" % \n Prix TTC --> "+resultat+"€");

        */


       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer une note entre 0 et 20 : ");
        int note = scanner.nextInt();

        if (note<0 || note >20){
            System.out.println("La note n'est pas entre 0 et 20.");
        }else{



            switch (note){
                case (note < 8 ? true : false)  :
                    System.out.println("Recalé");
                    break;
                case (note < 8 ? true : false) :
                case 9 :
                    System.out.println("Rattrapage");
                    break;

            }

            if (note>14){
                System.out.println("Bien");
            }
            else if(note > 12){
                System.out.println("Assez Bien");
            }
            else if (note > 10){
                System.out.println("Passable");
            }
            else if(note > 8){
                System.out.println("Rattrapage");
            }
            else{
                System.out.println("Recalé);
        }*/


            


 /*       Scanner scanner = new Scanner(System.in);

        System.out.println("Entrer votre premier nombre :");
        float x = scanner.nextFloat();
        System.out.println("Entrer votre deuxième nombre :");
        float y = scanner.nextFloat();

        if(x<0){
            if(y<0){
                System.out.println("Le produit de deux nombre négatif est positif");
            }
            else{
                System.out.println("Le produit d'un nombre positif et d'un nombre négatif est négatif");
            }
        }
        else{
            if(y<0){
                System.out.println("Le produit d'un nombre positif et d'un nombre négatif est négatif");
            }
            else{
                System.out.println("Le produit de deux nombre positif est positif");
            }
        }
*/

 /*Scanner scanner = new Scanner(System.in);

    System.out.println("Faite un choix :\n1)Ouvrir\n2)Quitter\n3)Sauver");

    int test =scanner.nextInt();
    switch (test){
        case 1 :
            System.out.println("Ouvert");
            break;

        case 2 :
            System.out.println("Quitter");
        break;

        case 3 :
            System.out.println("Sauver");
        break;

        default :
            System.out.println("Valeur non reconnue");
        break;
    }
*/





    }

}