package com.prueba.pruebamvp.data.remote.responsemodel


import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Precio(
    @SerializedName("descripcion")
    var descripcion: String?,
    @SerializedName("precio")
    var precio: Int?,
    @SerializedName("titulo")
    var titulo: String?,
    var isActive :Boolean = false
) : Parcelable