import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class EuroTest {

    @Test
    public void shouldCheckTheEqualityOfTwoObjects() {
        assertEquals(new Euro(10), new Euro(10));
    }

    @Test
    public void shouldReturnFalseWhenTwoObjectsAreDifferent() {
        assertNotEquals(new Euro(10), new Euro(5));
    }

    @Test
    public void shouldReturnFalseWhenOneObjectsIsNull() {
        assertNotEquals(new Euro(10), null);
    }

    @Test
    public void shouldReturnFalseWhenGivenObjectsAreOfDifferentTypes() {
        assertNotEquals(new Euro(10), new Object());
    }

    @Test
    public void shouldReturnSameWhenWeCompare10EuroWithTheSumOf7EuroAnd3Euro() {
        assertEquals(new Euro(10), new Euro(7).add(new Euro(3)));
    }

    @Test
    public void shouldCheck10EuroIsNotEqualTo5EuroPlus2Euro() {
        assertNotEquals(new Euro(10), new Euro(5).add(new Euro(2)));
    }

    @Test
    public void shouldCheck10EuroIsNotEqualTo10Dollar() {
        assertNotEquals(new Euro(10), new Dollar(10));
    }


    @Test
    public void shouldCheck10EuroIsEqualTo13dot5DollarUsingConverterClass() {

        assertEquals(new Euro(10), Converter.convertDollarToEuro(new Dollar(13.5)));
    }

}
