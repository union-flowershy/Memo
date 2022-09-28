//package com.example.memo
////import android.os.AsyncTask
//
//import android.annotation.SuppressLint
//import android.os.AsyncTask
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import androidx.recyclerview.widget.LinearLayoutManager
//import kotlinx.android.synthetic.main.activity_main.*
//
//@SuppressLint("StaticFieldLeak")
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
//        recyclerView.layoutManager = LinearLayoutManager(this)
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
//        val insertTask = (object : AsyncTask<Unit, Unit, Unit>() {   // 백그라운드로 보내준다
//            override fun doInBackground(vararg params: Unit?) {
//                db.memoDAO().insert(memo)
//            }
//
//            //인서트 완료후에 사이클러뷰에서 해야 할 일을 작업해야 한다.
//            //onPostExecute 작업 후에 무엇을 해야 할 지
//            override fun onPostExecute(result: Unit?) {
//                super.onPostExecute(result)
//                getAllMemo()
//            }
//
//        }).execute()
//
//    }
//
//    fun getAllMemo() {
//
//        //AsynceTask는 백그라운드&비동기작업 도움을 주는 작업
//        val getTask = (object : AsyncTask<Unit, Unit, Unit>() {
//            override fun doInBackground(vararg params: Unit?) {
//                memoList = db.memoDAO().getAll()
//            }
//
//            override fun onPostExecute(result: Unit?) {
//                super.onPostExecute(result)
//                // 메모리스트를 가져왔다면
//                setRecyclerView(memoList)
//            }
//        }).execute()
//    }
//
//    fun deleteMemo() {
//
//    }
//
//    fun setRecyclerView(memoList: List<MemoEntity>) {
//
//        recyclerView.adapter = MyAdapter(this, memoList)
//
//    }
//
//}