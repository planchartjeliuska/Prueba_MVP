package com.prueba.pruebamvp.data.itemlist

import android.os.Bundle
import com.prueba.pruebamvp.data.remote.responsemodel.ResponseModels

interface ItemListContract {
    interface Model {

        interface OnFinishedListener {
            fun onFinished(responseModels: ResponseModels?)
            fun onFailure(t: Throwable?)
        }

        fun getItemList(onFinishedListener: OnFinishedListener?)
    }

    interface View {

        fun showProgress()
        fun hideProgress()
        fun setDataToRecyclerView(responseModels: ResponseModels?)
        fun onResponseFailure(throwable: Throwable?)
    }

    interface Presenter {
        fun onDestroy()
        fun requestDataFromServer()
    }
}