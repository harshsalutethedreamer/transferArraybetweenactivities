package com.harsh.transferarraybetweenactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

   //Array data sending in openquizintent
    var quizbutton:Button?=null
    var datasafetyQuizClass:ArrayList<SafetyQuizClass>? = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initview()
        clicklistener();
    }

    fun initview(){
        quizbutton=findViewById(R.id.transferdata)
    }

    fun clicklistener(){
        quizbutton!!.setOnClickListener {
            openquizintent()
        }
    }

    fun openquizintent(){
        val safetyQuizClass1 =SafetyQuizClass("q1","a1")
        val safetyQuizClass2=SafetyQuizClass("q2","a2")
        datasafetyQuizClass!!.add(safetyQuizClass1)
        datasafetyQuizClass!!.add(safetyQuizClass2)

        //send data to intent
        val i = Intent(this,SecondActivity::class.java)
        i.putExtra("quizquestion", 0)
        i.putParcelableArrayListExtra("quizquestionlist",ArrayList(datasafetyQuizClass!!))
        startActivity(i)
    }
}