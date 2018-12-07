/**
 * This was a class that we made during Programming class. It was meant to show how we should format
 * classes in our code. But for my project, it's here to show how a return value works.
 * 
 * @author Nicholas Hansen
 *
 */
public class Player {


  // Fields
  /**
   * Player's name.
   */
  private String name;

  // Methods
  /**
   * Registers this player's name.
   * 
   * @param nameParam The name to be set as this Player's current name.
   */
  public void setName(String nameParam) {
    name = nameParam;
  }

  /** Retrieves this player's name.
   * 
   * @return Returns this player's name back to the main method.
   */
  public String getName() {
    return name; // returns the value name back to the Main method

  }
}
