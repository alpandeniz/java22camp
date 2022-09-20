public class Main {
    public static void main(String[] args) {
    int[] numbers = new int[]{1,2,5,7,9,0};
    int scanner = 5;
    boolean varMi = false;

    for (int number : numbers){
        if (number == scanner){
            varMi = true;
            break;
        }

    }
    if (varMi){
        System.out.println("Sayı mevcut.");
    }else {
    System.out.println("Sayı mevcut değil.");
    }
    }

    }
