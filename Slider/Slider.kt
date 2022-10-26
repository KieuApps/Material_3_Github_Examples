import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

@Composable
fun Examples() {
    
    var volume by rememberSaveable { mutableStateOf(0.5f) }

    // Slider
    Slider(
        value = volume,
        onValueChange = { volume = it }
    )
    
    
    // Slider with Steps
    Slider(
        value = volume,
        onValueChange = { volume = it },
        steps = 5
    )
    
    
    // Slider Colors
    Slider(
        value = volume,
        onValueChange = { volume = it },
        steps = 9,
        colors = SliderDefaults.colors(
            thumbColor = Color.Blue,
            activeTrackColor = Color.Blue.copy(0.72f),
            activeTickColor = Color.Yellow,
            inactiveTrackColor = Color.Blue.copy(0.32f),
            inactiveTickColor = Color.Yellow,
        )
    )
    
}
