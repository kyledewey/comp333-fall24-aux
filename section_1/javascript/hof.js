// higher-order functions
// closures
// anonymous functions
// lambda functions
// lambdas

function printArray(arr) {
    for (let index = 0; index < arr.length; index++) {
        let element = arr[index];
        console.log(element);
    }
}

// higher-order functions: functions are data
// compare is a function
// - Takes an array element
// - Returns true if the element should be printed
function printArrayComparison(arr, compare) {
    for (let index = 0; index < arr.length; index++) {
        let element = arr[index];
        if (compare(element)) {
            console.log(element);
        }
    }
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
