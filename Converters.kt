package com.example.runningapp.db

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.room.TypeConverter
import java.io.ByteArrayOutputStream

class Converters {

    @TypeConverter
    fun toBitmap(bytes: ByteArray) :Bitmap{
    return BitmapFactory.decodeByteArray(bytes,0,bytes.size)
    }

    @TypeConverter
    fun fromBitmap(btm:Bitmap):ByteArray{
        val outputStream=ByteArrayOutputStream()
        btm.compress(Bitmap.CompressFormat.PNG,100,outputStream)
        return  outputStream.toByteArray()
    }
}