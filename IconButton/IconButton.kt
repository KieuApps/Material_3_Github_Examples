import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun Examples() {

    // IconButton
    IconButton(onClick = { /*TODO*/ }) {
        Icon(Icons.Default.Favorite, "Love")
    }
    
    
    // IconButton Colors
    IconButton(
        onClick = { /*TODO*/ },
        colors = IconButtonDefaults.iconButtonColors(
            containerColor = Color(0x44E91E63),
            contentColor = Color(0xFF529B00)
        )
    ) {
        Icon(Icons.Default.Favorite, "Love")
    }
    
}
