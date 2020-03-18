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


    // average method test

    @Test
    internal fun averageTest() {
        var nums = listOf<Int>(3, 4, 5)
        var expected: Float = 4.0f
        var actualNumber: Float = MyUtils.average(nums)

        assertEquals(expected, actualNumber)

        println("AVERAGE IS $actualNumber")

    }


    // numExist method test
    @Test
    internal fun numberExistTest() {
        var numbers = listOf<Int>(1, 2, 3)
        var actualNumber: Boolean = MyUtils.numberExist(numbers, 1)
        var expected: Boolean = true
        assertEquals(expected, actualNumber)

        println("numberExistTest IS $actualNumber")
    }
}