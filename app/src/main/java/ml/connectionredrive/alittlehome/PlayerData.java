package ml.connectionredrive.alittlehome;

public class PlayerData {
    private int money;
    private int wood;
    private int meat;
    private int steel;
    private int population;

    public PlayerData() {
        money = 0;
        wood = 0;
        meat = 0;
        steel = 0;
        population = 0;
    }

    public void setMoney(int money) {
        if (money >= 0) {
            this.money = money;
        }
    }

    public int getMoney() {
        return money;
    }

    public void setWood(int wood) {
        if (wood >= 0) {
            this.wood = wood;
        }
    }

    public int getWood() {
        return wood;
    }

    public void setMeat(int meat) {
        if (meat >= 0) {
            this.meat = meat;
        }
    }

    public int getMeat() {
        return meat;
    }

    public void setSteel(int steel) {
        if (steel >= 0) {
            this.steel = steel;
        }
    }

    public int getSteel() {
        return steel;
    }

    public void setPopulation(int population) {
        if (population >= 0) {
            this.population = population;
        }
    }

    public int getPopulation() {
        return population;
    }
}
