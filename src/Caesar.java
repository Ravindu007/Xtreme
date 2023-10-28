import java.util.Scanner;

public class Caesar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        for (int i = 0; i < n; i++) {
            int shift = scanner.nextInt();
            scanner.nextLine(); // Consume the newline
            String message = scanner.nextLine();

            String result = "";
            if (isCiphertext(message)) {
                result = decrypt(message, shift);
            } else {
                result = encrypt(message, shift);
            }

            System.out.println(result);
        }

        scanner.close();
    }

    public static String encrypt(String plaintext, int shift) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : plaintext.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                encrypted.append((char) (base + (c - base + shift) % 26));
            } else {
                encrypted.append(c); // Keep spaces and other characters as they are
            }
        }
        return encrypted.toString();
    }

    public static String decrypt(String ciphertext, int shift) {
        StringBuilder decrypted = new StringBuilder();
        for (char c : ciphertext.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                decrypted.append((char) (base + (c - base - shift + 26) % 26));
            } else {
                decrypted.append(c); // Keep spaces and other characters as they are
            }
        }
        return decrypted.toString();
    }

    public static boolean isCiphertext(String message) {
        return message.contains("the");
    }
}
