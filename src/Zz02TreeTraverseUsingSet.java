import java.util.*;

/**
 * Created by Chris on 9/15/2016.
 */
public class Zz02TreeTraverseUsingSet extends LinkedHashSet {

    //Set<Zz02TreeTraverseUsingSet> set;
    private String result;

    // constructor - default
    public Zz02TreeTraverseUsingSet() {
        super();
    }

    // constructor - leaf
    public Zz02TreeTraverseUsingSet(String in) {
        super();
        this.result = in;
    }

    // getter
    public String getResult() {
        return result;
    }

    public String toString() {
        return result;
    }

    @Override
    public boolean equals(Object o) {
        Zz02TreeTraverseUsingSet z = (Zz02TreeTraverseUsingSet) o; // cast
        return super.equals(o) &&
                z.getResult().equals(this.getResult());
    }


    public /*LinkedHashSet<String>*/ void cartesianProduct(LinkedHashSet<String> in) {

        System.out.println("entering " + this.toString()); // Display the string.

        // leaf
        if (this.size() == 0) {
            //in.add(this.result);
            System.out.println("leaf " + this.toString()); // Display the string.
        } else {
            // intermediate node
            for (Object sub : this) {
                Zz02TreeTraverseUsingSet subZ = (Zz02TreeTraverseUsingSet) sub;
                subZ.cartesianProduct(in);
            }
        }
       /* return null; */
    }
}