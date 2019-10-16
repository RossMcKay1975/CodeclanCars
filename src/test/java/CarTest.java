import org.junit.Before;
import org.junit.Test;
import vehicles.Car;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;


    @Before
    public void before() {
        car = new Car("Lada", "Niva", 200000, "petrol", 55.55);
    }

    @Test
    public void hasMake(){
        assertEquals("Lada", car.getMake()); 
    }

}

