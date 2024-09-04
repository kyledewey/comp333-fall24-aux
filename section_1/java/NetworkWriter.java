public class NetworkWriter implements Writer {
    private final Socket socket;
    public Writer(final Socket socket) {
	this.socket = socket;
    }
    public void write(int toWrite) {
	socket.send(toWrite);
    }
    public void close() {
	socket.close();
    }
}
