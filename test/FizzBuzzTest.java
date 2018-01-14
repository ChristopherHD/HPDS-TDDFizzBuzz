import org.junit.Before;
import org.junit.Test;
import org.ulpgc.FizzBuzz;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.ulpgc.FizzBuzz.NegativeNumberException;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void init(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void given_2_return_2() {
        assertEquals("2", fizzBuzz.checkNumber(2));
    }
    @Test
    public void given_3_return_Fizz() {
        assertEquals("Fizz", new FizzBuzz().checkNumber(3));
    }
    @Test
    public void given_6_return_Fizz() {
        assertEquals("Fizz", new FizzBuzz().checkNumber(6));
    }
    @Test
    public void given_5_return_Buzz() {
        assertEquals("Buzz", new FizzBuzz().checkNumber(5));
    }
    @Test
    public void given_10_return_Buzz() {
        assertEquals("Buzz", new FizzBuzz().checkNumber(10));
    }
    @Test
    public void given_15_return_FizzBuzz() {
        assertEquals("FizzBuzz", new FizzBuzz().checkNumber(15));
    }
    @Test
    public void given_minus_1_should_thrown_exception() {
        try {
            new FizzBuzz().checkNumber(-1);
            assertEquals("Exception of negative number was not thrown","");
        } catch (NegativeNumberException ex){
            assertEquals(true,true);
        }
    }
    @Test
    public void given_30_return_FizzBuzz() {
        assertEquals("FizzBuzz", new FizzBuzz().checkNumber(30));
    }


    @Test
    public void reward() {
        assertThat(new FizzBuzz().of(2),is("2"));
        assertEquals("FizzBuzz", new FizzBuzz().checkNumber(150));
        //assertEquals("FizzBuzz", new FizzBuzz().checkNumber(-1500));
    }

}
