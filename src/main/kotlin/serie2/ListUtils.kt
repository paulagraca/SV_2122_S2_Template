package serie2

// Class Node
class Node<E> {
    var previous: Node<E>? = null
    var next: Node<E>? = null
    var value: E? = null

    constructor() { }
    constructor(e: E) {
        value = e
    }
}

fun <E> intersection(list1: Node<E>?, list2: Node<E>?, cmp: Comparator<E>): Node<E>? {
    //COMMENT NEXT LINE AND IMPLEMENT YOUR SOLUTION
    throw UnsupportedOperationException()
}

fun <E> mostOccurrent(lists: Array<Node<E>?>, cmp: Comparator<E>): E? {
    //COMMENT NEXT LINE AND IMPLEMENT YOUR SOLUTION
    throw UnsupportedOperationException()
}
















