public class FileWriter implements Writer {
    private final FileOutputStream stream;
    public FileWriter(FileOutputStream stream) {
	assert(stream != null);
	this.stream = stream;
    }
    public void write(int result) {
	stream.write(result);
    }
    public void close() {
	stream.close();
    }
}
