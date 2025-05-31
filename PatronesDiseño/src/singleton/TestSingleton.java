package singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Player player = Player.getPlayer("krono");
        System.out.println(player);
        player = Player.getPlayer("mankinx");
        System.out.println(player);
    }
}
