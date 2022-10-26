import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

@Composable
fun Examples() {

    // LinearProgressIndicator
    LinearProgressIndicator()
    
    
    // LinearProgressIndicator Colors
    LinearProgressIndicator(
        color = Color.Red,
        trackColor = Color.Red.copy(0.32f)
    )
    
    
    // LinearProgressIndicator Shape
    LinearProgressIndicator(
        modifier = Modifier
            .height(16.dp)
            .clip(CircleShape)
    )


    // Finite LinearProgressIndicator
    var progress by remember { mutableStateOf(0f) }

    LaunchedEffect(Unit) {
        while (progress < 1f) {
            delay(1L)
            progress += 0.0001f
        }
    }

    LinearProgressIndicator(progress = progress)
    
}
