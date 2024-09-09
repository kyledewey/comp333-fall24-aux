public class ConsoleWriter implements Writer {
    public ConsoleWriter() {}
    public void write(int toWrite) throws Exception {
	System.out.println(toWrite);
    }
    public void close() throws Exception {}
}
