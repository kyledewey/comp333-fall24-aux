public class Subtract implements AddOrSubtract {
    public Subtract() {}
    public AddOrSubtract flip() {
        return new Add();
    }
    public int operation(int x, int y) {
        return x - y;
    }
}
