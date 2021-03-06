import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestPunt {

    @Test
    public void testSetX() {
        Punt p = new Punt();
        p.setX(3);
        assertEquals(3, p.getX());
    }
    @Test
    public void testSetY() {
        Punt puntDos = new Punt();
        puntDos.setY(7);
        assertEquals(7, puntDos.getY());
    }

    @Test
    public void testPuntDefinit() {
        // comprova que el constructor Punt(int,int) deixi els valors correctes
        Punt p = new Punt(3, 4);
        assertEquals(3, p.getX());
        assertEquals(4, p.getY());
    }

    @Test
    public void testSuma(){
        Punt p = new Punt(2, 6);
        p.suma(p);
        assertEquals(4, p.getX());
        assertEquals(12, p.getY());
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestPuntX() {
        Punt p = new Punt(-3,7);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestPuntY() {
        Punt p = new Punt(8,-50);
    }

}