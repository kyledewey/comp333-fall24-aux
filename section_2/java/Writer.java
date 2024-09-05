public abstract class Writer {
    public abstract void write(int result);
    public abstract void close();
}

    
// Wasting space - don't need socket if we have stream
// Logic is getting intermixed
// public class Writer {
//     private final boolean userWantsConsole;
//     private final FileOutputStream stream;
//     private final Socket socket;

//     public Writer() {
// 	userWantsConsole = true;
// 	stream = null;
// 	socket = null;
//     }

//     public Writer(FileOutputStream stream) {
// 	assert(stream != null);
// 	userWantsConsole = false;
// 	this.stream = stream;
// 	socket = null;
//     }

//     public Writer(Socket socket) {
// 	assert(socket != null);
// 	userWantsConsole = false;
// 	stream = null;
// 	this.socket = socket;
//     }
    
//     // public Writer(boolean userWantsConsole,
//     // 		  FileOutputStream stream,
//     // 		  Socket socket) {
//     // 	if (userWantsConsole) {
//     // 	    assert(stream == null && socket == null);
//     // 	} else if (stream != null) {
//     // 	    assert(socket == null);
//     // 	} else {
//     // 	    assert(socket != null);
//     // 	}
//     // 	this.userWantsConsole = userWantsConsole;
//     // 	this.stream = stream;
//     // 	this.socket = socket;
//     // }

//     public void write(int result) {
// 	if (userWantsConsole) {
// 	    System.out.println(result);
// 	} else if (stream != null) {
// 	    stream.write(result);
// 	} else if (socket != null) {
// 	    socket.send(result);
// 	}
//     }

//     public void close() {
// 	if (stream != null) {
// 	    stream.close();
// 	} else if (socket != null) {
// 	    socket.disconnect();
// 	}
//     }
// }
