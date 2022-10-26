import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Examples() {

    var text by remember { mutableStateOf("") }

    // OutlinedTextField
    OutlinedTextField(
        value = text,
        onValueChange = { text = it }
    )


    // OutlinedTextField Shape
    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        shape = CircleShape
    )


    // OutlinedTextField with Label
    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Label") }
    )


    // OutlinedTextField with Placeholder
    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        placeholder = { Text("Placeholder...") }
    )


    // OutlinedTextField with Icons
    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        leadingIcon = {
            IconButton(onClick = { /* TODO */ }) {
                Icon(Icons.Default.Search, "Search")
            }
        },
        trailingIcon = {
            IconButton(onClick = { /* TODO */ }) {
                Icon(Icons.Default.Clear, "Clear")
            }
        },
    )


    // OutlinedTextField Colors
    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Text Colors") },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            textColor = Color.Blue,
            containerColor = Color.Transparent,
            cursorColor = Color.Magenta,
            focusedBorderColor = Color.Blue,
            unfocusedBorderColor = Color.Red,
            focusedLeadingIconColor = Color.Blue,
            unfocusedLeadingIconColor = Color.Red,
            focusedTrailingIconColor = Color.Blue,
            unfocusedTrailingIconColor = Color.Red,
            focusedLabelColor = Color.Blue,
            unfocusedLabelColor = Color.Red,
            placeholderColor = Color.Blue,
            focusedSupportingTextColor = Color.Blue,
            unfocusedSupportingTextColor = Color.Red
        )
    )

}
