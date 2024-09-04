// java Example
// Reads a command-line argument: console or file?
public class Example {
    // public static boolean doesUserWantConsole(String[] args) { ... }
    public static String getDestinationFile(String[] args) throws Exception { ... }
	
    public static int doComputation(Writer writer) {
	int retval = 3;
	for (long x = 1; x < 999999999999; x++) {
	    retval *= (int)x;
	    if (x % 1000 == 0) {
		// ad-hoc polymorphism
		writer.write(retval); // odd - rechecking stream
	    }
	}
	return retval;
    }
    
    public static void main(String[] args) throws Exception {
	String destinationFile = getDestinationFile(args);
	NetworkLocation location = getNetworkLocation(args);

	Writer writer = null;
	
	if (destinationFile != null) {
	    // writing to file - subtyping polymorphism
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
