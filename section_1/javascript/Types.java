// Java: statically-typed
// "happens statically": at compile-time
// "happens dynamically": at runtime
//
// Static typing pros:
// -Better performance
//    -(Most) checks done at compile-time
//    -Far less hidden control flow
//
// Dynamic typing pros:
// -Less verbose / less code
// -More programs are possible
// -Same function on different types
//
// Dynamic typing cons:
// -More programs are possible
// -Reasoning is harder
//   -Documentation is critical
//   -Hidden control flow
//   -Potentially harder to verify input
//   -Very few guarantees
//
// Dynamic deferrs checks to runtime:
// -You need to actually execute broken code to know it's broken
// -Overhead
//
public class Types {
    // public static Base foo(int x) {
    // 	if (x < 0) {
    // 	    return new IntBase(0);
    // 	} else {
    // 	    return new StringBase("foo");
    // 	}
    // }
    
    // public static (int|String) foo(int x) {
    // 	if (x < 0) {
    // 	    return 0; // int
    // 	} else {
    // 	    return "foo"; // String
    // 	}
    // }

    public static void broken() {
	int x = "foo";
    }
    
    public static String add(String x, String y) {
	return x + y;
    }
    
    public static int add(int x, int y) {
	return x + y;
    }

    public static double add(double x, double y) {
	return x + y;
    }
    
    public static void main(String[] args) {
	int x = 7;
	x = "foo";

	add(1, 2); // calls add(int, int)
	add("foo", "bar"); // calls add(String, String)
	
	// Java
	// List<SomeBigObjectName> list = new ArrayList<SomeBigObjectName>();

	// JavaScript
	// let list = [];
    }
}
