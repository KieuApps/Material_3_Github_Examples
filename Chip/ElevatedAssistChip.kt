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

    // ElevatedAssistChip
    ElevatedAssistChip(
        label = { Text("Chip") },
        onClick = { /*TODO*/ }
    )
    
    
    // ElevatedAssistChip with Leading Icon
    ElevatedAssistChip(
        label = { Text("Chip") },
        onClick = { /*TODO*/ },
        leadingIcon = { Icon(Icons.TwoTone.AddCircle, "Chip") }
    )
    
    
    // ElevatedAssistChip with Trailing Icon
    ElevatedAssistChip(
        label = { Text("Chip") },
        onClick = { /*TODO*/ },
        trailingIcon = { Icon(Icons.TwoTone.Create, "Chip") }
    )
    
    
    // ElevatedAssistChip Shape
    ElevatedAssistChip(
        label = { Text("Chip Shape") },
        onClick = { /*TODO*/ },
        shape = CircleShape
    )
    
    
    // ElevatedAssistChip Colors
    ElevatedAssistChip(
        label = { Text("Chip Colors") },
        onClick = { /*TODO*/ },
        leadingIcon = { Icon(Icons.TwoTone.AddCircle, "Chip") },
        trailingIcon = { Icon(Icons.TwoTone.Create, "Chip") },
        colors = AssistChipDefaults.elevatedAssistChipColors(
            containerColor = Color(0xFFD8FFD9),
            labelColor = Color(0xFF1C571E),
            leadingIconContentColor = Color(0xFF1C571E),
            trailingIconContentColor = Color(0xFF1C571E),
            disabledContainerColor = Color.Transparent,
            disabledLabelColor = Color.Gray,
            disabledLeadingIconContentColor = Color.Gray,
            disabledTrailingIconContentColor = Color.Gray,
        )
    )
    
    
    // ElevatedAssistChip Elevation
    ElevatedAssistChip(
        label = { Text("Chip Elevation") },
        onClick = { /*TODO*/ },
        elevation = AssistChipDefaults.elevatedAssistChipElevation(
            defaultElevation = 24.dp,
            pressedElevation = 16.dp,
            focusedElevation = 16.dp,
            hoveredElevation = 16.dp,
            draggedElevation = 16.dp,
            disabledElevation = 0.dp
        )
    )
    
}
