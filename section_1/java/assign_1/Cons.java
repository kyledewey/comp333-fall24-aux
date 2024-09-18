public class Cons implements ImmutableList {
    // ---BEGIN INSTANCE VARIABLES---
    public final int head;
    public final ImmutableList tail;
    // ---END INSTANCE VARIABLES---

    public Cons(final int head, final ImmutableList tail) {
        this.head = head;
        this.tail = tail;
    } // Cons

    // [-80, 4, 12].length()
    //   return value: 3
    // new Cons(-80, new Cons(4, new Cons(12, new Nil())))
    // head: -80
    // tail: [4, 12]
    // this: [-80, 4, 12]
    public int length() {
	//         [4, 12].length()
	// int rest = tail.length();
	// // rest: 2
	// return rest + 1;

	return 1 + tail.length();
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
} // Cons
