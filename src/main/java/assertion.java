import org.junit.*;

public class assertion {

    //ASSERTION
    //if expected == actual
    @Test
    public void assertions(){

//      1. Assert.assertEquals("expected","actual");
//      If assertion fails, then we see error message on the console
//      If assertion passs, then we see a green checkmark only
        Assert.assertEquals("java","java");

//      2. Assert.assertTrue(BOOLEAN);
        Assert.assertTrue("Selenium".contains("e"));

//      3. Assert.assertFalse(BOOLEAN);
        Assert.assertFalse("Selenium".contains("java"));// "Selenium".contains("a") -> FALSE

//      We can add a message as well.
//      This message will ONLY DISPLAY WHEN ASSERTION FAILS!!!!
        Assert.assertEquals("ASSERTION FAILED!","java","java");


    }
}
