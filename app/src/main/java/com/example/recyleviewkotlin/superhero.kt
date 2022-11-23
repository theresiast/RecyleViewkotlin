package com.example.recyleviewkotlin
import android.os.Parcelable
import androidx.versionedparcelable.VersionedParcelize



@VersionedParcelize
data class superhero(
    val imgSuperhero: Int,
    val nameSuperhero: String,
    val descSuperhero: String

): Parcelable




