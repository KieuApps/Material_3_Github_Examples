import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Examples() {

    // ModalNavigationDrawer
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val pages = listOf("Inbox", "Archive", "Sent")
    var selected by remember { mutableStateOf(0) }

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                pages.forEachIndexed { index, page ->
                    NavigationDrawerItem(
                        label = { Text(page) },
                        selected = selected == index,
                        onClick = { selected = index },
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }
    ) {
        // Your main content...
        Text("\n\n    Swipe >>>")
    }

}
