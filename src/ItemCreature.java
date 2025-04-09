public abstract class ItemCreature {

//fields
    protected String name;
    protected int age;
    protected String color;
    protected int full;

//constructors

    /**
     * Default constructor for item creatures.
     */
    public ItemCreature(){
        name = "No Name";
        age = -1;
        color = "null";
        full = 0;
    }

    /**
     * Value constructor for item creatures that sets the name.
     * @param name What the name of the item creature will be set to
     */
    public ItemCreature(String name){
        this.name = name;
        age = -1;
        color = "null";
        full = 0;
    }

    /**
     * Value constructor for item creatues that sets the name and age.
     * @param name What the name of the item creature will be set to
     * @param age What the age of the item creature will be set to.
     */
    public ItemCreature(String name, int age){
        this.name = name;
        this.age = age;
        color = "null";

        full = 0;
    }

    /**
     * Value constructor for item creatures that sets the name,
     * age, and color of the item creature.
     * @param name What the name of the item creature will be set to
     * @param age What the age of the item creature will be set to
     * @param color What the color of the item creature will be set to
     */
    public ItemCreature(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;

        full = 0;
    }

    /**
     * Copy constructor for item creature.
     * @param creature Another item creature to copy
     */
    public ItemCreature(ItemCreature creature){
        this.name = creature.name;
        this.age = creature.age;
        this.color = creature.color;
        this.full = creature.full;
    }



//methods

    //getter methods

    /**
     * Returns the name of the item creature.
     * @return String name of the item creature.
     */
    public String getName(){
        return name;
    }

    /**
     * Returns the age of the item creature.
     * @return int age of the item creature
     */
    public int getAge(){
        return age;
    }

    /**
     * Returns the color of the item creature.
     * @return String color of the item creature.
     */
    public String getColor(){
        return color;
    }

    /**
     * Returns the fullness of the item creature.
     * @return int full
     */
    public int getFull(){
        return full;
    }

    //setter methods

    /**
     * Sets the name of the item creature.
     * @param name what to change the name of the item creature to.
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Sets the name of the item creature.
     * @param age What to change the age of the item creature to.
     */
    public void setAge(int age){
        this.age = age;
    }

    /**
     * Sets the color of the item creature.
     * @param color What to change the color of the item creature to.
     */
    public void setColor(String color){
        this.color = color;
    }

    //Other methods

    /**
     * Feeds the item creature and increases the full by a certain amount
     */
    public void feed(){
        full += 5;
        System.out.println("Fed " + name + ".");
    }

    /**
     * Feeds the item creature a specific food, increasing his fullness by
     * the full value of the food.
     * @param food The food that you are feeding the item creature.
     */
    public void feed(Food food){
        full += food.getFeedValue();
        System.out.println("Fed " + name + " a " + food.getType());
    }

    /**
     * Prints the info of the item creature.
     * Says the type of creature, (papupi, peepy, ouioui, peeoui)
     * Says the name of the creature,
     * Says the age of the creature,
     * Says the color of the creature,
     * Says the fullness of the creature.
     */
    public void info(){
        String subStr = getClass().toString();
        System.out.println("Type of creature: " + subStr.substring(6));
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Color: " + color);
        System.out.println("Fullness: " + full);
    }

    @Override
    public String toString(){
        return "Hello I am a " + getClass() + " named " + name + ".\nI am " + age + " years old and am color " + color + ".";
    }

}
