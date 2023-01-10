package day_03self.内部类;

public class Inner01 {
     private int n = 10;
     public void test(){
         C c = new C();
         c.hello();
//         C.D d = new C().new D();

     }
     class C{
         public void hello(){
             System.out.println("C hello..");
         }
         class D{

         }
     }
}
