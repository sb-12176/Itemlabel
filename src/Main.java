public class Main {
    public static void main(String[] args) {
        Peepy firstPeepy = new Peepy();
        System.out.println(firstPeepy.toString());

        Food firstFood = new Food("peanut", 10);
        System.out.println(firstFood.toString());

        firstPeepy.feed(firstFood);
    }
}