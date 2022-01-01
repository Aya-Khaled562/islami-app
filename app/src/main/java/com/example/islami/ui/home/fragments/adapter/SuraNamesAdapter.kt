package com.example.islami.ui.home.fragments.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.islami.R

class SuraNamesAdapter(val items: List<String>) :
    RecyclerView.Adapter<SuraNamesAdapter.SuraViewHolder>() {

    class SuraViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.chapter_name)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuraViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_chaper_name, parent, false)
        return SuraViewHolder(view)
    }

    override fun onBindViewHolder(holder: SuraViewHolder, position: Int) {
        val suraName = items.get(position)
        holder.name.setText(suraName)
        if (onItemClickListener != null) {
            holder.itemView.setOnClickListener {
                onItemClickListener?.onItemClick(position, suraName)
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    var onItemClickListener: OnItemClickListener? = null

    interface OnItemClickListener {
        fun onItemClick(pos: Int, name: String)
    }
}