import java.util.Arrays;
import java.util.Scanner;
    public class GraWStatki {
        private static Scanner scanner=new Scanner(System.in);
        private static String nrPola;
        private static int kolumna;
        private static String[][] poleGry= new String[10][10];
        private static int wiersz;

        public static void main(String[] args) {

            System.out.println("Witaj w Grze w Statki !\n Podaj imię: ");
            String podajImie = scanner.nextLine();
            System.out.println(String.format("Witaj %s gra rozpoczyna się \n Wybierz Twój cel !", podajImie));


         for (kolumna = 0; kolumna < poleGry.length; kolumna++) {
             for (wiersz = 0; wiersz < poleGry.length; wiersz++) {
                 for (int cnt =0;cnt<poleGry.length;cnt++) {
                     poleGry[wiersz][kolumna] = ("[" + wiersz + "" + kolumna + "]");
                 }
             }
            }

            grid();
            choose();

            int proba=0;
            while (proba<80) {
                if      ((nrPola.equals("10")) ||
                        ((nrPola.equals("20"))) ||
                        ((nrPola.equals("30"))) ||
                        ((nrPola.equals("14"))) ||
                        ((nrPola.equals("15"))) ||
                        ((nrPola.equals("32"))) ||
                        ((nrPola.equals("33"))) ||
                        ((nrPola.equals("34"))) ||
                        ((nrPola.equals("35"))) ||
                        ((nrPola.equals("47"))) ||
                        ((nrPola.equals("54"))) ||
                        ((nrPola.equals("58"))) ||
                        ((nrPola.equals("59"))) ||
                        ((nrPola.equals("19"))) ||
                        ((nrPola.equals("29")))) {


                    poleGry[wiersz][kolumna] = ("[X]");
                    grid();
                    System.out.println("Trafiony !");
                    choose();
                    proba=proba+3;
                }
                else {

                    poleGry[wiersz][kolumna] = ("[o]");
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


            for (String[] tab:poleGry) {
                System.out.println(Arrays.toString(tab));
            }
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



