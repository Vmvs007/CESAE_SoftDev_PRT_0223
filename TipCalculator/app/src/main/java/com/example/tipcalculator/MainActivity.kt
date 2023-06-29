package com.example.tipcalculator

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tipcalculator.ui.theme.TipCalculatorTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.sp
import java.text.NumberFormat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TipCalculatorTheme {
                Surface {
                    TipTimeScreen()
                }
            }
        }
    }
}

@Composable
fun TipTimeScreen(){

    var roundUp by remember {
        mutableStateOf(false)
    }

    var valorIntroduzido by remember { mutableStateOf("0") }
    val valor = valorIntroduzido.toDoubleOrNull() ?: 0.0


    var gorjetaIntroduzida  by remember { mutableStateOf("0") }
    val gorjetaPercentagem= gorjetaIntroduzida.toDoubleOrNull() ?: 0.0

    val gorjeta = calcularGorjeta(valor,gorjetaPercentagem, roundUp)

    Column(modifier = Modifier.padding(32.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Text(stringResource(R.string.calcular_gorjeta))
        Spacer(modifier = Modifier.height(16.dp))

        // Text Field De Cima
        EditNumberField(
            label=R.string.custo_servico,
            keyboardOptions = KeyboardOptions.Default.copy(
            keyboardType = KeyboardType.Number,
            imeAction = ImeAction.Next),
            value=valorIntroduzido, onValueChange = {valorIntroduzido=it})

        // Text Field de Baixo
        EditNumberField(label=R.string.label_percentagem,
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done),
            value=gorjetaIntroduzida,
            onValueChange = {gorjetaIntroduzida=it})

        Spacer(modifier = Modifier.height(24.dp))

        ArredondarConta(roundUp = roundUp, onRoundUpChanged = {roundUp=it})

        Spacer(modifier = Modifier.height(24.dp))

        Text(text = stringResource(id = R.string.valor_gorjeta,gorjeta),
            modifier = Modifier.align(Alignment.CenterHorizontally),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
            )


    }

}


@Composable
fun ArredondarConta(roundUp:Boolean, onRoundUpChanged: (Boolean)-> Unit, modifier: Modifier = Modifier){
    Row(
        modifier = modifier
            .fillMaxWidth()
            .size(48.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = stringResource(R.string.arredondar))
        Switch(
            modifier = modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.End),
            checked = roundUp,
            onCheckedChange = onRoundUpChanged,
            colors = SwitchDefaults.colors(
                uncheckedThumbColor = Color.DarkGray
        ))
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditNumberField(@StringRes label:Int,keyboardOptions: KeyboardOptions, value:String, onValueChange:(String)->Unit, modifier: Modifier= Modifier){

    TextField(
        value = value,
        onValueChange = onValueChange,
        label={ Text(text = stringResource(id = label))},
        modifier = Modifier.fillMaxWidth(),
        singleLine = true,
        keyboardOptions = keyboardOptions
    )
    Spacer(modifier = Modifier.height(16.dp))


}

private fun calcularGorjeta(valor: Double, percentagemGorjeta: Double, roundUp:Boolean):String{

    var gorjeta = percentagemGorjeta/100*valor

    if(roundUp){ // Se o switch estiver ligado, ou seja, se quero arredondar a conta
        gorjeta = kotlin.math.ceil(gorjeta)
        return NumberFormat.getCurrencyInstance().format(gorjeta)
    }else{ // Se o switch estiver desligado, nao quero arredondar
        return NumberFormat.getCurrencyInstance().format(gorjeta)
    }

    /* // Versão 2 - menos código mas "mais" lógica
    if(roundUp) { // Se o switch estiver ligado, ou seja, se quero arredondar a conta
        gorjeta = kotlin.math.ceil(gorjeta)
    }
        return NumberFormat.getCurrencyInstance().format(gorjeta)
    */

}

@Preview (showBackground = true)
@Composable
fun DefaultPreview(){
    TipCalculatorTheme(){
        TipTimeScreen()
    }
}

