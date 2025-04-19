package com.amigo.quoteapp.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.amigo.quoteapp.models.Quote


@Composable
fun QuoteList(data: Array<Quote>,onClick:(quote: Quote)-> Unit){
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(data) { item ->
            Text(
                text = item.text,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )
        }
    }
}