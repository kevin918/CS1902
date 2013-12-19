package hw3.q01;

import hw3.q01.Profiler;
import hw3.q01.MethodProfile;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author seancheren
 */
public class ProfilerTest {

    /**
     * Test of getSingleton method, of class Profiler.
     */
    @Test
    public void testGetSingleton() {
        Profiler.getSingleton().clear();
        System.out.println("testGetSingletonCreatesObject");
        Profiler instance = Profiler.getSingleton();
        assertNotNull(instance);
    }

    /**
     * Test of add method, of class Profiler.
     */
    @Test
    public void testgetNumberofMethods() {
        Profiler.getSingleton().clear();
        Profiler profiler = Profiler.getSingleton();
        profiler.add("play");			// 1
        profiler.add("playOneLine");	// 4
        profiler.add("playOneLine");
        profiler.add("playOneLine");
        profiler.add("playOneLine");

        assertEquals("getNumberofMethods", 2, profiler.getNumberOfMethods());
    }

    /**
     * Test of add method, of class Profiler.
     */
    @Test
    public void testgetNumberofMethodCalls() {
        Profiler.getSingleton().clear();
        Profiler profiler = Profiler.getSingleton();
        profiler.add("play");			// 1
        profiler.add("playOneLine");	// 4
        profiler.add("playOneLine");
        profiler.add("playOneLine");
        profiler.add("playOneLine");
        profiler.add("playOneMove");	// 10
        profiler.add("playOneMove");
        profiler.add("playOneMove");
        profiler.add("playOneMove");
        profiler.add("playOneMove");
        profiler.add("playOneMove");
        profiler.add("playOneMove");
        profiler.add("playOneMove");

        assertEquals("getNumCalls", 13, profiler.getNumberOfMethodCalls());
    }

    /**
     * Test of add method, of class Profiler.
     */
    @Test
    public void testgetPercentage() {
        Profiler.getSingleton().clear();
        Profiler profiler = Profiler.getSingleton();
        profiler.add("play");			// 1
        profiler.add("playOneLine");	// 4
        profiler.add("playOneLine");
        profiler.add("playOneLine");
        profiler.add("playOneLine");
        profiler.add("playOneMove");	// 10
        profiler.add("playOneMove");
        profiler.add("playOneMove");
        profiler.add("playOneMove");
        profiler.add("playOneMove");
        profiler.add("playOneMove");
        profiler.add("playOneMove");
        profiler.add("playOneMove");
        profiler.add("playOneMove");
        profiler.add("playOneMove");

        System.out.println("# methods = " + profiler.getNumberOfMethods());
        System.out.println("# method calls = " + profiler.getNumberOfMethodCalls());
        List<MethodProfile> profiles = profiler.getProfiles();
        
        System.out.println("test");
        MethodProfile theOneWeAreTesting = profiler.getProfile("playOneLine");
        assertEquals("getPercentage", 27, Math.round(100*theOneWeAreTesting.percentOfCalls));

    }
}