import java.util.Scanner;

/*
Die Summe der Quadrate der ersten 10 natürlichen Zahlen ist

1 hoch 2 + 2 hoch 2 + ... + 10 hoch 2 = 385
Das Quadrat der Summe der ersten 10 natürlichen Zahlen ist

        (1 + 2 + ... + 10)hoch 2 = 552 = 3025
Somit ist die Differenz aus der Summe der Quadrate der ersten zehn natürlichen Zahlen und dem Quadrat der Summe 3025 - 385 = 2640.

Finden Sie die Differenz aus der Summe der Quadrate der ersten einhundert natürlichen Zahlen und dem Quadrat der Summe.
*/


public class summe_Quadrat_Differenz
{
    public static void main(String[] args)
    {
        int summeQuadrat=0;
        int quadratSumme= 0;
    int hochZahl;
    int differenz=0;
        System.out.println("Geben Sie die Hochzahl von dem Quadrat:");
        Scanner scanner = new Scanner(System.in);
        hochZahl= scanner.nextInt();
        for (int i =0;i<=hochZahl;i++)
        {
            summeQuadrat = summeQuadrat +(i*i);
        }
        System.out.println("die Summe der Quadrate der "+hochZahl+" natürlichen Zahlen ist: "+summeQuadrat);
        for (int j=0;j<=hochZahl;j++)
        {
            quadratSumme=quadratSumme+j;
        }
        quadratSumme= quadratSumme*quadratSumme;
        System.out.println("Das Quadrat der Summe der ersten "+hochZahl+" natürlichen Zahlen ist: "+quadratSumme);
        differenz = quadratSumme-summeQuadrat;

        System.out.println("Die Differenz aus der Summe der Quadrate der ersten "+hochZahl+" natürlichen Zahlen und dem Quadrat der Summe "+quadratSumme+" + "+summeQuadrat+" =  "+differenz);
    }
}
