package np.com.example.arimaa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import np.com.example.arimaa.ui.theme.ArimaaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArimaaTheme {
                    ArimaaBoard(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun ArimaaBoard(modifier: Modifier = Modifier) {
        modifier = modifier
            .fillMaxSize()
        ) {
        }
        }
    }

// Draw the 8x8 Arimaa board
private fun DrawScope.drawArimaaBoard() {
    val boardSize = size.width
    val cellSize = boardSize / 8

    // Colors
    val lightSquareColor = Color(0xFFEEEED2)
    val darkSquareColor = Color(0xFF769656)
    val trapColor = Color.Red

    // Draw squares
    for (row in 0..7) {
        for (col in 0..7) {
            val squareColor = if ((row + col) % 2 == 0) lightSquareColor else darkSquareColor
            drawRect(
                color = squareColor,
                topLeft = androidx.compose.ui.geometry.Offset(col * cellSize, row * cellSize),
                size = Size(cellSize, cellSize)
            )
        }
    }

