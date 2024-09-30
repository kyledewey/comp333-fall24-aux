function add(x, y) {
    return x + y;
}

// returns int or string or boolean
function foo(x) {
    if (x < 0) {
	return 0;
    } else if (x > 0) {
	return "foo";
    } else {
	return true;
    }
}

// let temp = foo(-1);
// if (typeof temp == 'string') {
    
