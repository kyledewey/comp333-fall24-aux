// higher-order functions
// closures
// anonymous functions
// lambda functions
// lambdas

function overload(x, y, z) {
    if (x === undefined &&
        y === undefined &&
        z === undefined) {
        console.log("no params");
    } else if (y === undefined &&
               z === undefined) {
        console.log(x);
    } else if (z === undefined) {
        console.log(x + y);
    } else {
        console.log(x + y + z);
    }
}

// for (let index = 0; index < arr.length; index++) {
//   let elem = arr[index];
//   if (...elem...) {
//     ...
//   }
// }
function forEach(arr, func) {
    for (let index = 0; index < arr.length; index++) {
        func(arr[index]);
    }
}

function printArray(arr) {
    forEach(arr, (e) => console.log(e));
}

// higher-order functions: functions are data
// compare is a function
// - Takes an array element
// - Returns true if the element should be printed
function printArrayComparison(arr, compare) {
    arr.filter(compare).forEach((e) => console.log(e));
    
    // forEach(arr, function (e) {
    //     if (compare(e)) {
    //         console.log(e)
    //     }
    // });
    
    // for (let index = 0; index < arr.length; index++) {
    //     let element = arr[index];
    //     if (compare(element)) {
    //         console.log(element);
    //     }
    // }
}

// synchronous I/O
// printf(...);
// int x = 5;
//
// File file = open(...);
// String data = read(file);
// String temp = data + "foo";
//
//
// asynchronous I/O
// File file = open(...);
// String data = read(file, callback);
//
// function callback() {
//   doneWithIO = true;
// }
function printArrayGreaterThan(arr, amount) {
    printArrayComparison(arr, (e) => e > amount);
                         // function (e) {
                         //     return e > amount;
                         // });
}

function printArrayLessThan(arr, amount) {
    printArrayComparison(arr,
                         function (arrElem) {
                             return arrElem < amount;
                         });
}
    
function printArrayLessThanFive(arr) {
    printArrayLessThan(arr, 5);
}

function printArrayLessThanTen(arr) {
    printArrayLessThan(arr, 10);
}

function callMe(foo) {
    foo();
}

function indirectIf(bool, function1, function2) {
    // (bool) ? function1() : function2();
    if (bool) {
        return function1();
    } else {
        return function2();
    }
}

// indirectWhile takes:
// - A function (foo)
//   - Takes nothing
//   - Returns a boolean
// - Another function (bar)
//   - Takes nothing
//   - Returns nothing
function indirectWhile(condition, body) {
    // condition() && (body(), indirectWhile(condition, body))
    // (condition()) ? (body() || indirectWhile(condition, body)) : undefined;
    if (condition()) {
        // body() + indirectWhile(condition, body)
        body();
        indirectWhile(condition, body);
    }
}

function addOne(y) {
    return 1 + y;
}

function indirectAdd(x) {
    return function (y) {
        return x + y;
    };
}

function add(x, y) {
    return x + y;
    // console.log('FIRST PARAM: ' + x);
    // console.log('SECOND PARAM: ' + y);
    // let retval = x + y;
    // console.log('RETURN VAL: ' + retval);
    // return retval;
}

function subtract(x, y) {
    return x - y;
}

// func is a function that takes two arguments
function debug2(func) {
    return function (x, y) {
        console.log('FIRST PARAM: ' + x);
        console.log('SECOND PARAM: ' + y);
        let retval = func(x, y);
        console.log('RETURN VAL: ' + retval);
        return retval;
    };
}

// wrapAdd takes:
// 1.) A function (f)
//       - Takes one parameter
//       - Returns an integer
// 2.) An integer (n)
//
// Returns a function
//   - Takes a parameter (p)
//   Adds p to n before calling f with this as input
//  
// def wrapAdd(f : (Int) => Int, n: Int): (Int) => Int

function increment(x) {
    let y = 17;
    return x + 1 + y;
}

// wrapAdd(increment, 5)

function wrapAdd(returnFunction, addInt) {
    y = 17;
    return function (newInt) {
        let retval = addInt + newInt;
        return returnFunction(retval);
    };
}

// function wrapAdd(task, i) {
//     return (param) => task(i + param);
// }

// let wrapAdd = (task, i) => ((param) => task(i + param));

function surprise() {
    x = 2; // introduces global variable x
}

// if True:
//   x = 3
// else:
//   x = 5
// print(x)

// operation is a function
// - Takes current value of the accumulator and current array element
// - Returns the new value of the accumulator
function reduce(arr, initialValue, operation) {
    let accumulator = initialValue;
    for (let index = 0; index < arr.length; index++) {
        // retval += arr[index];
        let element = arr[index];
        accumulator = operation(accumulator, element);
    }
    return accumulator;
}

function sum(arr) {
    return reduce(arr, 0, (a, e) => a + e);
    // let retval = 0; // accumulator
    // for (let index = 0; index < arr.length; index++) {
    //     // retval += arr[index];
    //     let element = arr[index];
    //     retval = retval + element;
    // }
    // return retval;
}

function product(arr) {
    return reduce(arr, 1, (a, e) => a * e);
    // let retval = 1;
    // for (let index = 0; index < arr.length; index++) {
    //     // retval += arr[index];
    //     let element = arr[index];
    //     retval = retval * element;
    // }
    // return retval;
}

// desired behavior: return 0 for empty array of integers,
//                   return "" for empty array of strings
function concat(arr) {
    return reduce(arr, "", (a, e) => a + e);    
    // let retval = "";
    // for (let index = 0; index < arr.length; index++) {
    //     // retval += arr[index];
    //     let element = arr[index];
    //     retval = retval + element;
    // }
    // return retval;
}


