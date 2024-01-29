import java.util.Random;

public class Orc {
    Random random = new Random();
    int quentityOfOrks;

    int powerOfOrc;

    private boolean isFight = false;

    public Orc(int quentityOfOrks, int powerOfOrc) {
        this.quentityOfOrks = quentityOfOrks;
        this.powerOfOrc = powerOfOrc;
        System.out.println("Покажи какое кол-во орков: " + this.quentityOfOrks + " и какая у них сила: " + this.powerOfOrc);

    }


}