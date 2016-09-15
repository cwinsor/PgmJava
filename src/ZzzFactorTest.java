import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by Chris on 9/14/2016.
 */
public class ZzzFactorTest {

    public void doTest() {

        RandomVariableState a1 = new RandomVariableState();
        RandomVariableState a2 = new RandomVariableState();
        RandomVariableState a3 = new RandomVariableState();
        RandomVariableSpace aSpace = new RandomVariableSpace(new HashSet<RandomVariableState>(Arrays.asList(a1,a2,a3)));
        RandomVariable A  = new RandomVariable(aSpace);

        RandomVariableState b1 = new RandomVariableState();
        RandomVariableState b2 = new RandomVariableState();
        RandomVariableSpace bSpace = new RandomVariableSpace(new HashSet<RandomVariableState>(Arrays.asList(b1,b2)));
        RandomVariable B  = new RandomVariable(bSpace);

        RandomVariableState c1 = new RandomVariableState();
        RandomVariableState c2 = new RandomVariableState();
        RandomVariableSpace cSpace = new RandomVariableSpace(new HashSet<RandomVariableState>(Arrays.asList(c1,c2)));
        RandomVariable C  = new RandomVariable(cSpace);

        // for testing purposes...
        Factor f1, f2, f3;
        RandomVariableSpace e;

        // reduce ...

        // reduce specifying a single value of one of the random variables
        // this should result in only that value in the result for that variable
        f1 = new Factor(new HashSet<RandomVariable>(Arrays.asList(A,B,C)));
        e = new RandomVariableSpace(new HashSet<RandomVariableState>(Arrays.asList(c1)));
        f2 = f1.reduce(e);

        // reduce specifying two values for one of the random variables
        // this should result in both of those values in the result
        e = new RandomVariableSpace(new HashSet<RandomVariableState>(Arrays.asList(b1,b2)));
        f2 = f1.reduce(e);

        // reduce specifying values for two different random variables
        // this should result in reduction for both random variables
        e = new RandomVariableSpace(new HashSet<RandomVariableState>(Arrays.asList(b1,b2,c1)));
        f2 = f1.reduce(e);

        // marginalize ...

        // marginalize out specifying one random variable
        f1 = new Factor(new HashSet<RandomVariable>(Arrays.asList(A,B,C)));
        f2 = f1.marginalizeOut(aSpace);
        // repeat to marginalize out additional variables
        f2 = f2.marginalizeOut(bSpace);

        // product
        f1 = new Factor(new HashSet<RandomVariable>(Arrays.asList(A,B)));
        f2 = new Factor(new HashSet<RandomVariable>(Arrays.asList(B,C)));
        f3 = f1.product(f2);
    }
}
