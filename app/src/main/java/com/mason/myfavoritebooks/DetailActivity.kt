package com.mason.myfavoritebooks


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mason.myfavoritebooks.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bookID = intent.getIntExtra(BOOK_ID_DETAILS, -1)
        val book = bookFromID(bookID)
        if(book != null) {
            binding.cover.setImageResource(book.cover)
            binding.title.text = book.title
            binding.author.text = book.author
            binding.description.text = book.description
        }
    }

    private fun bookFromID(bookID: Int): Books? {
        for(book in bookList) {
            if(book.id == bookID)
                return book
        }
        return null
    }
}