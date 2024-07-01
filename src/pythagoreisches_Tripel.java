import java.util.Scanner;

/*Ein pythagoreisches Tripel ist eine Menge von drei natürlichen Zahlen, a < b < c, für die gilt:

a2 + b2 = c2
Beispiel: 32 + 42 = 9 + 16 = 25 = 52.

Es existiert genau ein pythagoreisches Tripel, für das a + b + c = 1000.
Finden Sie das Produkt abc.*/

public class pythagoreisches_Tripel
{
    public static void main(String[] args)
    {
        System.out.println(tripelFinden(1000));
    }
    public static Long tripelFinden(int limit)
    {
        long antwort=0;
        for (var a= 3;a<limit;a++)
        {
            for (var b = a+1;b<limit;b++)
            {
                double c = (a*a)+(b*b);
                c = Math.sqrt(c);

                if ((a+b+c)==limit)
                {
                    antwort= (long) (a*b*c);
                    break;
                }
            }

        }
        return antwort;
    }
}
