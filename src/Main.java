import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void say(String text){
        System.out.println(text);
    }


    public static void main(String[] args) {
        /*
        say("Hello welcome to the itemalbel game.");
        say("lets make youe a peepy. first lets choose a name.");
        String firstName = scan.nextLine();
        say("Your peepy will be named " + firstName);
         */

        OuiOui oui = new OuiOui("Lobes", 1000, "brown");
        oui.info();

        OuiOui l = new OuiOui();
        l.info();

        Papupi pupu = new Papupi("Cheese", 2, "yellow");
        pupu.info();

        Food mango = new Food("mango", 1);
        pupu.feed(mango);
        say(pupu.sayFull());












        //sleep(1000);

        /*Peepy firstPeepy = new Peepy();
        System.out.println(firstPeepy.toString());

        Food firstFood = new Food("peanut", 10);
        System.out.println(firstFood.toString());

        firstPeepy.feed(firstFood);
         */
    }
}