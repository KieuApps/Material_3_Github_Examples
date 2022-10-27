import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily

@Composable
fun Examples() {

    // FontFamily Default
    Text(
        text = "This is the default text example.",
        fontFamily = FontFamily.Default
    )
    
    
    // FontFamily Cursive
    Text(
        text = "This is a cursive text example.",
        fontFamily = FontFamily.Cursive
    )
    
    
    // FontFamily Monospace
    Text(
        text = "This is a monospace text example.",
        fontFamily = FontFamily.Monospace
    )
    
    
    // FontFamily Sans Serif
    Text(
        text = "This is a sans serif text example.",
        fontFamily = FontFamily.SansSerif
    )
    
    
    // FontFamily Serif
    Text(
        text = "This is a serif text example.",
        fontFamily = FontFamily.Serif
    )
    
}
