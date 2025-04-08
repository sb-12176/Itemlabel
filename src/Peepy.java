public class Peepy {

    protected String name;
    protected int age;
    protected String color;

    private int full;
    private final int FULLFULL = 100;

//constructors

    /**
     * Default cotructor for peepy.
     */
    public Peepy(){
        name = "No Name";
        age = -1;
        color = "null";

        full = 0;
    }

    /**
     * Value contructor for peepy that sets only the name.
     * @param name What the name of the peepy will be set to.
     */
    public Peepy(String name){
        this.name = name;
        age = -1;
        color = "null";

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
        color = "null";

        full = 0;
    }

    /**
     * Value constructor that contruscts name, age, and color of the peepy.
     * @param name What the name of the peepy will be set to.
     * @param age What the age of the peepy will be set to.
     * @param color What the colour of the peepy will be set to.
     */
    public Peepy(String name, int age, String color){
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
     * @return String color of the peepy.
     */
    public String getColor(){
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
    public void setColor(String color){
        this.color = color;
    }

    //Other methods

    /**
     * Feeds the peepy and increases the full by a certain amount
     */
    public void feed(){
        full += 5;
        System.out.println("Fed " + name + ".");
        /*if (rand.nextBoolean()){
            System.out.println(name + " says: yummy this is a good food.\nNow I am " + full + "% full.");
        } else {
            System.out.println(name + " says: ok.......this is an ok food.\nNow I am " + full + "% full.");
        }*/
    }

    /**
     * Feeds the peepy a specific food, increasing his fullness by
     * the full value of the food.
     * @param food The food that you are feeding the peepy.
     */
    public void feed(Food food){
        full += food.getFeedValue();
        System.out.println("Fed " + name + " a " + food);
        /*if (rand.nextBoolean()){
            System.out.println(name + " says: yummy this is a good " + food.getType() + " food.\nNow I am " + full + "% full.");
        } else {
            System.out.println(name + " says: ok.......this is an ok " + food.getType() + " food.\nNow I am " + full + "% full.");
        }
        */
    }

    /**
     * Prints the info of the peepy.
     */
    public void info(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Color: " + color);
        System.out.println("Fullness: " + full);
    }


    @Override
    public String toString(){
        return "This is peepy named " + name + ". he is " + age + " year old and color " + color;
        //return (name + " says: Hello I am peepy named " + name + ". \nI am " + age + " years old. \nI am color " + color);
    }

}
