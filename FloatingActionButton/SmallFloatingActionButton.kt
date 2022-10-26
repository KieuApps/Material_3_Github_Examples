import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.unit.dp

@Composable
fun Examples() {

    // SmallFloatingActionButton
    SmallFloatingActionButton(onClick = { /*TODO*/ }) {
        Icon(Icons.Default.Favorite, "Love")
    }
    
    
    // SmallFloatingActionButton Shape
    SmallFloatingActionButton(
        onClick = { /*TODO*/ },
        shape = CircleShape
    ) {
        Icon(Icons.Default.Favorite, "Love")
    }
    
    
    // SmallFloatingActionButton Elevation
    SmallFloatingActionButton(
        onClick = { /*TODO*/ },
        elevation = FloatingActionButtonDefaults.elevation(
            defaultElevation = 12.dp,
            pressedElevation = 4.dp,
            focusedElevation = 4.dp,
            hoveredElevation = 4.dp
        )
    ) {
        Icon(Icons.Default.Favorite, "Love")
    }
    
    
    // SmallFloatingActionButton Colors
    SmallFloatingActionButton(
        onClick = { /*TODO*/ },
        containerColor = MaterialTheme.colorScheme.tertiary,
        contentColor = MaterialTheme.colorScheme.onTertiary
    ) {
        Icon(Icons.Default.Favorite, "Love")
    }
    
}
