import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Chris on 9/14/2016.
 * <p>
 * RandomVariableStateSet is the set of values that variable can take
 * More specifically - it is a set of RandomVariableState which identifies the space of a RandomVariable.
 */

public class RandomVariableStateSet extends HashSet<RandomVariableState> {

//    public String toString() {
//        String outS = new String("");
//        outS = outS.concat("{");
//        for (Object o : this) {
//            outS = outS.concat(" ");
//            String foo = o.toString();
//            outS = outS.concat(foo);
//
//        }
//        outS = outS.concat("}");
//        return outS;
//    }
}
