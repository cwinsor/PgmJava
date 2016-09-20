import java.util.*;

/**
 * Created by Chris on 9/14/2016.
 * A list of RandomVariable
 */

public class RandomVariableList extends HashMap<String,RandomVariable> {

    // constructor given a list of RandomVariable
    RandomVariableList (List<RandomVariable> arrayList) {
        for (RandomVariable r : arrayList) {
            if (r != null)
                this.put(r.getName(), r);
        }
    }

    public RandomVariable get(String name) {
        return this.get(name);
    }

//    public String toString() {
//
//    }
}
