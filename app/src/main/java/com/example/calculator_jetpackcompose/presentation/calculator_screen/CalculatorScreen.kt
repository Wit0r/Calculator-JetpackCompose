package com.example.calculator_jetpackcompose.presentation.calculator_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.calculator_jetpackcompose.domain.CalculatorAction
import com.example.calculator_jetpackcompose.domain.CalculatorOperator
import com.example.calculator_jetpackcompose.presentation.calculator_screen.components.CalculatorButton

@Composable
fun CalculatorScreen(
    viewModel: CalculatorViewModel
) {

    val state = viewModel.state

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp)
                .align(Alignment.TopEnd),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            // Display are for calculator output
            Text(
                text = state.number1 + (state.operator?.symbol ?: "") + state.number2,
                textAlign = TextAlign.End,
                fontSize = MaterialTheme.typography.titleLarge.fontSize,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground,
                modifier = Modifier
                    .fillMaxWidth()
            )

            // Number Pad Area
            Column(
                Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(6.dp),
                horizontalAlignment = Alignment.End
            ) {

                Spacer(modifier = Modifier.weight(0.3f))

                Divider(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 34.dp),
                    color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.2f)
                )


                // 1
                Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(14.dp)) {
                    CalculatorButton(
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(0.1f),
                        onClick = { viewModel.onAction(CalculatorAction.Clear) },
                        symbol = "C",
                        contentColor = MaterialTheme.colorScheme.secondary
                    )
                    CalculatorButton(
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(0.1f),
                        onClick = {  },
                        symbol = "( )",
                        contentColor = MaterialTheme.colorScheme.primary
                    )
                    CalculatorButton(
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(0.1f),
                        onClick = { /*TODO*/ },
                        symbol = "%",
                        contentColor = MaterialTheme.colorScheme.primary
                    )
                    CalculatorButton(
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(0.1f),
                        onClick = { /*TODO*/ },
                        symbol = "÷",
                        fontSize = MaterialTheme.typography.headlineLarge.fontSize,
                        contentColor = MaterialTheme.colorScheme.primary
                    )

                }

                //2
                Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(14.dp)) {
                    CalculatorButton(
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(0.1f),
                        onClick = { viewModel.onAction(CalculatorAction.Number(7)) },
                        symbol = "7"
                    )
                    CalculatorButton(
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(0.1f),
                        onClick = { viewModel.onAction(CalculatorAction.Number(8)) },
                        symbol = "8"
                    )
                    CalculatorButton(
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(0.1f),
                        onClick = { viewModel.onAction(CalculatorAction.Number(9)) },
                        symbol = "9"
                    )
                    CalculatorButton(
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(0.1f),
                        onClick = { viewModel.onAction(CalculatorAction.Operator(CalculatorOperator.Multiply)) },
                        symbol = "X",
                        contentColor = MaterialTheme.colorScheme.primary
                    )

                }

                //3
                Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(14.dp)) {
                    CalculatorButton(
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(0.1f),
                        onClick = { viewModel.onAction(CalculatorAction.Number(4)) },
                        symbol = "4"
                    )
                    CalculatorButton(
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(0.1f),
                        onClick = { viewModel.onAction(CalculatorAction.Number(5)) },
                        symbol = "5"
                    )
                    CalculatorButton(
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(0.1f),
                        onClick = { viewModel.onAction(CalculatorAction.Number(6)) },
                        symbol = "6"
                    )
                    CalculatorButton(
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(0.1f),
                        onClick = { viewModel.onAction(CalculatorAction.Operator(CalculatorOperator.Minus)) },
                        symbol = "-",
                        contentColor = MaterialTheme.colorScheme.primary
                    )
                }

                //4
                Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(14.dp)) {
                    CalculatorButton(
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(0.1f),
                        onClick = { viewModel.onAction(CalculatorAction.Number(1)) },
                        symbol = "1"
                    )
                    CalculatorButton(
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(0.1f),
                        onClick = { viewModel.onAction(CalculatorAction.Number(2)) },
                        symbol = "2"
                    )
                    CalculatorButton(
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(0.1f),
                        onClick = { viewModel.onAction(CalculatorAction.Number(3)) },
                        symbol = "3"
                    )
                    CalculatorButton(
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(0.1f),
                        onClick = { viewModel.onAction(CalculatorAction.Operator(CalculatorOperator.Plus)) },
                        symbol = "+",
                        contentColor = MaterialTheme.colorScheme.primary
                    )
                }

                //5
                Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(14.dp)) {
                    CalculatorButton(
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(0.1f),
                        onClick = {  },
                        symbol = "+/-"
                    )
                    CalculatorButton(
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(0.1f),
                        onClick = { viewModel.onAction(CalculatorAction.Number(0)) },
                        symbol = "0"
                    )
                    CalculatorButton(
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(0.1f),
                        onClick = { viewModel.onAction(CalculatorAction.Decimal) },
                        symbol = "."
                    )
                    CalculatorButton(
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(0.1f),
                        onClick = { viewModel.onAction(CalculatorAction.Calculate) },
                        symbol = "=",
                        containerColor = MaterialTheme.colorScheme.primary
                    )
                }
            }
        }
    }

}
