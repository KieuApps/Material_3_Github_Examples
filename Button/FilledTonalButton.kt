import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Examples() {

    // FilledTonalButton
    FilledTonalButton(onClick = { /*TODO*/ }) {
        Text("Button")
    }
    
    
    // FilledTonalButton Shape
    FilledTonalButton(
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(8.dp)
    ) {
        Text("Button Shape")
    }
    
    
    // FilledTonalButton Colors
    FilledTonalButton(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.filledTonalButtonColors(
            containerColor = Color(0xFF8A405A),
            contentColor = Color(0xFFFFFFFF),
            disabledContainerColor = Color.DarkGray,
            disabledContentColor = Color.LightGray
        )
    ) {
        Text("Button Colors")
    }
    
    
    // FilledTonalButton Elevation
    FilledTonalButton(
        onClick = { /*TODO*/ },
        elevation = ButtonDefaults.filledTonalButtonElevation(
            defaultElevation = 16.dp,
            pressedElevation = 4.dp,
            focusedElevation = 8.dp,
            hoveredElevation = 8.dp,
            disabledElevation = 0.dp
        )
    ) {
        Text("Button Elevation")
    }
    
    
    // FilledTonalButton Border
    FilledTonalButton(
        onClick = { /*TODO*/ },
        border = BorderStroke(
            width = 4.dp,
            brush = Brush.verticalGradient(
                listOf(Color.Gray, Color.Black)
            )
        )
    ) {
        Text("Button Border")
    }
    
    
    // FilledTonalButton Padding
    FilledTonalButton(
        onClick = { /*TODO*/ },
        contentPadding = PaddingValues(
            horizontal = 32.dp,
            vertical = 24.dp
        )
    ) {
        Text("Button Padding")
    }
    
}
