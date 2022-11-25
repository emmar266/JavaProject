package colour;

public class Colour {
    private float red;
    private float green;
    private float blue;

    public Colour(float r, float g, float b){
        this.red = r;
        this.green = g;
        this.blue = b;
    }
    //i really hate that we're overloading the constructor - it feels wrong
    public Colour(float combinedRGB){
        //I'm not sure what's supposed to happen here but sure look

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


}

