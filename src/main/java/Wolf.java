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
        this.maxSpeed += 2;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed -= 2;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
}
