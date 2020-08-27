package com.prueba.pruebamvp.views.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.prueba.pruebamvp.R
import com.prueba.pruebamvp.views.adapter.AdapterExtras
import com.prueba.pruebamvp.data.remote.responsemodel.ResponseModelsItem
import com.prueba.pruebamvp.utils.Constants
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    var responseModelsItem: ResponseModelsItem? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
       responseModelsItem = intent.getParcelableExtra(Constants.EXTRAS.RESPONSE_MODELS_ITEM)
        getExtras()
    }

    private fun getExtras (){
        responseModelsItem?.let {
            rvExtras.adapter = AdapterExtras(it.extras!!)
        }
    }
}