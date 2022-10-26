import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.kieuapps.composematerial3examples.R.drawable

@Composable
fun Examples() {

    // Icon
    Icon(
        Icons.Default.Favorite,
        contentDescription = "Favorite"
    )

    
    // Icon Color
    Icon(
        Icons.Default.Favorite,
        contentDescription = "Favorite",
        tint = Color(0xFFAF6D84)
    )


    // Custom Icon
    Icon(
        painterResource(drawable.ic_baseline_rocket_launch_24),
        contentDescription = "Custom Icon"
    )

}
