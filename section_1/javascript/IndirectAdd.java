public class IndirectAdd {
    public static Adder indirectAdd(final int x) {
        return new Adder(x);
    }

    public static void main(String[] args) {
        Adder addOne = indirectAdd(1);
        Adder addFive = indirectAdd(5);
        System.out.println(addOne.add(2));
        System.out.println(addFive.add(4));
    }
}

