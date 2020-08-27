package com.prueba.pruebamvp.data.remote.responsemodel


import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Extra(
    @SerializedName("descripcion")
    var descripcion: String?,
    @SerializedName("id")
    var id: String?,
    @SerializedName("items")
    var items: List<Item>?,
    @SerializedName("maximo")
    var maximo: Int?,
    @SerializedName("minimo")
    var minimo: Int?,
    @SerializedName("obligatorio")
    var obligatorio: Int?,
    @SerializedName("status")
    var status: Int?,
    @SerializedName("titulo")
    var titulo: String?
): Parcelable