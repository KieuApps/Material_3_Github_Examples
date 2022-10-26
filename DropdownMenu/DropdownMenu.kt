import androidx.compose.material3.*
import androidx.compose.runtime.*

@Composable
fun Examples() {

    // DropdownMenu
    val menuItems = listOf("Account", "Settings")
    var expanded by remember { mutableStateOf(false) }

    TextButton({ expanded = true }) {
        Text("Click for preview")
    }

    DropdownMenu(
        expanded = expanded,
        onDismissRequest = { expanded = false }
    ) {
        menuItems.forEach { item ->
            DropdownMenuItem(
                text = { Text(item) },
                onClick = { expanded = false }
            )
        }
    }

}
