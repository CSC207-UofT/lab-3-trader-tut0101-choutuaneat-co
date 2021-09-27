public class Wolf implements Tradable, Drivable {
    private int maxSpeed;

    public Wolf() {
        this.maxSpeed = 1;
    }
    @Override
    public int getPrice() {
        return 20;
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
        return this.maxSpeed;
    }
}
