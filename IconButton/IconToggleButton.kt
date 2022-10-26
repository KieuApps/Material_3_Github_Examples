import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.IconToggleButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

@Composable
fun Examples() {

    var checked by rememberSaveable { mutableStateOf(false) }

    // IconToggleButton
    IconToggleButton(
        checked = checked,
        onCheckedChange = { checked = it }
    ) {
        Icon(Icons.Default.Favorite, "Love")
    }


    // IconToggleButton Colors
    IconToggleButton(
        checked = checked,
        onCheckedChange = { checked = it },
        colors = IconButtonDefaults.iconToggleButtonColors(
            containerColor = Color.Gray.copy(0.32f),
            contentColor = Color.Gray,
            checkedContainerColor = Color(0x44E91E63),
            checkedContentColor = Color(0xFF529B00)
        )
    ) {
        Icon(Icons.Default.Favorite, "Love")
    }

}
