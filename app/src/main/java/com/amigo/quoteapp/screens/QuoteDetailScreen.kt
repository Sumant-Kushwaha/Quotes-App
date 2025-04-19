package com.amigo.quoteapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FormatQuote
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.amigo.quoteapp.R
import com.amigo.quoteapp.models.Quote

@Composable
fun QuoteDetail(quote: Quote) {
    Box(
        Modifier
            .fillMaxSize(1f)
            .background(
                Brush.linearGradient(
                    colors = listOf(
                        Color.Cyan,
                        Color.White
                    )
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        Card(
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp),
//                .align(alignment = Alignment.Center),
            elevation = CardDefaults.cardElevation(15.dp)
        ) {
            Column (
                Modifier.padding(20.dp)
            ) {
                Image(
                    imageVector = Icons.Outlined.FormatQuote,
                    "Icon",
                    modifier = Modifier.rotate(180f)
                        .size(48.dp)
                )
                Text(
                    quote.text,
                    fontSize = 30.sp,
                    fontFamily = FontFamily(Font(R.font.simpleday)),
                    color=Color.Black
                )
                Row (
                    Modifier.padding(top = 20.dp)
                ) {
                    Text(
                        "Author : ",
                        fontSize = 20.sp
                    )
                    Text(
                        quote.author,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}