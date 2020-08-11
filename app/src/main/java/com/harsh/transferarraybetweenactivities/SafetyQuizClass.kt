package com.harsh.transferarraybetweenactivities

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


//kotlin create data class
//for sending array data through intent used @Parcelize and :Parcelable
@Parcelize
data class SafetyQuizClass(
    var question: String, var choice: String):Parcelable {

}
