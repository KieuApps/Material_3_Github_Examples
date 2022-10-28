import androidx.compose.foundation.background
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun Examples() {

    val menuItems = listOf(
        "Account" to Icons.Default.Person,
        "Settings" to Icons.Default.Settings
    )
    var expanded by remember { mutableStateOf(false) }


    // DropdownMenu
    TextButton({ expanded = true }) {
        Text("Click for preview")
    }

    DropdownMenu(
        expanded = expanded,
        onDismissRequest = { expanded = false }
    ) {
        menuItems.forEach { item ->
            DropdownMenuItem(
                text = { Text(item.first) },
                leadingIcon = { Icon(item.second, item.first) },
                onClick = { expanded = false }
            )
        }
    }


    // DropdownMenu Colors
    val contentColor = Color(0xFF6E3CC5)

    TextButton({ expanded = true }) {
        Text("Click for preview (Dropdown Menu Colors)")
    }

    DropdownMenu(
        expanded = expanded,
        onDismissRequest = { expanded = false },
        modifier = Modifier.background(Color.Black)
    ) {
        menuItems.forEach { item ->
            DropdownMenuItem(
                text = { Text(item.first) },
                leadingIcon = { Icon(item.second, item.first) },
                onClick = { expanded = false },
                colors = MenuDefaults.itemColors(
                    textColor = contentColor,
                    leadingIconColor = contentColor,
                    trailingIconColor = contentColor,
                )
            )
        }
    }
}
