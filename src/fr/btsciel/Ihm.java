package fr.btsciel;

import clavier.*;

public class Ihm {
    public static void main(String[] args) {
        // Version 1

        final int NC = 1, V2plus = 1;
        final int _40 = 2, V1plus = 2;
        final int _30_5 = 3, Vegal = 3;
        final int _30_4 = 4, V1moins = 4;
        final int _30_3 = 5, V2moins = 5;
        final int _30_2 = 6, V3moins = 6;
        ;
        final int _30_1 = 7, V4moins = 7;
        ;
        final int _30 = 8;
        final int _15_5 = 9;
        final int _15_4 = 10;

        boolean monte = false;
        boolean descend = false;
        String classementfin = new String();
        int nvclassement = NC;
        int classement;
        int nbrvictoire, nbrmaxvictoire = 0, victoire = 0;
        int nbrpoints = 0, nbrpointsvictoire = 0;

        System.out.println("""
                 __________________________________
                |Veuillez choisir votre classement.|
                | 1) Non Classé         6) 35/2    |
                | 2) 40                 7) 35/1    |
                | 3) 35/5               8) 35      |
                | 4) 35/4               9) 15/5    |
                | 5) 35/3               10) 15/4   |
                |__________________________________|
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
            case _15_5:
                nbrpoints = 120;
                nbrmaxvictoire = 6;
                break;
            case _15_4:
                nbrpoints = 160;
                nbrmaxvictoire = 6;
                break;
        }
        System.out.println("Nombre maximum de victoire: " + nbrmaxvictoire);
        System.out.println("Capital de points de départ: " + nbrpoints);

        System.out.println("Saisir nombre de victoire");
        nbrvictoire = In.readInteger();
        if (nbrvictoire > nbrmaxvictoire) {
            nbrvictoire = nbrmaxvictoire;
        }

        for (int i = 0; i < nbrvictoire; i++) {
            System.out.println("""
                     _____________________________________________
                    |   Veuillez choisir votre type de victoire.  |
                    | 1) Victoire à 2 échelons au dessus et plus  |
                    | 2) Victoire à 1 échelon au dessus           |
                    | 3) Victoire à échelon égal                  |
                    | 4) Victoire à 1 échelon en dessous          |
                    | 5) Victoire à 2 échelons en dessous         |
                    | 6) Victoire à 3 échelons en dessous         |
                    | 7) Victoire à 4 échelons en dessous et plus |
                    |_____________________________________________|
                    """);
            victoire = In.readInteger();
            switch (victoire) {
                case V2plus:
                    nbrpointsvictoire += 150;
                    break;
                case V1plus:
                    nbrpointsvictoire += 100;
                    break;
                case Vegal:
                    nbrpointsvictoire += 50;
                    break;
                case V1moins:
                    nbrpointsvictoire += 30;
                    break;
                case V2moins:
                    nbrpointsvictoire += 20;
                    break;
                case V3moins:
                    nbrpointsvictoire += 15;
                    break;
                case V4moins:
                    nbrpointsvictoire += 0;
                    break;
            }
            System.out.println("Nombre de points gagnée: " + nbrpointsvictoire);
            System.out.println("Nombre de points après la victoire: " + (nbrpoints + nbrpointsvictoire));

            }

        if ((nbrpoints + nbrpointsvictoire) >= 660 && classement == _15_5) {
            nvclassement = _15_4;
            monte = true;
        } else if ((nbrpoints + nbrpointsvictoire) >= 580 && classement == _30) {
            nvclassement = _15_5;
            monte = true;
        } else if ((nbrpoints + nbrpointsvictoire) >= 510 && classement == _30_1) {
            nvclassement = _30;
            monte = true;
        } else if ((nbrpoints + nbrpointsvictoire) >= 480 && classement == _30_2) {
            nvclassement = _30_1;
            monte = true;
        } else if ((nbrpoints + nbrpointsvictoire) >= 410 && classement == _30_3) {
            nvclassement = _30_2;
            monte = true;
        } else if ((nbrpoints + nbrpointsvictoire) >= 340 && classement == _30_4) {
            nvclassement = _30_3;
            monte = true;
        } else if ((nbrpoints + nbrpointsvictoire) >= 260 && classement == _30_5) {
            nvclassement = _30_4;
            monte = true;
        } else if ((nbrpoints + nbrpointsvictoire) >= 150 && classement == _40) {
            nvclassement = _30_5;
            monte = true;
        } else if ((nbrpoints + nbrpointsvictoire) >= 80 && classement == NC) {
            nvclassement = _40;
            monte = true;
        } else {
            nvclassement = classement;
        }
        if ((nbrpoints + nbrpointsvictoire) < 395 && classement == _15_4) {
            nvclassement = _15_5;
            descend = true;
        } else if ((nbrpoints + nbrpointsvictoire) < 325 && classement == _15_5) {
            nvclassement = _30;
            descend = true;
        } else if ((nbrpoints + nbrpointsvictoire) < 290 && classement == _30) {
            nvclassement = _30_1;
            descend = true;
        } else if ((nbrpoints + nbrpointsvictoire) < 245 && classement == _30_1) {
            nvclassement = _30_2;
            descend = true;
        } else if ((nbrpoints + nbrpointsvictoire) < 205 && classement == _30_2) {
            nvclassement = _30_3;
            descend = true;
        } else if ((nbrpoints + nbrpointsvictoire) < 145 && classement == _30_3) {
            nvclassement = _30_4;
            descend = true;
        } else if ((nbrpoints + nbrpointsvictoire) < 90 && classement == _30_4) {
            nvclassement = _30_5;
            descend = true;
        } else if ((nbrpoints + nbrpointsvictoire) < 50 && classement == _30_5) {
            nvclassement = _40;
            descend = true;
        } else {
            nvclassement = classement;
        }

            switch (nvclassement) {
                case NC:
                    classementfin = new String("Non classé");
                    break;
                case _40:
                    classementfin = new String("40");
                    break;
                case _30_5:
                    classementfin = new String("30/5");
                    break;
                case _30_4:
                    classementfin = new String("30/4");
                    break;
                case _30_3:
                    classementfin = new String("30/3");
                    break;
                case _30_2:
                    classementfin = new String("30/2");
                    break;
                case _30_1:
                    classementfin = new String("30/1");
                    break;
                case _30:
                    classementfin = new String("30");
                    break;
                case _15_5:
                    classementfin = new String("15/5");
                    break;
                case _15_4:
                    classementfin = new String("15/4");
                    break;
            }

        System.out.println("Nouveau classement: " + classementfin + "\n");

    }
}
