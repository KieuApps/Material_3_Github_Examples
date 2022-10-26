import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun Examples() {

    val options = listOf("Option 1", "Option 2", "Option 3")
    var selected by remember { mutableStateOf(0) }

    // RadioButton
    Column {
        options.forEachIndexed { index, option ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.clickable { selected = index }
            ) {
                RadioButton(
                    selected = selected == index,
                    onClick = { selected = index }
                )
                Text(option)
            }
        }
    }


    // RadioButton Colors
    Column {
        Text(
            "RadioButton Colors",
            color = MaterialTheme.colorScheme.onBackground.copy(0.5f),
            style = MaterialTheme.typography.titleMedium
        )

        options.forEachIndexed { index, option ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.clickable { selected = index }
            ) {
                RadioButton(
                    selected = selected == index,
                    onClick = { selected = index },
                    colors = RadioButtonDefaults.colors(
                        selectedColor = Color.Red,
                        unselectedColor = Color.Red,
                        disabledSelectedColor = Color.DarkGray,
                        disabledUnselectedColor = Color.DarkGray,
                    )
                )
                Text(option)
            }
        }
    }
}
