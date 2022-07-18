import java.time.LocalDateTime;

class Player {
    public String name;
    public int power;
    public int speed;
    int reach; // default = public
    private int health;
    private int money;
    int star; // default = public

    Player(String playerName) {
        this.name = playerName;
        this.health = setHealthBasedOnTime();
    }

    void setMoney(int playerMoney) {
        this.money = this.star * playerMoney;
    }

    int setHealthBasedOnTime() {
        int tempHealth = 0;
        LocalDateTime currentTime = LocalDateTime.now();

        int currentHour = currentTime.getHour();
        if (currentHour >= 0 && currentHour < 8) {
            tempHealth = 80;
        }
        else if (currentHour >= 8 && currentHour < 16) {
            tempHealth = 100;
        }
        else if (currentHour >= 16 && currentHour <= 23) {
            tempHealth = 70;
        }

        return tempHealth;
    }

    void display() {
        System.out.println("Name    : " + this.name);
        System.out.println("Power   : " + this.power);
        System.out.println("Speed   : " + this.speed);
        System.out.println("Reach   : " + this.reach);
        System.out.println("Star    : " + this.star);
        System.out.println("Money   : " + this.money);
        System.out.println("Health  : " + this.health);
    }
}
