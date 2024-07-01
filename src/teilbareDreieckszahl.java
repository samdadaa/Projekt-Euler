import java.util.ArrayList;

public class teilbareDreieckszahl {
    public static void main(String[] args) {

        ArrayList<Integer> dreiEckZahlenListe = new ArrayList<>();
        int dreieckZahl = 0;
        for (int zahl = 1; zahl < 10000; zahl++) {
            dreieckZahl += zahl;
            dreiEckZahlenListe.add(dreieckZahl);
        }
        zeahleTeilbar(dreiEckZahlenListe);
    }

    public static void zeahleTeilbar(ArrayList<Integer> dreiEckZahlenListe) {
        int zealer = 0;
        for (Integer zahl : dreiEckZahlenListe) {
            for (int i = 1; i < 10000; i++) {
                if (zahl % i == 0) {
                    zealer++;
                }
            }
            if (zealer > 500) {
                System.out.println(zahl);
                System.out.println(zealer);
                break;
            }
        }
    }
}


