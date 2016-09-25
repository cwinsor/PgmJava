import java.util.Arrays;

/**
 * Created by Chris on 9/14/2016.
 */
public class Zz01_TestFactors {


    public static void main(String[] args) {
        Zz01_TestFactors t = new Zz01_TestFactors();
        t.doTest();
    }

    public void doTest() {

        // define random variable states
        RandomVariableState a1 = new RandomVariableState("a1");
        RandomVariableState a2 = new RandomVariableState("a2");
        RandomVariableState a3 = new RandomVariableState("a3");
        RandomVariable A = new RandomVariable("A", Arrays.asList(a1, a2, a3));

        RandomVariableState b1 = new RandomVariableState("b1");
        RandomVariableState b2 = new RandomVariableState("b2");
        RandomVariable B = new RandomVariable("B", Arrays.asList(b1,b2));

        RandomVariableState c1 = new RandomVariableState("c1");
        RandomVariableState c2 = new RandomVariableState("c2");
        RandomVariable C = new RandomVariable("C", Arrays.asList(c1, c2));

        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString());

        // Factor
        Factor f = new Factor("f", Arrays.asList(A, B, C));
        System.out.println(f.toString());

        // get a random variable using its name
        RandomVariable f2 = f.getRv("A");
// create a ran
//        f.reduce(new RandomVariableStateSet(Arrays.asList(c1)));



    }
}
