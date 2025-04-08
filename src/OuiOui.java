import java.awt.*;
import java.util.Random;

public class OuiOui extends Peepy{

    /**
     * Default constructor for ouioui.
     */
    public OuiOui(){
        name = "No Name";
        age = -1;
        color = "null";
    }

    /**
     * Value constructor for ouioui that only sets the name
     * @param name What to make the name of this new ouioui object.
     */
    public OuiOui(String name){
        this.name = name;
        age = -1;
        color = "null";
    }

    /**
     * Value constructor for ouioui that sets the name and age
     * @param name What to set the name of oyioui to.
     * @param age What to set the age of ouioui to.
     */
    public OuiOui(String name, int age){
        this.name = name;
        this.age = age;
        color = "null";
    }

    /**
     * Value constructor for ouioui that sets all the fields, name age and colour.
     * @param name What to set the name of the ouioui to.
     * @param age What to set the age of tje ouioui to.
     * @param color What to set the color of the ouioui to.
     */
    public OuiOui(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

//methods
    //other methods

    /**
     * Grows this ouioui into a peepy, keeping all the same fields
     * except the age increases.
     */
    public void grow(){
        //not finished
        new Peepy(name, age+1, color);
    }

    /**
     * Grows this ouioui into a peepy, keeping all the same fields,
     * except the age increases, and it has a new color.
     * @param newColor The color that the peepy made from ouioui will be changed to.
     */
    public void grow(String newColor){
        //not finished
        new Peepy(name, age+1, newColor);
    }




}
