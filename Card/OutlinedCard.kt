import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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

    // OutlinedCard
    OutlinedCard {
        MyCardTitle("Card")
        LoremIpsumText()
    }


    // Expandable OutlinedCard
    var expanded by remember { mutableStateOf(false) }

    OutlinedCard(modifier = Modifier
        .fillMaxWidth()
        .clip(CardDefaults.shape)
        .clickable { expanded = !expanded }
    ) {
        
        MyCardTitle("Expandable Card (click me)")

        AnimatedVisibility(expanded) {
            LoremIpsumText()
        }
    }


    // OutlinedCard Shape
    OutlinedCard(shape = RectangleShape) {
        MyCardTitle("Card Shape")
        LoremIpsumText()
    }


    // OutlinedCard Colors
    OutlinedCard(
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFCFADA2), 
            contentColor = Color(0xFF661C04)
        ), 
        border = BorderStroke(2.dp, Color.DarkGray)
    ) {
        MyCardTitle("Card Colors")
        LoremIpsumText()
    }


    // OutlinedCard Elevation
    OutlinedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 8.dp,
            pressedElevation = 4.dp,
            focusedElevation = 4.dp,
            hoveredElevation = 4.dp,
            draggedElevation = 4.dp,
            disabledElevation = 0.dp,
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
