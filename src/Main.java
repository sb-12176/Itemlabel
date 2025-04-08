import java.util.Scanner;
import static java.lang.Thread.sleep;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void say(String text){
        System.out.println(text);
    }


    public static void main(String[] args) {
        say("Hello welcome to the itemalbel game.");
        say(";ets make youe a peepy. first lets choose a name.");
        String firstName = scan.next();
        //sleep(1000);



        /*Peepy firstPeepy = new Peepy();
        System.out.println(firstPeepy.toString());

        Food firstFood = new Food("peanut", 10);
        System.out.println(firstFood.toString());

        firstPeepy.feed(firstFood);
         */
    }
}