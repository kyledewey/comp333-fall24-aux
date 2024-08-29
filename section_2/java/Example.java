import java.io.File;
import java.io.FileOutputStream;

// Reads command-line arguments to determine where to print
// (write to console or to a file)
//
// java Example      /// means console; doesUserWantConsole = true
//                                    ; getDestinationFile = null
//
// java Example foo.txt   /// means file; doesUserWantConsole = false
//                            getDestinationFile = "foo.txt"

public class Example {
    public static boolean doesUserWantConsole(String[] args) { ... }
    public static String getDestinationFile(String[] args) { ... }

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

	FileOutputStream stream = null;
	
	if (!userWantsConsole) {
	    File file = new File(destinationFile);
	    stream = new FileOutputStream(file);
	}

	Writer writer = new Writer(userWantsConsole, stream);
	int result = doComputation(writer);

	writer.write(result);
	writer.close();
    }
}
