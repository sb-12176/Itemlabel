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




    @Override
    public String toString(){
        return ("Hello I am peepy named " + name + ". I am " + age + " years old and color " + color.toString());
    }

}
