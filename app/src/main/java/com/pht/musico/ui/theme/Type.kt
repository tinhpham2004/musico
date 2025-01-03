package com.pht.musico.ui.theme

import androidx.compose.ui.text.font.FontStyle
import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.pht.musico.R


// Set of Material typography styles to start with
val InterFontFamily = FontFamily(
    Font(R.font.inter_18pt_regular),
    Font(R.font.inter_18pt_bold, FontWeight.Bold),
    Font(R.font.inter_18pt_bolditalic, FontWeight.Bold, FontStyle.Italic),
    Font(R.font.inter_18pt_extrabold, FontWeight.ExtraBold),
    Font(R.font.inter_18pt_italic, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.inter_18pt_light, FontWeight.Light),
    Font(R.font.inter_18pt_lightitalic, FontWeight.Light, FontStyle.Italic),
    Font(R.font.inter_18pt_medium, FontWeight.Medium),
    Font(R.font.inter_18pt_mediumitalic, FontWeight.Medium, FontStyle.Italic),
    Font(R.font.inter_18pt_semibold, FontWeight.SemiBold),
    Font(R.font.inter_18pt_semibolditalic, FontWeight.SemiBold, FontStyle.Italic),
    Font(R.font.inter_18pt_thin, FontWeight.Thin),
    Font(R.font.inter_18pt_thinitalic, FontWeight.Thin, FontStyle.Italic),
    Font(R.font.inter_18pt_black, FontWeight.Black),
    Font(R.font.inter_18pt_blackitalic, FontWeight.Black, FontStyle.Italic),
    Font(R.font.inter_18pt_extralight, FontWeight.ExtraLight),
    Font(R.font.inter_18pt_extralightitalic, FontWeight.ExtraLight, FontStyle.Italic),
)

val typography = Typography(
    displayLarge = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 57.sp
    ),
    displayMedium = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 45.sp
    ),
    displaySmall = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 36.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    ),
    titleLarge = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp
    ),
    titleMedium = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp
    ),
    titleSmall = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    bodySmall = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    ),
    labelLarge = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    labelMedium = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    ),
    labelSmall = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 11.sp
    )
)