package info.sanaebadi.androidtestingwithjunitandespresso

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import junit.framework.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    //we need the rule to launch the activity before running the test

    @Rule
    @JvmField

    //this line means : espresso please launch the main activity before run test

    var myRule = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("info.sanaebadi.androidtestingwithjunitandespresso", appContext.packageName)
    }
}