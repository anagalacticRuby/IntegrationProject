//Nicholas Hansen
public class Character {
  // fields
  private String name;
  private int health;

  // methods
  public void setHealth(int hp) {
    health = hp;
  }

  public int getHealth() {
    return health;
  }

  public void setName(String nic) { // set methods have a void return type
    name = nic;
  }

  public String getName() {
    // get methods match the type of the field in question
    // In this case the field is a String so String comes before getName();
    return name;
  }

  public Character() { // This is the default constructor with no parameters
    this.name = "Nick";
    this.health = 10;
  }

  public Character(String name, int health) {
    // Constructor with two parameters specified
    this.name = name;
    this.health = health; // If the parameter name is the same, use this.

  }

  public void print() {
    System.out.println("This is a test message");
  }
}
