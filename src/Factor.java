import java.util.HashSet;

/**
 * Created by Chris on 9/14/2016.
 *  RandomVariable has a state.  That state can take on a limited set of values defined by the rv state space.
 */
public class Factor {

    RandomVariableList list; // a list of random variables
    private String name;

    // constructor
    public Factor(String name) {
        this.name = name;
    }

    // constructor
    public Factor(String name,
                  RandomVariableList list) {
        this.name = name;
        this.list = list;
    }

    public String toString() {
        String out = new String("---- Factor ");
        out = out.concat(name).concat(" ----");
        for (RandomVariable rv : list) {
            out = out.concat("\n");
            out = out.concat(rv.toString());
        }
        out = out.concat("\n");
        return out;
    }

}
