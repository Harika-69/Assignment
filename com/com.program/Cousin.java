public class Cousin
{
  String name="harika";
  public static void main(String[]args)
  {
    Cousin C=new Cousin();
    Cousin C1=new Cousin();
    Cousin C2=new Cousin();
    System.out.println(C.name);
    System.out.println(C1.name);
    System.out.println(C2.name);
    C.name="renuka";
    System.out.println(C.name);
    System.out.println(C1.name);
    System.out.println(C2.name);
  }
}
