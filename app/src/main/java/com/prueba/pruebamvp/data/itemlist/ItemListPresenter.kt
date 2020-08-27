package com.prueba.pruebamvp.data.itemlist

import com.prueba.pruebamvp.data.remote.responsemodel.ResponseModels

class ItemListPresenter(private var itemListView: ItemListContract.View?) : ItemListContract.Presenter, ItemListContract.Model.OnFinishedListener {


    private var itemListModel: ItemListContract.Model = ItemListModel()


    override fun onFinished(responseModels: ResponseModels?) {
        itemListView?.hideProgress()
        itemListView?.setDataToRecyclerView(responseModels)
    }


    override fun onFailure(t: Throwable?) {
        itemListView?.hideProgress()
        itemListView?.onResponseFailure(t)
    }

    override fun onDestroy() {
        itemListView = null
    }

    override fun requestDataFromServer() {
        itemListView?.showProgress()
        itemListModel.getItemList(this)
    }

}