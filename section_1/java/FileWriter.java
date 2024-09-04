public class FileWriter implements Writer {
    private final FileOutputStream stream;
    public FileWriter(final FileOutputStream stream) {
	this.stream = stream;
    }
    public void write(int toWrite) {
	stream.writeln(toWrite);
    }
    public void close() {
	stream.close();
    }
}
