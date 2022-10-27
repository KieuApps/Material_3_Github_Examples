import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


// Permanent Drawer
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PermanentDrawerExample() {
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


// Permanent Drawer Colors
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PermanentDrawerColorsExample() {
    
    val lightBlue = Color(0xFF55A29A)
    val orange = Color(0xFFFFDFAE)
    val purple = Color(0xFF9DD5CF)
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
                drawerShape = RoundedCornerShape(32.dp),
                drawerContainerColor = lightBlue,
                drawerContentColor = Color.Black,
                drawerTonalElevation = 8.dp
            ) {
                pages.forEachIndexed { index, page ->
                    NavigationDrawerItem(
                        label = { Text(page.first) },
                        selected = selected == index,
                        onClick = { selected = index },
                        icon = { Icon(page.second, page.first) },
                        modifier = Modifier.padding(8.dp),
                        colors = NavigationDrawerItemDefaults.colors(
                            selectedContainerColor = orange,
                            unselectedContainerColor = purple,
                            selectedIconColor = Color.Black,
                            unselectedIconColor = Color.DarkGray,
                            selectedTextColor = Color.Black,
                            unselectedTextColor = Color.DarkGray,
                            selectedBadgeColor = Color.Black,
                            unselectedBadgeColor = Color.DarkGray
                        )
                    )
                }
            }
        }
    ) {
        // Your main content...

    }
}
