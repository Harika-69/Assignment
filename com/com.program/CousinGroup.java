public class CousinGroup
{
  String group="btech";
  public static void main(String[]args)
  {
  CousinGroup c=new CousinGroup();
  CousinGroup c1=new CousinGroup();
  CousinGroup c2=new CousinGroup();
  System.out.println(c.group);
  System.out.println(c1.group);
  System.out.println(c2.group);
  c1.group="bpharmcy";
  System.out.println(c.group);
  System.out.println(c1.group);
  System.out.println(c2.group);
  }
}
  
  