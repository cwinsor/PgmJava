package us.cwinsor;

import java.util.*;

/**
 * Created by Chris on 9/14/2016. A list of RandomVariable
 */
public class RvHash extends HashMap {

    // constructor given a list of RandomVariable
    RvHash(List<Rv> arrayList) {
        for (Rv rv : arrayList) {
            if (rv != null) {
                this.put(rv.getName(), rv);
            }
        }
    }

    // copy
    public RvHash copy(String name) {
        return null;
    }

}
