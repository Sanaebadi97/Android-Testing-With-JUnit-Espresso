package info.sanaebadi.androidtestingwithjunitandespresso

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MyUtilsTest {
    @Test
    internal fun sumTest() {

        var nums = listOf<Int>(1, 2, 3)

        /*
        we expect 6 if not , so should be a problem and we to back to fix some function

         */
        var actualNumber: Int = MyUtils.sum(nums)
        var expected: Int = 7

        assertEquals(expected, actualNumber)

        println("SUM IS $actualNumber")

        nums = listOf(4, 5, 6)

        actualNumber = MyUtils.sum(nums)
        expected = 16


        assertEquals(expected, actualNumber)

        println("SUM2 IS $actualNumber")


    }
}