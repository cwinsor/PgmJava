import java.util.LinkedHashSet;

/**
 * Created by Chris on 9/15/2016.
 */
public class Zz02TreeTraverseUsingSetTest extends LinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet<String> in = new LinkedHashSet<String>();

        Zz02TreeTraverseUsingSet a = new Zz02TreeTraverseUsingSet("a");
        Zz02TreeTraverseUsingSet b = new Zz02TreeTraverseUsingSet("b");
        Zz02TreeTraverseUsingSet c = new Zz02TreeTraverseUsingSet("c");

        Zz02TreeTraverseUsingSet s1 = new Zz02TreeTraverseUsingSet("s1");
        s1.add(a);
        s1.add(b);
        s1.add(c);

        Zz02TreeTraverseUsingSet x = new Zz02TreeTraverseUsingSet("x");
        Zz02TreeTraverseUsingSet y = new Zz02TreeTraverseUsingSet("y");

        Zz02TreeTraverseUsingSet s2 = new Zz02TreeTraverseUsingSet("s2");
        s2.add(x);
        s2.add(y);

        Zz02TreeTraverseUsingSet s3 = new Zz02TreeTraverseUsingSet("s3");
        s3.add(s1);
        s3.add(s2);

        s3.cartesianProduct(in);



    }
}
