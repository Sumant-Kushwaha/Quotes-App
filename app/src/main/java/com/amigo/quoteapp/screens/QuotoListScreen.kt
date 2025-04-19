package com.amigo.quoteapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.amigo.quoteapp.models.Quote
import com.amigo.quoteapp.R

@Composable
fun QuoteListScreen(data: Array<Quote>, onClick: (quote: Quote) -> Unit) {
    Column {
        Box(Modifier.height(WindowInsets.statusBars.asPaddingValues().calculateTopPadding())
            .background(Color.Black)
            .fillMaxWidth()
        )
        Card(
            modifier = Modifier
                .padding(start = 5.dp, end = 5.dp),
            elevation = CardDefaults.cardElevation(15.dp)
        ) {
            Text(
                "Quotes App",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(8.dp, 24.dp)
                    .fillMaxWidth(1f),
                style = MaterialTheme.typography.headlineMedium,
                fontFamily = FontFamily(Font(R.font.simpleday))

            )
        }
        QuoteList(data = data, onClick)
    }
}