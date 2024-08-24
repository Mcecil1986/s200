public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit card number as a long integer: ");
        long creditCardNumber = input.nextLong();

        if (isValid(creditCardNumber)) {
            System.out.println(creditCardNumber + " is valid");
        } else {
            System.out.println(creditCardNumber + " is invalid");
        }
    }
    public static boolean isValid(long number) {
        int total = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        return (total % 10 == 0) && (getSize(number) >= 13) && (getSize(number) <= 16);
    }
    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        String numStr = String.valueOf(number);

        for (int i = numStr.length() - 2; i >= 0; i -= 2) {
            int doubleDigit = getDigit(Character.getNumericValue(numStr.charAt(i)) * 2);
            sum += doubleDigit;
        }
        return sum;
    }
    public static int getDigit(int number) {
        if (number < 10) {
            return number;
        } else {
            return (number % 10) + (number / 10);
        }
    }
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        String numStr = String.valueOf(number);

        for (int i = numStr.length() - 1; i >= 0; i -= 2) {
            sum += Character.getNumericValue(numStr.charAt(i));
        }
        return sum;
    }
    public static int getSize(long d) {
        return String.valueOf(d).length();
    }
    public static boolean prefixMatched(long number, int d) {
        return getPrefix(number, getSize(d)) == d;
    }
    public static long getPrefix(long number, int k) {
        String numStr = String.valueOf(number);
        if (k > numStr.length()) {
            return number;
        } else {
            return Long.parseLong(numStr.substring(0, k));
        }
    }
}