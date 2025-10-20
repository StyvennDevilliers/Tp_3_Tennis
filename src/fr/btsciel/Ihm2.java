package fr.btsciel;

import clavier.*;

public class Ihm2 {
    public static void main(String[] args) {
        // Version 2

        final int NC = 1, V2plus = 1, Degal = 1;
        final int _40 = 2, V1plus = 2, D1moins = 2;
        final int _30_5 = 3, Vegal = 3, D2moins = 3;
        final int _30_4 = 4, V1moins = 4;
        final int _30_3 = 5, V2moins = 5;
        final int _30_2 = 6, V3moins = 6;
        final int _30_1 = 7, V4moins = 7;
        final int _30 = 8;
        final int _15_5 = 9;
        final int _15_4 = 10;
        String again = new String();
        boolean check;

        do {
            int e = 0, j = 0, g = 0;
            String classementfin = new String();
            int nvclassement;
            int classement;
            int nbrvictoire, nbrmaxvictoire = 0, nbrvictoiresup, nbrvictoiresupreel, victoire;
            int nbrdefaite, defaite;
            int nbrpoints = 0;

            do {
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
                if(classement != NC || classement != _40 || classement != _30_5 || classement != _30_4 || classement != _30_3 || classement != _30_2 || classement != _30_1 || classement != _30 || classement != _15_5 || classement != _15_4){
                    System.out.println("Erreur. Veuillez ressaisir.");
                }
            }while (classement != NC || classement != _40 || classement != _30_5 || classement != _30_4 || classement != _30_3 || classement != _30_2 || classement != _30_1 || classement != _30 || classement != _15_5 || classement != _15_4);

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

            System.out.println("Saisir nombre de victoire");
            nbrvictoire = In.readInteger();
            if (nbrvictoire > nbrmaxvictoire) {
                nbrvictoire = nbrmaxvictoire;
            }

            System.out.println("Saisir nombre de défaite");
            nbrdefaite = In.readInteger();

            for (int i = 0; i < nbrdefaite; i++) {

                do {
                    System.out.println("""
                             _____________________________________________
                            |   Veuillez choisir votre type de défaite.   |
                            | 1) Défaite à échelon égal                   |
                            | 2) Défaite à 1 échelon inférieur            |
                            | 3) Défaite à 2 échelons inférieur           |
                            |_____________________________________________|
                            """);
                    defaite = In.readInteger();
                    if(defaite!=Degal ||defaite!=D1moins || defaite!=D2moins){
                        System.out.println("Erreur. Veuillez ressaisir.");
                    }
                }while (defaite!=Degal ||defaite!=D1moins || defaite!=D2moins);

                switch (defaite) {
                    case Degal:
                        e += 1;
                        break;
                    case D1moins:
                        j += 1;
                        break;
                    case D2moins:
                        g += 1;
                        break;
                }
            }
            nbrvictoiresup = nbrvictoire - e - 2 * j - 5 * g;

            if (nbrvictoiresup <= 4) {
                nbrvictoiresupreel = 1;
            } else if (nbrvictoiresup >= 5 && nbrvictoiresup <= 9) {
                nbrvictoiresupreel = 2;
            } else if (nbrvictoiresup >= 10 && nbrvictoiresup <= 14) {
                nbrvictoiresupreel = 3;
            } else if (nbrvictoiresup >= 15 && nbrvictoiresup <= 19) {
                nbrvictoiresupreel = 4;
            } else if (nbrvictoiresup >= 20 && nbrvictoiresup <= 24) {
                nbrvictoiresupreel = 5;
            } else {
                nbrvictoiresupreel = 6;
            }
            System.out.println("Nombre de victoire supplémentaires prises en compte: " + nbrvictoiresupreel);

            for (int i = 0; i < (nbrmaxvictoire + nbrvictoiresupreel); i++) {

                do {
                    System.out.println("""
                                 _____________________________________________
                                |   Veuillez choisir votre type de victoire.  |
                                | 1) Victoire à 2 échelons au-dessus et plus  |
                                | 2) Victoire à 1 échelon au-dessus           |
                                | 3) Victoire à échelon égal                  |
                                | 4) Victoire à 1 échelon en dessous          |
                                | 5) Victoire à 2 échelons en dessous         |
                                | 6) Victoire à 3 échelons en dessous         |
                                | 7) Victoire à 4 échelons en dessous et plus |
                                |_____________________________________________|
                                """);
                    victoire = In.readInteger();
                    if(victoire!=V2plus ||victoire!=V1plus || victoire!=Vegal || victoire!=V1moins || victoire!=V2moins || victoire!=V3moins || victoire!=V4moins){
                        System.out.println("Erreur. Veuillez ressaisir.");
                    }
                }while(victoire!=V2plus ||victoire!=V1plus || victoire!=Vegal || victoire!=V1moins || victoire!=V2moins || victoire!=V3moins || victoire!=V4moins);

                switch (victoire) {
                    case V2plus:
                        nbrpoints += 150;
                        break;
                    case V1plus:
                        nbrpoints += 100;
                        break;
                    case Vegal:
                        nbrpoints += 50;
                        break;
                    case V1moins:
                        nbrpoints += 30;
                        break;
                    case V2moins:
                        nbrpoints += 20;
                        break;
                    case V3moins:
                        nbrpoints += 15;
                        break;
                    case V4moins:
                        nbrpoints += 0;
                        break;
                }
                if (i < (nbrmaxvictoire + nbrvictoiresupreel-1)) {
                    System.out.println("Nombre de points après la victoire: " + nbrpoints);
                }
            }
            System.out.println("Total des points: " + nbrpoints);

            if (nbrpoints >= 660 && classement == _15_5) {
                nvclassement = _15_4;
            } else if (nbrpoints >= 580 && classement == _30 || nbrpoints < 395 && classement == _15_4) {
                nvclassement = _15_5;
            } else if (nbrpoints >= 510 && classement == _30_1 || nbrpoints < 325 && classement == _15_5) {
                nvclassement = _30;
            } else if (nbrpoints >= 480 && classement == _30_2 || nbrpoints < 290 && classement == _30) {
                nvclassement = _30_1;
            } else if (nbrpoints >= 410 && classement == _30_3 || nbrpoints < 245 && classement == _30_1) {
                nvclassement = _30_2;
            } else if (nbrpoints >= 340 && classement == _30_4 || nbrpoints < 205 && classement == _30_2) {
                nvclassement = _30_3;
            } else if (nbrpoints >= 260 && classement == _30_5 || nbrpoints < 145 && classement == _30_3) {
                nvclassement = _30_4;
            } else if (nbrpoints >= 150 && classement == _40 || nbrpoints < 90 && classement == _30_4) {
                nvclassement = _30_5;
            } else if (nbrpoints >= 80 && classement == NC || nbrpoints < 50 && classement == _30_5) {
                nvclassement = _40;
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

            do{
                System.out.println("Voulez-vous recommencer ? (o\\n)");
                again = In.readString().replaceAll(" ", "").toLowerCase();
                if (again.equals("o")) {
                    check = true;
                } else if (again.equals("n")) {
                    check = true;
                }else {
                    check = false;
                }
            }while (!check);

        }while (again.equals("o"));

        System.out.println("\nProgramme terminé. Au revoir !");

    }
}
