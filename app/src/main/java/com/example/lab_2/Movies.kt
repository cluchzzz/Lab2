package com.example.lab_2

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MovieData(
    val name: String,
    val image: String,
    val dfirst: String,
    val dsecond: String,
    val watch: String
): Parcelable
