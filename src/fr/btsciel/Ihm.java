package fr.btsciel;

import clavier.In;

public class Ihm {
    public static void main(String[] args) {
        final int NC = 1;
        final int _40 = 2;
        final int _30_5 = 3;
        final int _30_4 = 4;
        final int _30_3 = 5;
        final int _30_2 = 6;
        final int _30_1 = 7;
        final int _30 = 8;
        final int _15_5 = 9;
        final int _15_4 = 10;


        int classement ;
        int nbrvictoire,nbrvictoirereel,nbrmaxvictoire = 0,nbrvictoiresuple;
        int nbrpoints = 0;
        int nbrdefaite,nbrdefaite1echelon,nbrdefaite2echelon;

        System.out.println("""Veuillez choisir votre classement.
                 ___________________________________________
                | 1) Non Classé         6) 35/2
                | 2) 40                 7) 35/1
                | 3) 35/5               8) 35
                9) 15/5
                | 4) 35/4               10) 15/4
                | 5) 35/3
                | 
                """);
        classement = In.readInteger();
        switch (classement) {
            case NC:
                nbrpoints = 0;
                nbrmaxvictoire = 5;
                break;
            case _40:
                nbrpoints = 2;
                nbrmaxvictoire = 5;
                break;
            case _30_5:
                nbrpoints = 5;
                nbrmaxvictoire = 5;
                break;
            case _30_4:
                nbrpoints = 10;
                nbrmaxvictoire = 5;
                break;
            case _30_3:
                nbrpoints = 20;
                nbrmaxvictoire = 6;
                break;
            case _30_2:
                nbrpoints = 30;
                nbrmaxvictoire = 6;
                break;
            case _30_1:
                nbrpoints = 50;
                nbrmaxvictoire = 6;
                break;
            case _30:
                nbrpoints = 80;
                nbrmaxvictoire = 6;
                break;
            case "15/5":
                nbrpoints = 120;
                nbrmaxvictoire = 6;
                break;
            case "15/4":
                nbrpoints = 160;
                nbrmaxvictoire = 6;
                break;
        }
        System.out.println("Nombre maximum de victoire: " + nbrmaxvictoire);
        System.out.println("Capital de points de départ: " + nbrpoints);
        System.out.println("Veuillez saisir votre nombre de victoire.");
        nbrvictoire = In.readInteger();
        if (nbrvictoire!=0){
            System.out.println("Il te reste : " + (nbrmaxvictoire-nbrvictoire) + " victoires.");
        }




        //System.out.println("Veuillez saisir votre nombre de défaite à échelon égal.");
        //nbrdefaite = In.readInteger();
        //System.out.println("Veuillez saisir votre nombre de défaite à 1 échelon inférieur.");
        //nbrdefaite1echelon = In.readInteger();
        //System.out.println("Veuillez saisir votre nombre de défaite à 2 échelon inférieur.");
        //nbrdefaite2echelon = In.readInteger();
        //nbrvictoirereel = nbrvictoire - nbrdefaite - 2 * nbrdefaite1echelon - 5 * nbrdefaite2echelon;


    }
}
