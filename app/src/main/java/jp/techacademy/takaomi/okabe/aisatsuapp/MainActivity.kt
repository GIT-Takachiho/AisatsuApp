package jp.techacademy.takaomi.okabe.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        showTimePickerDialog()
    }

    private fun showTimePickerDialog(){

        val timePickerDialog = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                    if ( hour >= 18)  {
                        textView.text = "こんばんは"
                    }else if ( hour >= 10){
                        textView.text = "こんにちは"
                    }else if ( hour >= 2){
                        textView.text = "おはよう"
                    }else if ( hour >= 0){
                        textView.text = "こんばんは"
                    }

                    Log.d("UI_PARTS", "$hour:$minute")
                },
                0, 0, true)
        timePickerDialog.show()

    }
}

