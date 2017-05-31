import org.junit.Assert;
import org.junit.Test;

/**
 * Created by karen.kiener on 5/28/17.
 */
public class StringCountTest {

    @Test
    public void charactercounter_returns_1_for_a_in_a() {
        CharacterCounter counter = new CharacterCounter("a");

        Assert.assertEquals(1, counter.count('a'));
    }

    @Test
    public void charactercounter_returns_2_for_aa() {
        CharacterCounter counter = new CharacterCounter("aa");

        Assert.assertEquals(2, counter.count('a'));
    }

    @Test
    public void charactercounter_returns_0_for_b() {
        CharacterCounter counter = new CharacterCounter("aa");

        Assert.assertEquals(0, counter.count('b'));
    }
}
