// Different things:
// -Initial value
// -Operation applied to (currentResult, currentArrayElement);
//  returns the new result

function reduceLeft(arr, initialValue, operation) {
    let accumulator = initialValue;
    for (let index = 0; index < arr.length; index++) {
        let element = arr[index];
        accumulator = operation(accumulator, element);
    }
    return accumulator;
}

function add(x, y) {
    return x + y;
}

function sum(arr) {
    return reduceLeft(arr, 0, add);
    // return reduceLeft(arr, 0, (accum, e) => accum + e);
    // let retval = 0;
    // for (let index = 0; index < arr.length; index++) {
    //     let element = arr[index];
    //     retval = retval + element;
    // }
    // return retval;
}

function concatenate(arr) {
    return reduceLeft(arr, "", (accum, e) => accum + e);
    // let retval = "";
    // for (let index = 0; index < arr.length; index++) {
    //     let element = arr[index];
    //     retval = retval + element;
    // }
    // return retval;
}

function product(arr) {
    return reduceLeft(arr, 1, (accum, e) => accum * e);
    // let retval = 1;
    // for (let index = 0; index < arr.length; index++) {
    //     let element = arr[index];
    //     retval = retval * element;
    // }
    // return retval;
}

// higher-order functions
// closures
// anonymous functions
// lambda functions
// lambdas

function forEach(arr, func) {
    for (let index = 0; index < arr.length; index++) {
        let element = arr[index];
        func(element);
    }
}

function printArray(arr) {
    forEach(arr, (e) => console.log(e));
}

// shouldPrint is a function
// - Takes an array element
// - Returns true if we should print the array element
function printSomeArray(arr, shouldPrint) {
    arr.filter(shouldPrint).forEach((e) => console.log(e));

    // forEach(arr,
    //         (element) => {
    //             if (shouldPrint(element)) {
    //                 console.log(element);
    //             }
    //         });
    
    // forEach(arr,
    //         function (element) {
    //             if (shouldPrint(element)) {
    //                 console.log(element);
    //             }
    //         });

    // for (let index = 0; index < arr.length; index++) {
    //     let element = arr[index];
    //     if (shouldPrint(element)) {
    //         console.log(element);
    //     }
    // }
}

function printGreaterThan(arr, amount) {
    printSomeArray(arr, (arrElem) => arrElem > amount);
                   // function (arrElem) {
                   //     return arrElem > amount;
                   // });
}

function printLessThan(arr, amount) {
    printSomeArray(arr,
                   function (arrElem) {
                       return arrElem < amount;
                   });
}

function printLessThanFive(arr) {
    printLessThan(arr, 5);
}

function printLessThanTen(arr) {
    printLessThan(arr, 10);
}


// function printLessOrGreaterThan(arr, amount, isLess) {
//     for (let index = 0; index < arr.length; index++) {
//         let element = arr[index];
//         if (isLess) {
//             if (element < amount) {
//                 console.log(element);
//             }
//         } else {
//             if (element > amount) {
//                 console.log(element);
//             }
//         }
//     }
// }

// higher-order function: functions are data


function seeIncDec(x) {
    return [function () { return x; },
            function () { x++; },
            function () { x--; }];
}

callMe = (foo) => foo();
// function callMe(foo) {
//     foo();
// }

// function indirectIf(isOne, one, two) {
//     if (isOne) {
//         one();
//     } else {
//         two();
//     }
// }

// otherFunc = (a) => (a) ? () => console.log('yes') : () => console.log('no');

indirectIf = (a, one, two) => (a) ? one() : two();

function indirectWhile(condition, body) {
    if (condition()) {
        body();
        indirectWhile(condition, body);
    }
}

function indirectAdd(x) {
    return function (y) {
        return x + y;
    }
}

function add(x, y) {
    return x + y;
}

function subtract(x, y) {
    return x - y;
}

// func is a function:
//   -Takes two parameters
//   -Returns something
// Returns a function taking two parameters, with debugging output
function debug2(func) {
    return function(x, y) {
        console.log('First param: ' + x);
        console.log('Second param: ' + y);
        let retval = func(x, y);
        console.log('Return value: ' + retval);
        return retval;
    };
}

// wrapAdd takes two parameters:
// 1.) A function (f)
//       - Takes one parameter
//       - Returns something
// 2.) An integer (m)
//
// wrapAdd returns a function:
//   - Takes a parameter (a)
//   - Returns something
//
// a + m
//
// def wrapAdd(func: (Int) => Int, integer: Int): (Int) => Int
function wrapAdd(func, integer) {
    return function (param) {
        return func(param + integer);
    }
}
