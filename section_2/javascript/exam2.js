function extract(arr1, arr2, f) {
    for (let index = 0; index < arr1.length; index++) {
        if (f(arr1[index], arr2[index])) {
            arr2[index] = arr1[index];
        }
    }
}

function extractMin(arr1, arr2) {
    extract(arr1, arr2, (a, b) => a < b);
}

function extractMax(arr1, arr2) {
    extract(arr1, arr2, (a, b) => a > b);
}
