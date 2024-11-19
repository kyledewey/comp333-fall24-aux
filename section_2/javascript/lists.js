List.prototype.isList = function() {
    return true;
};
function List() {
    // this.__proto__ = List.prototype;
}

Nil.prototype = new List();
Nil.prototype.isEmpty = function() {
    return true;
};
function Nil() {
    // this.__proto__ = Nil.prototype;
}

Cons.prototype = new List();
Cons.prototype.isEmpty = function() {
    return false;
};
function Cons(h, t) {
    // this.__proto__ = Cons.prototype;
    this.head = h;
    this.tail = t;
}
