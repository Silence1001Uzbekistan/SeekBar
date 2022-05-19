package uz.silence.practice_4_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import uz.silence.practice_4_5.databinding.ActivityMainRatingBarBinding

class MainActivityRatingBar : AppCompatActivity() {

    private lateinit var bindingR: ActivityMainRatingBarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingR = ActivityMainRatingBarBinding.inflate(layoutInflater)
        setContentView(bindingR.root)

        bindingR.ratingBar.setOnRatingBarChangeListener { ratingBar, fl, b ->
            Toast.makeText(this, "$fl", Toast.LENGTH_SHORT).show()
        }

        bindingR.ratingBarTwo.setOnRatingBarChangeListener { ratingBar, fl, b ->
            Toast.makeText(this, "$fl", Toast.LENGTH_SHORT).show()
        }

    }
}