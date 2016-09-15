import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Chris on 9/15/2016.
 */
public class ZzzRepresentation {

    public enum Values {
        EBAY, PAYPAL, GOOGLE, YAHOO, ATT
    }

    public static void main(String[] args) {
        System.out.println("Hello World!"); // Display the string.

        Set<Integer> lowSet1 = new HashSet<Integer>();
        lowSet1.add(5);
        lowSet1.add(7);
        lowSet1.add(8);

        Set<Integer> lowSet2 = new HashSet<Integer>();
        lowSet2.add(12);
        lowSet2.add(15);
        lowSet2.add(16);

        System.out.println("lowSet1.size() = " + lowSet1.size());
        System.out.println("isEmpty " + lowSet2.isEmpty());


    }


}
