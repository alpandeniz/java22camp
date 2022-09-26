public class Main {

    public static void main(String[] args) {

        String classRoom1 = "A Sınıfı";
        String classA[] = {"Ali","Ahmet","Mehmet"};

        String classRoom2 = "B Sınıfı";
        String classB[] = {"Ayşe", "Kıvanç","Fatma" };
        String classRoom3 = "C Sınıfı";
        String classC[] = {"Behlül", "Bihter","Ali Rıza" };
        String classRoom4 = "D Sınıfı";
        String classD[] = {"Tayyip","Arda","Emine" };

        String[] room1 = classA;

        String[] classRooms = {classRoom2, classRoom1, classRoom3, classRoom4};

        //System.out.println(classRooms);

        for (String school : classRooms) {
            System.out.println(school);
        }
        for (String room: room1) {
            System.out.println(room);
        }

    }
}