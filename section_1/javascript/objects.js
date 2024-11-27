Shape.prototype.isShape = function() {
    return true;
}
function Shape() {}

Rectangle.prototype = new Shape();
Rectangle.prototype.getArea = function () {
    return this.width * this.height;
}
Rectangle.prototype.getWidth = function () {
    return this.width;
}
function Rectangle(w, h) {
    this.width = w;
    this.height = h;
}

/*
let rectanglePrototype = {
    'getArea': function () {
        return this.width * this.height;
    },
    'getWidth': function () {
        return this.width;
    }
};

function Rectangle(w, h) {
    // if called as a constructor (with new, like new Rectangle...)
    // this = {};
    this.width = w;
    this.height = h;
    this.__proto__ = rectanglePrototype;
    // this.getArea = getRecArea;
    // this.getWidth = getWidth;
    // return this;
}
*/
function makeRectangle(w, h) {
    return { 'width': w, 'height': h };
}
