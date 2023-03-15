package com.example.constrant_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}    return super.onOptionsItemSelected(item)
}

override fun onBackPressed() {
    val builder= AlertDialog.Builder(this)
    builder.setMessage("Do you want to exit ?")
    builder.setTitle("Alert !")
    builder.setCancelable(false)
    builder.setPositiveButton("Yes")
    {
            dialog, which-> finish()
    }
    builder.setNegativeButton("No")
    { dialog, which -> dialog.cancel()
    }

    val alertDialog = builder.create()
    alertDialog.show()
}