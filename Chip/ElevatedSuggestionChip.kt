import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Examples() {

    // ElevatedSuggestionChip
    ElevatedSuggestionChip(
        label = { Text("Chip") },
        onClick = { /*TODO*/ }
    )
    
    
    // ElevatedSuggestionChip with Icon
    ElevatedSuggestionChip(
        label = { Text("Chip") },
        onClick = { /*TODO*/ },
        icon = { Icon(Icons.TwoTone.AddCircle, "Chip") }
    )
    
    
    // ElevatedSuggestionChip Shape
    ElevatedSuggestionChip(
        label = { Text("Chip Shape") },
        onClick = { /*TODO*/ },
        shape = CircleShape
    )
    
    
    // ElevatedSuggestionChip Colors
    ElevatedSuggestionChip(
        label = { Text("Chip Colors") },
        onClick = { /*TODO*/ },
        icon = { Icon(Icons.TwoTone.AddCircle, "Chip") },
        colors = SuggestionChipDefaults.elevatedSuggestionChipColors(
            containerColor = Color(0xFFD8FFD9),
            labelColor = Color(0xFF1C571E),
            iconContentColor = Color(0xFF1C571E),
            disabledContainerColor = Color.Transparent,
            disabledLabelColor = Color.Gray,
            disabledIconContentColor = Color.Gray,
        )
    )
    
    
    // ElevatedSuggestionChip Elevation
    ElevatedSuggestionChip(
        label = { Text("Chip Elevation") },
        onClick = { /*TODO*/ },
        elevation = SuggestionChipDefaults.elevatedSuggestionChipElevation(
            defaultElevation = 24.dp,
            pressedElevation = 16.dp,
            focusedElevation = 16.dp,
            hoveredElevation = 16.dp,
            draggedElevation = 16.dp,
            disabledElevation = 0.dp
        )
    )
    
}
