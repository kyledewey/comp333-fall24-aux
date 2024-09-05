public class ConsoleWriter extends Writer {
    public ConsoleWriter() {}
    public void write(int result) {
	System.out.println(result);
    }
    public void close() {}
}

