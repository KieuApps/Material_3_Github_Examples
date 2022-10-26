import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Examples() {

    var selected by remember { mutableStateOf(false) }

    // ElevatedFilterChip
    ElevatedFilterChip(
        selected = selected,
        label = { Text("Chip") },
        onClick = { selected = !selected }
    )
    
    
    // ElevatedFilterChip with Leading Icon
    ElevatedFilterChip(
        selected = selected,
        label = { Text("Chip") },
        onClick = { selected = !selected },
        leadingIcon = { Icon(Icons.TwoTone.AddCircle, "Chip") }
    )
    
    
    // ElevatedFilterChip with Trailing Icon
    ElevatedFilterChip(
        selected = selected,
        label = { Text("Chip") },
        onClick = { selected = !selected },
        trailingIcon = { Icon(Icons.TwoTone.Create, "Chip") }
    )
    
    
    // ElevatedFilterChip Shape
    ElevatedFilterChip(
        selected = selected,
        label = { Text("Chip Shape") },
        onClick = { selected = !selected },
        shape = CircleShape
    )
    
    
    // ElevatedFilterChip Colors
    ElevatedFilterChip(
        selected = selected,
        label = { Text("Chip Colors") },
        onClick = { selected = !selected },
        leadingIcon = { Icon(Icons.TwoTone.AddCircle, "Chip") },
        trailingIcon = { Icon(Icons.TwoTone.Create, "Chip") },
        colors = FilterChipDefaults.elevatedFilterChipColors(
            containerColor = Color(0xFF8BA58C),
            labelColor = Color(0xFF2B352C),
            iconColor = Color(0xFF2B352C),
            disabledContainerColor = Color.Transparent,
            disabledLabelColor = Color.Gray,
            disabledLeadingIconColor = Color.Gray,
            disabledTrailingIconColor = Color.Gray,
            disabledSelectedContainerColor = Color.Transparent,
            selectedContainerColor = Color(0xFFB5F8B8),
            selectedLabelColor = Color(0xFF267029),
            selectedLeadingIconColor = Color(0xFF3F51B5),
            selectedTrailingIconColor = Color(0xFF326834)
        )
    )
    
    
    // ElevatedFilterChip Elevation
    ElevatedFilterChip(
        selected = selected,
        label = { Text("Chip Elevation") },
        onClick = { selected = !selected },
        elevation = FilterChipDefaults.elevatedFilterChipElevation(
            defaultElevation = 24.dp,
            pressedElevation = 16.dp,
            focusedElevation = 16.dp,
            hoveredElevation = 16.dp,
            draggedElevation = 16.dp,
            disabledElevation = 0.dp
        )
    )

}
