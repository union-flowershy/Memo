//package com.example.memo
//
//import android.content.Context
//import android.view.LayoutInflater
//import android.view.View
//import android.view.View.OnLongClickListener
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import kotlinx.android.synthetic.main.item_memo.view.*
//
//class MyAdapter (val context : Context,
//                 var list : List<MemoEntity>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){
//
//    // 아이템 리스트 카운트
//    override fun getItemCount(): Int {
//        return list.size
//    }
//
//    // 상자 틀을 만든다
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
//
//        val itemView = LayoutInflater.from(context).inflate(R.layout.item_memo,parent, false)
//
//        return MyViewHolder(itemView)
//
//    }
//
//    // onCreateViewHolder에서 틀을 만들고 리턴을 하면 여기로 온다
//    // 만든 틀과 넘겨온 리스트의 내용을 바인딩한다(합쳐준다)
//    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//
//        // list = 1, 2, 3
//        val memo = list[position]
//        holder.memo.text = memo.memo
//        holder.root.setOnLongClickListener(object : OnLongClickListener{
//            override fun onLongClick(v: View?): Boolean {
//                return true
//            }
//        })
//
//    }
//
//      inner class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
//
//          val memo = itemView.textview_memo
//          val root = itemView.root
//
//      }
//
//}