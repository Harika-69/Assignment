public class CousinBloodGroup
{
  String bloodgroup="opositive";
  public void myGroup()
  {
   String bloodgroup="onegative";
   System.out.println(bloodgroup);
  }
   public static void main(String[]args)
   {
    CousinBloodGroup c=new CousinBloodGroup();
    System.out.println("apositive");
    c.myGroup();
    System.out.println(c.bloodgroup);
   }
}
   
