/*2520 ist die kleinste Zahl, die ohne Rest durch jede Zahl von 1 bis 10 teilbar ist.

Was ist die kleinste positive Zahl, die durch alle Zahlen von 1 bis 20 glatt teilbar ist?*/
// für 1000000000 = 232792560 ist die kleinste zahl die durch 1-20 ohne Rest teilbar

public class smallest_multiple
{
    public static void main(String[] args)
    {
        for (int i =1; i<1000000000;i++)
        {if (divisioncheck(i)){System.out.println(i);break;}}
    }
    public static boolean divisioncheck(int i)
    {for (int j =2;j<21;j++) {if (i%j!=0) {return false;}}return true;}
}
