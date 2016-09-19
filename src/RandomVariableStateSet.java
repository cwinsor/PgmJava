import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by Chris on 9/14/2016.
 */

public class RandomVariableStateSet extends HashSet<RandomVariableState> {


    // constructor given a list of RandomVariableState
    public RandomVariableStateSet(List<RandomVariableState> arrayList) {
        this.addAll(arrayList);
    }


    public RandomVariableState get(String name) {

        for (RandomVariableState s : this) {
            if (s.equals(name)) {
                return s;
            }
        }
        return null;
    }
}
