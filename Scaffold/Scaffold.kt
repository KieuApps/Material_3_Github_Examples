import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Examples() {

    // Scaffold
    val menuIcon = Icons.Default.Menu
    val homeIcon = Icons.Default.Home
    val alertsIcon = Icons.Default.Notifications
    val contactsIcon = Icons.Default.Person

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "My App") },
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(menuIcon, "Menu")
                    }
                },
            )
        },
        floatingActionButton = {
            SmallFloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Default.Email, "Email")
            }
        },
        bottomBar = {
            BottomAppBar(Modifier.fillMaxHeight(0.16f)) {
                val pages = listOf(
                    "Home" to homeIcon,
                    "Alerts" to alertsIcon,
                    "Contacts" to contactsIcon
                )
                var selected by remember { mutableStateOf(0) }

                pages.forEachIndexed { index, page ->
                    NavigationBarItem(
                        selected = selected == index,
                        onClick = { selected = index },
                        icon = { Icon(page.second, page.first) }
                    )
                }
            }
        }
    ) { padding ->

        // Your main content...

        Box(
            modifier = Modifier.padding(padding).fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Example \nContent...",
                color = MaterialTheme.colorScheme.onSurface.copy(0.5f)
            )
        }
    }
}
