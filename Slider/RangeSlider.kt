import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.RangeSlider
import androidx.compose.material3.SliderDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Examples() {
    
    var range by remember { mutableStateOf(0.3f..0.7f) }

    // RangeSlider
    RangeSlider(
        value = range,
        onValueChange = { range = it }
    )


    // RangeSlider with Steps
    RangeSlider(
        value = range,
        onValueChange = { range = it },
        steps = 9
    )


    // RangeSlider Colors
    RangeSlider(
        value = range,
        onValueChange = { range = it },
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
