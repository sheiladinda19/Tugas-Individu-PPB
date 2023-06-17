package com.example.minggu943

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var tvSelectedOption: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvSelectedOption = findViewById(R.id.tvSelectedOption)

        val btnShowPicker: Button = findViewById(R.id.btnShowPicker)
        btnShowPicker.setOnClickListener {
            showPicker()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_item1 -> {
                tvSelectedOption.text = "Selected Choices: Choice 1"
                return true
            }
            R.id.menu_item2 -> {
                tvSelectedOption.text = "Selected Choices: Choice 2"
                return true
            }
            R.id.menu_item3 -> {
                tvSelectedOption.text = "Selected Choices: Choice 3"
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

    private fun showMenu() {
        openOptionsMenu()
    }

    private fun showPicker() {
        val pickerOptions = arrayOf("Choice 1", "Choice 2", "Choice 3")

        val builder = androidx.appcompat.app.AlertDialog.Builder(this)
        builder.setTitle("Select a Choice")

        builder.setItems(pickerOptions) { _, which ->
            tvSelectedOption.text = "Selected Choices: ${pickerOptions[which]}"
        }

        builder.create().show()
    }
}