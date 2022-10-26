import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Examples() {

    // PermanentNavigationDrawer
    val pages = listOf(
        "Create" to Icons.Default.Create,
        "Inbox" to Icons.Default.Email,
        "Trash" to Icons.Default.Delete
    )
    var selected by remember { mutableStateOf(0) }

    PermanentNavigationDrawer(
        drawerContent = {
            PermanentDrawerSheet(
                modifier = Modifier.fillMaxWidth(0.5f),
                drawerTonalElevation = 4.dp
            ) {
                pages.forEachIndexed { index, page ->
                    NavigationDrawerItem(
                        label = { Text(page.first) },
                        selected = selected == index,
                        onClick = { selected = index },
                        icon = { Icon(page.second, page.first) },
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }
    ) {
        // Your main content...

    }

}
