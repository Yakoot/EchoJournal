package dev.mamkin.echojournal.ui.icons.inactive

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.mamkin.echojournal.ui.icons.Mood

val Mood.Inactive.ExcitedInactive: ImageVector
    get() {
        if (_ExcitedInactive != null) {
            return _ExcitedInactive!!
        }
        _ExcitedInactive = ImageVector.Builder(
            name = "Inactive.ExcitedInactive",
            defaultWidth = 33.dp,
            defaultHeight = 34.dp,
            viewportWidth = 33f,
            viewportHeight = 34f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF9FABCD)),
                strokeLineWidth = 1f
            ) {
                moveTo(17f, 33.5f)
                curveTo(22.174f, 33.5f, 26.068f, 31.121f, 28.653f, 27.61f)
                curveTo(31.227f, 24.114f, 32.5f, 19.504f, 32.5f, 15f)
                curveTo(32.5f, 10.459f, 30.912f, 6.818f, 28.149f, 4.316f)
                curveTo(25.392f, 1.819f, 21.513f, 0.5f, 17f, 0.5f)
                curveTo(12.488f, 0.5f, 8.369f, 1.818f, 5.368f, 4.301f)
                curveTo(2.357f, 6.792f, 0.5f, 10.434f, 0.5f, 15f)
                curveTo(0.5f, 24.009f, 6.631f, 33.5f, 17f, 33.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9FABCD)),
                stroke = SolidColor(Color(0xFF9FABCD)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(25f, 18f)
                curveTo(24.167f, 19.833f, 22.725f, 23f, 19.5f, 23f)
                curveTo(16.5f, 23f, 14.5f, 19.5f, 14f, 18f)
                lineTo(25f, 18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF9FABCD)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(24f, 10.67f)
                lineTo(27.252f, 13.9f)
            }
            path(
                stroke = SolidColor(Color(0xFF9FABCD)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(14.252f, 10.67f)
                lineTo(11f, 13.9f)
            }
        }.build()

        return _ExcitedInactive!!
    }

@Suppress("ObjectPropertyName")
private var _ExcitedInactive: ImageVector? = null
