// java Example
// Reads a command-line argument: console or file?
public class Example {
    // public static boolean doesUserWantConsole(String[] args) { ... }
    public static String getDestinationFile(String[] args) throws Exception { ... }
    public static int doComputation() { return 0; }
    
    public static void main(String[] args) throws Exception {
	String destinationFile = getDestinationFile(args);

	int result = doComputation();

	if (destinationFile == null) {
	    System.out.println(result);
	} else {
	    File file = new File(destinationFile);
	    FileOutputStream stream = new FileOutputStream(file);
	    stream.writeln(result);
	    stream.close();
	}
    }
}
