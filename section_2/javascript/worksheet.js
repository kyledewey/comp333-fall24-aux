function Base() {}
function Sub1() {}
function Sub2() {}

Base.prototype.method = function() { console.log("base"); }
Sub1.prototype = new Base();
Sub2.prototype = new Base();
Sub1.prototype.method = function() { console.log("sub1"); }

let base = new Base();
let sub1 = new Sub1();
let sub2 = new Sub2();
base.method();
sub1.method();
sub2.method();
console.log(base instanceof Base);
console.log(sub1 instanceof Base);
console.log(sub2 instanceof Base);
