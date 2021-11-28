package com.mason.myfavoritebooks

var bookList = mutableListOf<Books>()

var BOOK_ID_DETAILS = "bookDetails"

class Books (
    var cover: Int,
    var author: String,
    var title: String,
    var description: String,
    var id: Int? = bookList.size
        )