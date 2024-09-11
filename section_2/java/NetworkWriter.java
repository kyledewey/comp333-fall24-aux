public class NetworkWriter implements Writer {
    private final Socket socket;
    public NetworkWriter(Socket socket) {
	assert(socket != null);
	this.socket = socket;
    }
    public void write(int result) {
	socket.send(result);
    }
    public void close() {
	socket.disconnect();
    }
}
