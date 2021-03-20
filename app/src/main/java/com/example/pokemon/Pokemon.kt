package com.example.pokemon

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
@Parcelize

data class Pokemon (val picture:Int, val number: Int, val name: String, val type:String): Parcelable