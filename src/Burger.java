/**
 * A class that is used for the polymorphism example contained in the main method. This class
 * focuses on burgers.
 * 
 * @author Nicholas Hansen
 */
public class Burger extends PolyMorphismExample {

  /*
   * (non-Javadoc)
   * 
   * @see PolyMorphismExample#showFood()
   */
  @Override
  public void showFood() {
    System.out.println("Burgers are really tasty. Some awesome variants " + "include:");
    System.out.println(
        "Turkey Burgers, Hamburgers, Cheeseburgers, Black Bean Burgers, " + "and Veggie Burgers.");
  }

  /*
   * (non-Javadoc)
   * 
   * @see PolyMorphismExample#imagineFood()
   */
  @Override
  public void imagineFood() {
    System.out.println("Wow imagine the most epicest burger out there, man. " + "It's for dinner.");
    super.imagineFood();
    // Super is a method that will make the code use the 'parent' class's method.
    // In other words, this will print whatever is in the parent class's imagineFood method
    // instead of printing another line of "wow imagine the most epicest burger etc etc..."
  }
}
