import java.time.LocalDateTime;

class Player {
    String name;
    int power;
    int speed;
    int reach;
    int health;
    int money;
    int star;

    Player(String playerName) {
        name = playerName;
        health = setHealthBasedOnTime();
    }

    void setMoney(int playerMoney) {
        money = star * playerMoney;
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
}
