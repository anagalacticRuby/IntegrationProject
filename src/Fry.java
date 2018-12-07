/**
 * A class used for the polymorphism example contained in the main method. This class focuses on
 * fries.
 * 
 * @author Nicholas Hansen
 *
 */
public class Fry extends PolyMorphismExample {
  /*
   * (non-Javadoc)
   * 
   * @see PolyMorphismExample#showFood()
   */
  @Override
  public void showFood() {
    System.out.println("Fries are made out of potatoes! Sure is tasty, " + "huh.");
  }

  /*
   * (non-Javadoc)
   * 
   * @see PolyMorphismExample#imagineFood()
   */
  @Override
  public void imagineFood() {
    System.out.println("Imagine having a cup full of nicely salted fries " + "and ketchup.");
  }
}
