package tw.tutorials.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val myTextView = findViewById<TextView>(R.id.mytextview)
        var timesClicked = 0

        btnClickMe.setOnClickListener {
            timesClicked += 1

            myTextView.text = timesClicked.toString()
            Toast.makeText(this, "Hey I'm a toast!", Toast.LENGTH_LONG).show()
        }

    }
}