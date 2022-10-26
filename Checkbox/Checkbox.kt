import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

@Composable
fun Examples() {

    var checked by rememberSaveable { mutableStateOf(false) }

    // Checkbox
    Checkbox(
        checked = checked,
        onCheckedChange = { checked = it }
    )


    // Checkbox Colors
    Checkbox(
        checked = checked,
        onCheckedChange = { checked = it },
        colors = CheckboxDefaults.colors(
            checkedColor = Color(0xFFD88A71),
            uncheckedColor = Color(0xFFD88A71),
            checkmarkColor = MaterialTheme.colorScheme.background
        )
    )

}
