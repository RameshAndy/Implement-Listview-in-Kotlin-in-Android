package com.ram.example.kotlinlistview

/**
 * Created by ramesh on 11/9/17.
 */
data class DataPojo(
		var status: String,// ok
		var comment: Comment,
		var success: Boolean// true
)

data class Comment(
		var id: Int,// 126033
		var name: String,// Andy1111
		var url: String,//
		var date: String,// 2017-09-11 18:49:32
		var content: String,// hai this test comment
		var parent: String,// 0
		var author: Author
)

data class Author(
		var id: Int,// 8609
		var slug: String,// Andy1111
		var name: String,// Andy1111
		var first_name: String,// Andy1111
		var last_name: String,
		var nickname: String,// andy1111
		var url: String,// //www.gravatar.com/avatar/7a6b715212cf4636903c429a5dbe60ba?s=120&#038;r=g&#038;d=mm
		var description: String//
)
