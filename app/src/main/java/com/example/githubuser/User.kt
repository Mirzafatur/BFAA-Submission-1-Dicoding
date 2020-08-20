package com.example.githubuser

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User (
    var avatar : Int,
    var name : String,
    var username : String,
    var repository : Int,
    var following : Int,
    var followers : Int,
    var company : String,
    var location : String
) : Parcelable