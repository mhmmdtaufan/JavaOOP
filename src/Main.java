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

        System.out.println("Name    : " + player1.name);
        System.out.println("Power   : " + player1.power);
        System.out.println("Speed   : " + player1.speed);
        System.out.println("Reach   : " + player1.reach);
        System.out.println("Star    : " + player1.star);
        System.out.println("Money   : " + player1.money);
        System.out.println("Health  : " + player1.health);

        System.out.println("-------------------------------");

        System.out.println("Name    : " + player2.name);
        System.out.println("Power   : " + player2.power);
        System.out.println("Speed   : " + player2.speed);
        System.out.println("Reach   : " + player2.reach);
        System.out.println("Star    : " + player2.star);
        System.out.println("Money   : " + player2.money);
        System.out.println("Health  : " + player2.health);
    }
}
