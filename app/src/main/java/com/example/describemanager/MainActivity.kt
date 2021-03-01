package com.example.describemanager

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.widget.*
import androidx.appcompat.widget.AlertDialogLayout
import androidx.constraintlayout.widget.ConstraintLayout
import kotlin.math.log
import android.R.layout.simple_expandable_list_item_1



class MainActivity : AppCompatActivity() {
    private val TAG:String = "MainActivity"
    private val LIST_MENU = arrayOf("ITEM1","ITEM2","ITEM3","ITEM4")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //createBoxDynamically()
        ListviewCtrl()
    }

    //리스트뷰 컨트롤
    private fun ListviewCtrl(){
        val atr = ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1, LIST_MENU) //SDK에서 제공하는 어댑터는 여러 종류가 있다.
        val lsview = findViewById(R.id.listview1) as ListView
        lsview.adapter = atr

    }


    //동적 컴포넌트 생성, 추가 - 21.03.01
    private fun createBoxDynamically(){
        val box1 = R.layout.boxview
        val dbtn = Button(this)
        val layout = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        )
        dbtn.layoutParams = layout
        val view = findViewById<LinearLayout>(R.id.mylinear)
        view.addView(dbtn)

    }


}