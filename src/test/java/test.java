
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
        Colour colour = new Colour(red,green,blue);
        assertEquals(colour.getRed(),red,"Red value should match");
        assertEquals(colour.getBlue(),blue,"Blue value should match");
        assertEquals(colour.getGreen(),green,"Green value should match");
        //assertTrue();
    }
    @Test
    @DisplayName("Test second Constructor")
    void testOverloadConstructor(){
        Colour colour = new Colour(0.9f);
        float red =2.14E-43f ;
        float blue =3.55E-43f ;
        float green = 2.14E-43f;
        assertEquals(colour.getRed(),red,"Red value should match");
        assertEquals(colour.getBlue(),blue,"Blue value should match");
        assertEquals(colour.getGreen(),green,"Green value should match");

    }
    @Test
    @DisplayName("Test red getter")
    void testRedGetter(){
        float red = 0.7f;
        float blue = 0.2f;
        float green = 0.3f;
        Colour colour = new Colour(red,green,blue);
        assertTrue(colour.getRed() == red);
    }
    @Test
    @DisplayName("Test Green getter")
    void testGreenGetter(){
        float red = 0.7f;
        float blue = 0.2f;
        float green = 0.3f;
        Colour colour = new Colour(red,green,blue);
        assertTrue(colour.getGreen() == green);

    }
    @Test
    @DisplayName("Test Blue getter")
    void testBlueGetter(){
        float red = 0.7f;
        float blue = 0.2f;
        float green = 0.3f;
        Colour colour = new Colour(red,green,blue);
        assertTrue(colour.getBlue() == blue);

    }
    @Test
    @DisplayName("Test equals")
    void testEqual(){
        Colour colour1 = new Colour(0f,0f,0f);
        Colour colour2 = new Colour(0f);
        System.out.println((colour2.getRed()));
        System.out.println((colour2.getGreen()));
        System.out.println((colour2.getBlue()));
        assertTrue(colour1.equals(colour2) == true);

    }






}

