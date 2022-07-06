public class Main {
    public static void main(String[] args) {
        var player1 = new Player();
        player1.name = "Komo";
        player1.power = 84;
        player1.speed = 37;
        player1.reach = 20;

        var player2 = new Player();
        player2.name = "Snowbi";
        player2.power = 49;
        player2.speed = 90;
        player2.reach = 50;

        System.out.println("Name  : " + player1.name + " vs " + player2.name);
        System.out.println("Power : " + player1.power + " || " + player2.power);
        System.out.println("Speed : " + player1.speed + " || " + player2.speed);
        System.out.println("Reach : " + player1.reach + " || " + player2.reach);
    }
}
