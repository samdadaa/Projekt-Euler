public class prim
{
    public static void main(String[] args) {
        int sum=0;
        // Methode 1: Brute-Force-Ansatz
        for (int num = 2; num < 2000000; num++) {
            if (isPrime(num)) {
                sum += num;
            }
        }
        System.out.println(sum);
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
