import java.util.Random;

public class Battelfield {

    double length = 0;
    double width = 0;
    public Battelfield(double length, double width){
        this.length = length;
        this.width = width;
        System.out.println("Игрок твое поле: " + this.length * this.width + "м2");
    }

    int howManyOrc = 0;

    public void infoAboutAreaSize(){
        System.out.println( "Размер поля: " + length * width);
    }
    public void InfoHowManyOrcs(){
        System.out.println("Столько орков на поле :" + howManyOrc);
    }


}
