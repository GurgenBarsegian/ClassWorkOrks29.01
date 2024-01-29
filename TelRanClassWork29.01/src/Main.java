import java.util.Random;

public class Main {
    public static void main(String[] args) {
          Random random = new Random();
          Battelfield world = new Battelfield(10, 10);


          int quentityOfOrcs = random.nextInt(2, 10);
          int powerOfOrc = random.nextInt(2, 100);
          Orc orc= new Orc(quentityOfOrcs, powerOfOrc);



    }
}
