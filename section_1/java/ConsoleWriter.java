public class ConsoleWriter implements Writer {
    public ConsoleWriter() {}
    public void write(int toWrite) {
	System.out.println(toWrite);
    }
}
