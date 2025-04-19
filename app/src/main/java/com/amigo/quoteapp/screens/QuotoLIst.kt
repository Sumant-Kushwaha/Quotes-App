package com.amigo.quoteapp.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.amigo.quoteapp.models.Quote


@Composable
fun QuoteList(data: Array<Quote>,onClick:(quote: Quote)-> Unit){
    LazyColumn {
        items(data){
            QuoteListItem(quote = it,onClick)
        }
    }
}