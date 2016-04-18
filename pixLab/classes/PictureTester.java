/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
    /** Method to test zeroBlue */
    public static void testZeroBlue()
    {
	Picture beach = new Picture("beach.jpg");
	beach.explore();
	beach.zeroBlue();
	beach.explore();
    }
  
    /** Method to test mirrorVertical */
    public static void testMirrorVertical()
    {
	Picture caterpillar = new Picture("caterpillar.jpg");
	caterpillar.explore();
	caterpillar.mirrorVertical();
	caterpillar.explore();
    }

    /** Method to test mirrorVerticalRightToLeft */
    public static void testMirrorVerticalRightToLeft()
    {
	Picture caterpillar = new Picture("caterpillar.jpg");
	caterpillar.explore();
	caterpillar.mirrorVerticalRightToLeft();
	caterpillar.explore();
    }

    /** Method to test mirrorHorizontal */
    public static void testMirrorHorizontal()
    {
	Picture caterpillar = new Picture("caterpillar.jpg");
	caterpillar.explore();
	caterpillar.mirrorHorizontal();
	caterpillar.explore();
    }

    /** Method to test mirrorHorizontalBotToTop */
    public static void testMirrorHorizontalBotToTop()
    {
	Picture caterpillar = new Picture("caterpillar.jpg");
	caterpillar.explore();
	caterpillar.mirrorHorizontalBotToTop();
	caterpillar.explore();
    }
    
    /** Method to test mirrorDiagonal */
    public static void testMirrorDiagonal()
    {
	Picture caterpillar = new Picture("beach.jpg");
	caterpillar.explore();
	caterpillar.mirrorDiagonal();
	caterpillar.explore();
    }

    /** Method to test mirrorTemple */
    public static void testMirrorTemple()
    {
	Picture temple = new Picture("temple.jpg");
	temple.explore();
	temple.mirrorTemple();
	temple.explore();
    }

    /** Method to test mirrorArms */
    public static void testMirrorArms()
    {
	Picture snowman = new Picture("snowman.jpg");
	snowman.explore();
	snowman.mirrorArms();
	snowman.explore();
    }
    
    /** Method to test mirrorGull */
    public static void testMirrorGull()
    {
	Picture seagull = new Picture("seagull.jpg");
	seagull.explore();
	seagull.mirrorGull();
	seagull.explore();
    }
  
    /** Method to test the collage method */
    public static void testCollage()
    {
	Picture canvas = new Picture("640x480.jpg");
	canvas.createCollage();
	canvas.explore();
    }
    
    /** Method to test my collage method */
    public static void testMyCollage()
    {
	Picture canvas = new Picture("640x480.jpg");
	canvas.explore();
	Picture gull = new Picture("seagull.jpg");
	gull.explore();
	canvas.copy(gull, 0, 0, 0, 0, 300, 300);
	canvas.copy(gull, 100, 100, 230, 230, 350, 350);
	gull.mirrorHorizontal();
	canvas.copy(gull, 250, 100, 230, 230, 350, 350);
	canvas.explore();
    }
  
    /** Method to test edgeDetection */
    public static void testEdgeDetection()
    {
	Picture swan = new Picture("swan.jpg");
	swan.edgeDetection(10);
	swan.explore();
    }
    
    /** Method to test copy */
    public static void testCopy()
    {
	Picture beach = new Picture("beach.jpg");
	Picture swan = new Picture("swan.jpg");
	beach.explore();
	swan.explore();
	beach.copy(swan, 50, 50, 60, 80, 300, 400);
	beach.explore();
    }
  
    /** Main method for testing.  Every class can have a main
     * method in Java */
    public static void main(String[] args)
    {
	// uncomment a call here to run a test
	// and comment out the ones you don't want
	// to run
	//testZeroBlue(); // Good
	//testKeepOnlyBlue();
	//testKeepOnlyRed();
	//testKeepOnlyGreen();
	//testNegate();
	//testGrayscale();
	//testFixUnderwater();
	//testMirrorVertical(); // Good
	//testMirrorVerticalRightToLeft(); // Good
	//testMirrorHorizontal(); // Good
	//testMirrorHorizontalBotToTop(); // Good
	//testMirrorTemple(); // Good 
	//testMirrorArms(); // Good
	//testMirrorGull(); // Good
	//testMirrorDiagonal(); // Good
	//testCollage(); // Good
	//testMyCollage(); // Good
	//testCopy(); // Good
	//testEdgeDetection();
	//testEdgeDetection2();
	//testChromakey();
	//testEncodeAndDecode();
	//testGetCountRedOverValue(250);
	//testSetRedToHalfValueInTopHalf();
	//testClearBlueOverValue(200);
	//testGetAverageForColumn(0);
    }
}
