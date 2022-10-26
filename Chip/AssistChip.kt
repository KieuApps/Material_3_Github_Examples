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

    // AssistChip
    AssistChip(
        label = { Text("Chip") },
        onClick = { /*TODO*/ }
    )
    
    
    // AssistChip with Leading Icon
    AssistChip(
        label = { Text("Chip") },
        onClick = { /*TODO*/ },
        leadingIcon = { Icon(Icons.TwoTone.AddCircle, "Chip") }
    )
    
    
    // AssistChip with Trailing Icon
    AssistChip(
        label = { Text("Chip") },
        onClick = { /*TODO*/ },
        trailingIcon = { Icon(Icons.TwoTone.Create, "Chip") }
    )
    
    
    // AssistChip Shape
    AssistChip(
        label = { Text("Chip Shape") },
        onClick = { /*TODO*/ },
        shape = CircleShape
    )
    
    
    // AssistChip Colors
    AssistChip(
        label = { Text("Chip Colors") },
        onClick = { /*TODO*/ },
        leadingIcon = { Icon(Icons.TwoTone.AddCircle, "Chip") },
        trailingIcon = { Icon(Icons.TwoTone.Create, "Chip") },
        colors = AssistChipDefaults.assistChipColors(
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
    
    
    // AssistChip Elevation
    AssistChip(
        label = { Text("Chip Elevation") },
        onClick = { /*TODO*/ },
        elevation = AssistChipDefaults.assistChipElevation(
            defaultElevation = 24.dp,
            pressedElevation = 16.dp,
            focusedElevation = 16.dp,
            hoveredElevation = 16.dp,
            draggedElevation = 16.dp,
            disabledElevation = 0.dp
        )
    )
    
    
    // AssistChip Border
    AssistChip(
        label = { Text("Chip BorderStroke") },
        onClick = { /*TODO*/ },
        border = AssistChipDefaults.assistChipBorder(
            borderColor = Color(0xFFB6476D),
            disabledBorderColor = Color.Gray,
            borderWidth = 2.dp
        )
    )
    
}
