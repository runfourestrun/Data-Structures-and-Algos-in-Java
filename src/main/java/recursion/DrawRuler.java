package recursion;


/***
 * a simple example of a fractal, that is, a shape that is self-recursive at various levels of magnitude
 */
public class DrawRuler {

    private int rulerSize; // size of the overall ruler
    private int majorLength; // length of ticksize for inch
    private int tickLength; //

    public DrawRuler(int rulerSize, int majorLength){

        this.rulerSize = rulerSize;
        this.majorLength = majorLength;

    }


    public void drawRuler(int nInches, int majorLength) {
        drawLine(majorLength, 0); //draw inch 0 line and label
        for(int i =0; i < majorLength; i++){
            drawInterval(majorLength - 1); //draw interior ticks for inch
            drawLine(majorLength,i); //draw inch j line and label
        }

    }


    public static void drawLine(int tickLength, int tickLabel){
        for(int j = 0; j < tickLength;j++){
            if(tickLabel >= 0)
                System.out.println(" " + tickLabel);
            System.out.println("\n");
        }
    }

    public static void drawInterval(int centralLength) {
        if (centralLength >= 1) { // do nothing
            drawInterval(centralLength - 1); //recursively draw top interval
            drawLine(centralLength); // draw center tick line (without label)
            drawInterval(centralLength - 1); // recursively draw bottom interval
        }
    }


    public static void drawLine(int tickLength){
        drawLine(tickLength, -1);
    }
}


