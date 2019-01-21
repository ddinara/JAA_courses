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

}