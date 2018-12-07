
/**
 * A class that sets up "CollegeClass" objects for the main method to use.
 * 
 * @author Nicholas Hansen
 *
 */
public class CollegeClass {

  // fields
  /**
   * The college course's name.
   */
  private String name;
  /**
   * Amount of credits this course provides.
   */
  private int credits;
  /**
   * An array which will house the students enrolled in this course.
   */
  private String[] roster;



  // methods

  // constructor

  // default constructor has no parameters
  /**
   * A CollegeClass constructor with no parameters.
   */
  public CollegeClass() {
    name = "Not set";
    credits = 0;
    roster = new String[60];
  }

  // overloaded constructor
  /**
   * This is an overloaded constructor with parameters. It will accept three arguments: name,
   * credits, and roster. See the parameter descriptions for more info about these.
   * 
   * 
   * @param name Name of this college course.
   * @param credits Credits this college course offers.
   * @param roster Students enrolled in this course.
   */
  public CollegeClass(String name, int credits, String[] roster) {
    this.name = name;
    this.credits = credits;
    this.roster = roster;
  }


  // accessors
  /**
   * Retrieves the name of this college class.
   * 
   * @return Returns name of this college class.
   */
  public String getName() {
    return name;
  }

  /**
   * Retrieves the amount of credits offered by this college class.
   * 
   * @return Returns the amount of credits offered by this class.
   */
  public int getCredits() {
    return credits;
  }

  /**
   * Retrieves the students enrolled in this class.
   * 
   * @return Returns the students enrolled in this class.
   */
  public String[] getRoster() {
    return roster;
  }

  // mutator
  /**
   * Registers the name of this course.
   * 
   * @param name The name of this course to be set.
   */
  public void setName(String name) {
    // field name = parameter name
    this.name = name;
  }

  /**
   * Registers the amount of credits offered by this course.
   * 
   * @param credits The amount of credits offered to be set.
   */
  public void setCredits(int credits) {
    this.credits = credits;
  }

  /**
   * Registers the students enrolled in this class. (And thus set on the roster)
   * 
   * @param roster The students enrolled in this class.
   */
  public void setRoster(String[] roster) {
    this.roster = roster;
  }

  /**
   * A test print message.
   */
  public void printInfo() {
    System.out.println("College Class");
  }

}
