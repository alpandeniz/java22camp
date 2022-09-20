public class Main {
    public static void main(String[] args) {
        String student1 = "Alpan";
        String student2 = "Engin";
        String student3 = "Derin";
        String student4 = "Efsane";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

        System.out.println("----------");

        //[] = array diye okunur. Dizi yazılacaksa tanım komutunun hemen yanında Stringse String[] intse int[]

        String[] students = new String[4];
        students[0] = "Alpan";
        students[1] = "Engin";
        students[2] = "Derin";
        students[3] = "Efsane";
        //students[4] = "Ali";

        System.out.println("----------");

        for (int i=0;i<students.length;i++){
            System.out.println(students[i]);
        }
        for (String student:students){
            System.out.println(student);
        }

    }
}