import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color

@Composable
fun Examples() {

    val pages = listOf(
        "Home" to Icons.Default.Home,
        "Contacts" to Icons.Default.Person,
        "Share" to Icons.Default.Share
    )
    var selected by remember { mutableStateOf(pages[0]) }
    
    
    // NavigationBar
    NavigationBar {
        pages.forEach { page ->
            NavigationBarItem(
                selected = selected == page,
                onClick = { selected = page },
                icon = { Icon(page.second, page.first) },
                label = { Text(page.first) }
            )
        }
    }
    
    
    // NavigationBar Colors
    val lightGreen = Color(0xFF89C78B)
    val green = Color(0xFF408D42)
    
    NavigationBar(
        containerColor = lightGreen,
        contentColor = Color.Black
    ) {
        pages.forEach { page ->
            NavigationBarItem(
                selected = selected == page,
                onClick = { selected = page },
                icon = { Icon(page.second, page.first) },
                label = { Text(page.first) },
                colors = NavigationBarItemDefaults.colors(
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
