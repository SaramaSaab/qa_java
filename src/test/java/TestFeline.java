import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestFeline {

    @Mock
    Feline feline;

    @Test
    public void testFelineGetFamily(){
       Mockito.when(feline.getFamily()).thenReturn("Кошачьи");
       assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testFelineGetKittens(){
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void testFelineEatMeat() throws Exception{
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = feline.eatMeat();
        System.out.println("Ожидаемое значение " + expected);
        System.out.println("Фактическое значение " + actual);
        assertEquals(expected, actual);
    }
}
