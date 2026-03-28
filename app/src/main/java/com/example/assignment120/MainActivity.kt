package com.example.assignment120

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.assignment120.ui.theme.Assignment120Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //Declaration of Variables
        val timeInput = findViewById<EditText>(R.id.editTime)
        val resultText = findViewById<TextView>(R.id.txtResult)
        val checkButton = findViewById<Button>(R.id.btnCheck)
        val resetButton = findViewById<Button>(R.id.btnReset)

        //Check Button
        checkButton.setOnClickListener {
            val time = timeInput.text.toString()

            val message = when (time){
                "Morning" -> "Tell/Text someone Good Morning"
                "Good Morning" -> "Send someone an uplifting message"
                "Breakfast" -> "Send a joke to someone"
                "Afternoon" -> "Smile and wave at someone"
                "Good Afternoon" -> "Make conversation with someone new"
                "Lunch" -> "Invite someone to join you for lunch"
                "Night" -> "Ask someone about their day"
                "Goodnight" -> "Show gratitude towards someone"
                "Dinner" -> "Share a fun memory from your day"
                "Done" -> "Amazing Work, Well done"
                else -> "Answer not accepted"
            }

            resultText.text = message

        }
        //Reset Button
        resetButton.setOnClickListener {
            timeInput.text.clear()
            resultText.text = "Result will appear here"
        }

    }
}






