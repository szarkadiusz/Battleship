import java.util.Scanner;
    public class GraWStatki {
        private static Scanner scanner=new Scanner(System.in);
        private static String nrPola;
        private static int kolumna;
        private static String[][] poleGry= new String[5][10];
        private static int wiersz;

        public static void main(String[] args) {

            System.out.println("Witaj w Grze w Statki !\n Podaj imię: ");
            String podajImie = scanner.nextLine();
            System.out.println(String.format("Witaj %s gra rozpoczyna się \n Wybierz Twój cel !", podajImie));

         for (kolumna = 0; kolumna < poleGry.length; kolumna++) {
             for (wiersz = 0; wiersz < poleGry[kolumna].length; wiersz++) {
                    System.out.print("[" + wiersz + kolumna + "]");
                }
             System.out.println();
            }

            choose();

            int proba=0;
            while (proba<80) {
                if ((nrPola.equals(10)) || ((nrPola.equals("20"))) || ((nrPola.equals("30"))) || ((nrPola.equals("14"))) || ((nrPola.equals("15"))) || ((nrPola.equals("32"))) || ((nrPola.equals("33"))) || ((nrPola.equals("34"))) || ((nrPola.equals("35"))) || ((nrPola.equals("47"))) || ((nrPola.equals("19"))) || ((nrPola.equals("29")))) {

                    System.out.println(nrPola);
                    poleGry[wiersz][kolumna] = ("[X]");
                    grid();
                    System.out.println("Trafiony !");
                    choose();
                    proba=proba+3;
                }
                else {

                    System.out.println(nrPola);
                    poleGry[wiersz][kolumna] = ("[O]");
                    grid();
                    System.out.println("Pudło !");
                    choose();
                    proba=proba+5;
                    }
            }
            switch (proba){

                case 36:
                    System.out.println(String.format("%s Wygrałeś. gratuluję !",podajImie));
                    break;
                case 80:
                    System.out.println(String.format("%s Pozdro poćwicz. Koniec gry.", podajImie));
                    break;
                default:
                    System.out.println(String.format("%s Za duzo prób. Koniec Gry",podajImie));
            }

        }
        public static void grid(){


            System.out.println("   0  "+"1  "+"2  "+"3  "+"4  "+"5  "+"6  "+"7  "+"8  "+"9  ");
            System.out.println("0 "+poleGry[0][0] + poleGry[0][1] + poleGry[0][2] + poleGry[0][3] + poleGry[0][4] + poleGry[0][5] + poleGry[0][6] + poleGry[0][7] + poleGry[0][8] + poleGry[0][9]);
            System.out.println("1 "+poleGry[1][0] + poleGry[1][1] + poleGry[1][2] + poleGry[1][3] + poleGry[1][4] + poleGry[1][5] + poleGry[1][6] + poleGry[1][7] + poleGry[1][8] + poleGry[1][9]);
            System.out.println("2 "+poleGry[2][0] + poleGry[2][1] + poleGry[2][2] + poleGry[2][3] + poleGry[2][4] + poleGry[2][5] + poleGry[2][6] + poleGry[2][7] + poleGry[2][8] + poleGry[2][9]);
            System.out.println("3 "+poleGry[3][0] + poleGry[3][1] + poleGry[3][2] + poleGry[3][3] + poleGry[3][4] + poleGry[3][5] + poleGry[3][6] + poleGry[3][7] + poleGry[3][8] + poleGry[3][9]);
            System.out.println("4 "+poleGry[4][0] + poleGry[4][1] + poleGry[4][2] + poleGry[4][3] + poleGry[4][4] + poleGry[4][5] + poleGry[4][6] + poleGry[4][7] + poleGry[4][8] + poleGry[4][9]);
        }

        public static void choose(){
            System.out.println("Wybierz kolumnę: ");
            kolumna = scanner.nextByte();
            System.out.println("Wybierz wiersz: ");
            wiersz = scanner.nextByte();
                if (wiersz<=4) {
                    nrPola = String.format("%d%d", kolumna, wiersz);
                }
                else{
                    System.out.println("Przekroczono liczbę wierszy (4)\n Podaj nr wiersza ponownie");
                    wiersz = scanner.nextByte();
                    nrPola = String.format("%d%d", kolumna, wiersz);
                }
        }

    }



