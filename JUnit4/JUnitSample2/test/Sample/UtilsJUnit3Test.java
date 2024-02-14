/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package sample;

import java.util.concurrent.TimeoutException;
import java.lang.InterruptedException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mcanmor0312
 */
public class UtilsJUnit3Test {

    public UtilsJUnit3Test() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testHelloWorld() {
        System.out.println("* UtilsJUnit3Test: test method 1 - testHelloWorld()");
        assertEquals("Hello, world!", Utils.concatWords("Hello", ", ", "world", "!"));
    }

    /**
     * Test of concatWords method, of class Utils.
     *
     * @Test public void testConcatWords() { System.out.println("concatWords");
     * String[] words = null; String expResult = ""; String result =
     * Utils.concatWords(words); assertEquals(expResult, result); // TODO review
     * the generated test code and remove the default call to fail. fail("The
     * test case is a prototype."); }
     */
    /**
     * Test of computeFactorial method, of class Utils.
     */
    /*
    @Test
    public void testComputeFactorial() {
        System.out.println("computeFactorial");
        int number = 0;
        String expResult = "";
        String result = Utils.computeFactorial(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
     */
    /**
     * Test of computeFactorial method, of class Utils.
     *
     * @throws java.lang.InterruptedException
     */
    /**
     * Test of computeFactorial method, of class Utils.
     *
     * @throws java.lang.InterruptedException
     * @throws java.util.concurrent.TimeoutException
     */

    public void testWithTimeout() throws InterruptedException, TimeoutException {
        final int factorialOf = 1 + (int) (30000 * Math.random());
        System.out.println("informática" + factorialOf + '!');
        Thread testThread;
        testThread = new Thread() {
            @Override
            public void run() {
                System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
            }
        };
        testThread.start();
        Thread.sleep(10000000);
        testThread.interrupt();
        if (testThread.isInterrupted()) {
            throw new TimeoutException("the test took too long to complete");
        }

    }

    /**
     * Test of normalizeWord method, of class Utils.
     */
    @Test
    public void testNormalizeWord() {
        System.out.println("normalizeWord");
        String word = "";
        String expResult = "";
        String result = Utils.normalizeWord(word);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
