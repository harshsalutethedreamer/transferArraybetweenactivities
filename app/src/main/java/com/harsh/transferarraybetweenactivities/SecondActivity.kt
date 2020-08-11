package com.harsh.transferarraybetweenactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {
    var questionlist:ArrayList<SafetyQuizClass>?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

       //Show data send by array
        val iab = intent.getIntExtra("quizquestion", 0)
        // val args:Bundle=intent.getBundleExtra("Bundle")
        questionlist=intent.getParcelableArrayListExtra<SafetyQuizClass>("quizquestionlist")
        Log.d("data",questionlist.toString())
    }
}