package com.example.memo
//
//import android.os.AsyncTask
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import kotlinx.android.synthetic.main.activity_main.*
//
//class MainActivity : AppCompatActivity() {
//
//    lateinit var db  : MemoDatabase //바로 초기화 하지 않을 경우 lateinit 이용
//    var memoList = listOf<MemoEntity>()
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        db = MemoDatabase.getInstance(this)!!
//
//        // 클릭을 하면
//        button_add.setOnClickListener {
//            val memo = MemoEntity(null, edittext_memo.text.toString())
//            insertMemo(memo)
//        }
//
//    }
//
//    // 1. Insert Data
//    // 2. Get Data
//    // 3. Delete Data
//    // 4. Set RecycerView
//
//    fun insertMemo(memo : MemoEntity) {
//
//        // 1. MainThread vs WorkerThread(Backround Thread)
//        // 모든 UI 및 텍스트, 색상, 화면과 관련된 내용은 Mainthread에서 이루어진다
//        // 모든 데이터 통신 관련된 내용, API 받아오거나 , ROOM DATABASE 등은 WorkerThread에서 이루어진다.
//        // 코르틴이 나오기 전 원초적인 안드로이드 FM 정석으로 장석
//
//        val insertTask = object : AsyncTask<Unit, Unit, Unit>() {   // 백그라운드로 보내준다
//            override fun doInBackground(vararg params: Unit?) {
//                db.memoDAO().insert(memo)
//            }
//
//            //인서트 완료후에
//            override fun onPostExecute(result: Unit?) {
//                super.onPostExecute(result)
//                getAllMemo()
//            }
//
//        }
//        insertTask.execute()
//
//    }
//
//    fun getAllMemo() {
//
//    }
//
//    fun deleteMemo() {
//
//    }
//
//    fun setRecyclerView() {
//
//    }
//
//}