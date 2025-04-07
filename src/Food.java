public class Food {

    private String type;
    private int feedValue;


//Constructors

    /**
     * Default contructor for Food.
     */
    public Food(){
        type = "Null Type";
        feedValue = -1;
    }

    /**
     * Value contructor for Food, Initicalized type.
     * @param type Sets the type of the food.
     */
    public Food(String type){
        this.type = type;
        feedValue = -1;
    }

    /**
     * Value contructor for Food. Inizia;izes type and feedValue
     * @param type Sets the type of the food.
     * @param feedValue Sets the full value of the food.
     */
    public Food(String type, int feedValue){
        this.type = type;
        this.feedValue = feedValue;
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





    @Override
    public String toString(){
        return "This is a food of " + type + " type. It has " + feedValue + " feed value.";
    }

}
