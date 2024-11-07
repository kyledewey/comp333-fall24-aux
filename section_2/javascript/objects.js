// function makeRectangle(w, h) {
//     return { 'width': w, 'height': h };
// }

const rectanglePrototype = {
    'getArea': function () {
        return this.width * this.height;
    }
};

// Preferred way: put prototype directly on Rectangle
// TODO: show this
function Rectangle(w, h) {
    // if called as a constructor (new Rectangle(..., ...))
    // this = {};
    this.width = w;
    this.height = h;
    this.__proto__ = rectanglePrototype;
    // return this;
}
