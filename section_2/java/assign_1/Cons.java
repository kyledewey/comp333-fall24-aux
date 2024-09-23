public class Cons implements ImmutableList {
    // ---BEGIN INSTANCE VARIABLES---
    public final int head;
    public final ImmutableList tail;
    // ---END INSTANCE VARIABLES---

    public Cons(final int head, final ImmutableList tail) {
        this.head = head;
        this.tail = tail;
    } // Cons

    // new Cons(4, new Cons(2, new Cons(7, new Nil()))).length()
    // [4, 2, 7].length() ==> 3
    // this.head: 4
    // this.tail: [2, 7]
    // this: [4, 2, 7]
    public int length() {
	//  rest = [2, 7].length();
	int rest = tail.length();
	// rest: 2
	return 1 + rest;

	// return 1 + tail.length();
    }

    public int sum() {
	return 0;
    }
    public ImmutableList append(final ImmutableList other) {
	return null;
    }
    public boolean contains(final int value) {
	return false;
    }

    public boolean isEmpty() {
	return false;
    }
    
    public boolean equals(final Object other) {
        if (other instanceof Cons) {
            final Cons otherCons = (Cons)other;
            return head == otherCons.head && tail.equals(otherCons.tail);
        } else {
            return false;
        }
    } // equals
    
    public String toString() {
        return "Cons(" + head + ", " + tail.toString() + ")";
    } // toString

    public int hashCode() {
        return sum();
    } // hashCode

    // [2, 7].addAmount(1) ==> [3, 8]
    public ImmutableList addAmount(int amount) {
	// amount: 1
	// head: 2
	// tail: [7]
	// this: [2, 7]
	//                   [7].addAmount(1)
	ImmutableList rest = tail.addAmount(amount);
	// rest: [8]
	return new Cons(head + amount, rest);

	// return new Cons(head + amount, tail.addAmount(amount))
    }
} // Cons
