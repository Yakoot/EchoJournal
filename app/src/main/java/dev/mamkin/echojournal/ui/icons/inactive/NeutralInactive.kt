package dev.mamkin.echojournal.ui.icons.inactive

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.mamkin.echojournal.ui.icons.Mood

val Mood.Inactive.NeutralInactive: ImageVector
    get() {
        if (_NeutralInactive != null) {
            return _NeutralInactive!!
        }
        _NeutralInactive = ImageVector.Builder(
            name = "Inactive.NeutralInactive",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF9FABCD)),
                strokeLineWidth = 1f
            ) {
                moveTo(14f, 1.5f)
                lineTo(18f, 1.5f)
                arcTo(12.5f, 12.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 30.5f, 14f)
                lineTo(30.5f, 18f)
                arcTo(12.5f, 12.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 30.5f)
                lineTo(14f, 30.5f)
                arcTo(12.5f, 12.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 18f)
                lineTo(1.5f, 14f)
                arcTo(12.5f, 12.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 1.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF9FABCD)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(20f, 11.175f)
                curveTo(21.63f, 11.511f, 22.701f, 12.448f, 23.248f, 14.02f)
            }
            path(
                stroke = SolidColor(Color(0xFF9FABCD)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(11.248f, 11.175f)
                curveTo(9.618f, 11.511f, 8.548f, 12.448f, 8f, 14.02f)
            }
            path(
                stroke = SolidColor(Color(0xFF9FABCD)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(10f, 21f)
                curveTo(11.25f, 21.444f, 13.6f, 22f, 16f, 22f)
                curveTo(18.4f, 22f, 21.25f, 21.444f, 22f, 21f)
            }
        }.build()

        return _NeutralInactive!!
    }

@Suppress("ObjectPropertyName")
private var _NeutralInactive: ImageVector? = null
