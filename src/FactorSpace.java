import java.util.HashSet;

/**
 * Created by Chris on 9/15/2016.
 */
public class FactorSpace {

    // a FactorSpace is the space of a Factor
    // This space is an ordered set of RandomVariable states.
    // FactorSpace is the cartesian product of the individual random variable spaces
    // but we maintin that as a compact representation - an ordered list
    // of the individual random variable spaces, and the cartesian product
    // can be inferred from that.
    private HashSet<RandomVariableSpace> space;

    // constructor
    public FactorSpace(HashSet<RandomVariableSpace> space) {
        this.space = space;
    }
}
