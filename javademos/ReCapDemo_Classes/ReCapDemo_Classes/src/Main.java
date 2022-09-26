public class Main {
    public static void main(String[] args) {
    DortIslem dortIslem = new DortIslem();

    int sonucTopla = dortIslem.Topla(3,4);

    int sonucCikar = dortIslem.Cikar(14,6);

    int sonucBol = dortIslem.Bolme(30,5);

    int sonucCarp = dortIslem.Carp(25,4);

    System.out.println(sonucTopla);
    System.out.println(sonucCikar);
    System.out.println(sonucBol);
    System.out.println(sonucCarp);


    }
}