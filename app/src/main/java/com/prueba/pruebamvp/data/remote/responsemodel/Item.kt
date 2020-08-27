package com.prueba.pruebamvp.data.remote.responsemodel


import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Item(
    @SerializedName("id")
    var id: String,
    @SerializedName("nombre")
    var nombre: String,
    @SerializedName("precio")
    var precio: Int,
    @SerializedName("status")
    var status: Int

) : Parcelable