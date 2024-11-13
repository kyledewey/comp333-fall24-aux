// FOR WEDNESDAY: finish showing constructors; explaining
// code below
function Rectangle(w, h) {
    // if called as a constructor (with new, like new Rectangle...)
    // this = {};
    this.width = w;
    this.height = h;
    this.getArea = function () {
        return this.width * this.height;
    };
    // return this;
}

function makeRectangle(w, h) {
    return { 'width': w, 'height': h };
}
