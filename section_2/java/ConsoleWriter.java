public class ConsoleWriter implements Writer {
    public ConsoleWriter() {}
    public void write(int result) {
	System.out.println(result);
    }
    public void close() {}
}

