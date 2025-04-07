import java.awt.*;
import java.util.Random;

public class Peepy {

    private String name;
    private int age;
    private Color color;

    private int full;
    private final int FULLFULL = 100;

    private Random rand;

//constructors

    /**
     * Default cotructor for peepy.
     */
    public Peepy(){
        name = "No Name";
        age = -1;
        color = Color.WHITE;
    }

    /**
     * Value contructor for peepy that sets only the name.
     * @param name What the name of the peepy will be set to.
     */
    public Peepy(String name){
        this.name = name;
        age = -1;
        color = Color.WHITE;

        full = 0;
    }

    /**
     * Value contructor that contructs name and age of the peepy.
     * @param name What the name of the peepy will be set to.
     * @param age What the age of the peepy will be set to.
     */
    public Peepy(String name, int age){
        this.name = name;
        this.age = age;
        color = Color.WHITE;

        full = 0;
    }

    /**
     * Value constructor that contruscts name, age, and color of the peepy.
     * @param name What the name of the peepy will be set to.
     * @param age What the age of the peepy will be set to.
     * @param color What the colour of the peepy will be set to.
     */
    public Peepy(String name, int age, Color color){
        this.name = name;
        this.age = age;
        this.color = color;

        full = 0;
    }


//methods

    //getter methods

    /**
     * Returns the name of the peepy.
     * @return String name of the peepy.
     */
    public String getName(){
        return name;
    }

    /**
     * Returns the age of the peepy.
     * @return int age of the peepy
     */
    public int getAge(){
        return age;
    }

    /**
     * Returns the color of the peepy.
     * @return Color color of the peepy.
     */
    public Color getColor(){
        return color;
    }

    /**
     * Returns the fullness of the peepy.
     * @return int full
     */
    public int getFull(){
        return full;
    }


    //setter methods

    /**
     * Sets the name of the peepy.
     * @param name what to change the name of the peepy to.
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Sets the name of the peepy.
     * @param age What to change the age of the peepy to.
     */
    public void setAge(int age){
        this.age = age;
    }

    /**
     * Sets the color of the peepy.
     * @param color What to change the color of the peepy to.
     */
    public void setColor(Color color){
        this.color = color;
    }

    //Other methods

    /**
     * Feeds the peepy and increases the full by a certain amount
     */
    public void feed(){
        full += 5;
    }

    /**
     * Feeds the peepy a specific food, increasing his fullness by
     * the full value of the food.
     * @param food The food that you are feeding the peepy.
     */
    public void feed(Food food){
        full += food.getFeedValue();
    }



    @Override
    public String toString(){
        return ("Hello I am peepy named " + name + ". \nI am " + age + " years old. \nI am color " + color);
    }

}
