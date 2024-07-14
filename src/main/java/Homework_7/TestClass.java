package Homework_7;

import java.util.Collection;

public class TestClass {

    public static void main(String[] args) {

//        Player player1 = new Player(1, "AAA!1", 50, true);
    PlayerService service = null;
    int playerId = service.createPlayer("aaa1");
    service.addPoints(playerId, 100);

        Collection<Player> players = service.getPlayers();
        for (Player player : players) {
            System.out.println(player);
        }


//        System.out.println(player1);
//        PlayerService service = new PlayerServiceJSON();
//        System.out.println(service);
    }
}
