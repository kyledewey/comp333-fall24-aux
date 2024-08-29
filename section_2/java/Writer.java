// Wasting space - don't need socket if we have stream
// Logic is getting intermixed
public class Writer {
    private boolean userWantsConsole;
    private FileOutputStream stream;
    private Socket socket;

    public Writer(boolean userWantsConsole,
		  FileOutputStream stream,
		  Socket socket) {
	this.userWantsConsole = userWantsConsole;
	this.stream = stream;
	this.socket = socket;
    }

    public void write(int result) {
	if (userWantsConsole) {
	    System.out.println(result);
	} else if (stream != null) {
	    stream.write(result);
	} else if (socket != null) {
	    socket.send(result);
	}
    }

    public void close() {
	if (stream != null) {
	    stream.close();
	} else if (socket != null) {
	    socket.disconnect();
	}
    }
}
