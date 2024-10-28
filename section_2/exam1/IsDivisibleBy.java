public class IsDivisibleBy implements Compare {
    public int param;
    public IsDivisibleBy(int param) {
        this.param = param;
    }
    public boolean op(int input) {
        return input % param == 0;
    }
}
