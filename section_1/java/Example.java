// java Example
// Reads a command-line argument: console or file?
public class Example {
    // public static boolean doesUserWantConsole(String[] args) { ... }
    public static String getDestinationFile(String[] args) throws Exception { ... }

    public static void write(FileOutputStream stream, int toWrite) {
	if (stream == null) { // odd - rechecking stream
	    System.out.println(retval);
	} else {
	    stream.writeln(retval);
	}
    }
	
    public static int doComputation(FileOutputStream stream) {
	int retval = 3;
	for (long x = 1; x < 999999999999; x++) {
	    retval *= (int)x;
	    if (x % 1000 == 0) {
		write(stream, retval); // odd - rechecking stream
	    }
	}
	return retval;
    }
    
    public static void main(String[] args) throws Exception {
	String destinationFile = getDestinationFile(args);
	FileOutputStream stream = null;
	if (destinationFile != null) {
	    stream = new FileOutputStream(destinationFile);
	}

	int result = doComputation(stream);

	write(stream, result);
	if (stream != null) {
	    stream.close();
	}
    }
}
