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

// shouldPrint is a function
// - Takes an array element
// - Returns true if we should print the array element
function printSomeArray(arr, shouldPrint) {
    for (let index = 0; index < arr.length; index++) {
        let element = arr[index];
        if (shouldPrint(element)) {
            console.log(element);
        }
    }
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

// TODO: debug1
