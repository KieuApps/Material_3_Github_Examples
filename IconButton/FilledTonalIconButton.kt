import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.FilledTonalIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun Examples() {
    
    // FilledTonalIconButton
    FilledTonalIconButton(onClick = { /*TODO*/ }) {
        Icon(Icons.Default.Favorite, "Love")
    }


    // FilledTonalIconButton Colors
    FilledTonalIconButton(
        onClick = { /*TODO*/ },
        colors = IconButtonDefaults.filledTonalIconButtonColors(
            containerColor = Color(0x44E91E63),
            contentColor = Color(0xFF529B00)
        )
    ) {
        Icon(Icons.Default.Favorite, "Love")
    }

}
