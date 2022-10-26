import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp

@Composable
fun Examples() {

    // Card
    Card {
        MyCardTitle("Card")
        LoremIpsumText()
    }


    // Expandable Card
    var expanded by remember { mutableStateOf(false) }

    Card(modifier = Modifier
        .fillMaxWidth()
        .clip(CardDefaults.shape)
        .clickable { expanded = !expanded }
    ) {

        MyCardTitle("Expandable Card (click me)")

        AnimatedVisibility(expanded) {
            LoremIpsumText()
        }
    }


    // Card Shape
    Card(shape = RectangleShape) {
        MyCardTitle("Card Shape")
        LoremIpsumText()
    }


    // Card Colors
    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFCFADA2),
            contentColor = Color(0xFF661C04)
        ),
        border = BorderStroke(2.dp, Color.DarkGray)
    ) {
        MyCardTitle("Card Colors")
        LoremIpsumText()
    }
    
    
    // Card Elevation
    Card(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 12.dp,
            pressedElevation = 8.dp,
            focusedElevation = 8.dp,
            hoveredElevation = 8.dp,
            draggedElevation = 8.dp,
            disabledElevation = 4.dp,
        )
    ) {
        MyCardTitle("Card Elevation")
        LoremIpsumText()
    }
    
}


@Composable
fun MyCardTitle(text: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = text, modifier = Modifier.padding(8.dp), style = MaterialTheme.typography.titleMedium
        )
    }
}


@Composable
fun LoremIpsumText() {
    val loremIpsumString =
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce aliquet viverra nulla eget blandit. Maecenas consequat efficitur nisl at commodo."

    Text(
        text = loremIpsumString, modifier = Modifier.padding(8.dp)
    )
}
