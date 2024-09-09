public class NetworkWriter implements Writer {
    private final Socket socket;
    public NetworkWriter(final Socket socket) {
	this.socket = socket;
    }
    public void write(int toWrite) throws Exception {
	socket.send(toWrite);
    }
    public void close() throws Exception {
	socket.close();
    }
}
