package com.felipejose.optionmenuapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var fundo: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fundo = findViewById<LinearLayout>(R.id.fundo) as LinearLayout
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_principal,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item!!.itemId){
            R.id.corAzulEscuro -> fundo.setBackgroundColor(Color.parseColor("#00008B"))

            R.id.corVerdeEscuro -> fundo.setBackgroundColor(Color.parseColor("#006400"))

            R.id.corVioletaEscuro -> fundo.setBackgroundColor(Color.parseColor("#9400D3"))

            R.id.texto -> Toast.makeText(this@MainActivity, "Clique nos três botões ao lado para escolher uma cor de fundo.", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}
