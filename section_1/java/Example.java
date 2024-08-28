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
		writer.write(retval); // odd - rechecking stream
	    }
	}
	return retval;
    }
    
    public static void main(String[] args) throws Exception {
	String destinationFile = getDestinationFile(args);
	NetworkLocation location = getNetworkLocation(args);
	
	FileOutputStream stream = null;
	Socket socket = null;
	
	if (destinationFile != null) {
	    stream = new FileOutputStream(destinationFile);
	} else if (location != null) {
	    socket = new Socket(location);
	}

	Writer writer = new Writer(stream, socket);
	int result = doComputation(writer);

	writer.write(result);
	writer.close();
    }
}
