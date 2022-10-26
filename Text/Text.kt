import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp

@Composable
fun Examples() {

    // Text
    Text(text = "This is a text example")


    // Text Color
    Text(
        text = "This is a red text example",
        color = Color.Red
    )

    // Overflow Text
    val reallyLongString =
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce aliquet viverra nulla eget blandit. Maecenas consequat efficitur nisl at commodo."

    Text(
        text = reallyLongString,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis
    )

    // Selectable Text
    val loremIpsumString =
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce aliquet viverra nulla eget blandit. Maecenas consequat efficitur nisl at commodo."

    SelectionContainer {
        Column(modifier = Modifier.padding(8.dp)) {
            Text(text = "This text is selectable. \n$loremIpsumString")
            DisableSelection {
                Text(text = "This text is not selectable.")
            }
        }
    }

}
