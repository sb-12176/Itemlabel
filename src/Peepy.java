public class Peepy extends ItemCreature{

    private final int FULLFULL = 100;

//constructors

    /**
     * Default constructor for peepy.
     */
    public Peepy(){
        super();
    }

    /**
     * Value constructor for peepy that sets only the name.
     * @param name What the name of the peepy will be set to.
     */
    public Peepy(String name){
        super(name);
    }

    /**
     * Value constructor that constructs name and age of the peepy.
     * @param name What the name of the peepy will be set to.
     * @param age What the age of the peepy will be set to.
     */
    public Peepy(String name, int age){
        super(name, age);
    }

    /**
     * Value constructor that contruscts name, age, and color of the peepy.
     * @param name What the name of the peepy will be set to.
     * @param age What the age of the peepy will be set to.
     * @param color What the colour of the peepy will be set to.
     */
    public Peepy(String name, int age, String color){
        super(name, age, color);
    }

    /**
     * Makes Ouioui grow into a peepy.
     * @param oui The Ouioui that will grow into a peepy
     */
    public Peepy(OuiOui oui){
        super(oui);
    }


//methods

    //Other methods


}
