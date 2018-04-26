import junit.framework.Assert;
                import org.junit.Ignore;
                import org.junit.Test;
                import java.util.Random;
                

                
                /**  
                 ** Created by dshmaya on 15/11/2017 ...03
                 * Created by dshmaya on 15/11/2017 ...03
                */
                public class SimpleTest {
                                
                   @Test  
                   public void alwaysPass1()
                   {
                       Assert.assertEquals(1, 1);
                   }
                

                   @Test
                    public void alwaysPass2()
                    {
                        Assert.assertEquals(1, 1);
                    }
                   @Test  
                   public void alwaysPass3()
                   {
                       Assert.assertEquals(1, 1);
                   }




                  @Test
                    public void alwaysPass4()
                    {
                        Assert.assertEquals(1, 2);
                    }
                   @Test
                   public void alwaysFail5()
                   {
                       Assert.assertEquals(1, 2);
                   }


                  @Test
                    public void alwaysPass6()
                    {
                        Assert.assertEquals(1, 1);
                    }
                  @Test
                    public void alwaysPass7()
                    {
                        Assert.assertEquals(1, 1);
                    }
                 @Test
                   public void alwaysFail81()
                   {
                       Assert.assertEquals(1, 2);
                   }
                  @Test
                   public void alwaysFail91()
                   {
                       Assert.assertEquals(1, 2);
                   }
                  @Test
                   public void alwaysFail10()
                   {
                       Assert.assertEquals(1, 2);
                   }
                  @Test
                   public void alwaysFail11()
                   {
                       Assert.assertEquals(1, 2);
                   }
                  @Test
                   public void alwaysFail12()
                   {
                       Assert.assertEquals(1, 2);
                   }

                  @Test
                   public void alwaysFail13()
                   {
                       Assert.assertEquals(1, 2);
                   }
                  @Test
                   public void alwaysFail14()
                   {
                       Assert.assertEquals(1, 2);
                   }
                  @Test
                   public void alwaysFail15()
                   {
                       Assert.assertEquals(1, 2);
                   }
                  @Test
                   public void alwaysFail16()
                   {
                       Assert.assertEquals(1, 2);
                   }
                  @Test
                   public void alwaysFail17()
                   {
                       Assert.assertEquals(1, 2);
                   }
                  
                  @Test
                   public void alwaysFail18()
                   {
                       Assert.assertEquals(1, 2);
                   }
                  
                  @Test
                   public void alwaysFail19()
                   {
                       Assert.assertEquals(1, 2);
                   }
                 
                    @Test
                    @Ignore
                    public void ignored1()
                    {
                        Random random = new Random();
                        int randomNumber = random.nextInt(99);
                        boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
                        Assert.assertEquals(smallerThanFiftee, true);            
                    }
                                
                    @Test
                    @Ignore
                    public void ignored2()
                    {
                        Random random = new Random();
                        int randomNumber = random.nextInt(100);
                        boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
                        Assert.assertEquals(smallerThanFiftee, true);
                    }
                }
