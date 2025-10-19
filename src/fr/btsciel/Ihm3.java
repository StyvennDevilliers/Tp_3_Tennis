package fr.btsciel;

import clavier.*;

public class Ihm3 {
    public static void main(String[] args){
        // Version 3

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
            boolean rattrapage = true;
            boolean finboucle = false;
            boolean descente;
            int e = 0, j = 0, g = 0;
            String classementfin = new String();
            int nvclassement = NC;
            int classement;
            int nbrvictoire, nbrmaxvictoire = 0, nbrvictoiresup, nbrvictoiresupreel, victoire;
            int nbrdefaite, defaite;
            int nbrpoints = 0;

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

            System.out.println("Saisir nombre de victoire(s)");
            nbrvictoire = In.readInteger();
            if (nbrvictoire > nbrmaxvictoire) {
                nbrvictoire = nbrmaxvictoire;
            }

            System.out.println("Saisir nombre de défaite(s)");
            nbrdefaite = In.readInteger();

            for (int i = 0; i < nbrdefaite; i++) {
                System.out.println("""
                         _____________________________________________
                        |   Veuillez choisir votre type de défaite.   |
                        | 1) Défaite à échelon égal                   |
                        | 2) Défaite à 1 échelon inférieur            |
                        | 3) Défaite à 2 échelons inférieur           |
                        |_____________________________________________|
                        """);
                defaite = In.readInteger();
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
            System.out.println("Nombre de victoires supplémentaires prises en compte: " + nbrvictoiresupreel);

            nvclassement = classement;
            int i = 0;
            while (!finboucle) {
                for (i = i; i < (nbrmaxvictoire + nbrvictoiresupreel); i++) {
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
                    if (nbrpoints >= 660 && nvclassement == _15_5) {
                        nvclassement = _15_4;
                        nbrpoints = 160;
                    } else if (nbrpoints >= 580 && nvclassement == _30) {
                        nvclassement = _15_5;
                        nbrpoints = 120;
                    } else if (nbrpoints >= 510 && nvclassement == _30_1) {
                        nvclassement = _30;
                        nbrpoints = 80;
                    } else if (nbrpoints >= 480 && nvclassement == _30_2) {
                        nvclassement = _30_1;
                        nbrpoints = 50;
                    } else if (nbrpoints >= 410 && nvclassement == _30_3) {
                        nvclassement = _30_2;
                        nbrpoints = 30;
                    } else if (nbrpoints >= 340 && nvclassement == _30_4) {
                        nvclassement = _30_3;
                        nbrpoints = 20;
                    } else if (nbrpoints >= 260 && nvclassement == _30_5) {
                        nvclassement = _30_4;
                        nbrpoints = 10;
                    } else if (nbrpoints >= 150 && nvclassement == _40) {
                        nvclassement = _30_5;
                        nbrpoints = 5;
                    } else if (nbrpoints >= 80 && nvclassement == NC) {
                        nvclassement = _40;
                        nbrpoints = 2;
                    } else {
                    }
                    classementfin = switchclassement(nvclassement);
                    System.out.println("Classement: " + classementfin);
                }

                if ((nbrpoints == 2 && nvclassement == _40 || nbrpoints == 5 && nvclassement == _30_5 || nbrpoints == 10 && nvclassement == _30_4 || nbrpoints == 20 && nvclassement == _30_3 || nbrpoints == 30 && nvclassement == _30_2 || nbrpoints == 50 && nvclassement == _30_1 || nbrpoints == 80 && nvclassement == _30 || nbrpoints == 120 && nvclassement == _15_5 || nbrpoints == 160 && nvclassement == _15_4) && rattrapage == true) {
                    i = (nbrmaxvictoire + nbrvictoiresupreel) - 1;
                    rattrapage = false;
                } else {
                    finboucle = true;
                }

            }

            System.out.println("Total des points: " + nbrpoints);
            if (nbrpoints < 395 && nvclassement == _15_4) {
                nvclassement = _15_5;
                nbrpoints = 120;
                descente = true;
            } else if (nbrpoints < 325 && nvclassement == _15_5) {
                nvclassement = _30;
                nbrpoints = 80;
                descente = true;
            } else if (nbrpoints < 290 && nvclassement == _30) {
                nvclassement = _30_1;
                nbrpoints = 50;
                descente = true;
            } else if (nbrpoints < 245 && nvclassement == _30_1) {
                nvclassement = _30_2;
                nbrpoints = 30;
                descente = true;
            } else if (nbrpoints < 205 && nvclassement == _30_2) {
                nvclassement = _30_3;
                nbrpoints = 20;
                descente = true;
            } else if (nbrpoints < 145 && nvclassement == _30_3) {
                nvclassement = _30_4;
                nbrpoints = 10;
                descente = true;
            } else if (nbrpoints < 90 && nvclassement == _30_4) {
                nvclassement = _30_5;
                nbrpoints = 5;
                descente = true;
            } else if (nbrpoints < 50 && nvclassement == _30_5) {
                nvclassement = _40;
                nbrpoints = 2;
                descente = true;
            } else {
                nvclassement = nvclassement;
                descente = false;
            }

            if (descente) {
                classementfin = switchclassement(nvclassement);
                System.out.println("\nClassement : " + classementfin);
                System.out.println("Avec " + nbrpoints + " points.\n");
            }

            do {
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

    public static String switchclassement(int nvclassement) {
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
        String classementfin = new String();
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
        return classementfin;
    }

}
