import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Examples() {

    // OutlinedButton
    OutlinedButton(onClick = { /*TODO*/ }) {
        Text("Button")
    }
    
    
    // OutlinedButton Shape
    OutlinedButton(
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(8.dp)
    ) {
        Text("Button Shape")
    }
    
    
    // OutlinedButton Colors
    OutlinedButton(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.outlinedButtonColors(
            containerColor = Color(0xFF8A405A),
            contentColor = Color(0xFFFFFFFF),
            disabledContainerColor = Color.DarkGray,
            disabledContentColor = Color.LightGray
        )
    ) {
        Text("Button Colors")
    }
    
    
    // OutlinedButton Border
    OutlinedButton(
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
    
    
    // OutlinedButton Padding
    OutlinedButton(
        onClick = { /*TODO*/ },
        contentPadding = PaddingValues(
            horizontal = 32.dp,
            vertical = 24.dp
        )
    ) {
        Text("Button Padding")
    }
    
}
