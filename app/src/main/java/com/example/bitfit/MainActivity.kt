package com.example.bitfit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private lateinit var foodRecyclerView: RecyclerView
    private val foodItems = mutableListOf<DisplayFood>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val addButton = findViewById<Button>(R.id.AddNewFood)

        foodRecyclerView = findViewById(R.id.recyclerView)

        val db = AppDatabase.getInstance(this)

        val allFoods = db.foodDAO().getAll()

        foodRecyclerView.apply{
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = FoodAdapter(allFoods)

        }

        addButton.setOnClickListener{
            val intent = Intent(this@MainActivity, AddActivity::class.java)
            startActivity(intent)

            val test = "pushed the button, should go to addactivity now"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(this, test, duration) // in Activity
            //toast.show()
        }
    }




}