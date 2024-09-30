// Java: statically-typed (compile time)
// JavaScript: dynamically-typed (runtime)
//
// Dynamic typing pros:
// -Less restrictive; more programs possible
// -Less code
// -More error-prone
//
// Static typing pros:
// -Faster
// -Easier to reason about
//
public class Types {
    public static String add(String x, String y) {
	return x + y; // x.concat(y)
    }
    public static int add(int x, int y) {
	return x + y; // iadd
    }
    // public static Base foo(int x) {
    // 	if (x < 0) {
    // 	    return new IntBase(0);
    // 	} else {
    // 	    return new StringBase("foo");
    // 	}
    // }
    // public static (int|String) foo(int x) {
    // 	if (x < 0) {
    // 	    return 0;
    // 	} else {
    // 	    return "foo";
    // 	}
    // }
    
    public static void main(String[] args) {
	int x = 7;
	x = 27;
	x = "foo";
    }
}

