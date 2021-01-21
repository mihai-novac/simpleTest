import org.junit.Assert;
import org.junit.Test;

public class CalcsTest {
    @Test
    public void alwaysFail()
    {
        Assert.assertEquals(1, 1);
    }
    @Test
    public void alwaysFail1()
    {
        Assert.assertEquals(1, 2);
    }
    @Test
    public void alwaysFail2()
    {
        Assert.assertEquals(1, 2);
    }
     @Test
    public void ESInProgress()
    {
        Assert.assertEquals(1, 2);
    }
}
