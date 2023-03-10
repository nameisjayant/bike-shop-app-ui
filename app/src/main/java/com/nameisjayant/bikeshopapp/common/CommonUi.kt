package com.nameisjayant.bikeshopapp.common

import android.annotation.SuppressLint
import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.nameisjayant.bikeshopapp.ui.theme.IconBackgroundGradient

@SuppressLint("ModifierParameter")
@Composable
fun AppIconButton(
    @DrawableRes icon: Int,
    background: Brush = IconBackgroundGradient,
    tint: Color = Color.Unspecified,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {

    Box(
        modifier = modifier
            .clip(RoundedCornerShape(10.dp))
            .background(background)
            .clickable { onClick() }, contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = "",
            tint = tint,
            modifier = Modifier
                .size(20.dp)
                .padding(10.dp)
        )
    }

}