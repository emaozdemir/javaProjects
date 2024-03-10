package P03.kahve;


public class KahveRunner {

   public static void main(String[] args) {

      Kahve musteri1 = new Kahve();
      System.out.println(musteri1);
      musteri1.kahveSec();//objName ile meth. call
      //  kahveSec(); -> static meth import veya calss name ile call edldi
      System.out.println(musteri1);//


   }


}