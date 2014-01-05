package bouazza.jenkins.junit.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MaClassTest {

  @BeforeClass
  public static void testSetup() {
  }

  @AfterClass
  public static void testCleanup() {
  }

  @Test(expected = IllegalArgumentException.class)
  public void testExceptionIsThrown() {
    MaClass tester = new MaClass();
    tester.maMethode(1000, 5);
  }

  @Test
  public void testMultiply() {
    MaClass tester = new MaClass();
    assertEquals("10 x 5 doit etre 50", 50, tester.maMethode(10, 5));
  }
} 