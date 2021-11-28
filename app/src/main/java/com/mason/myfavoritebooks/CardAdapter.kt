package com.mason.myfavoritebooks

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mason.myfavoritebooks.databinding.BookCardViewBinding

class CardAdapter(private val myBooks: List<Books>,
                  private val clickListener: FavoriteBooksClickListenerClickListener
)
    : RecyclerView.Adapter<CardViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = BookCardViewBinding.inflate(from, parent, false)
        return CardViewHolder(binding, clickListener)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bindBook(myBooks[position])
    }

    override fun getItemCount(): Int = myBooks.size

}