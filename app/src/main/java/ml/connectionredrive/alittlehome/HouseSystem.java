package ml.connectionredrive.alittlehome;

public class HouseSystem {
    private int houseLevel;
    private int housePrice;

    public void setHouseLevel(int houseLevel) {
        if (this.houseLevel < houseLevel) {
            this.houseLevel = houseLevel;
        }
    }

    public int getHouseLevel() {
        return houseLevel;
    }

    public void setHousePrice(int housePrice) {
        if (housePrice >= 0) {
            this.housePrice = housePrice;
        }
    }

    public int getHousePrice() {
        return housePrice;
    }
}
