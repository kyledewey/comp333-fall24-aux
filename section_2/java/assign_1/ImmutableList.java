public interface ImmutableList {
    public int length();
    public int sum(); // empty list sum is defined as 0
    public boolean contains(final int value);
    public ImmutableList append(final ImmutableList other);

    // examples
    public boolean isEmpty();

    // [4, 0, 5].addAmount(2) ==> [6, 2, 7]
    // [2, 7].addAmount(1) ==> [3, 8]
    // [].addAmount(5) ==> []
    public ImmutableList addAmount(int amount);
    
    public String toString();
    public int hashCode();
    public boolean equals(final Object other);
} // ImmutableList
