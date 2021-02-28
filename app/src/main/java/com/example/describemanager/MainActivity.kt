package com.example.describemanager

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import androidx.appcompat.widget.AlertDialogLayout
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    private val TAG:String = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        InitCalinderToday()
        /*
            R.layout -> res 하위 layout폴더
            activity_main.xml을 컨텍스트 뷰로 설정
            res 폴더 및 하위 폴더들 명칭은 변경하면 안됨. 영어 소문자로 작성
         */

    }

    private val dllistener = DialogInterface.OnClickListener { dialog, which -> Log.d(TAG,"ok button click") } //람다식 표현

    private val dllistener_lamda = object:DialogInterface.OnClickListener{
        override fun onClick(dialog:DialogInterface?, which:Int){
            Log.d(TAG,"객체- cancle button click ")
        }
    }//onClick 이벤트를 오버라이드, 리스너 등록

    private fun InitCalinderToday(){

        val adl:AlertDialog.Builder =  AlertDialog.Builder(this);

        adl.setMessage("캘린더 초기화 로직")
        adl.setTitle("init cal")
        //adl.setPositiveButton("ok"){_,_-> Log.d(TAG,"확인버튼 클릭")}
        //adl.setNegativeButton("cancel"){_,_ -> Log.d(TAG,"취소버튼 클릭")} //익명 함수를 사용할때.
        adl.setPositiveButton("ok",dllistener) //이벤트 리스너 등록 후 사용할때
        adl.setNegativeButton("cancel",dllistener_lamda)



        val dialog:AlertDialog;
        dialog = adl.create()
        dialog.show()


    }


}