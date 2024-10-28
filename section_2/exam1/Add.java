public class Add implements AddOrSubtract {
    public Add() {}
    public AddOrSubtract flip() {
        return new Subtract();
    }
    public int operation(int x, int y) {
        return x + y;
    }
}
