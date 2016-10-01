package us.cwinsor;

import java.util.List;

/**
 * Created by Chris on 9/14/2016. RandomVariable has a space and a state. Space
 * is the definition of the set of values the RandomVariable can take. State is
 * a subset of this - the values the random variable currently can take. The
 * space is identified upon construction (passed in as parameter) and immutable.
 * That state can be modified by calls to setter.
 */
public class Rv {

    private StateHash space;
    //private RandomVariableStateSet state;
    private String name;

    // constructor
    public Rv(String name,
            StateHash space) {
        this.name = name;
        this.space = space;
    }

    // constructor
    public Rv(String name,
            List<State> arrayList) {
        this.name = name;
        this.space = new StateHash(arrayList);
    }

    // copy constructor
    public Rv copy(String name) {
        Rv out = new Rv(name, this.space);
        out.name = name;
        return out;
    }

    public String getName() {
        return name;
    }

    public StateHash getStateHash() {
        return this.space;
    }

    @Override
    public String toString() {
        String out = new String("-- Random Variable: ").concat(name).concat(":");
        out = out.concat(space.toString());
        return out;
    }
}
