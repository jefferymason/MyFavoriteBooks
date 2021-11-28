package com.mason.myfavoritebooks

import androidx.recyclerview.widget.RecyclerView
import com.mason.myfavoritebooks.databinding.BookCardViewBinding

class CardViewHolder(
    private val cardCellBinding: BookCardViewBinding,
    private val clickListener: FavoriteBooksClickListenerClickListener
) : RecyclerView.ViewHolder(cardCellBinding.root)
{

    fun bindBook(book: Books) {
        cardCellBinding.cover.setImageResource(book.cover)
        cardCellBinding.title.text = book.title
        cardCellBinding.author.text = book.author
        cardCellBinding.cardView.setOnClickListener{
            clickListener.onClick(book)
        }
        }
    }