import java.util.Map;
import java.util.Set;

/**
 * Created by Chris on 9/14/2016.
 */
public class Factor {

    // the space of the factor
    private FactorSpace space;

    // result table (performs the function map from state to a Float)
    private Map<FactorState, Float> valueTable;

    // constructor
    public Factor() {
    }

    // constructor given a set of RandomVariable
    public Factor(Set<RandomVariable> vList) {
    }

    // getResult
    // the entire purpose of a factor is as a function
    // given a set of random variable values return a result (value)
    // This method performs such function.
    // More specifically - given a FactorState returns the result (value).
    public float getValue(RandomVariableSpace randomVariableSpace) {
        Factor foo = this.reduce(randomVariableSpace);
        return foo.sum();
    }

    // reduce
    // given an randomVariableSpace (a set of random variable values)
    // this method returns a new Factor which is the subset of the
    // valueTable that meets the specification of the RandomVariableSpace.
    //
    // conceptually:
    // our table index is a Cartesian Product   A x B
    // and given B' we want a new table whose index is  A x (B n B')
    //
    // algorithm:
    //    for any random variable identified in the list - the union of the values specified
    //    for any random variable not identified in the list - its entire space
    public Factor reduce(RandomVariableSpace randomVariableSpace) {
        return null;
    }

    // sum
    // return the sum of the values in the valueTable
    public float sum() {
        //return valueTable.values().stream()./*sum*/
        return 0;
    }

    // marginalizeOut
    // user specifies a RandomVariable "r" that they want to "marginalize out"
    //
    // create a new Factor f
    // for each value v in r
    //      tempFactor = this.reduce(r.v)
    //      newFactor.add(tempFactor)
    public Factor marginalizeOut(RandomVariableSpace x) {
        return null;
    }

    /////////////////////////////////////
    // factor product
    // performs the factor product of this and the given factor
    // returns a new factor
    // new factor has scope which is cross of scopes of individuals
    public Factor product(Factor other) {
        return null;
    }

}
