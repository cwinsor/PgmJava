import java.util.Arrays;

/**
 * Created by Chris on 9/14/2016.
 */
public class Zz01_FactorOperations {


    public static void main(String[] args) {
        Zz01_FactorOperations t = new Zz01_FactorOperations();
        t.doTest();
    }

    public void doTest() {

        // define random variable states
        RandomVariableState a1 = new RandomVariableState("a1");
        RandomVariableState a2 = new RandomVariableState("a2");
        RandomVariableState a3 = new RandomVariableState("a3");
        RandomVariable A = new RandomVariable("A", Arrays.asList(a1, a2, a3));
        System.out.println(A.toString());

        // in case we need to get the states or space...
        A.getSpace().get("a1");
        RandomVariableStateSet aSpace = A.getSpace();
        System.out.println(aSpace.toString());
       // RandomVariableStateSet aState = A.getState();

        RandomVariableState b1 = new RandomVariableState("b1");
        RandomVariableState b2 = new RandomVariableState("b2");
        RandomVariable B = new RandomVariable("B", Arrays.asList(b1,b2));

        RandomVariableState c1 = new RandomVariableState("c1");
        RandomVariableState c2 = new RandomVariableState("c2");
        RandomVariable C = new RandomVariable("C", Arrays.asList(c1, c2));

        // Factor
        Factor f = new Factor("f", Arrays.asList(A, B, C));
        System.out.println(f.toString());

        RandomVariable tempRv = f.rvNamed("A");
        ///f.reduce(f.rvNamed("A"));


    }
}
