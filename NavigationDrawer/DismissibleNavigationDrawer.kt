import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kieuapps.composematerial3examples.R.drawable
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Examples() {
    
    // DismissibleNavigationDrawer
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
            DismissibleDrawerSheet(drawerTonalElevation = 4.dp) {
                
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
