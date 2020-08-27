package com.prueba.pruebamvp.views.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.prueba.pruebamvp.R
import com.prueba.pruebamvp.data.remote.responsemodel.ResponseModelsItem
import com.prueba.pruebamvp.utils.extensions.loadImageFromUrl
import kotlinx.android.synthetic.main.item_first.view.*

class AdapterFirst(val responseModelsItem: List<ResponseModelsItem>, val listener: AdapterFirst.ListenerFirstAdapter) : RecyclerView.Adapter<AdapterFirst.ViewHolder>(){

    class ViewHolder(inflater: LayoutInflater, parent: ViewGroup):
        RecyclerView.ViewHolder(inflater.inflate(R.layout.item_first, parent, false))
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(inflater, parent)
    }
    override fun getItemCount(): Int {
        return responseModelsItem.size!!
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val shop = responseModelsItem[position]
        holder.itemView.apply {
            rvPrice.adapter = PriceAdapter( shop.precios!! )
            ivUrlImage.loadImageFromUrl(shop.urlImagen, true)
            tvTitle.text = shop.titulo
            tvDescription.text = shop.descripcion
            tvStatus.text = "Estado  " + shop.status!!.toString()
            tvDescuentos.text = "Descuento  " + shop.descuento!!.toString()
            this.setOnClickListener {
                listener.onClickView(shop)
            }


            tvPrice.setOnClickListener {
                if ( rvPrice.visibility != View.VISIBLE){
                    rvPrice.visibility = View.VISIBLE
                }else{
                    rvPrice.visibility = View.GONE
                }
            }
        }
    }
    interface ListenerFirstAdapter{
        fun onClickView(shop : ResponseModelsItem)
    }

}


