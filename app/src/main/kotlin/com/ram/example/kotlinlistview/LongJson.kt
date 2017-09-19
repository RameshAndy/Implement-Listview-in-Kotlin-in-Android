package com.ram.example.kotlinlistview

/**
 * Created by ramesh on 11/9/17.
 */

data class BigJson(
		var status: String,// ok
		var count: Int,// 1
		var count_total: Int,// 27
		var pages: Int,// 27
		var posts: List<Post>,
		var query: Query
)

data class Query(
		var ignore_sticky_posts: Boolean,// true
		var offset: String,// 0
		var posts_per_page: String// 1
)

data class Post(
		var id: Int,// 2065
		var type: String,// post
		var slug: String,// a-physical-relationship-isnt-just-for-other-people
		var url: String,// http://10.5.6.103/a-physical-relationship-isnt-just-for-other-people/
		var status: String,// publish
		var title: String,// A Physical Relationship Isn’t Just For Other People
		var title_plain: String,// A Physical Relationship Isn’t Just For Other People
		var content: String,// <p>Your disability might feel like an obstacle when it comes to <a href="https://www.specialbridge.com/relationship-and-romance-tips-for-people-with-disabilities/">dating</a> and having a physical relationship, but it doesn&#8217;t have to be.</p>
<p>It might take some time to get there, but with the right partner and open communication it can happen!</p>
<p>Read on to find out about ways to have the healthy love life you desire with your partner while managing your disability.</p>
<h3>Communication</h3>
<p>This is probably the most important thing when it comes to all relationships, especially if things become physical.</p>
<p>There are a lot of false ideas out there that individuals with disabilities can&#8217;t or don&#8217;t want to have a physical relationship.</p>
<p>This is <a href="http://www.sheknows.com/love-and-sex/articles/1048707/top-five-myths-about-dating-someone-with-a-physical-disability" target="_blank" rel="noopener noreferrer">not true</a>!</p>
<p>You can still have a <a href="https://www.specialbridge.com/married-woman-with-down-syndrome-shares-her-story/">fulfilling</a> relationship, physical or otherwise, with your partner if you have a disability.</p>
<p>Talk openly with them about your disability, and what this means when you get intimate.</p>
<p>It&#8217;s important to remember that everyone is different.</p>
<p>Your disability and situation is different from someone else&#8217;s disability and their situation.</p>
<p>Taking the time to talk to your partner about your disability and how it affects things in the bedroom may be a little bit uncomfortable at first but it is worth it.</p>
<p>Being open and honest in any relationship is key to building trust with your partner, and it can bring you closer together.</p>
<h3>Safe Sex</h3>
<p>After talking with your partner about having a physical relationship, make sure the both of you are informed about each other&#8217;s sexual health.</p>
<p>It&#8217;s also a good idea to discuss your options for having safe sex.</p>
<p>It&#8217;s important to communicate about your emotions, but it&#8217;s also important to talk about this side of having a physical relationship, too.</p>
<p>Take the time to learn about birth control options.</p>
<p>Seek help from someone you trust or a medical professional if you need to.</p>
<h3>There are different ways to have a physical relationship</h3>
<p>Having a physical relationship doesn&#8217;t only mean having sex in the traditional sense.</p>
<p>Television and movies might make you think that sex happens one way, but it&#8217;s a different experience for everyone.</p>
<p>A physical relationship, after all, is more than just engaging in some sort of sexual activity with someone.</p>
<p>It&#8217;s about building and experiencing a sense of closeness, trust, and comfort with your partner.</p>
<p>Don&#8217;t be afraid to get creative with your partner when it comes to your physical relationship.</p>
<p>Talk about what you each like, be realistic about what can happen, and go from there.</p>
<p>If one thing doesn&#8217;t work, try something else until you find what works for the both of you!</p>
<h3>Conclusion</h3>
<p>Deciding to have a physical relationship with your partner is a big step.</p>
<p>B as long as you and your partner are both comfortable and on the same page, there&#8217;s no reason why you can&#8217;t have a fulfilling physical relationship.</p>
<p>Do you have a relationship success story or struggles that you&#8217;d like to share? Leave a comment below!</p>

		var excerpt: String,// Your disability might feel like an obstacle when it comes to dating and having a physical relationship, but it doesn’t have to be. It might take some time to get there, but with the right partner and open communication it can happen! Read on to find out about ways to have the healthy love life […]
		var date: String,// 2017-07-06 16:40:19
		var modified: String,// 2017-07-06 16:41:48
		var categories: List<Category>,
		var tags: List<Tag>,
		var author: Author,
		var comments: List<Comment>,
		var attachments: List<Attachment>,
		var comment_count: Int,// 117
		var comment_status: String,// open
		var thumbnail: String,// http://10.5.6.103/wp-content/uploads/2017/07/physical-disability-e1499373593914.jpg
		var custom_fields: Custom_fields,
		var thumbnail_size: String,// post-thumbnail
		var thumbnail_images: Thumbnail_images,
		var total_like: String,// 12
		var like_flag: Int = 0// 1
)

data class Category(
		var id: Int,// 13
		var slug: String,// dating
		var title: String,// Dating
		var description: String,//
		var parent: Int,// 0
		var post_count: Int// 12
)

data class Custom_fields(
		var slide_template: List<String>,
		var sbg_selected_sidebar: List<String>,
		var sbg_selected_sidebar_replacement: List<String>
)

data class Comment(
		var id: Int,// 125872
		var name: String,// briblo201982
		var url: String,//
		var date: String,// 2017-07-06 16:58:06
		var content: String,// All it takes is patience, communication, and understanding
		var parent: Int,// 0
		var author: Author,
		var replies: List<Reply>
)

