package koans.practice.pawan.kotlinkoanssolutions._1_introduction._2_Named_Arguments

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import koans.practice.pawan.kotlinkoanssolutions.R

/**
 * Created by Pawan on 04/09/17.
 */
class _2_NamedArgumentsActivity : AppCompatActivity() {


    //Least priority variables goes below....
    val TAG = "_2_NamedArgumentsActivity".toString().trim().subSequence(0,25).toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Case 1:
        bar(1, TAG, false)

        //Case 2:
        bar(2, TAG)

        //Case 3:
        bar(3)


        //Case 4:
        task2(listOf(10,20,30,40,50))
    }//onCreate closes here....


    //Default values for arguments....
    fun bar(i:Int, s: String = "", b:Boolean = true){
        Log.d(TAG, "i = "+i+", s = "+s+", b = "+b)
    }//bar function closes here....

    /**
     * Function for Collectiuons manipulations goes below....
     *
     * Task 2.
     * Print out the collection contents surrounded by curly braces using the library function 'joinToString'.
     * Specify only 'prefix' and 'postfix' arguments.
     **/
    fun task2(collection: Collection<Int>): String{
        Log.d(TAG, "Original Collection: "+collection)
        var modifiedCollection:String = collection.joinToString (prefix = "{", postfix = "}")
        Log.d(TAG, "Modified Collection: "+modifiedCollection)

        return modifiedCollection
    }//task2 closes here....
}//_2_NamedArgumentsActivity class closes here.....