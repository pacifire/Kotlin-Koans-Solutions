package koans.practice.pawan.kotlinkoanssolutions._0_Hello_World

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import koans.practice.pawan.kotlinkoanssolutions.R

class HelloWorldActivity : AppCompatActivity() {


    //Least priority variables goes below.....
    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "Task1 chk values: "+todoTask0())//Chk values in Log....
    }//onCreate closes here....

    private fun todoTask0(): String {
        return "OK"
    }//todoTask0 closes here.....
}//MainActivity closes here....