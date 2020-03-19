package info.sanaebadi.androidtestingwithjunitandespresso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import info.sanaebadi.androidtestingwithjunitandespresso.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))

        setContentView(binding.root)


    }

    fun handelRegister(view: View) {
        if (binding.edtName.text!!.isEmpty() or binding.edtUserName.text!!.isEmpty() or binding.edtPassword.text!!.isEmpty()) {
            binding.txtError.visibility = View.VISIBLE
            binding.txtError.text = getString(R.string.fill_all_fields)
        } else {
            binding.txtError.visibility = View.GONE
        }
    }
}
