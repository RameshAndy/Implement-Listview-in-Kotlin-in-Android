package com.ram.example.kotlinlistview

/**
 * Created by ramesh on 11/9/17.
 */


data class CheckAnother(
		var status: String,// ok
		var msg: String,//
		var success: String,//
		var error: String,//
		var total: Int,// 0
		var members: List<Member>
)

data class Member(
		var status: String,// ok
		var msg: String,//
		var success: String,//
		var error: String,//
		var total: Int// 0
)