package com.example.calculator_jetpackcompose.presentation.calculator_screen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit

@Composable
fun CalculatorButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    symbol: String,
    containerColor: Color = MaterialTheme.colorScheme.surface,
    contentColor: Color = MaterialTheme.colorScheme.onSurface,
    fontSize: TextUnit = MaterialTheme.typography.titleLarge.fontSize
) {
    Box(
        modifier = Modifier
            .clip(Shapes.Full)
            .background(containerColor)
            .clickable { onClick() }
            .then(modifier), contentAlignment = Alignment.Center
    ) {
        Text(
            text = symbol,
            fontSize = fontSize,
            fontWeight = FontWeight.Medium,
            color = contentColor
        )
    }
}
