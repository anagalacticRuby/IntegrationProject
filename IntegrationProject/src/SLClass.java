// Nicholas Hansen
public class SLClass extends CollegeClass {
  /*
   * the extends keyword means "inherits from", which tells us that SLClass is 
   * now the child class of CollegeClass. 
   * When a class inherits from a parent class, it means that 
   * the child class will
   * act as if it includes all of the public classes included inside of the 
   * parent class. This is
   * useful because it saves you from copying and pasting a thousand lines over
   *  and over in multiple classes.
   */
  // overriding
  // Overriding a method is when you have a method that shares the same name
  // As a method that you are inheriting from the parent class.
  // The method within the child class will override the inheritance
  // And take the stage.
  public void printInfo() {
    super.printInfo();
    System.out.println("SL Class");
  }

}
