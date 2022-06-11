package com.wisnu.kurniawan.wallee.runtime.navigation

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Shape
import com.wisnu.kurniawan.wallee.foundation.theme.LargeRadius
import com.wisnu.kurniawan.wallee.foundation.theme.SmallRadius

@Immutable
data class MainBottomSheetConfig(
    val sheetShape: Shape,
    val showScrim: Boolean
)

val DefaultMainBottomSheetConfig = MainBottomSheetConfig(
    RoundedCornerShape(
        topStart = LargeRadius,
        topEnd = LargeRadius
    ),
    true
)
val NoScrimMainBottomSheetConfig = MainBottomSheetConfig(
    RoundedCornerShape(
        topStart = LargeRadius,
        topEnd = LargeRadius
    ),
    false
)
val NoScrimSmallShapeMainBottomSheetConfig = MainBottomSheetConfig(
    RoundedCornerShape(
        topStart = SmallRadius,
        topEnd = SmallRadius
    ),
    false
)

