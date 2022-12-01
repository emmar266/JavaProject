package colour;

public class Colour {
    private float red;
    private float green;
    private float blue;
    private float combinedRGB;

    /**
     * Creates a colour from the following components
     * @param red - represents the amount of red in the colour
     * @param blue - represents the amount of blue in the colour
     * @param green - represents the amount of green in the colour
     * **/
    public Colour(float red, float green, float blue){
        if (red>1 |red <0){
            throw new IllegalArgumentException("Red value should be between 0 and 1");
        }
        this.red = red;
        if (blue>1 | blue <0){
            throw new IllegalArgumentException("Blue value should be between 0 and 1");
        }
        this.green = green;
        if (green>1 | green <0){
            throw new IllegalArgumentException("Green value should be between 0 and 1");
        }
        this.blue = blue;
    }
    /**
     * Alternative Constructor for Colour which takes 1 input as apposed to 3
     * @param combinedRGB - Value of the entire Colour where the first 8 bits represent
     *                    the blue componenet of the colour, next 8 bits represent green and the
     *                   last 8 bits represent the red component
     * */
    public Colour(float combinedRGB){
        //I'm not sure what's supposed to happen here but sure look
        String binaryRep = floatToBinarayString(combinedRGB);
        if (binaryRep.length() <= 25){
            while (binaryRep.length() <= 25){
                binaryRep ='0' + binaryRep;
            }
        }
        String red = binaryRep.substring(16,24);
        String blue = binaryRep.substring(0,8);
        String green = binaryRep.substring(8,16);
        this.red = binaryStringToFloat(red);
        this.green = binaryStringToFloat(green);
        this.blue = binaryStringToFloat(blue);

    }
    /**
     * Returns the value associated with red
     * */
    public float getRed(){
        return this.red;
    }
    /**
     * Returns the value associated with blue
     * */
    public float getBlue(){
        return this.blue;
    }
    /**
     * Returns the value associated with red
     * */
    public float getGreen(){
        return this.green;
    }
    /**
     * Will convert a floating point number into a string containing the binary value of that floating number
     * @param  FloatToConvert - Floating value to convert to binary
     * */
    private String floatToBinarayString(float FloatToConvert){
        int intBits = Float.floatToIntBits(FloatToConvert);
        String binary = Integer.toBinaryString(intBits);
        return binary;
    }
    /**
     * Will convert a binary String to a floating number
     * @param stringToConvert - the string that contains binary to convert to a floating point
     * */
    private float binaryStringToFloat(String stringToConvert){
        int intVal = Integer.parseInt(stringToConvert,2);
        float floatVal = Float.intBitsToFloat(intVal);
        return floatVal;
    }
    /**
     * Will override the default equals and ensure equals means that the red, green and blue value are all
     * equal between the two objects
     * @param c2 - represents another colour object which we are testing against the current one
     *
     * */
    public boolean equals(Colour c2){
        if (this.getRed() == c2.getRed()){
            if (this.getBlue() == c2.getBlue()){
                if (this.getGreen() == c2.getGreen()){
                    return true;
                }
            }
        }
        return false;
    }

}

