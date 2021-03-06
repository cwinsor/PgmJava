package us.cwinsor;

import java.sql.Array;
import java.util.*;

/**
 * Created by Chris on 9/14/2016.
 */
//public class StateHash extends HashMap implements Comparable {
public class StateSet extends TreeSet implements Comparable {

    // constructor given a list of RandomVariableState
    public StateSet(List<State> list) {
        this.addAll(list);
//        for (State state : list) {
//            this.add(state);
//            // this.put(state.getName(), state);
//        }
    }

    // empty constructor
    public StateSet() {
        super();
    }

    // for purposes of sorting here is the compareTo
    // given this and that StateHash, we get the keyset (set of names)
    // for each.  We sort the keys within
    // each set, and then compare them as strings
    public int compareTo(Object o) {
        StateSet that = (StateSet) o;
        return this.toString().compareTo(that.toString());
    }
}

/*
//    @Override
    public String toString() {
      return this.values().toString();
    }


    // for purposes of sorting here is the compareTo
    // given this and that StateHash, we get the keyset (set of names)
    // for each.  We sort the keys within
    // each set, and then compare them as strings
    public int compareTo(Object o) {
        // cast o to StateHash
        StateHash that = (StateHash) o;
        List thatList = new ArrayList(that.keySet());
        java.util.Collections.sort(thatList);

        List thisList = new ArrayList(this.keySet());
        java.util.Collections.sort(thisList);

        return thisList.toString().compareTo(thatList.toString());
    }
 */
