class Car
{
   public int speedLimit()
   { 
       return 100;
   }
   public static void main(String[]args)
   {
        Car c = new Car();
        int num =c.speedLimit();
        System.out.println("speedLimit is:"+num);
    }
}