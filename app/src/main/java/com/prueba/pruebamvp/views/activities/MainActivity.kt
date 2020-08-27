package com.prueba.pruebamvp.views.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.prueba.pruebamvp.R
import com.prueba.pruebamvp.views.adapter.AdapterFirst
import com.prueba.pruebamvp.data.itemlist.ItemListContract
import com.prueba.pruebamvp.data.itemlist.ItemListPresenter
import com.prueba.pruebamvp.data.remote.responsemodel.ResponseModels
import com.prueba.pruebamvp.data.remote.responsemodel.ResponseModelsItem
import com.prueba.pruebamvp.utils.Constants
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ItemListContract.View, AdapterFirst.ListenerFirstAdapter{

    private val listPresenter: ItemListPresenter by lazy {
        ItemListPresenter(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listPresenter.requestDataFromServer()
    }

    override fun showProgress() {

    }

    override fun hideProgress() {

    }

    override fun setDataToRecyclerView(responseModels: ResponseModels?) {
        responseModels?.let {
            rvFirst.adapter = AdapterFirst(it, this@MainActivity)
        }
    }

    override fun onResponseFailure(throwable: Throwable?) {

    }



    override fun onClickView(responseModelsItem: ResponseModelsItem) {

        val intent = Intent(this, DetailActivity::class.java)

        intent.putExtra(Constants.EXTRAS.RESPONSE_MODELS_ITEM,responseModelsItem)

        startActivity(intent)

    }
}