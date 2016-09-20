import java.util.*;

/**
 * Created by Chris on 9/14/2016.
 */

public class RandomVariableStateSet extends HashMap<String, RandomVariableState> {

    // constructor given a list of RandomVariableState
    public RandomVariableStateSet(List<RandomVariableState> arrayList) {
        for (RandomVariableState s : arrayList) {
            if (s != null)
                this.put(s.getName(), s);
        }
    }

    public RandomVariableState get(String name) {
        return this.get(name);
    }

//    public String toString() {
//        String out = new String("");
//        for (Map.Entry<String, RandomVariableState> entry : this.entrySet()) {
//            String key = entry.getKey();
//            RandomVariableState value = entry.getValue();
//            out = out.concat(key).concat(value.toString());
//        }
//        return out;
//    }
}

