import java.util.ArrayList;

public class SummierungVonPrimzahlen
{
    public static void main(String[] args) {
        ArrayList<Integer> primzahlen = new ArrayList<>();

        for(int i =2;i<4000000;i++)
        {
            primzahlen.add(i);
        }
        for (int j = 0;j<primzahlen.size();j++)
        {
            if (primzahlen.get(j)>2&& primzahlen.get(j)%2==0)
            {
                primzahlen.remove(j);
            } else if (primzahlen.get(j)>3&&primzahlen.get(j)%3==0) {
                primzahlen.remove(j);
            } else if (primzahlen.get(j)>5&&primzahlen.get(j)%5==0) {
                primzahlen.remove(j);
            }
        }
        double summe=0;
        for (int t=0;t<primzahlen.size();t++)
        {
            if (primzahlen.get(t)<1999999)
            {
                summe+=primzahlen.get(t);
            } else if (primzahlen.get(t)>=1999999) {
                break;
            }

        }
        System.out.println(summe);

    }
}
