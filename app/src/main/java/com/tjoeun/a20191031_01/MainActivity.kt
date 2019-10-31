package com.tjoeun.a20191031_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // intent에 첨부된 데이터를 찾아주는 코드
        var recvName = intent.getStringExtra("tagName")
        var recvNum = intent.getStringExtra("tagNum")
        var recvId = intent.getStringExtra("tagId")

        memberNum.text = "${recvNum} 번 회원"
        memberName.text = "${recvName} (${recvId})"


    }
}
