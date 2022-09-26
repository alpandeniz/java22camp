public class Main {
    public static void main(String[] args) {
        String playlist1 = "Yaşar Kurt - Ruhum";
        String playlist2 = "Ezhel - 3 Gün";
        String playlist3 = "The White Buffalo - Oh Darling";
        String playlist4 = "Frank Sinatra - Thats Life";

        String[] dailyPlayList = new String[4];
        dailyPlayList[0] ="Yaşar Kurt - Ruhum";
        dailyPlayList[1] ="Ezhel - 3 Gün";
        dailyPlayList[2] ="The White Buffalo - Oh Darling";
        dailyPlayList[3] ="Frank Sinatra - Thats Life";

        System.out.println(dailyPlayList.length);

        for (int i=0;i<dailyPlayList.length;i++){
            System.out.println(dailyPlayList[i]);
        }
        System.out.println("--------");

        for (String playList:dailyPlayList){
            System.out.println(playList);
        }

    }
}