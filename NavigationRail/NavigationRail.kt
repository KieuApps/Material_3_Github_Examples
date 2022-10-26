import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.graphics.Color

@Composable
fun Examples() {

    // NavigationRail
    val lightGreen = Color(0xFF89C78B)
    val green = Color(0xFF408D42)

    val pages = listOf(
        "Menu" to Icons.Default.Menu,
        "Contacts" to Icons.Default.Person,
        "Inbox" to Icons.Default.Email,
        "Create" to Icons.Default.Create
    )
    var selected by rememberSaveable { mutableStateOf(1) }


    NavigationRail(
        header = { Text("Header") },
        containerColor = lightGreen,
        contentColor = Color.Black
    ) {
        pages.forEachIndexed { index, page ->
            NavigationRailItem(
                selected = selected == index,
                onClick = { selected = index },
                icon = { Icon(page.second, page.first) },
                colors = NavigationRailItemDefaults.colors(
                    selectedIconColor = Color.Black,
                    selectedTextColor = Color.Black,
                    indicatorColor = green,
                    unselectedIconColor = Color.Black,
                    unselectedTextColor = Color.Black,
                )
            )
        }
    }
    
}
