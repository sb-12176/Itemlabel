import java.awt.*;

public class Peepy {

    private String name;
    private int age;
    private Color color;

    public Peepy(){
        name = "No Name";
        age = -1;
        color = Color.WHITE;
    }




    public Peepy(String name){
        this.name = name;
        age = -1;
        color = Color.WHITE;
    }

    public Peepy(String name, int age){
        this.name = name;
        this.age = age;
        color = Color.WHITE;
    }

    public Peepy(String name, int age, Color color){
        this.name = name;
        this.age = age;
        this.color = color;
    }




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





    @Override
    public String toString(){
        return ("Hello I am peepy named " + name + ". I am " + age + " years old and color " + color.toString());
    }

}
