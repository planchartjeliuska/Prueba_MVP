package com.prueba.pruebamvp.utils.extensions

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.loadImageFromUrl(urlImage: String?, isShowError: Boolean = false) {
    if (isShowError) {
        Glide.with(this)
            .load(urlImage)
            .error(ColorDrawable(Color.GRAY))
            .into(this)
    } else {
        Glide.with(this).load(urlImage).into(this)
    }
}