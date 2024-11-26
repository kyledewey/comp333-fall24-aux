function AddThis(x) { this.x = x; }
AddThis.prototype.add = function (y) { return this.x + y; }

let withOne = new AddThis(1);
let withFive = new AddThis(5);
console.log(withOne.add(1));
console.log(withFive.add(2));
