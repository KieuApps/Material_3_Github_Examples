import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Examples() {

    // TextButton
    TextButton(onClick = { /*TODO*/ }) {
        Text("TextButton")
    }
    
    
    // TextButton Shape
    TextButton(
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(8.dp)
    ) {
        Text("TextButton Shape")
    }
    
    
    // TextButton Colors
    TextButton(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.textButtonColors(
            containerColor = Color(0xFF8A405A),
            contentColor = Color(0xFFFFFFFF),
            disabledContainerColor = Color.DarkGray,
            disabledContentColor = Color.LightGray
        )
    ) {
        Text("TextButton Colors")
    }
    
    
    // TextButton Border
    TextButton(
        onClick = { /*TODO*/ },
        border = BorderStroke(
            width = 4.dp,
            brush = Brush.verticalGradient(
                listOf(Color.Gray, Color.Black)
            )
        )
    ) {
        Text("TextButton Border")
    }
    
    
    // TextButton Padding
    TextButton(
        onClick = { /*TODO*/ },
        contentPadding = PaddingValues(
            horizontal = 32.dp,
            vertical = 24.dp
        )
    ) {
        Text("TextButton Padding")
    }
    
}
