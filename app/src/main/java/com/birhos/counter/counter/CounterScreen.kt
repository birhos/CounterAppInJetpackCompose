package com.birhos.counter.counter

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.birhos.counter.ui.theme.CounterRememberTheme

@Composable
fun CounterScreen() {
    var counterValue by rememberSaveable { mutableStateOf(0) }

    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = MaterialTheme.colors.primary
            ) {
                Text(
                    "Counter Remember",
                    modifier = Modifier
                        .padding(10.dp),
                    color = MaterialTheme.colors.onPrimary
                )
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    counterValue++
                }
            ) {
                Icon(imageVector = Icons.Default.Add, contentDescription = null)
            }
        }
    ) {
        Column(
            Modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.Center),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "You have clicked the button this many times:",
            )
            CounterText(counterValue)
        }
    }
}

@Composable
fun CounterText(counterValue: Int) {
    Text(
        text = "$counterValue",
        style = MaterialTheme.typography.h4,
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CounterRememberTheme {
        Surface(color = MaterialTheme.colors.background) {
            CounterScreen()
        }
    }
}