package com.prueba.pruebamvp.data.itemlist

import com.prueba.pruebamvp.data.remote.ApiClient
import com.prueba.pruebamvp.data.remote.responsemodel.ResponseModels
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ItemListModel : ItemListContract.Model{

    override fun getItemList(onFinishedListener: ItemListContract.Model.OnFinishedListener?) {
        ApiClient.build()?.getItems()?.enqueue(object : Callback<ResponseModels> {
            override fun onResponse(call: Call<ResponseModels>, response: Response<ResponseModels>) {
                onFinishedListener?.onFinished(response.body());
            }
            override fun onFailure(call: Call<ResponseModels>, t: Throwable) {
                onFinishedListener?.onFailure(t);
            }
        })
    }

}