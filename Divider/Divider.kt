import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Examples() {

    // Divider
    Divider()


    // Custom Divider
    Divider(
        thickness = 8.dp,
        color = Color.Red
    )


    // Divider with Padding
    Divider(modifier = Modifier.padding(horizontal = 64.dp))

}
