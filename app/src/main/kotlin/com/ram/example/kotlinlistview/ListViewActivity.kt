package com.ram.example.kotlinlistview

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

public class ListViewActivity() : AppCompatActivity() {
    var name:String?=null
    var sum:Int?=0

    override fun onCreate(savedState: Bundle?) {
        super.onCreate(savedState)
        setContentView(R.layout.activity_list_view)

        val lv = findViewById(R.id.list) as ListView
        lv.adapter = ListExampleAdapter(this)

        }

    }

    private class ListExampleAdapter(context: Context) : BaseAdapter() {
        internal var sList = arrayOf("Android", "Kotlin", "Java", "Ios", "Big Data", "Six", "Seven",
                "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen")
        private val mInflator: LayoutInflater

        init {
            this.mInflator = LayoutInflater.from(context)
        }

        override fun getCount(): Int {
            return sList.size
        }

        override fun getItem(position: Int): Any {
            return sList[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
            val view: View?
            val vh: ListRowHolder
            if (convertView == null) {
                view = this.mInflator.inflate(R.layout.list_row, parent, false)
                vh = ListRowHolder(view)
                view.tag = vh
            } else {
                view = convertView
                vh = view.tag as ListRowHolder
            }

            vh.label.text = sList[position]
            vh.label.setOnClickListener {
            Log.d("Error","Kotlin")
            }


            vh.label.setOnClickListener(object: View.OnClickListener {
                override fun onClick(view: View): Unit {
                    // Handler code here.
                    Toast.makeText(view.context, "Button 1",
                            Toast.LENGTH_LONG).show()
                }
            })




            return view
        }
    }

    private class ListRowHolder(row: View?) {
        public val label: TextView

        init {
            this.label = row?.findViewById(R.id.label) as TextView
        }
    }

