class Stack<T> {

    val stack = mutableListOf<T>()

    fun push(item: T) {
        stack.add(item)
    }

    fun pop(): T? {
        return if (stack.size > 0) {
            stack.removeAt(stack.lastIndex)
        } else
            null
    }

    fun isEmpty(): Boolean {
        return stack.size == 0
    }
}