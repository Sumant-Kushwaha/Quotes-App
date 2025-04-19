package com.amigo.quoteapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FormatQuote
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.amigo.quoteapp.models.Quote


@Composable
fun QuoteListItem(quote: Quote, onClick: (quote: Quote) -> Unit) {
    Card(
        modifier = Modifier
            .padding(5.dp)
            .clickable { onClick(quote) },
        elevation = CardDefaults.cardElevation(5.dp),
        shape = RoundedCornerShape(10.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Card(
                Modifier.padding(5.dp)
            ) {
                Image(
                    imageVector = Icons.Outlined.FormatQuote,
                    "quote",
                    colorFilter = ColorFilter.tint(Color.Black),
                    modifier = Modifier
                        .size(58.dp)
                        .rotate(180f)
                )
            }
            Column(
                Modifier.weight(.8f)
            ) {
                Card(
                    Modifier
                        .padding(5.dp)
                        .height(50.dp)
                        .fillMaxWidth(),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFD5D5D5)),
                    elevation = CardDefaults.cardElevation(5.dp),
                    shape = RoundedCornerShape(10.dp),
                ) {
                    Text(
                        quote.quote,
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.headlineMedium,
                        fontSize = 15.sp,
                        lineHeight = 20.sp,
                        modifier = Modifier.padding(5.dp)
                    )
                }
                Card(
                    Modifier
                        .padding(5.dp)
                        .background(Color.Transparent),
                    shape = RoundedCornerShape(10.dp),
                ) {
                    Row {
                        Text("Author : ")
                        Text(
                            quote.author,
                            textDecoration = TextDecoration.Underline,
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                }
            }
        }
    }
}
