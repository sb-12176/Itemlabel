public class Papupi extends ItemCreature{

    private final int PICK_UP_LIMIT = 1;

//Constructors

    /**
     * Default constructor for Papupi.
     */
    public Papupi() {
        super();
    }

    /**
     * Value constructor for Papupi that sets the name.
     * @param name What to set the name of the Papupi to
     */
    public Papupi(String name) {
        super(name);
    }

    /**
     * Value constructor for Papupi that sets the name and age.
     * @param name What to set the name of the Papapupi to
     * @param age What to set the age of the Papupi to
     */
    public Papupi(String name, int age) {
        super(name, age);
    }

    /**
     * Value constructor for Papupi that sets the name, age, and color.
     * @param name What to set the name of the Papupi to
     * @param age What to set the age of the papupi to
     * @param color What to set the color of the papupi to
     */
    public Papupi(String name, int age, String color) {
        super(name, age, color);
    }

    /**
     * Makes peepy grow into a papupi.
     * @param peepy The peepy that will grow into a papupi
     */
    public Papupi(Peepy peepy) {
        super(peepy);
    }

//Methods

    //other methods

    public void grow(){
        System.out.println("This creature does not grow!");
    }

}
