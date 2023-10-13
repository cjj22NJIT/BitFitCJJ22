package com.example.bitfit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AddActivity :  AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)
        val recordButton = findViewById<Button>(R.id.recordButton)
        val foodNameInput = findViewById<TextView>(R.id.foodNameInput)
        val calorieCountInput = findViewById<TextView>(R.id.calorieCountInput)

        val db = AppDatabase.getInstance(this)



        recordButton.setOnClickListener{
            val foodName = foodNameInput.text.toString()
            val calAmount = calorieCountInput.text.toString()
            val test = "food: "+foodName+" cc = "+calAmount+" should go to back to mainactivity now"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(this, test, duration) // in Activity
            //toast.show()
            val newItem = FoodEntity(food_name = foodName, calorie_amount = calAmount)
            db.foodDAO().insert(newItem)
            val intent = Intent(this@AddActivity, MainActivity::class.java)
            startActivity(intent)

        }

    }

}