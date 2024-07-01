import java.util.Scanner;

public class leangsteCollatzFolge
{
    public static void main(String[] args) {
        int zahl;
        int zeahler=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib eine zahl ein" );
        zahl = scanner.nextInt();

        do {
            if (zahl%2==0)
            {
                zahl = zahl/2;
                System.out.print(zahl+" ");
                zeahler++;
            }else if (zahl%2!=0)
            {
                zahl = (zahl*3)+1;
                System.out.print(zahl+" ");
                zeahler++;
            }
        }while(zahl!=1);
        System.out.println();
        System.out.println(zeahler);
    }
}
