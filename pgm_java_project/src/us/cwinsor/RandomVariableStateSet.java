package us.cwinsor;

import java.util.*;

/**
 * Created by Chris on 9/14/2016.
 */
public class RandomVariableStateSet extends HashMap<String, RandomVariableState> {

    // constructor given a list of RandomVariableState
    public RandomVariableStateSet(List<RandomVariableState> arrayList) {
        for (RandomVariableState s : arrayList) {
            if (s != null) {
                this.put(s.getName(), s);
            }
        }
    }

}
