public class Main
{
     public static void main(String[] args)
  {
      Feeder f = new Feeder();
      System.out.println(f);
      //System.out.println(f.currentFood);
      System.out.println(f.getcurrentFood());
      Feeder g = new Feeder(500);
      System.out.println(g.getcurrentFood());
      g.simulateOneDay(12);
      System.out.println(g.getcurrentFood());
      Feeder h = new Feeder(1000);
      h.simulateOneDay(22);
      System.out.println(h.getcurrentFood());
      Feeder i = new Feeder(100);
      i.simulateOneDay(5);
      System.out.println(i);
      Feeder j = new Feeder(2400);
      System.out.println(j.simulateManyDays(10, 4));
      Feeder a = new Feeder(250);
      System.out.println(a.simulateManyDays(10,5));
      Feeder l = new Feeder(0);
      System.out.println(l.simulateManyDays(5, 10));
      Feeder k = new Feeder(0);
      System.out.println(k.simulateManyDays(5, 10));

  }
}