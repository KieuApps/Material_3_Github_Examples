import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.graphics.Color

@Composable
fun Examples() {

    var selected by rememberSaveable { mutableStateOf(1) }
    val pages = listOf(
        "Account" to Icons.Default.AccountBox,
        "Home" to Icons.Default.Home
    )

    
    // Plain BottomAppBar
    BottomAppBar {
        pages.forEachIndexed { index, page ->
            NavigationBarItem(
                selected = selected == index,
                onClick = { selected = index },
                icon = { Icon(page.second, page.first) },
                label = { Text(page.first) }
            )
        }
    }
    

    // BottomAppBar Colors
    val darkRed = Color(0xFF521E2F)
    val pink = Color(0xFF7A4456)

    BottomAppBar(
        containerColor = darkRed,
        contentColor = Color.White
    ) {
        pages.forEachIndexed { index, page ->
            NavigationBarItem(
                selected = selected == index,
                onClick = { selected = index },
                icon = { Icon(page.second, page.first) },
                label = { Text(page.first) },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color.White,
                    selectedTextColor = Color.White,
                    indicatorColor = pink,
                    unselectedIconColor = Color.White,
                    unselectedTextColor = Color.White,
                )
            )
        }
    }
}
