package koans.practice.pawan.kotlinkoanssolutions

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    //Least priority variables goes below.....
    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }//onCreate closes here....
}//MainActivity closes here....
