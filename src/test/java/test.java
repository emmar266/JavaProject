
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import colour.Colour;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class test {
    Colour colour;


    //this tests the first constructor
    @Test
    @DisplayName("Test first Constructor")
    void testConstructor(){
        float red = 0.7f;
        float blue = 0.2f;
        float green = 0.3f;
        Colour colour2 = new Colour(red,green,blue);
        assertEquals(colour2.getRed(),red,"Red value should match");
        assertEquals(colour2.getBlue(),blue,"Blue value should match");
        assertEquals(colour2.getGreen(),green,"Green value should match");
        //assertTrue();
    }
    @Test
    @DisplayName("Test second Constructor")
    void testOverloadConstructor(){
        Colour colour3 = new Colour(0.9f);
        float red =2.14E-43f ;
        float blue =3.55E-43f ;
        float green = 2.14E-43f;
        assertEquals(colour3.getRed(),red,"Red value should match");
        assertEquals(colour3.getBlue(),blue,"Blue value should match");
        assertEquals(colour3.getGreen(),green,"Green value should match");

    }
    @Test
    @DisplayName("Test red getter")
    void testRedGetter(){
        float red = 0.7f;
        float blue = 0.2f;
        float green = 0.3f;
        Colour colour4 = new Colour(red,green,blue);
        assertTrue(colour4.getRed() == red);
    }
    @Test
    @DisplayName("Test Green getter")
    void testGreenGetter(){
        float red = 0.7f;
        float blue = 0.2f;
        float green = 0.3f;
        Colour c1 = new Colour(red,green,blue);
        assertTrue(c1.getGreen() == green);

    }
    @Test
    @DisplayName("Test Blue getter")
    void testBlueGetter(){
        float red = 0.7f;
        float blue = 0.2f;
        float green = 0.3f;
        Colour c1 = new Colour(red,green,blue);
        assertTrue(c1.getBlue() == blue);

    }





}

