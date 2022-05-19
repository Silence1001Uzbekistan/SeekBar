package uz.silence.practice_4_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.SeekBar
import android.widget.Toast
import uz.silence.practice_4_5.databinding.ActivityMainSeekBarBinding

class MainActivitySeekBar : AppCompatActivity() {

    private lateinit var bindingSeek: ActivityMainSeekBarBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingSeek = ActivityMainSeekBarBinding.inflate(layoutInflater)
        setContentView(bindingSeek.root)

        Mythread().start()

        bindingSeek.seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                Toast.makeText(this@MainActivitySeekBar, "OnProgressChanges", Toast.LENGTH_SHORT)
                    .show()
                Mythread().start()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                Toast.makeText(this@MainActivitySeekBar, "OnStartTrackingTouch", Toast.LENGTH_SHORT)
                    .show()
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                Toast.makeText(this@MainActivitySeekBar, "onStopTrackingTouch", Toast.LENGTH_SHORT)
                    .show()
            }

        })

    }

    inner class Mythread:Thread(){
        override fun run() {
            sleep(2000)
            bindingSeek.seekBar.progress += 5
        }
    }

}