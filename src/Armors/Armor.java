package Armors;

public class Armor {
    private int id;
    private int blocking;

    private int money;

    public Armor(int id, int blocking, int money) {
        this.id = id;
        this.blocking = blocking;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBlocking() {
        return blocking;
    }

    public void setBlocking(int blocking) {
        this.blocking = blocking;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


}
