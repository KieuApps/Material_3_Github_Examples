import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.material3.DrawerValue.Closed
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.DEVELOPER_NAME.APP_NAME.R.drawable
import kotlinx.coroutines.launch


// Dismissible Drawer
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DismissibleDrawerExample() {
    Box(modifier = Modifier.height(250.dp)) {

        val scope = rememberCoroutineScope()
        val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
        val tools = listOf(
            "Drag" to painterResource(id = drawable.ic_baseline_pan_tool_alt_24),
            "Pen" to painterResource(id = drawable.ic_baseline_draw_24),
            "Pencil" to painterResource(id = drawable.ic_baseline_mode_edit_outline_24),
        )
        var selected by remember { mutableStateOf(0) }

        // Close the drawer on back press
        BackHandler(enabled = drawerState.isOpen) {
            scope.launch { drawerState.close() }
        }

        // Menu button
        FilledTonalIconButton(
            onClick = { scope.launch { drawerState.open() } },
            modifier = Modifier.padding(16.dp)
        ) {
            Icon(
                painter = tools[selected].second,
                contentDescription = tools[selected].first
            )
        }

        // Drawer
        DismissibleNavigationDrawer(
            drawerState = drawerState,
            drawerContent = {
                DismissibleDrawerSheet {
                    tools.forEachIndexed { index, tool ->
                        NavigationDrawerItem(
                            label = { Text(tool.first) },
                            selected = selected == index,
                            onClick = {
                                selected = index
                                scope.launch { drawerState.close() }
                            },
                            icon = { Icon(tool.second, tool.first) },
                            modifier = Modifier.padding(8.dp)
                        )
                    }
                }
            }
        ) {
            // Your main content...

        }
    }
}



// Dismissible Drawer Colors
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DismissibleDrawerColorsExample() {
    Box(modifier = Modifier.height(250.dp)) {

        val lightBlue = Color(0xFF55A29A).copy(0.72f)
        val orange = Color(0xFFFFDFAE).copy(0.72f)
        val purple = Color(0xFF9DD5CF).copy(0.72f)
        val scope = rememberCoroutineScope()
        val drawerState = rememberDrawerState(initialValue = Closed)
        val tools = listOf(
            "Drag" to painterResource(id = drawable.ic_baseline_pan_tool_alt_24),
            "Pen" to painterResource(id = drawable.ic_baseline_draw_24),
            "Pencil" to painterResource(id = drawable.ic_baseline_mode_edit_outline_24),
        )
        var selected by remember { mutableStateOf(0) }

        // Close the drawer on back press
        BackHandler(enabled = drawerState.isOpen) {
            scope.launch { drawerState.close() }
        }

        // Menu button
        FilledTonalIconButton(
            onClick = { scope.launch { drawerState.open() } },
            modifier = Modifier.padding(16.dp)
        ) {
            Icon(
                painter = tools[selected].second,
                contentDescription = tools[selected].first
            )
        }

        // Drawer
        DismissibleNavigationDrawer(
            drawerState = drawerState,
            drawerContent = {
                DismissibleDrawerSheet(
                    drawerShape = RoundedCornerShape(32.dp),
                    drawerContainerColor = lightBlue,
                    drawerContentColor = Color.Black,
                    drawerTonalElevation = 8.dp
                ) {
                    tools.forEachIndexed { index, tool ->
                        NavigationDrawerItem(
                            label = { Text(tool.first) },
                            selected = selected == index,
                            onClick = {
                                selected = index
                                scope.launch { drawerState.close() }
                            },
                            icon = { Icon(tool.second, tool.first) },
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
}
