import java.util.Scanner; // Import the Scanner class for user input

public class BinaryConverter {
    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        int decimal = 0;
        int binaryLength = binaryString.length();

        for (int i = 0; i < binaryLength; i++) {
            char digit = binaryString.charAt(i);
            if (digit == '0') {
                decimal = decimal * 2;
            } else if (digit == '1') {
                decimal = decimal * 2 + 1;
            } else {
                throw new BinaryFormatException("Invalid binary character in the string: " + digit);
            }
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter a binary string: ");
        String binaryString = scanner.nextLine(); 

        try {
            int decimalValue = bin2Dec(binaryString);
            System.out.println("Decimal equivalent: " + decimalValue);
        } catch (BinaryFormatException e) {
            System.out.println("BinaryFormatException: " + e.getMessage());
        }

        scanner.close(); 
    }
}