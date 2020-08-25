package com.test.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initSpn()
    }

    private fun initSpn(){
        // Add Item In ArrayList
        val spnList = ArrayList<String>()
        spnList.add("ALL")
        spnList.add("FREE")
        spnList.add("PAY")

        // Create Adapter And Set Adapter
        spn_test.adapter = AdtSpinner(this, spnList)

        // Add EventListener
        spn_test.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                Toast.makeText(applicationContext, "${spn_test.getItemAtPosition(p2)} Selected!!", Toast.LENGTH_SHORT).show()
            }

        }
    }
}