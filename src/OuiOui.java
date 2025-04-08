import java.awt.*;
import java.util.Random;

public class OuiOui extends Peepy{

    /**
     * Default constructor for ouioui.
     */
    public OuiOui(){
        name = "No Name";
        age = -1;
        color = Color.WHITE;
    }

    /**
     * Value constructor for ouioui that only sets the name
     * @param name What to make the name of this new ouioui object.
     */
    public OuiOui(String name){
        this.name = name;
        age = -1;
        color = Color.WHITE;
    }

    /**
     * Value constructor for ouioui that sets the name and age
     * @param name What to set the name of oyioui to.
     * @param age What to set the age of ouioui to.
     */
    public OuiOui(String name, int age){
        this.name = name;
        this.age = age;
        color = Color.WHITE;
    }

    /**
     * Value constructor for ouioui that sets all the fields, name age and colour.
     * @param name What to set the name of the ouioui to.
     * @param age What to set the age of tje ouioui to.
     * @param color What to set the color of the ouioui to.
     */
    public OuiOui(String name, int age, Color color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
}
