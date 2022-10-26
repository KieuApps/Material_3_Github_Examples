import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

@Composable
fun Examples() {

    // TextAlign Start
    Text(
        text = "TextAlign.Start",
        textAlign = TextAlign.Start,
        modifier = Modifier.fillMaxWidth()
    )

    // TextAlign Center
    Text(
        text = "TextAlign.Center",
        textAlign = TextAlign.Center,
        modifier = Modifier.fillMaxWidth()
    )


    // TextAlign End
    Text(
        text = "TextAlign.End",
        textAlign = TextAlign.End,
        modifier = Modifier.fillMaxWidth()
    )


    // TextAlign Justify
    Text(
        text = "TextAlign.Justify",
        textAlign = TextAlign.Justify,
        modifier = Modifier.fillMaxWidth()
    )


    // TextAlign Left
    Text(
        text = "TextAlign.Left",
        textAlign = TextAlign.Left,
        modifier = Modifier.fillMaxWidth()
    )


    // TextAlign Right
    Text(
        text = "TextAlign.Right",
        textAlign = TextAlign.Right,
        modifier = Modifier.fillMaxWidth()
    )

}
