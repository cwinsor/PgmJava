/**
 * Created by Chris on 9/15/2016.
 */
public class Zz01_CartesianProductOnSetTest {

    public static void main(String[] args) {

        Zz01_CartesianProductOnSet a = new Zz01_CartesianProductOnSet("a");
        Zz01_CartesianProductOnSet b = new Zz01_CartesianProductOnSet("b");
        Zz01_CartesianProductOnSet c = new Zz01_CartesianProductOnSet("c");
        Zz01_CartesianProductOnSet s1 = new Zz01_CartesianProductOnSet("s1");
        s1.add(a);
        s1.add(b);
        s1.add(c);

        Zz01_CartesianProductOnSet x = new Zz01_CartesianProductOnSet("x");
        Zz01_CartesianProductOnSet y = new Zz01_CartesianProductOnSet("y");
        Zz01_CartesianProductOnSet s2 = new Zz01_CartesianProductOnSet("s2");
        s2.add(x);
        s2.add(y);

        System.out.println(s1.toString());
        System.out.println(s2.toString());

        Zz01_CartesianProductOnSet s3 = new Zz01_CartesianProductOnSet("s3");
        s3.add(s1);
        s3.add(s2);
        System.out.println(s3.toString());

      /* zona - want cartesianProduct to return a new OnSet item
        s1.cartesianProduct(s2);
         */
        System.out.println(s1.toString());
       // s3.cartesianProduct(in);



    }
}
