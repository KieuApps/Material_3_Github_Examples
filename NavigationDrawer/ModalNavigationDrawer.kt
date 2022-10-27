import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


// Modal Drawer
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ModalDrawerExample() {

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
        Text("\n\n     Swipe >>>")
        
    }
}


// Modal Drawer Colors
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ModalDrawerColorsExample() {

    val lightBlue = Color(0xFF55A29A).copy(0.72f)
    val orange = Color(0xFFFFDFAE).copy(0.72f)
    val purple = Color(0xFF9DD5CF).copy(0.72f)
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val pages = listOf("Inbox", "Archive", "Sent")
    var selected by remember { mutableStateOf(0) }

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet(
                drawerShape = RoundedCornerShape(32.dp),
                drawerContainerColor = lightBlue,
                drawerContentColor = Color.Black,
                drawerTonalElevation = 8.dp
            ) {
                pages.forEachIndexed { index, page ->
                    NavigationDrawerItem(
                        label = { Text(page) },
                        selected = selected == index,
                        onClick = { selected = index },
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
        Text("\n\n     Swipe >>>")
      
    }
}
