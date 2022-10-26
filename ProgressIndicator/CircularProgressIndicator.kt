import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

@Composable
fun Examples() {

    // CircularProgressIndicator
    CircularProgressIndicator()


    // CircularProgressIndicator Color
    CircularProgressIndicator(
        color = Color.Red
    )


    // CircularProgressIndicator Stroke
    CircularProgressIndicator(
        strokeWidth = 6.dp
    )


    // Finite CircularProgressIndicator
    var progress by remember { mutableStateOf(0f) }

    LaunchedEffect(Unit) {
        while (progress < 1f) {
            delay(1L)
            progress += 0.0001f
        }
    }

    CircularProgressIndicator(progress = progress)

}
