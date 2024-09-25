function add(x, y) {
    return x + y;
}

// returns either an int or a string or a boolean
function foo(x) {
    if (x < 0) {
	return 0;
    } else if (x > 0) {
	return "foo";
    } else {
	return true;
    }
}

let result = foo(5);
if (typeof result == "string") {
    
