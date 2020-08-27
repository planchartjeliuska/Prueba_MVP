package com.prueba.pruebamvp.data.remote.responsemodel


import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ResponseModelsItem(
    @SerializedName("descripcion")
    var descripcion: String?,
    @SerializedName("descuento")
    var descuento: Int?,
    @SerializedName("extras")
    var extras: List<Extra>?,
    @SerializedName("id")
    var id: String?,
    @SerializedName("precios")
    var precios: List<Precio>?,
    @SerializedName("status")
    var status: Int?,
    @SerializedName("tiendaId")
    var tiendaId: String?,
    @SerializedName("titulo")
    var titulo: String?,
    @SerializedName("urlImagen")
    var urlImagen: String?
): Parcelable