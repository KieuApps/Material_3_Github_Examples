import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.unit.dp

@Composable
fun Examples() {

    // TriState Checkbox
    val (cupcakes, onCupcakesStateChange) = rememberSaveable { mutableStateOf(true) }
    val (popcorn, onPopcornStateChange) = rememberSaveable { mutableStateOf(true) }
    val (fruit, onFruitStateChange) = rememberSaveable { mutableStateOf(true) }

    val treatsState = rememberSaveable(cupcakes, popcorn, fruit) {
        if (cupcakes && popcorn && fruit) {
            ToggleableState.On
        } else if (!cupcakes && !popcorn && !fruit) {
            ToggleableState.Off
        } else {
            ToggleableState.Indeterminate
        }
    }

    val onTreatsClick = {
        val s = treatsState != ToggleableState.On
        onCupcakesStateChange(s)
        onPopcornStateChange(s)
        onFruitStateChange(s)
    }

    Column {
        Row(verticalAlignment = Alignment.CenterVertically) {
            TriStateCheckbox(state = treatsState, onClick = onTreatsClick)
            Text("Treats")
        }
        Column(modifier = Modifier.padding(start = 16.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(cupcakes, onCupcakesStateChange)
                Text("Cupcakes")
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(popcorn, onPopcornStateChange)
                Text("Popcorn")
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(fruit, onFruitStateChange)
                Text("Fruit")
            }
        }
    }
}
