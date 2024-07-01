
public class Main {
    public static void sortiere(int[] zahlen) {

        if (zahlen == null || zahlen.length == 0) {
            return;
        }

        int laenge = zahlen.length;
        quicksort(zahlen, 0, laenge - 1);
    }
    public static void main(String[] args)
    {
        int[] zahlen = {6,2,5,1,7,9,3};
        sortiere(zahlen);
        for (int z : zahlen)
        {
            System.out.print(z+"\t");
        }

    }


    public static void quicksort(int[] zahlen, int niedrig, int hoch)
    {
        int i = niedrig, j = hoch;

        // Wir holen uns das Pivot Element aus der Mitte der Liste:
        int pivot = zahlen[niedrig + (hoch - niedrig) / 2];

        // Wir teilen die Liste in zwei Listen auf:
        while (i <= j) {
            // Ist das linke Element niedriger als das Pivotelement, dann prüfen wir das naechste Element in der linken Liste.
            while (zahlen[i] < pivot) {
                i++;
            }

            // Ist das rechte Element größer als das Pivotelement, dann prüfen wir das naechste Element in der rechten Liste.
            while (zahlen[j] > pivot) {
                j--;
            }

            // Haben wir Zahlen in beiden Listen gefunden, die nicht richtig sortiert sind, dann tauschen wir diese.
            if (i <= j) {
                int temp = zahlen[i];
                zahlen[i] = zahlen[j];
                zahlen[j] = temp;
                i++;
                j--;
            }
        }
        if (niedrig < j)
        {
            quicksort(zahlen, niedrig, j);
        }

        if (i < hoch)
        {
            quicksort(zahlen, i, hoch);
        }
    }

}
