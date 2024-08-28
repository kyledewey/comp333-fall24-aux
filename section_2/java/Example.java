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
    public static int doComputation() { return 0; }
    
    public static void main(String[] args) throws Exception {
	boolean userWantsConsole = doesUserWantConsole(args);
	String destinationFile = getDestinationFile(args);

	int result = doComputation();

	if (userWantsConsole) {
	    System.out.println(result);
	} else {
	    File file = new File(destinationFile);
	    FileOutputStream stream = new FileOutputStream(file);
	    stream.write(result);
	    stream.close();
	}
    }
}
