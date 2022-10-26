import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

@Composable
fun Examples() {

    // LargeFloatingActionButton
    LargeFloatingActionButton(onClick = { /*TODO*/ }) {
        Icon(Icons.Default.Favorite, "Love")
    }


    // LargeFloatingActionButton Shape
    LargeFloatingActionButton(
        onClick = { /*TODO*/ },
        shape = CircleShape
    ) {
        Icon(Icons.Default.Favorite, "Love")
    }


    // LargeFloatingActionButton Elevation
    LargeFloatingActionButton(
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


    // LargeFloatingActionButton Colors
    LargeFloatingActionButton(
        onClick = { /*TODO*/ },
        containerColor = MaterialTheme.colorScheme.tertiary,
        contentColor = MaterialTheme.colorScheme.onTertiary
    ) {
        Icon(Icons.Default.Favorite, "Love")
    }

}
