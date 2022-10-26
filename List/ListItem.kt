import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Examples() {

    // ListItem
    val list = listOf("Item 1", "Item 2")

    Column {
        list.forEach { item ->
            ListItem(headlineText = { Text(item) })
        }
    }

}
