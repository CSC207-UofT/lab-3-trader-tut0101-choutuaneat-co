public class Chou implements Drivable, Domesticatable, Tradable {
    private int maxSpeed;

    public void Horse() {
        this.maxSpeed = 10;
    }

    @Override
    public String sound() {
        return "CHOUTUANEAT!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return 10;
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
