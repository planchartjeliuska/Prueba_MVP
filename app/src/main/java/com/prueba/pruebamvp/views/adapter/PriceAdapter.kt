package com.prueba.pruebamvp.views.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.prueba.pruebamvp.R
import com.prueba.pruebamvp.data.remote.responsemodel.Precio
import kotlinx.android.synthetic.main.item_price.view.*

class PriceAdapter(val listPrice : List<Precio>): RecyclerView.Adapter<PriceAdapter.ViewHolder>() {

    class ViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
        RecyclerView.ViewHolder(inflater.inflate(R.layout.item_price, parent, false))
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(inflater, parent)
    }
    override fun getItemCount(): Int {
        return listPrice.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val price = listPrice[position]
        holder.itemView.apply {
            tvPriceTitle.text = price.titulo
            tvPriceDescription.text = price.descripcion
            tvPriceprice.text = "Precio  " + price.precio!!.toString()
        }
    }

}