// function makeRectangle(w, h) {
//     return { 'width': w, 'height': h };
// }

// let rectanglePrototype = {
//     'getArea': function () {
//         return this.width * this.height;
//     }
// };

Shape.prototype.isShape = function() {
    return true;
}
function Shape() {}

// Preferred way: put prototype directly on Rectangle
Rectangle.prototype = new Shape();
Rectangle.prototype.getArea = function() {
    return this.width * this.height;
};
function Rectangle(w, h) {
    // if called as a constructor (new Rectangle(..., ...))
    // this = {}; // automatic
    // this.__proto__ = Rectangle.prototype; // automatic
    this.width = w;
    this.height = h;

    // this.__proto__ = rectanglePrototype;

    // return this; // automatic
}
