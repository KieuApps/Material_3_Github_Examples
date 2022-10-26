import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextDecoration

@Composable
fun Examples() {

    // TextDecoration Underline
    Text(
        text = "This is a text example",
        textDecoration = TextDecoration.Underline
    )


    // TextDecoration LineThrough
    Text(
        text = "This is a text example",
        textDecoration = TextDecoration.LineThrough
    )
    
}
