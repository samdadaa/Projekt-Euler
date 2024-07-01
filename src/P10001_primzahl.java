import java.util.ArrayList;
/*Wenn wir die ersten 6 Primzahlen auflisten: 2, 3, 5, 7, 11 und 13, können wir sehen, dass die 6. Primzahl 13 ist.

Was ist die 10001. Primzahl?*/
public class P10001_primzahl
{
    public static void main(String[] args)
    {
        ArrayList<Integer> primzahlen = new ArrayList<>();
        for (int i = 2;i<10000;i++)
        {
            primzahlen.add(i);
        }
        for (int j = 0;j<primzahlen.size();j++)
        {
            if (primzahlen.get(j)>2 && primzahlen.get(j)%2==0)
            {
                if (primZahlcheck(j,2))
                {
                    primzahlen.remove(j);
                }
            }
        }
        for (int d = 0;d<primzahlen.size();d++)
        {
            if (primzahlen.get(d)>3 && primzahlen.get(d)%3==0)
            {
               if (primZahlcheck(d,3))
               {
                   primzahlen.remove(d);
               }
            }
        }
        for (int f = 0;f<primzahlen.size();f++)
        {
            if (primzahlen.get(f)>5 && primzahlen.get(f)%5==0)
            {
                if (primZahlcheck(f,5))
                {
                    primzahlen.remove(f);
                }
            }
        }
        for (int h=3; h<primzahlen.size();h++)
        {
            if (primZahlcheck(h,5))
            {
                primzahlen.remove(h);
            }
        }
        System.out.println(primzahlen.get(1000));
        for (int g=0;g<primzahlen.size();g++)
        {
            System.out.println(primzahlen.get(g));
        }

    }
    public static boolean primZahlcheck(int zahl, int d)
    {
        for (int i = 3;i<10000;i++)
        {
            if (zahl>d&&zahl%i==0)
            {
                return true;
            }
        }
        return false;
    }
}
