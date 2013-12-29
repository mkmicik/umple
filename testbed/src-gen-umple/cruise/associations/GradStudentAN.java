/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.19.0.3287 modeling language!*/

package cruise.associations;

// line 37 "../../../src/LocalHarness.ump"
public class GradStudentAN
{
  @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
  public @interface umplesourcefile{int[] line();String[] file();int[] javaline();int[] length();}

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GradStudentAN Associations
  private MentorAN mentorAN;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GradStudentAN(MentorAN aMentorAN)
  {
    if (aMentorAN == null || aMentorAN.getGradStudent() != null)
    {
      throw new RuntimeException("Unable to create GradStudentAN due to aMentorAN");
    }
    mentorAN = aMentorAN;
  }

  public GradStudentAN(String aNameForMentorAN)
  {
    mentorAN = new MentorAN(aNameForMentorAN, this);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public MentorAN getMentorAN()
  {
    return mentorAN;
  }

  public void delete()
  {
    MentorAN existingMentorAN = mentorAN;
    mentorAN = null;
    if (existingMentorAN != null)
    {
      existingMentorAN.delete();
    }
  }

}