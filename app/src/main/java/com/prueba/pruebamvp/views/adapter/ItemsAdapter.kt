package com.prueba.pruebamvp.views.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.prueba.pruebamvp.R
import com.prueba.pruebamvp.data.remote.responsemodel.Item
import kotlinx.android.synthetic.main.item_items.view.*

class ItemsAdapter(val listItems : List<Item>): RecyclerView.Adapter<ItemsAdapter.ViewHolder>() {

    class ViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
        RecyclerView.ViewHolder(inflater.inflate(R.layout.item_items, parent, false))
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(inflater, parent)
    }
    override fun getItemCount(): Int {
        return listItems.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val items = listItems[position]
        holder.itemView.apply {
            tvItemName.text = items.nombre
            tvItemPrice.text = "Precio  " + items.precio!!.toString()
            tvItemStatus.text = "Estado  " + items.status!!.toString()
        }
    }

}