import androidx.compose.foundation.BorderStroke
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Examples() {
    
    // OutlinedIconButton
    OutlinedIconButton(onClick = { /*TODO*/ }) {
        Icon(Icons.Default.Favorite, "Love")
    }


    // OutlinedIconButton Colors
    OutlinedIconButton(
        onClick = { /*TODO*/ },
        colors = IconButtonDefaults.outlinedIconButtonColors(
            containerColor = Color(0x44E91E63),
            contentColor = Color(0xFF529B00)
        ),
        border = BorderStroke(width = 2.dp, color = Color.Gray)
    ) {
        Icon(Icons.Default.Favorite, "Love")
    }

}
