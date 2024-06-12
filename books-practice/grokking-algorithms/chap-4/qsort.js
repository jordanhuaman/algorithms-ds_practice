var __spreadArray = (this && this.__spreadArray) || function (to, from, pack) {
    if (pack || arguments.length === 2) for (var i = 0, l = from.length, ar; i < l; i++) {
        if (ar || !(i in from)) {
            if (!ar) ar = Array.prototype.slice.call(from, 0, i);
            ar[i] = from[i];
        }
    }
    return to.concat(ar || Array.prototype.slice.call(from));
};
function qsort(arr) {
    if (arr.length <= 1) {
        console.log('hello');
        return arr;
    }
    console.log('another');
    var pivot = arr[0];
    var lef = arr.filter(function (x) { return x < pivot; });
    var right = arr.filter(function (x) { return x > pivot; });
    console.log({ lef: lef, pivot: pivot, right: right });
    return __spreadArray(__spreadArray(__spreadArray([], qsort(lef), true), [pivot], false), qsort(right), true);
}
console.log(qsort([10, 2, 12, 1, 29, 30, 100, 1, 10, 1, 2, 3, 2]));
