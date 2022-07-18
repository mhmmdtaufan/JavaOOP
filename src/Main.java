public class Main {
    public static void main(String[] args) {
        var player1 = new Player("Komo");
        player1.power = 84;
        player1.speed = 37;
        player1.reach = 20;
        player1.star = 3;
        player1.setMoney(50);

        var player2 = new Player("Snowbi");
        player2.power = 49;
        player2.speed = 90;
        player2.reach = 50;
        player2.star = 2;
        player2.setMoney(35);

        System.out.println("Player Profile : ");
        System.out.println("-------------------------------");

        player1.display();

        System.out.println("-------------------------------");

        player2.display();
    }
}
