import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontStyle

@Composable
fun Examples() {

    // FontStyle Normal
    Text(
        text = "This is the normal text example.",
        fontStyle = FontStyle.Normal
    )


    // FontStyle Italic
    Text(
        text = "This is an italic text example.",
        fontStyle = FontStyle.Italic
    )

}
