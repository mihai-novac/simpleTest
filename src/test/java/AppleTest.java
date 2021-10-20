import org.junit.Assert;
import org.junit.Test;

public class AppleTest{
    @Test
    public void alwaysFailAp()
    {
        Assert.assertEquals(1, 9);
    }
    @Test
    public void alwaysFailAp1()
    {
        Assert.assertEquals(1, 2);
    }
    @Test
    public void alwaysFailAp3()
    {
        Assert.assertEquals(1, 1);
    }
    @Test
    public void alwaysFailAp4()
    {
        Assert.assertEquals(1, 1);
    }
}
