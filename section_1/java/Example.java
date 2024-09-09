import java.io.File;
import java.io.FileOutputStream;

// java Example
// Reads a command-line argument: console or file?
public class Example {
    // public static boolean doesUserWantConsole(String[] args) { ... }
    public static String getDestinationFile(String[] args) throws Exception {
	return null;
    }

    public static NetworkLocation getNetworkLocation(String[] args) throws Exception {
	return null;
    }
    
    // writer's runtime type is one of:
    // - FileWriter
    // - NetworkWriter
    // - ConsoleWriter
    public static int doComputation(Writer writer) throws Exception {
	int retval = 3;
	for (long x = 1; x < 99999999; x++) {
	    retval *= (int)x;
	    if (x % 1000 == 0) {
		// ad-hoc polymorphism - actual method called
		// depends on writer's runtime type
		// semantically, this is what happens:
		// if (writer instanceof ConsoleWriter) {
		//     // call ConsoleWriter's write
		// } else if (writer instanceof FileWriter) {
		//     // call FileWriter's write
		// } else if (writer instanceof NetworkWriter) {
		//     // call NetworkWriter's write
		// }
		writer.write(retval); // odd - rechecking stream
	    }
	}
	return retval;
    }
    
    public static void main(String[] args) throws Exception {
	String destinationFile = getDestinationFile(args);
	NetworkLocation location = getNetworkLocation(args);

	// at compile-time: writer has type Writer
	// at runtime: writer has one of the following types:
	// - FileWriter
	// - NetworkWriter
	// - ConsoleWriter
	Writer writer = null;

	// if destinationFile is not None:
	//    writer = FileWriter(FileOutputStream(destinationFile))
	if (destinationFile != null) {
	    // writing to file - subtyping polymorphism: compile-time feature
	    // Writer = FileWriter
	    writer = new FileWriter(new FileOutputStream(destinationFile));
	} else if (location != null) {
	    // writing to network - subtyping polymorphism
	    // Writer = NetworkWriter
	    writer = new NetworkWriter(new Socket(location));
	} else {
	    // writing to console - subtyping polymorphism
	    // Writer = ConsoleWriter
	    writer = new ConsoleWriter();
	}

	int result = doComputation(writer);
	
	writer.write(result);
	writer.close();
    }
}
