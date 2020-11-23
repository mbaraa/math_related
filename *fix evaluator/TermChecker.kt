object TermChecker {
    fun isNumber(number: String): Boolean {
        try {
            number.toDouble()
        } catch (nfe: NumberFormatException) {
            return false
        }

        return true
    }

    fun isOperator(chr: String): Boolean {
        val op = chr[0]
        try {
            chr[1]

        } catch (sioobe: StringIndexOutOfBoundsException) {
            return op == '+' || op == '-' ||
                    op == '*' || op == '/' ||
                    op == 'p'

        }

        return false
    }
}