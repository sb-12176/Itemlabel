public class Food {

    private String type;
    private int feedValue;
    private String color;


//Constructors

    /**
     * Default constructor for Food.
     */
    public Food(){
        type = "No Type";
        feedValue = -1;
        color = "null";
    }

    /**
     * Value constructor for Food, Initializes type.
     * @param type Sets the type of the food.
     */
    public Food(String type){
        this.type = type;
        feedValue = -1;
        color = "null";
    }

    /**
     * Value constructor for Food. Initializes type and feedValue
     * @param type Sets the type of the food.
     * @param feedValue Sets the full value of the food.
     */
    public Food(String type, int feedValue){
        this.type = type;
        this.feedValue = feedValue;
        color = "null";
    }

    /**
     * Value constructor for Food. Initializes type, feed value, and
     * color of the food.
     * @param type What to set the type of the food to
     * @param feedValue What to set the feed value of the food to
     * @param color What tp set the color of the food to
     */
    public Food(String type, int feedValue, String color){
        this.type = type;
        this.feedValue = feedValue;
        this.color = color;
    }

//Methods

    //getter methods

    /**
     * Returns the type of the food.
     * @return String type of food.
     */
    public String getType(){
        return type;
    }

    /**
     * Returns the feed value of the food.
     * @return int feed value.
     */
    public int getFeedValue(){
        return feedValue;
    }

    /**
     * Returns the color of the food.
     * @return String color of the object of food
     */
    public String getColor(){
        return color;
    }

    //setter methods

    /**
     * Changes the type of the food.
     * @param type What to change the type to.
     */
    public void setType(String type){
        this.type = type;
    }

    /**
     * Changes the feed value of the food.
     * @param feedValue What to change the feed value to.
     */
    public void setFeedValue(int feedValue){
        this.feedValue = feedValue;
    }

    /**
     * Changes the color of the food.
     * @param color What to change the color of the food to
     */
    public void setColor(String color){
        this.color = color;
    }

    //Other methods

    public void info(){
        System.out.println("Type: " + type);
        System.out.println("Feed Value: " + feedValue);
        System.out.println("Color: " + color);
    }




    @Override
    public String toString(){
        return type + " food info: This is a food of " + type + " type. It has " + feedValue + " feed value.";
    }

}
