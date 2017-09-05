package koans.practice.pawan.kotlinkoanssolutions._1_introduction._2_Named_Arguments

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import koans.practice.pawan.kotlinkoanssolutions.R

/**
 * Created by Pawan on 05/09/17.
 */
class _3_DefaultArgumentsActivity : AppCompatActivity() {

    //Least priority variables goes below.....
    val TAG = "_3_DefaultArgumentsActivity";


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        foo("a")
        foo("b", number = 1)
        foo("c", toUpperCase = true)
        foo(name = "d", number = 2, toUpperCase = true)
    }//onCreate closes here....


    /**
     * Original Code:
     *
        fun foo(name : String) : String{
            return name
        }//foo closes here.....
    **/


    /**
     * Solution Code:**/
    fun foo(name:String, number:Int = 0, toUpperCase:Boolean=false) : String{
        return "Name = "+name+", number = "+number+", toUpperCase = "+toUpperCase
    }//fun foo closes here.....
}//_3_DefaultArgumentsActivity closes here.....