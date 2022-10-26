import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Examples() {

    var checked by rememberSaveable { mutableStateOf(false) }

    // Switch
    Switch(
        checked = checked,
        onCheckedChange = { checked = it }
    )


    // Switch with Icon
    Switch(
        checked = checked,
        onCheckedChange = { checked = it },
        thumbContent = {
            Icon(Icons.Default.Check, "Check", Modifier.padding(2.dp))
        }
    )


    // Switch Colors
    Switch(
        checked = checked,
        onCheckedChange = { checked = it },
        thumbContent = {
            Icon(Icons.Default.Check, "Check", Modifier.padding(2.dp))
        },
        colors = SwitchDefaults.colors(
            checkedThumbColor = Color(0xA31C286B),
            checkedTrackColor = Color(0xA303A9F4),
            checkedBorderColor = Color(0xA31C286B),
            checkedIconColor = Color.White,
            uncheckedThumbColor = Color(0x661C286B),
            uncheckedTrackColor = Color(0x6603A9F4),
            uncheckedBorderColor = Color(0x661C286B),
            uncheckedIconColor = Color.White,
            disabledCheckedThumbColor = Color.Gray,
            disabledCheckedTrackColor = Color.LightGray,
            disabledCheckedBorderColor = Color.DarkGray,
            disabledCheckedIconColor = Color.DarkGray,
            disabledUncheckedThumbColor = Color.Gray,
            disabledUncheckedTrackColor = Color.LightGray,
            disabledUncheckedBorderColor = Color.DarkGray,
            disabledUncheckedIconColor = Color.DarkGray,
        )
    )

}
