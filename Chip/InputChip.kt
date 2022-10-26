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

    // InputChip
    InputChip(
        selected = selected,
        label = { Text("Chip") },
        onClick = { selected = !selected }
    )
    
    
    // InputChip with Leading Icon
    InputChip(
        selected = selected,
        label = { Text("Chip") },
        onClick = { selected = !selected },
        leadingIcon = { Icon(Icons.TwoTone.AddCircle, "Chip") }
    )
    
    
    // InputChip with Trailing Icon
    InputChip(
        selected = selected,
        label = { Text("Chip") },
        onClick = { selected = !selected },
        trailingIcon = { Icon(Icons.TwoTone.Create, "Chip") }
    )
    
    
    // InputChip Shape
    InputChip(
        selected = selected,
        label = { Text("Chip Shape") },
        onClick = { selected = !selected },
        shape = CircleShape
    )
    
    
    // InputChip Colors
    InputChip(
        selected = selected,
        label = { Text("Chip Colors") },
        onClick = { selected = !selected },
        leadingIcon = { Icon(Icons.TwoTone.AddCircle, "Chip") },
        trailingIcon = { Icon(Icons.TwoTone.Create, "Chip") },
        colors = InputChipDefaults.inputChipColors(
            containerColor = Color(0xFF8BA58C),
            labelColor = Color(0xFF2B352C),
            leadingIconColor = Color(0xFF2B352C),
            trailingIconColor = Color(0xFF2B352C),
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
    
    
    // InputChip Elevation
    InputChip(
        selected = selected,
        label = { Text("Chip Elevation") },
        onClick = { selected = !selected },
        elevation = InputChipDefaults.inputChipElevation(
            defaultElevation = 24.dp,
            pressedElevation = 16.dp,
            focusedElevation = 16.dp,
            hoveredElevation = 16.dp,
            draggedElevation = 16.dp,
            disabledElevation = 0.dp
        )
    )
    
    
    // InputChip Border
    InputChip(
        selected = selected,
        label = { Text("Chip BorderStroke") },
        onClick = { selected = !selected },
        border = InputChipDefaults.inputChipBorder(
            borderColor = Color(0xFFB6476D),
            selectedBorderColor = Color(0xFF3F51B5),
            disabledBorderColor = Color.Gray,
            disabledSelectedBorderColor = Color.Gray,
            borderWidth = 2.dp,
            selectedBorderWidth = 2.dp
        )
    )

}
