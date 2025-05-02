import java.util.ArrayList;
public class Bag {
    private ArrayList<Food> space = new ArrayList<Food>();

    public Bag(){
        //um i dont know
    }

    public String getContents(){
        return "idk";
    }

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
