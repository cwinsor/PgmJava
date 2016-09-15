import java.util.Set;

/**
 * Created by Chris on 9/14/2016.
 * <p>
 * RandomVariableSpace is the set of values that variable can take
 * More specifically - it is a set of RandomVariableState which identify the space of a RandomVariable.
 */

public class RandomVariableSpace {

    Set<RandomVariableState> space;

    // constructor
    RandomVariableSpace(Set<RandomVariableState> space) {
        this.space = space;
    }
}
