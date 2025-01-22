package dev.mamkin.echojournal.ui.icons.inactive

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.mamkin.echojournal.ui.icons.Mood

val Mood.Inactive.SadInactive: ImageVector
    get() {
        if (_SadInactive != null) {
            return _SadInactive!!
        }
        _SadInactive = ImageVector.Builder(
            name = "Inactive.SadInactive",
            defaultWidth = 34.dp,
            defaultHeight = 34.dp,
            viewportWidth = 34f,
            viewportHeight = 34f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF9FABCD)),
                strokeLineWidth = 1f
            ) {
                moveTo(17f, 33.5f)
                curveTo(21.488f, 33.5f, 25.604f, 32.444f, 28.611f, 30.215f)
                curveTo(31.638f, 27.973f, 33.5f, 24.572f, 33.5f, 20f)
                curveTo(33.5f, 15.457f, 31.663f, 10.599f, 28.705f, 6.875f)
                curveTo(25.749f, 3.153f, 21.618f, 0.5f, 17f, 0.5f)
                curveTo(12.382f, 0.5f, 8.251f, 3.153f, 5.295f, 6.875f)
                curveTo(2.337f, 10.599f, 0.5f, 15.457f, 0.5f, 20f)
                curveTo(0.5f, 24.572f, 2.362f, 27.973f, 5.389f, 30.215f)
                curveTo(8.396f, 32.444f, 12.512f, 33.5f, 17f, 33.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF9FABCD)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(20f, 25.078f)
                curveTo(19.118f, 23.975f, 16.445f, 21.836f, 12.815f, 22.101f)
                curveTo(9.185f, 22.365f, 8.378f, 24.196f, 8f, 25.078f)
            }
            path(
                stroke = SolidColor(Color(0xFF9FABCD)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(9.226f, 12.479f)
                curveTo(8.968f, 13.916f, 7.453f, 15.311f, 6f, 15.45f)
            }
            path(
                stroke = SolidColor(Color(0xFF9FABCD)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(17.402f, 12.184f)
                curveTo(17.496f, 13.64f, 18.844f, 15.198f, 20.272f, 15.5f)
            }
            path(fill = SolidColor(Color(0xFF9FABCD))) {
                moveTo(23f, 20f)
                curveTo(23f, 20.828f, 22.328f, 21.5f, 21.5f, 21.5f)
                curveTo(20.672f, 21.5f, 20f, 20.828f, 20f, 20f)
                curveTo(20f, 19.172f, 21.5f, 17f, 21.5f, 17f)
                curveTo(21.5f, 17f, 23f, 19.172f, 23f, 20f)
                close()
            }
        }.build()

        return _SadInactive!!
    }

@Suppress("ObjectPropertyName")
private var _SadInactive: ImageVector? = null
