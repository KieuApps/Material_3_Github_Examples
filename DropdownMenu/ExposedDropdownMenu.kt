import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Examples() {

    val items = listOf("Item 1", "Item 2", "Item 3", "Item 4")
    var expanded by remember { mutableStateOf(false) }
    var selected by rememberSaveable { mutableStateOf(items[0]) }


    // ExposedDropdownMenu
    ExposedDropdownMenuBox(
        expanded = expanded,
        onExpandedChange = { expanded = !expanded }
    ) {
        TextField(
            readOnly = true,
            value = selected,
            onValueChange = { },
            label = { Text("Label") },
            trailingIcon = {
                ExposedDropdownMenuDefaults
                    .TrailingIcon(
                        expanded = expanded
                    )
            },
            modifier = Modifier.menuAnchor()
        )
        ExposedDropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            items.forEach { item ->
                DropdownMenuItem(
                    text = { Text(item) },
                    onClick = {
                        selected = item
                        expanded = false
                    }
                )
            }
        }
    }


    // ExposedDropdownMenu Colors
    val contentColor = Color(0xFF6E3CC5)

    ExposedDropdownMenuBox(
        expanded = expanded,
        onExpandedChange = { expanded = !expanded }
    ) {
        TextField(
            readOnly = true,
            value = selected,
            onValueChange = { },
            label = { Text("Dropdown Colors") },
            trailingIcon = {
                ExposedDropdownMenuDefaults.TrailingIcon(
                    expanded = expanded
                )
            },
            modifier = Modifier.menuAnchor(),
            colors = TextFieldDefaults.textFieldColors(
                textColor = Color.LightGray,
                containerColor = Color.Black,
                cursorColor = contentColor,
                focusedIndicatorColor = contentColor,
                unfocusedIndicatorColor = Color.Gray,
                focusedTrailingIconColor = contentColor,
                unfocusedTrailingIconColor = Color.Gray,
                focusedLabelColor = contentColor,
                unfocusedLabelColor = Color.Gray
            )
        )
        ExposedDropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            items.forEach { item ->
                DropdownMenuItem(
                    text = { Text(item) },
                    onClick = {
                        selected = item
                        expanded = false
                    },
                    colors = MenuDefaults.itemColors(
                        textColor = contentColor,
                        leadingIconColor = contentColor,
                        trailingIconColor = contentColor,
                    )
                )
            }
        }
    }
}
