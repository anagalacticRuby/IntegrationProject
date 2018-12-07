/**
 * A test placeholder class that demonstrates constructors and returning values.
 * 
 * @author Nicholas Hansen
 *
 */
public class Character {
  // fields
  /**
   * This character's name.
   */
  private String name;
  /**
   * This character's health.
   */
  private int health;

  // methods
  /**
   * Determines what value this character's health points should be set to.
   * 
   * @param hp The health points this character currently has
   */
  public void setHealth(int hp) {
    health = hp;
  }

  /**
   * Retrieves this character's current health value.
   * 
   * @return Returns this character's current health value.
   */
  public int getHealth() {
    return health;
  }

  /**
   * Registers the name of this character.
   * 
   * @param nic Name of this character, shortened to nic (like nickname)
   */
  public void setName(String nic) { // set methods have a void return type
    name = nic;
  }

  /**
   * Retrieves this character's name.
   * 
   * @return Returns the name of this character.
   */
  public String getName() {
    // get methods match the type of the field in question
    // In this case the field is a String so String comes before getName();
    return name;
  }

  /**
   * A constructor that creates character objects. It allows the other methods of class Character to
   * be used.
   */
  public Character() { // This is the default constructor with no parameters
    this.name = "Nick";
    this.health = 10;
  }

  /**
   * Another constructor but this time with parameters it will look for. Also creates character
   * objects.
   * 
   * @param name The name of the generated character. Used by getName and setName.
   * @param health The health value of the generated character. Used by getHealth and setHealth.
   */
  public Character(String name, int health) {
    // Constructor with two parameters specified
    this.name = name;
    this.health = health; // If the parameter name is the same, use this.

  }

  /**
   * A test method that outputs a message when the entire class is called.
   */
  public void print() {
    System.out.println("This is a test message." + name);
  }
}
