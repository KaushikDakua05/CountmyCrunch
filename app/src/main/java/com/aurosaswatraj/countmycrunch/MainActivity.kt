package com.aurosaswatraj.countmycrunch

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import androidx.appcompat.app.AppCompatActivity
import com.aurosaswatraj.countmycrunch.CalorieCounter.CalorieData
import com.aurosaswatraj.countmycrunch.CalorieCounter.CalorieOutputFragment
import com.aurosaswatraj.countmycrunch.CalorieCounter.Calorie_Calculator
import com.aurosaswatraj.countmycrunch.CalorieCounter.FragmentCalorieOutput


private const val TAG="MainActivity"
class MainActivity : AppCompatActivity(),FragmentCalorieOutput{

    var fragmentB:CalorieOutputFragment?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        fragmentB=CalorieOutputFragment()

    }



    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.buttom_nev_menu, menu)
        return true
    }

    override fun onOutputSent(data: ArrayList<CalorieData>) {

        Log.d(TAG,"Data in MainActivity is $data")
        fragmentB?.updateEditText(data)
    }


}

/** Monitor your health in your hands. */
/**
 * Fat Loss = 12-13 calories per pound of body weight
 * Maintenance = 15-16 calories per #
 * Weight Gain = 18-19 calories per #
 */

//Pass Data between Fragments; https://www.youtube.com/watch?v=i22INe14JUc&ab_channel=CodinginFlow


/*
https://www.themealdb.com/api.php
https://www.fruityvice.com/
https://github.com/surhud004/Foodish
* */