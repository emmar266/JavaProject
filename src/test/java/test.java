
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import colour.Colour;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class test {
    Colour colour;

    @BeforeEach
    void setUp(){
        colour = new Colour(0.3f,0.4f,0.9f); //use f at the end to make it a floating point number and not a double(default)
    }

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





}