data class Reply(
		var id: Int,// 14
		var slug: String,// general
		var title: String,// General
		var description: String,//
		var parent: Int,// 0
		var post_count: Int// 21
)

data class Author(
		var id: Int,// 7922
		var slug: String,// briblo201982
		var name: String,// briblo201982
		var first_name: String,//
		var last_name: String,//
		var nickname: String,// briblo201982
		var url: String,// http://10.5.6.103/wp-content/uploads/avatars/7922/59558f5ad58d0-bpthumb.jpg
		var description: String//
)

data class Attachment(
		var id: Int,// 2066
		var url: String,// http://www.specialbridge.com/wp-content/uploads/2017/07/physical-disability.jpg
		var slug: String,// physical-disability
		var title: String,// physical-disability
		var description: String,//
		var caption: String,//
		var parent: Int,// 2065
		var mime_type: String,// image/jpeg
		var images: Images
)

data class Images(
		var full: Full,
		var thumbnail: Thumbnail,
		var medium: Medium,
		var medium_large: Medium_large,
		var large: Large,
		var post-thumbnail: Post-thumbnail,
		var blog_carousel: Blog_carousel,
		var bbwall-url-preview-thumb: Bbwall-url-preview-thumb
)

data class Medium_large(
		var url: String,// http://10.5.6.103/wp-content/uploads/2017/07/physical-disability-e1499373593914.jpg
		var width: Int,// 620
		var height: Int// 331
)

data class Blog_carousel(
		var url: String,// http://10.5.6.103/wp-content/uploads/2017/07/physical-disability-e1499373593914-310x177.jpg
		var width: Int,// 310
		var height: Int// 177
)

data class Large(
		var url: String,// http://10.5.6.103/wp-content/uploads/2017/07/physical-disability-e1499373593914.jpg
		var width: Int,// 620
		var height: Int// 331
)

data class Full(
		var url: String,// http://10.5.6.103/wp-content/uploads/2017/07/physical-disability-e1499373593914.jpg
		var width: Int,// 620
		var height: Int// 331
)

data class Post-thumbnail(
		var url: String,// http://10.5.6.103/wp-content/uploads/2017/07/physical-disability-e1499373593914.jpg
		var width: Int,// 620
		var height: Int// 331
)

data class Bbwall-url-preview-thumb(
		var url: String,// http://10.5.6.103/wp-content/uploads/2017/07/physical-disability-e1499373593914-200x100.jpg
		var width: Int,// 200
		var height: Int// 100
)

data class Thumbnail(
		var url: String,// http://10.5.6.103/wp-content/uploads/2017/07/physical-disability-e1499373593914-150x150.jpg
		var width: Int,// 150
		var height: Int// 150
)

data class Medium(
		var url: String,// http://10.5.6.103/wp-content/uploads/2017/07/physical-disability-e1499373593914-300x160.jpg
		var width: Int,// 300
		var height: Int// 160
)

data class Author(
		var id: Int,// 1
		var slug: String,// specialbridge
		var name: String,// Special Bridge
		var first_name: String,// Special
		var last_name: String,// Bridge
		var nickname: String,// Special Bridge
		var url: String,// http://10.5.6.103/wp-content/uploads/avatars/1/648cb106944192d9f63c15db06967059-bpthumb.jpg
		var description: String//
)

data class Thumbnail_images(
		var full: Full,
		var thumbnail: Thumbnail,
		var medium: Medium,
		var medium_large: Medium_large,
		var large: Large,
		var post-thumbnail: Post-thumbnail,
		var blog_carousel: Blog_carousel,
		var bbwall-url-preview-thumb: Bbwall-url-preview-thumb
)

data class Medium_large(
		var url: String,// http://10.5.6.103/wp-content/uploads/2017/07/physical-disability-e1499373593914.jpg
		var width: Int,// 620
		var height: Int// 331
)

data class Blog_carousel(
		var url: String,// http://10.5.6.103/wp-content/uploads/2017/07/physical-disability-e1499373593914-310x177.jpg
		var width: Int,// 310
		var height: Int// 177
)

data class Large(
		var url: String,// http://10.5.6.103/wp-content/uploads/2017/07/physical-disability-e1499373593914.jpg
		var width: Int,// 620
		var height: Int// 331
)

data class Full(
		var url: String,// http://10.5.6.103/wp-content/uploads/2017/07/physical-disability-e1499373593914.jpg
		var width: Int,// 620
		var height: Int// 331
)

data class Post-thumbnail(
		var url: String,// http://10.5.6.103/wp-content/uploads/2017/07/physical-disability-e1499373593914.jpg
		var width: Int,// 620
		var height: Int// 331
)

data class Bbwall-url-preview-thumb(
		var url: String,// http://10.5.6.103/wp-content/uploads/2017/07/physical-disability-e1499373593914-200x100.jpg
		var width: Int,// 200
		var height: Int// 100
)

data class Thumbnail(
		var url: String,// http://10.5.6.103/wp-content/uploads/2017/07/physical-disability-e1499373593914-150x150.jpg
		var width: Int,// 150
		var height: Int// 150
)

data class Medium(
		var url: String,// http://10.5.6.103/wp-content/uploads/2017/07/physical-disability-e1499373593914-300x160.jpg
		var width: Int,// 300
		var height: Int// 160
)

data class Tag(
		var id: Int,// 14
		var slug: String,// general
		var title: String,// General
		var description: String,//
		var parent: Int,// 0
		var post_count: Int// 21
)