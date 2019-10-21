import java.util.Scanner;

    public class GraWStatki {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);                                                               // inicjacja skanera do wprowadzania danych

            System.out.println("Witaj w Grze w Statki !\n Podaj imię: ");                                           //komunikat powitalny + zapytanie o imie
            String podajImie = scanner.nextLine();                                                              //inicacja zmiennej do wprowadzenia imienia
            System.out.println(String.format("Witaj %s gra rozpoczyna się \n Wybierz Twój cel !", podajImie));      // komunikat rozpoczynajcy grę z uzyciem metody String.format

            String[][] poleGry = new String[5][10];
            int kolumna;
            int wiersz;

            for (kolumna = 0; kolumna < poleGry.length; kolumna++) {
                for (wiersz = 0; wiersz < poleGry[kolumna].length; wiersz++) {
                    System.out.print("[" + wiersz + kolumna + "]");
                }
                System.out.println();
            }

            System.out.println("Wybierz kolumnę: ");          // deklaracja
            kolumna = scanner.nextByte();
            System.out.println("Wybierz wiersz: ");          // deklaracja
            wiersz = scanner.nextByte();
            String nrPola = String.format("%d%d", kolumna, wiersz);

            int proba=0;
            while (proba<80) {
                if ((nrPola.equals(10)) || ((nrPola.equals("20"))) || ((nrPola.equals("30"))) || ((nrPola.equals("14"))) || ((nrPola.equals("15"))) || ((nrPola.equals("32"))) || ((nrPola.equals("33"))) || ((nrPola.equals("34"))) || ((nrPola.equals("35"))) || ((nrPola.equals("47"))) || ((nrPola.equals("19"))) || ((nrPola.equals("29")))) {

                    System.out.println("if");
                    System.out.println(nrPola);
                    poleGry[wiersz][kolumna] = "[X]";

                    System.out.println("   0  "+"1  "+"2  "+"3  "+"4  "+"5  "+"6  "+"7  "+"8  "+"9  ");
                    System.out.println("0 "+poleGry[0][0] + poleGry[0][1] + poleGry[0][2] + poleGry[0][3] + poleGry[0][4] + poleGry[0][5] + poleGry[0][6] + poleGry[0][7] + poleGry[0][8] + poleGry[0][9]);
                    System.out.println("1 "+poleGry[1][0] + poleGry[1][1] + poleGry[1][2] + poleGry[1][3] + poleGry[1][4] + poleGry[1][5] + poleGry[1][6] + poleGry[1][7] + poleGry[1][8] + poleGry[1][9]);
                    System.out.println("2 "+poleGry[2][0] + poleGry[2][1] + poleGry[2][2] + poleGry[2][3] + poleGry[2][4] + poleGry[2][5] + poleGry[2][6] + poleGry[2][7] + poleGry[2][8] + poleGry[2][9]);
                    System.out.println("3 "+poleGry[3][0] + poleGry[3][1] + poleGry[3][2] + poleGry[3][3] + poleGry[3][4] + poleGry[3][5] + poleGry[3][6] + poleGry[3][7] + poleGry[3][8] + poleGry[3][9]);
                    System.out.println("4 "+poleGry[4][0] + poleGry[4][1] + poleGry[4][2] + poleGry[4][3] + poleGry[4][4] + poleGry[4][5] + poleGry[4][6] + poleGry[4][7] + poleGry[4][8] + poleGry[4][9]);

                    System.out.println("trafiony");

                    System.out.println("Wybierz kolumnę: ");          // deklaracja
                    kolumna = scanner.nextByte();
                    System.out.println("Wybierz wiersz: ");          // deklaracja
                    wiersz = scanner.nextByte();
                    nrPola = String.format("%d%d", kolumna, wiersz);
                    proba=proba+3;
                }
                else {
                    System.out.println("else");
                    System.out.println(nrPola);
                    poleGry[wiersz][kolumna] = "[O]";
                    System.out.println("   0  "+"1  "+"2  "+"3  "+"4  "+"5  "+"6  "+"7  "+"8  "+"9  ");
                    System.out.println("0 "+poleGry[0][0] + poleGry[0][1] + poleGry[0][2] + poleGry[0][3] + poleGry[0][4] + poleGry[0][5] + poleGry[0][6] + poleGry[0][7] + poleGry[0][8] + poleGry[0][9]);
                    System.out.println("1 "+poleGry[1][0] + poleGry[1][1] + poleGry[1][2] + poleGry[1][3] + poleGry[1][4] + poleGry[1][5] + poleGry[1][6] + poleGry[1][7] + poleGry[1][8] + poleGry[1][9]);
                    System.out.println("2 "+poleGry[2][0] + poleGry[2][1] + poleGry[2][2] + poleGry[2][3] + poleGry[2][4] + poleGry[2][5] + poleGry[2][6] + poleGry[2][7] + poleGry[2][8] + poleGry[2][9]);
                    System.out.println("3 "+poleGry[3][0] + poleGry[3][1] + poleGry[3][2] + poleGry[3][3] + poleGry[3][4] + poleGry[3][5] + poleGry[3][6] + poleGry[3][7] + poleGry[3][8] + poleGry[3][9]);
                    System.out.println("4 "+poleGry[4][0] + poleGry[4][1] + poleGry[4][2] + poleGry[4][3] + poleGry[4][4] + poleGry[4][5] + poleGry[4][6] + poleGry[4][7] + poleGry[4][8] + poleGry[4][9]);
                    System.out.println("pudło");

                    System.out.println("Wybierz kolumnę: ");          // deklaracja
                    kolumna = scanner.nextByte();
                    System.out.println("Wybierz wiersz: ");          // deklaracja
                    wiersz = scanner.nextByte();
                    nrPola = String.format("%d%d", kolumna, wiersz);
                    proba=proba+5;

                }

            }
            switch (proba){

                case 36:
                    System.out.println("Wygrałeś");
                    break;
                case 80:
                    System.out.println("Pozdro poćwicz");
                    break;
                default:
                    System.out.println("Za duzo prób");
            }
        }
    }



