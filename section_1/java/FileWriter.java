import java.io.FileOutputStream;

public class FileWriter implements Writer {
    private final FileOutputStream stream;
    public FileWriter(final FileOutputStream stream) {
	this.stream = stream;
    }
    public void write(int toWrite) throws Exception {
	stream.write(toWrite);
    }
    public void close() throws Exception {
	stream.close();
    }
}
