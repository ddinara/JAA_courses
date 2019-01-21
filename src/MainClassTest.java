import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void myFirstTest() {
        System.out.println(this.getLocalNumber());
    }

    @Test
    public void testGetLocalNumber() {
        int expected = this.getLocalNumber();

        Assert.assertTrue("Wrong number != 14",expected == 14);
    }

    @Test
    public void testGetClassNumber() {
        int expected = this.getClassNumber();

        Assert.assertTrue("Wrong number < 45",expected > 45);
    }

    @Test
    public void testGetClassString() {
        String expected = this.getClassString();

        Assert.assertTrue("class_string doesn't contains 'Hello' or 'hello'", this.getClassString().contains("Hello") | this.getClassString().contains("hello"));
    }


}
