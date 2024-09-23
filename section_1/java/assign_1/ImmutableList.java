public interface ImmutableList {
    // you implement
    public int length();
    public int sum(); // empty list sum is defined as 0
    public ImmutableList append(final ImmutableList other);
    public boolean contains(final int value);

    // examples
    public boolean isEmpty();

    // [1, 2].addAmount(5) ==> [6, 7]
    //   [1 + 5, 2 + 5]
    // [3, 1, 4].addAmount(2) ==> [5, 3, 6]
    public ImmutableList addAmount(int amount);
    
    // provided
    public String toString();
    public int hashCode();
    public boolean equals(final Object other);
} // ImmutableList
