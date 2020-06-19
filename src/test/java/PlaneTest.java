import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    private Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.CESSNA172);
    }

    @Test
    public void hasType() {
        assertEquals(PlaneType.CESSNA172, plane.getType());
    }
}
