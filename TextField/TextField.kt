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

    // TextField
    TextField(
        value = text,
        onValueChange = { text = it }
    )


    // TextField Shape
    TextField(
        value = text,
        onValueChange = { text = it },
        shape = CircleShape,

        //  To disable the underline, also add...
        //  colors = TextFieldDefaults.textFieldColors(
        //      focusedIndicatorColor = Color.Transparent,
        //      unfocusedIndicatorColor = Color.Transparent
        //  )

        //  Or if you want to clip the underline, add...
        //  modifier = Modifier.clip(CircleShape)
    )


    // TextField with Label
    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Label") }
    )


    // TextField with Placeholder
    TextField(
        value = text,
        onValueChange = { text = it },
        placeholder = { Text("Placeholder...") }
    )


    // TextField with Icons
    TextField(
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


    // TextField Colors
    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Text Colors") },
        colors = TextFieldDefaults.textFieldColors(
            textColor = Color.Blue,
            containerColor = Color.Transparent,
            cursorColor = Color.Magenta,
            focusedIndicatorColor = Color.Blue,
            unfocusedIndicatorColor = Color.Red,
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
