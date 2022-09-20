public class Main {
    public static void main(String[] args) {
        int number1 = 284;
        int number2 = 220;
        int total = 0;

        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                total = total + i;
            }
        }
        if (total == number1 || total == number2) {
            System.out.println("Arkadaş sayı");
        } else {
            System.out.println("Arkadaş olmayan sayı");
        }
    }
}