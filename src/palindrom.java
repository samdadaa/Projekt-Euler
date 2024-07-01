/*Eine Palindromzahl liest sich rückwärts so wie vorwärts. Das größte Palindrom, das ein Produkt von 2 zweistelligen Zahlen ist, ist 9009 = 91 × 99.

Finden Sie das größte Palindrom, das das Produkt von 2 dreistelligen Zahlen ist.*/

public class palindrom
{

    public static void main(String[] args) {
        int largestPalindrome = 0;

        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999; j++) {
                int product = i * j;
                String productString = String.valueOf(product);

                if (isPalindrome(productString)) {
                    if (product > largestPalindrome) {
                        largestPalindrome = product;
                    }
                }
            }
        }

        System.out.println("Größtes Palindromprodukt: " + largestPalindrome);
    }

    private static boolean isPalindrome(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0, j = chars.length - 1; i < chars.length / 2; i++, j--) {
            if (chars[i] != chars[j]) {
                return false;
            }
        }
        return true;
    }
}

