package com.baobapps.assignment_1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.baobapps.assignment_1.ui.theme.Assignment1Theme

class MainActivity : ComponentActivity() {
    val TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activitymain_xml)
        Log.d(TAG, "ONCREATE ACTIVITY CALLED")
        Toast.makeText(applicationContext, "Activity Created", Toast.LENGTH_LONG).show()
        //advanced code
        val goToSecondActivityButton: Button = findViewById(R.id.button)
        goToSecondActivityButton.setOnClickListener {
            val linkToSecondaryActivity = Intent(this, SecondaryActivity::class.java)
            startActivity(linkToSecondaryActivity)
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "ONSTART ACTIVITY CALLED")
        Toast.makeText(applicationContext, "Activity Started", Toast.LENGTH_LONG).show()

    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "ONRESUME ACTIVITY CALLED")
        Toast.makeText(applicationContext, "Activity Resumed", Toast.LENGTH_LONG).show()

    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "ONSTOP ACTIVITY CALLED")
        Toast.makeText(applicationContext, "Activity Stopped", Toast.LENGTH_LONG).show()

    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "ONRESTART ACTIVITY CALLED")
        Toast.makeText(applicationContext, "Activity Restarted", Toast.LENGTH_LONG).show()

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "ONDESTROY ACTIVITY CALLED")
        Toast.makeText(applicationContext, "Activity Destroyed", Toast.LENGTH_LONG).show()

    }
}


