package com.example.revisiontpdialog

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isVisible
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var button:Button
    lateinit var editeText:EditText
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button=findViewById(R.id.button)
        editeText=findViewById(R.id.etName)
        button.setOnClickListener {

           // callActivity()
            if(editeText.length()== 0){

                val Sb = Snackbar.make(it, "les champs ne doivent pas etre vide" , Snackbar.LENGTH_LONG).setAction("Action", null)
                Sb.show();

            }
            else{
                val ad = AlertDialog.Builder(this)
                ad.setMessage(" confirmer les données ")
                ad.setTitle("Confirmer")
                ad.setIcon(android.R.drawable.btn_dialog)
                ad.setPositiveButton("yes"){dialogInterface, it -> dialogInterface.cancel()
                    callActivity()
                }
                ad.setNegativeButton("no"){dialogInterface, it -> dialogInterface.cancel()}
                ad.show()
            }

        }
    }
    private fun callActivity(){
        val message= editeText.text.toString()
        val intent = Intent(this,SecondActivity::class.java).also {
            it.putExtra("EXTRA_MESSAGE",message)
            startActivity(it)
        }
        //intent.putExtra("EXTRA_MESSAGE",message)
        //startActivity(intent)


    }
}