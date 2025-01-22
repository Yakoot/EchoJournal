package dev.mamkin.echojournal.ui.icons.inactive

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.mamkin.echojournal.ui.icons.Mood

val Mood.Inactive.PeacefulInactive: ImageVector
    get() {
        if (_PeacefulInactive != null) {
            return _PeacefulInactive!!
        }
        _PeacefulInactive = ImageVector.Builder(
            name = "Inactive.PeacefulInactive",
            defaultWidth = 34.dp,
            defaultHeight = 32.dp,
            viewportWidth = 34f,
            viewportHeight = 32f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF9FABCD)),
                strokeLineWidth = 1f
            ) {
                moveTo(18f, 30.5f)
                curveTo(22.513f, 30.5f, 26.392f, 29.181f, 29.149f, 26.684f)
                curveTo(31.912f, 24.183f, 33.5f, 20.541f, 33.5f, 16f)
                curveTo(33.5f, 11.462f, 31.916f, 7.581f, 29.167f, 4.833f)
                curveTo(26.419f, 2.085f, 22.538f, 0.5f, 18f, 0.5f)
                curveTo(8.972f, 0.5f, 0.5f, 6.81f, 0.5f, 16f)
                curveTo(0.5f, 20.59f, 2.627f, 24.232f, 5.883f, 26.712f)
                curveTo(9.129f, 29.184f, 13.491f, 30.5f, 18f, 30.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF9FABCD)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(13f, 21f)
                curveTo(14.029f, 22.47f, 15.75f, 25f, 20f, 25f)
                curveTo(24.5f, 25f, 26.559f, 22.176f, 27f, 21f)
            }
            path(
                stroke = SolidColor(Color(0xFF9FABCD)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(24f, 12.037f)
                curveTo(24.566f, 13.601f, 26.538f, 14.877f, 28.198f, 14.753f)
            }
            path(
                stroke = SolidColor(Color(0xFF9FABCD)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(16.198f, 12.037f)
                curveTo(15.631f, 13.601f, 13.66f, 14.877f, 12f, 14.753f)
            }
        }.build()

        return _PeacefulInactive!!
    }

@Suppress("ObjectPropertyName")
private var _PeacefulInactive: ImageVector? = null
