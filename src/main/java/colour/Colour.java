package colour;

public class Colour {
    private float red;
    private float green;
    private float blue;
    private float combinedRGB;

    public Colour(float r, float g, float b){
        this.red = r;
        this.green = g;
        this.blue = b;
    }
    //i really hate that we're overloading the constructor - it feels wrong
    public Colour(float combinedRGB){
        //I'm not sure what's supposed to happen here but sure look
        String binaryRep = floatToString(combinedRGB);
        System.out.println(binaryRep);
        String red = binaryRep.substring(16,24);
        String blue = binaryRep.substring(0,8);
        String green = binaryRep.substring(8,16);
        this.red = stringToFloat(red);
        this.green = stringToFloat(green);
        this.blue = stringToFloat(blue);
        System.out.println(this.red);
        System.out.println(this.blue);
        System.out.println(this.green);

    }
    public float getRed(){
        return this.red;
    }
    public float getBlue(){
        return this.blue;
    }
    public float getGreen(){
        return this.green;
    }

    private String floatToString(float FloatToConvert){
        int intBits = Float.floatToIntBits(FloatToConvert);
        String binary = Integer.toBinaryString(intBits);
        return binary;
    }
    private float stringToFloat(String stringToConvert){
        int intVal = Integer.parseInt(stringToConvert,2);
        float floatVal = Float.intBitsToFloat(intVal);
        return floatVal;
    }

}

