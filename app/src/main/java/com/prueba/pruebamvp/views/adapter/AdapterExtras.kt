package com.prueba.pruebamvp.views.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.prueba.pruebamvp.R
import com.prueba.pruebamvp.data.remote.responsemodel.Extra
import kotlinx.android.synthetic.main.item_extras.view.*

class AdapterExtras(val extra: List<Extra>) : RecyclerView.Adapter<AdapterExtras.ViewHolder>(){

    class ViewHolder(inflater: LayoutInflater, parent: ViewGroup):
        RecyclerView.ViewHolder(inflater.inflate(R.layout.item_extras, parent, false))
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(inflater, parent)
    }
    override fun getItemCount(): Int {
        return extra.size!!
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val items = extra[position]
        holder.itemView.apply {
            rvItems.adapter = ItemsAdapter(items.items!!)
            tvExtrasTitle.text = items.titulo
            tvExtrasDescription.text = items.descripcion
            tvextrasStatus.text = "Estado  " + items.status!!.toString()
            tvExtrasObligatorio.text = "Obligatorio  " + items.obligatorio!!.toString()
            tvExtrasMaximo.text = "Maximo  " + items.maximo!!.toString()
            tvExtrasMinimo.text = "Minimo  " + items.minimo!!.toString()
            tvExtrasItem.setOnClickListener {
                if ( rvItems.visibility != View.VISIBLE){
                    rvItems.visibility = View.VISIBLE
                }else{
                    rvItems.visibility = View.GONE
                }
            }
        }
    }


}


