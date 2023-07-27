package com.example.androidthemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)

        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.example_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.item1 -> {
                Toast.makeText(this, "Item 1 selected", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.item2 -> {
                Toast.makeText(this, "Item 2 selected", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.item3 -> {
                Toast.makeText(this, "Item 3 selected", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.nested_item_1 -> {
                Toast.makeText(this, "Nested_Item 1 selected", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.nested_item_2 -> {
                Toast.makeText(this, "Nested_Item 2 selected", Toast.LENGTH_SHORT).show()
                return true
            }

            else -> {
                return super.onOptionsItemSelected(item)
            }

        }


    }

}