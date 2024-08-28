public class Writer {
    private FileOutputStream stream;
    private Socket socket;

    public Writer(FileOutputStream stream,
		  Socket socket) {
	this.stream = stream;
	this.socket = socket;
    }

    public static void write(int toWrite) {
	// odd - rechecking stream
	if (stream != null) {
	    stream.writeln(retval);
	} else if (socket != null) {
	    socket.send(retval);
	} else {
	    System.out.println(retval);
	}
    }

    public void close() {
	if (stream != null) {
	    stream.close();
	} else if (socket != null) {
	    socket.close();
	}
    }
}
