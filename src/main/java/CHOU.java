public class Chou implements Drivable, Domesticatable, Tradable {
    private int maxSpeed;

    public Horse() {
        this.maxSpeed = 10;
    }

    @Override
    public String sound() {
        return "CHOUTUANEAT!";
    }

    @Override
    public int getMaxSpeed() {
        return 10;
    }
}
