package com.amigo.quoteapp

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.amigo.quoteapp.models.Quote
import com.google.gson.Gson

object DataManager {

    var data=emptyArray<Quote>()
    var currentQuote: Quote?=null

    val currentPage=mutableStateOf(Pages.Listing)
    var isDataLoaded= mutableStateOf(false)

    fun loadAssetFromFile(context: Context){
        val inputStream=context.assets.open("quotes.json")
        val size:Int=inputStream.available()
        val buffer= ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json= String(buffer, Charsets.UTF_8)
        val gson=Gson()
        data=gson.fromJson(json, Array<Quote>::class.java)
        isDataLoaded.value=true
    }

    fun switchPages(quote: Quote?){
        if(currentPage.value== Pages.Listing){
            currentQuote=quote
            currentPage.value= Pages.Details
        }
        else{
            currentPage.value= Pages.Listing
        }
    }
}