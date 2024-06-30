import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestLion {

    @Spy
    Lion lionTest;

    @Test
    public void testLionMale() throws Exception{
        lionTest.lion("Самец");
        Mockito.verify(lionTest).lion("Самец");
    }

    @Test
    public void testLionFemale() throws Exception{
        lionTest.lion("Самка");
        Mockito.verify(lionTest).lion("Самка");
    }

    @Test
    public void testLionNoName() throws Exception{
        lionTest.lion("Алеша");
        Mockito.verify(lionTest).lion("Алеша");

    }

    @Test
    public void testLionGetFood() throws Exception{
        System.out.println(lionTest.getFood());
        Mockito.verify(lionTest, Mockito.times(1)).getFood();
    }

    @Test
    public void testLionDoesHaveMane() throws Exception{
        System.out.println(lionTest.doesHaveMane());
        Mockito.verify(lionTest, Mockito.times(1)).doesHaveMane();
    }
}

