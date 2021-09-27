/* A banji class that implements Tradable and Domesticatable
 */
public class banji implements Tradable, Domesticatable {

    @Override
    public int getPrice() {
        return 8888.88;
    }

    @Override
    public String sound() {
        return "biaji biaji";
    }
}

