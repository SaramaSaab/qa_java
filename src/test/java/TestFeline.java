import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestFeline {

    @Spy
    Feline feline;

    @Test
    public void testFelineGetFamily(){
        feline.getFamily();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testFelineGetKittens(){
        feline.getKittens();
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void testFelineEatMeat() throws Exception{
        List<String> s = feline.getFood("Хищник");
        feline.eatMeat();
        Assert.assertEquals(s,feline.getFood("Хищник"));
    }
}
