package dev.mamkin.echojournal.ui.icons.inactive

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.mamkin.echojournal.ui.icons.Mood

val Mood.Inactive.StressesInactive: ImageVector
    get() {
        if (_StressesInactive != null) {
            return _StressesInactive!!
        }
        _StressesInactive = ImageVector.Builder(
            name = "Inactive.StressesInactive",
            defaultWidth = 32.dp,
            defaultHeight = 34.dp,
            viewportWidth = 32f,
            viewportHeight = 34f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF9FABCD)),
                strokeLineWidth = 1f
            ) {
                moveTo(16f, 33.5f)
                curveTo(20.566f, 33.5f, 24.208f, 31.643f, 26.699f, 28.632f)
                curveTo(29.182f, 25.631f, 30.5f, 21.511f, 30.5f, 17f)
                curveTo(30.5f, 7.935f, 23.321f, 0.5f, 16f, 0.5f)
                curveTo(12.338f, 0.5f, 8.466f, 2.367f, 5.52f, 5.334f)
                curveTo(2.569f, 8.307f, 0.5f, 12.428f, 0.5f, 17f)
                curveTo(0.5f, 26.069f, 6.846f, 33.5f, 16f, 33.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF9FABCD)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(8f, 23f)
                curveTo(8.833f, 21.167f, 10.275f, 18f, 13.5f, 18f)
                curveTo(16.5f, 18f, 18.5f, 21.5f, 19f, 23f)
            }
            path(
                stroke = SolidColor(Color(0xFF9FABCD)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(18f, 14f)
                lineTo(23f, 11f)
            }
            path(
                stroke = SolidColor(Color(0xFF9FABCD)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(5f, 11f)
                lineTo(10f, 14f)
            }
        }.build()

        return _StressesInactive!!
    }

@Suppress("ObjectPropertyName")
private var _StressesInactive: ImageVector? = null
