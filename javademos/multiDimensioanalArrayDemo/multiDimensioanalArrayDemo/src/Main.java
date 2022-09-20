public class Main {
    public static void main(String[] args) {
        String[][] citys=new String[3][3];

        citys[0][0]="İstanbul";
        citys[0][1]="Bursa";
        citys[0][2]="Bilecik";
        citys[1][0]="Ankara";
        citys[1][1]="Sivas";
        citys[1][2]="Konya";
        citys[2][0]="Mersin";
        citys[2][1]="Antalya";
        citys[2][2]="Hatay";

        for (int i =0; i<=2;i++) {
            System.out.println("----------------");
            for (int j=0; j<=2;j++){
                System.out.println(citys[i][j] );
            }
        }
        }



    }
