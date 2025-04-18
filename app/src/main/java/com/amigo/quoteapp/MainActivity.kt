package com.amigo.quoteapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.amigo.quoteapp.ui.theme.QuoteAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PreviewFunction()
        }
    }
}

@Preview
@Composable
fun PreviewFunction() {
    Column {
        Box(
            Modifier
                .height(WindowInsets.statusBars.asPaddingValues().calculateTopPadding())
                .background(Color.Black)
                .fillMaxWidth()
        )
        Heading()
        Column(Modifier.verticalScroll(rememberScrollState())) {
            getItemList().map { item ->
                CardLayout(item.img, item.title, item.subTitle)
            }
        }
    }
}

@Composable
fun Heading() {
    Card(
        Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(5.dp),
        elevation = CardDefaults.cardElevation(5.dp),
        shape = RoundedCornerShape(10.dp),
    ) {
        Column(
            Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "Quotes App",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
fun CardLayout(img: Int, quote: String, authorName: String) {
    Card(
        Modifier.padding(5.dp),
        elevation = CardDefaults.cardElevation(5.dp),
        shape = RoundedCornerShape(10.dp),
//        colors = CardDefaults.cardColors(Color(0xFFD0D0CB))
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Card(
                Modifier.padding(5.dp)
            ) {
                Image(
                    painter = painterResource(img),
                    quote,
                    colorFilter = ColorFilter.tint(Color.Black),
                    modifier = Modifier
                        .size(58.dp)
                )
            }
            ItemDescription(quote, authorName)
        }
    }
}

@Composable
fun RowScope.ItemDescription(
    quote: String,
    authorName: String
) {
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
                quote,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.headlineMedium,
                fontSize = 15.sp,
                lineHeight = 20.sp,
                modifier = Modifier.padding(5.dp)
            )
        }
        Card(
            Modifier.padding(5.dp)
                .background(Color.Transparent),
            shape = RoundedCornerShape(10.dp),
        ) {
            Row {
                Text("Author : ")
                Text(
                    authorName,
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }

    }
}

data class Category(
    val img: Int,
    val title: String,
    val subTitle: String
)


fun getItemList(): MutableList<Category> {
    val list = mutableListOf<Category>()

    list.add(
        Category(
            R.drawable.quote,
            "Success is not final, failure is not fatal: It is the courage to continue that counts",
            "Winston Churchill"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "The only way to do great work is to love what you do.",
            "Steve Jobs"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "In the middle of every difficulty lies opportunity.",
            "Albert Einstein"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "Your time is limited, so don’t waste it living someone else’s life.",
            "Steve Jobs"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "The best way to predict the future is to invent it.",
            "Alan Kay"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "Do what you can, with what you have, where you are.",
            "Theodore Roosevelt"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "It does not matter how slowly you go as long as you do not stop.",
            "Confucius"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "Believe you can and you're halfway there.",
            "Theodore Roosevelt"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "The only limit to our realization of tomorrow will be our doubts of today.",
            "Franklin D. Roosevelt"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "Act as if what you do makes a difference. It does.",
            "William James"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "Success usually comes to those who are too busy to be looking for it.",
            "Henry David Thoreau"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "Don’t be afraid to give up the good to go for the great.",
            "John D. Rockefeller"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "I find that the harder I work, the more luck I seem to have.",
            "Thomas Jefferson"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "Opportunities don't happen. You create them.",
            "Chris Grosser"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "Success is not how high you have climbed, but how you make a positive difference to the world.",
            "Roy T. Bennett"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "Hardships often prepare ordinary people for an extraordinary destiny.",
            "C.S. Lewis"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "Don’t watch the clock; do what it does. Keep going.",
            "Sam Levenson"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "Keep your face always toward the sunshine—and shadows will fall behind you.",
            "Walt Whitman"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "The future belongs to those who believe in the beauty of their dreams.",
            "Eleanor Roosevelt"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "It always seems impossible until it’s done.",
            "Nelson Mandela"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "What lies behind us and what lies before us are tiny matters compared to what lies within us.",
            "Ralph Waldo Emerson"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "The only way to achieve the impossible is to believe it is possible.",
            "Charles Kingsleigh"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "Don’t let yesterday take up too much of today.",
            "Will Rogers"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "You learn more from failure than from success. Don’t let it stop you. Failure builds character.",
            "Unknown"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "It’s not whether you get knocked down, it’s whether you get up.",
            "Vince Lombardi"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "If you are working on something that you really care about, you don’t have to be pushed. The vision pulls you.",
            "Steve Jobs"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "People who are crazy enough to think they can change the world, are the ones who do.",
            "Rob Siltanen"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "Failure will never overtake me if my determination to succeed is strong enough.",
            "Og Mandino"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "We may encounter many defeats but we must not be defeated.",
            "Maya Angelou"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "Knowing is not enough; we must apply. Wishing is not enough; we must do.",
            "Johann Wolfgang Von Goethe"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "Imagine your life is perfect in every respect; what would it look like?",
            "Brian Tracy"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "We generate fears while we sit. We overcome them by action.",
            "Dr. Henry Link"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "Whether you think you can or think you can’t, you’re right.",
            "Henry Ford"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "Security is mostly a superstition. Life is either a daring adventure or nothing.",
            "Helen Keller"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "The man who has confidence in himself gains the confidence of others.",
            "Hasidic Proverb"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "The only limit to our realization of tomorrow will be our doubts of today.",
            "Franklin D. Roosevelt"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "Creativity is intelligence having fun.",
            "Albert Einstein"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "What you get by achieving your goals is not as important as what you become by achieving your goals.",
            "Zig Ziglar"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "You are never too old to set another goal or to dream a new dream.",
            "C.S. Lewis"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "To see what is right and not do it is a lack of courage.",
            "Confucius"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "Reading is to the mind, as exercise is to the body.",
            "Brian Tracy"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "The future depends on what you do today.",
            "Mahatma Gandhi"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "Do something today that your future self will thank you for.",
            "Unknown"
        )
    )
    list.add(Category(R.drawable.quote, "Little things make big days.", "Unknown"))
    list.add(
        Category(
            R.drawable.quote,
            "It’s going to be hard, but hard does not mean impossible.",
            "Unknown"
        )
    )
    list.add(Category(R.drawable.quote, "Don’t wait for opportunity. Create it.", "Unknown"))
    list.add(
        Category(
            R.drawable.quote,
            "Sometimes we’re tested not to show our weaknesses, but to discover our strengths.",
            "Unknown"
        )
    )
    list.add(
        Category(
            R.drawable.quote,
            "The key to success is to focus on goals, not obstacles.",
            "Unknown"
        )
    )
    list.add(Category(R.drawable.quote, "Dream it. Wish it. Do it.", "Unknown"))

    return list
}