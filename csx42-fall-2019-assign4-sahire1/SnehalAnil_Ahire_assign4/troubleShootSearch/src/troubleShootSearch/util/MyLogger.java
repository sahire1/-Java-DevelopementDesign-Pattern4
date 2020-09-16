
// FIXME: replace XYZ with the package name for the assignment
package troubleShootSearch.util;

public class MyLogger{

    // FIXME: Add more enum values as needed for the assignment
    public static enum DebugLevel { FILE_PROCESSOR ,EMPTY_INPUT , Results, Boundary, FileDoesNotExists
                                   };

    private static DebugLevel debugLevel;


    // FIXME: Add switch cases for all the levels
    public static void setDebugValue (int levelIn) {
	switch (levelIn) {
	case 2: debugLevel = DebugLevel.Boundary; break;
	case 4: debugLevel = DebugLevel.FILE_PROCESSOR; break;
	case 3: debugLevel = DebugLevel.EMPTY_INPUT;break;
	case 1: debugLevel = DebugLevel.Results;break;
	case 5: debugLevel = DebugLevel.FileDoesNotExists;break;
	//default: debugLevel = DebugLevel.NONE; break;
	}
    }

    public static void setDebugValue (DebugLevel levelIn) {
	debugLevel = levelIn;
    }

    public static void writeMessage (String     message  ,
                                     DebugLevel levelIn ) {
	if (levelIn == debugLevel)
	    System.out.println(message);
    }

    public String toString() {
	return "The debug level has been set to the following " + debugLevel;
    }
}