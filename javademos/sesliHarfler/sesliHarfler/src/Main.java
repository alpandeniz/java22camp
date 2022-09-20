public class Main {
    public static void main(String[] args) {
        char harf = 'A';
        String[] Harfler = new String[8];
        Harfler[0] = "A";
        Harfler[1] = "O";
        Harfler[2] = "I";
        Harfler[3] = "U";
        Harfler[4] = "E";
        Harfler[5] = "İ";
        Harfler[6] = "Ü";
        Harfler[7] = "Ö";

        for (int i = 0; i < Harfler.length; i++) {
            switch (harf) {
                case 'A':
                case 'I':
                case 'U':
                case 'O':
                    System.out.println("Kalın sesli harf girdiniz.");
                    return;
                case 'E':
                case 'İ':
                case 'Ö':
                case 'Ü':
                    System.out.println("İnce sesli harf girdiniz.");
                    return;
                default:
                    System.out.println("Geçersiz seçim yaptınız.");
                    return;



            }

        }
        }
    }