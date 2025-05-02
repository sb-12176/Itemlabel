import java.util.ArrayList;
public class Bag {
    private ArrayList<Food> space;
    private String name;

//Constructors
    /**
     * Default contrsuctor for bag class.
     */
    public Bag(){
        space = new ArrayList<Food>();
    }

    /**
     * field constructor for bag. sets name and creates the space in the bag
     * @param name What the name of the bag will be
     */
    public Bag(String name){
        space = new ArrayList<Food>();
        this.name = name;
    }


//methods

    //getter methods

    /**
     * Gets the contents of the bag
     * @return Returns string that says every object in the bag.
     */
    public String getContents(){
        return "idk";
    }

    /**
     * Retirns the name of the bag
     * @return String name of the bag
     */
    public String getName(){
        return name;
    }


    //other methods

    public void addFood(Food food){
        space.add(food);
    }

    public boolean contains(Food food){
        return space.contains(food);
    }

    public void remove(Food food){
        space.remove(food);
    }




}
