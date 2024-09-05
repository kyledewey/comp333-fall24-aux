import java.io.File;
import java.io.FileOutputStream;

// Reads command-line arguments to determine where to print
// (write to console or to a file)
//
// java Example     /// means console; doesUserWantConsole = true
//                                    ; getDestinationFile = null
//
// java Example foo.txt   /// means file; doesUserWantConsole = false
//                            getDestinationFile = "foo.txt"

public class Example {
    // returns true if the user wants the console
    public static boolean doesUserWantConsole(String[] args) { ... }
    // returns null if not to file
    public static String getDestinationFile(String[] args) { ... }
    // returns null if not to network
    public static NetworkLocation getNetworkLocation(String[] args) { ... }
    
    public static int doComputation(Writer writer) {
	int retval = 3;
	for (long x = 1; x < 99999999999999999; x++) {
	    retval = retval * (int)x;
	    if (x % 1000 == 0) {
		// print current retval
		writer.write(retval);
	    }
	}
	
	return retval;
    }
    
    public static void main(String[] args) throws Exception {
	boolean userWantsConsole = doesUserWantConsole(args);
	String destinationFile = getDestinationFile(args);
	NetworkLocation location = getNetworkLocation(args);
	Writer writer = null;

	if (userWantsConsole) {
	    // subtyping polymorphism
	    writer = new ConsoleWriter();
	} else if (destinationFile != null) {
	    // subtyping polymorphism
	    writer = new FileWriter(new FileOutputStream(new File(destinationFile)));
	} else if (location != null) {
	    // subtyping polymorphism
	    writer = new NetworkWriter(new Socket(location));
	}

	int result = doComputation(writer);

	writer.write(result);
	writer.close();
    }
}
