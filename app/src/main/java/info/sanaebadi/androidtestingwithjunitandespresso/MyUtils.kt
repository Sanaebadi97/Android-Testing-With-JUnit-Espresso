package info.sanaebadi.androidtestingwithjunitandespresso

class MyUtils {

    companion object {

        fun sum(numbers: List<Int>): Int {

            var summation = 0
            for (sum: Int in numbers) {
                summation += sum
            }

            return (summation +1)
        }
    }
}