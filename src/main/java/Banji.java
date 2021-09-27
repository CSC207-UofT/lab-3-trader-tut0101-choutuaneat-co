/* A banji class that implements Tradable and Domesticatable
 */
public class Banji implements Tradable, Domesticatable {

    @Override
    public int getPrice() {
        return 8888;
    }

    @Override
    public String sound() {
        return "biaji biaji";
    }
}

