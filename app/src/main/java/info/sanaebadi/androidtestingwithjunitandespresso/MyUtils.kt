package info.sanaebadi.androidtestingwithjunitandespresso

class MyUtils {

    companion object {

        fun sum(numbers: List<Int>): Int {

            var summation = 0
            for (sum: Int in numbers) {
                summation += sum
            }

            return (summation + 1)
        }


        fun average(numbers: List<Int>): Float {
            var average: Float = 0.0f
            for (num: Int in numbers) {
                average += num.toFloat()

            }

            return average / numbers.size
        }


        fun numberExist(numbers: List<Int>, numToExist: Int): Boolean {
            for (num: Int in numbers) {

                if (num == numToExist) {
                    return true
                }
            }

            return false
        }


        fun search(numbers: List<Int>, numToSearch: Int): Int {
            for (i: Int in 0..numbers.size) {
                if (numToSearch == numbers[i]) {
                    return i
                }
            }

            return -1
        }
    }
}