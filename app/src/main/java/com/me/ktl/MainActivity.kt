package com.me.ktl

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow.Companion.Clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.sp
import androidx.compose.unaryPlus
import androidx.ui.core.Clip
import androidx.ui.core.dp
import androidx.ui.foundation.DrawImage
import androidx.ui.layout.Container
import androidx.ui.layout.Expanded
import androidx.ui.layout.Height
import androidx.ui.res.imageResource
import androidx.ui.text.style.TextOverflow
import dagger.hilt.android.AndroidEntryPoint
import kotlin.math.roundToInt

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // CustomTheme(true, ClickedText())
            // MaterialTheme {
                //     // Greeting("NYC Jetpack Compose")
                //     // ScrollableAppBar(...) // all the parameters
                
                // }
        }
    }

    @Preview
    @Composable
    fun CusContainer() {
        Container(modifier = Height(300.dp) wraps Expanded) {
            Clip(shape = androidx.ui.foundation.shape.corner.RoundedCornerShape(4.dp)) {
                DrawImage(+imageResource(R.drawable.img_0))
            }
        }
    }
    
    //     @Composable // ?????????????????????????????????????????????
    //  fun CustomTheme(
        //     darkTheme: Boolean = isSystemInDarkTheme(),  // ????????????????????????????????????????????????
        //     content: @Composable () -> Unit // ???????????? Composable ??????
        // ){
            //     val colors = if (darkTheme) {
                //         DarkColors
                //     } else {
                    //         LightColors
                    //     }

                    //     MaterialTheme(colors = colors) { // ???????????????????????????
                    //         content()
                    //     }
                    // }

                    //  @SuppressLint("ConflictingOnColor")
                    //  private val DarkColors = darkColors( // ????????????????????????
                    //     primary = Color.Gray,
                    //     primaryVariant = Color.Blue,
                    //     onPrimary = Color.Black,
                    //     secondary = Color.Gray,
                    //     onSecondary = Color.Black,
                    //     error = Color.Gray
                    // )

                    //  private val LightColors = lightColors( // ????????????????????????
                    //     primary = Color.Blue,
                    //     primaryVariant = Color.Blue,
                    //     onPrimary = Color.White,
                    //     secondary = Color.Blue,
                    //     secondaryVariant = Color.Blue,
                    //     onSecondary = Color.White,
                    //     error = Color.DarkGray
                    // )
                    //     @Preview
                    //     @Composable
                    //     fun ClickedText() {
                        //         val modifier = Modifier.clickable(
                            //             onClick = {
                                //                 Log.d("Andoter", this.javaClass.name)
                                //                 Toast.makeText(this@MainActivity, "Button ??????", Toast.LENGTH_SHORT).show()
                                //         })
                                //         Text(text = "Hello Compose!", modifier = modifier.padding(10.dp))
                                //     }    
                                // @Preview
                                // @Composable
                                // fun ProductList() {
                                    //     ScrollableColumn(Modifier.fillMaxSize()) {
                                        //         listOf("Ant", "Andoter", "??????").forEach { value ->
                                            //                                                        ProductDetailView(value)
                                        //         }
                                        //     }
                                        // }
                                        // @Composable
                                        // fun ProductDetailView(text: String) {
                                            //     val image = imageResource(id = R.drawable.header)
                                            //     Column(modifier = Modifier.padding(16.dp)) {
                                                //         val imageModifier = Modifier
                                                //             .preferredHeight(180.dp)
                                                //             .clip(shape = RoundedCornerShape(5.dp))
                                                //             .fillMaxWidth()
                                                //             .clickable(onClick = {
                                                    //                            Log.d("Ant", "click");
                                                    //             })
                                                    //         Image(image, modifier = imageModifier, contentScale = ContentScale.Crop)
                                                    //         Spacer(modifier = Modifier.preferredHeight(16.dp))
                                                    //         Text("Hello Compose!")
                                                    //     }
                                                    // }

                                                    
                                                    // // ???????????????
                                                    // private val toolBarHeight = 56.dp
                                                    // // ??????????????????
                                                    // private val navigationIconSize = 50.dp
                                                    // @Preview
                                                    // @Composable
                                                    // fun CusButton () {
                                                        //     Scaffold(
                                                            //         floatingActionButton = {
                                                                //             FloatingActionButton(onClick = { /* ... */ }) {
                                                                    //                 /* FAB content */
                                                                    //             }
                                                                    //         },
                                                                    //         isFloatingActionButtonDocked = true,
                                                                    //         bottomBar = {
                                                                        //             BottomAppBar(
                                                                            //                 // Defaults to null, that is, No cutout
                                                                            //                 cutoutShape = MaterialTheme.shapes.small.copy(
                                                                                //                     CornerSize(percent = 50)
                                                                                //                 )
                                                                                //             ) {
                                                                                    //                 /* Bottom app bar content */
                                                                                    //             }
                                                                                    //         }
                                                                                    //     ) {
                                                                                        //         // Screen content: ????????????????????????????????????
                                                                                        //         Column() {
                                                                                            //             Button(
                                                                                                //                 onClick = { /* ... */ },
                                                                                                //                 // Uses ButtonDefaults.ContentPadding by default
                                                                                                //                 contentPadding = PaddingValues(
                                                                                                    //                     start = 20.dp,
                                                                                                    //                     top = 12.dp,
                                                                                                    //                     end = 20.dp,
                                                                                                    //                     bottom = 12.dp
                                                                                                    //                 )
                                                                                                    //             ) {
                                                                                                        //                 // Inner content including an icon and a text label
                                                                                                        //                 Icon(
                                                                                                            //                     Icons.Filled.Favorite,
                                                                                                            //                     contentDescription = "Favorite",
                                                                                                            //                     modifier = Modifier.size(ButtonDefaults.IconSize)
                                                                                                            //                 )
                                                                                                            //                 Spacer(Modifier.size(ButtonDefaults.IconSpacing))
                                                                                                            //                 Text("Like")
                                                                                                            //             }
                                                                                                            //             Spacer(Modifier.size(15.dp))
                                                                                                            //             ExtendedFloatingActionButton(
                                                                                                                //                 onClick = { /* ... */ },
                                                                                                                //                 icon = {
                                                                                                                    //                     Icon(
                                                                                                                        //                         Icons.Filled.Favorite,
                                                                                                                        //                         contentDescription = "Favorite"
                                                                                                                        //                     )
                                                                                                                        //                 },
                                                                                                                        //                 text = { Text("Like") }
                                                                                                                        //             )
                                                                                                                        //         }
                                                                                                                        //     }
                                                                                                                        // }
                                                                                                                        
                                                                                                                        // @Composable
                                                                                                                        // fun ScrollableAppBar(
                                                                                                                            //     modifier: Modifier = Modifier,
                                                                                                                            //     title: String = stringResource(id = R.string.app_name), //??????????????????
                                                                                                                            //     navigationIcon: @Composable (() -> Unit) =
                                                                                                                                //         { Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "ArrowBack", tint = Color.White) }, //??????????????????
                                                                                                                            //     @DrawableRes backgroundImageId: Int, // ????????????
                                                                                                                            //     background: Color = MaterialTheme.colors.primary,
                                                                                                                            //     scrollableAppBarHeight: Dp, //ScrollableAppBar??????
                                                                                                                            //     toolbarOffsetHeightPx: MutableState<Float> //???????????????
                                                                                                                            // ) {
                                                                                                                                //     // ??????????????????????????????
                                                                                                                                //     val maxOffsetHeightPx = with(LocalDensity.current) { scrollableAppBarHeight.roundToPx().toFloat() - toolBarHeight.roundToPx().toFloat() }
                                                                                                                                //     // Title ??????????????????
                                                                                                                                //     val titleOffsetWidthReferenceValue = with(LocalDensity.current) { navigationIconSize.roundToPx().toFloat() }
                                                                                                                                //     Box(modifier = Modifier
                                                                                                                                //             .height(scrollableAppBarHeight)
                                                                                                                                //             .offset {
                                                                                                                                    //                 IntOffset(x = 0, y = toolbarOffsetHeightPx.value.roundToInt()) //???????????????
                                                                                                                                    //             }
                                                                                                                                    //             .fillMaxWidth()
                                                                                                                                    //     ) {
                                                                                                                                        //         Image(painter = painterResource(id = backgroundImageId), contentDescription = "background", contentScale = ContentScale.FillBounds)
                                                                                                                                        //         // ??????????????????
                                                                                                                                        //         Row(
                                                                                                                                            //             modifier = modifier
                                                                                                                                            //                 .offset {
                                                                                                                                                //                     IntOffset(
                                                                                                                                                    //                         x = 0,
                                                                                                                                                    //                         y = -toolbarOffsetHeightPx.value.roundToInt() //?????????????????????????????????
                                                                                                                                                    //                     )
                                                                                                                                                    //                 }
                                                                                                                                                    //                 .height(toolBarHeight)
                                                                                                                                                    //                 .fillMaxWidth(),
                                                                                                                                                    //             verticalAlignment = Alignment.CenterVertically
                                                                                                                                                    //         ) {
                                                                                                                                                        //             // ????????????
                                                                                                                                                        //             Box(modifier = Modifier.size(navigationIconSize),contentAlignment = Alignment.Center) {
                                                                                                                                                            //                 navigationIcon()
                                                                                                                                                            //             }
                                                                                                                                                            //         }
                                                                                                                                                            //         Box(
                                                                                                                                                                //             modifier = Modifier
                                                                                                                                                                //                 .height(toolBarHeight) //???ToolBar??????
                                                                                                                                                                //                 .fillMaxWidth()
                                                                                                                                                                //                 .align(Alignment.BottomStart)
                                                                                                                                                                //                 .offset {
                                                                                                                                                                    //                     IntOffset(
                                                                                                                                                                        //                         x = -((toolbarOffsetHeightPx.value / maxOffsetHeightPx) * titleOffsetWidthReferenceValue).roundToInt(),
                                                                                                                                                                        //                         y = 0
                                                                                                                                                                        //                     )
                                                                                                                                                                        //                 },
                                                                                                                                                                        //             contentAlignment = Alignment.CenterStart
                                                                                                                                                                        //         ) {
                                                                                                                                                                            //             Text(text = title,color = Color.White,modifier = Modifier.padding(start = 20.dp),fontSize = 20.sp)
                                                                                                                                                                            //         }
                                                                                                                                                                            //     }
                                                                                                                                                                            // }

                                                                                                                                                                            // // @Preview
                                                                                                                                                                            // @Composable
                                                                                                                                                                            // fun One(modifier: Modifier) {
                                                                                                                                                                                //     Text(modifier = modifier
                                                                                                                                                                                //              .fillMaxSize()
                                                                                                                                                                                //              .padding(top = 100.dp), text = "One", color = Color.DarkGray)
                                                                                                                                                                                // }
                                                                                                                                                                                // @Composable
                                                                                                                                                                                // fun Two(modifier: Modifier) {
                                                                                                                                                                                    //     Text(modifier = modifier
                                                                                                                                                                                    //              .fillMaxSize()
                                                                                                                                                                                    //              .padding(top = 100.dp), text = "Two", color = Color.DarkGray)
                                                                                                                                                                                    // }
                                                                                                                                                                                    // @Composable
                                                                                                                                                                                    // fun Three(modifier: Modifier) {
                                                                                                                                                                                        //     Text(modifier = modifier
                                                                                                                                                                                        //              .fillMaxSize()
                                                                                                                                                                                        //              .padding(top = 100.dp), text = "Three", color = Color.DarkGray)
                                                                                                                                                                                        // }
                                                                                                                                                                                        // @Composable
                                                                                                                                                                                        // fun Four(modifier: Modifier) {
                                                                                                                                                                                            //     Text(modifier = modifier
                                                                                                                                                                                            //              .fillMaxSize()
                                                                                                                                                                                            //              .padding(top = 100.dp), text = "Four", color = Color.DarkGray)
                                                                                                                                                                                            // }

                                                                                                                                                                                            // fun marginOrPadding() {
                                                                                                                                                                                                //     Column {
                                                                                                                                                                                                    //         Box(
                                                                                                                                                                                                        //             Modifier
                                                                                                                                                                                                        //                 .background(Color.Black)
                                                                                                                                                                                                        //                 .size(100.dp)
                                                                                                                                                                                                        //         ) {
                                                                                                                                                                                                            //             Text(
                                                                                                                                                                                                                //                 text = "Margin", fontSize = 15.sp, color = Color.Red,
                                                                                                                                                                                                                //                 modifier = Modifier
                                                                                                                                                                                                                //                     .padding(10.dp)
                                                                                                                                                                                                                //                     .background(Color.White)
                                                                                                                                                                                                                //             )
                                                                                                                                                                                                                //         }
                                                                                                                                                                                                                //         Box(
                                                                                                                                                                                                                    //             Modifier
                                                                                                                                                                                                                    //                 .background(Color.Blue)
                                                                                                                                                                                                                    //                 .size(100.dp)
                                                                                                                                                                                                                    //         ) {
                                                                                                                                                                                                                        //             Text(
                                                                                                                                                                                                                            //                 text = "Padding", fontSize = 15.sp, color = Color.Red,
                                                                                                                                                                                                                            //                 modifier = Modifier
                                                                                                                                                                                                                            //                     .background(Color.White)
                                                                                                                                                                                                                            //                     .padding(20.dp)
                                                                                                                                                                                                                            //             )
                                                                                                                                                                                                                            //         }
                                                                                                                                                                                                                            //     }
                                                                                                                                                                                                                            // }
}
// @OptIn(ExperimentalPagerApi::class)
// fun viewPager() {
    //     val pagerState = rememberPagerState()
    //     HorizontalPager(state = pagerState, count = 10) {
        //         Text(
            //             text = "Page: $it", modifier = Modifier.fillMaxWidth()
            //         )
            //     }
            // }

            //     fun scrollView() {
                //         Column(
                    //             Modifier
                    //                 .fillMaxWidth()
                    // //                .height(300.dp) // ?????????height????????????????????????????????????
                    //                 .verticalScroll(rememberScrollState())
                    //         ) {
                        //             Box(
                            //                 Modifier
                            //                     .fillMaxWidth()
                            //                     .background(Color.Black)
                            //                     // .height(150.dp)
                            //             ) {
                                //                 Text(text = "1", fontSize = 15.sp, color = Color.Red, modifier = Modifier.align(
                                    //                     Alignment.Center))
                                    //             }
                                    //             Box(
                                        //                 Modifier
                                        //                     .fillMaxWidth()
                                        //                     .background(Color.White)
                                        //                     // .height(150.dp)
                                        //             ) {
                                            //                 Text(text = "2", fontSize = 15.sp, color = Color.Red, modifier = Modifier.align(Alignment.Center))
                                            //             }
                                            //             Box(
                                                //                 Modifier
                                                //                     .fillMaxWidth()
                                                //                     .background(Color.Blue)
                                                //                     // .height(150.dp)
                                                //             ) {
                                                    //                 Text(text = "3", fontSize = 15.sp, color = Color.Red, modifier = Modifier.align(Alignment.Center))
                                                    //             }
                                                    //         }
                                                    //     }
                                                    // fun recyclerview() {
                                                        //     val itemsList = arrayListOf<String>()
                                                        //     for (index in 1..100) {
                                                            //         itemsList.add("hello vivo-${index}")
                                                            //     }
                                                            //     // ????????????lazyRow
                                                            //     LazyColumn {
                                                                //         // item {
                                                                    //         //     Image(painterResource(R.mipmap.tly2), contentDescription = "?????????", Modifier.size(100.dp), contentScale = ContentScale.Crop)
                                                                    //         // }
                                                                    //         items(itemsList) { // ?????????????????????????????????
                                                                    //             // itemsList.forEach { item ->
                                                                        //                 Box(
                                                                            //                     Modifier
                                                                            //                         .fillMaxWidth()
                                                                            //                         .height(30.dp)
                                                                            //                 ) {
                                                                                //                     Text(text = it, fontSize = 15.sp, color = Color.Red)
                                                                                //                 }
                                                                                //         }
                                                                                //     }
                                                                                // }
                                                                                //}

                                                                                // @Preview
                                                                                // @Composable
                                                                                // fun linearLayout() {
                                                                                    //     Column {
                                                                                        //         Column {
                                                                                            //             Text(text = "hello vivo ", fontSize = 15.sp, color = Color.Green)
                                                                                            //             Text(text = "hello apple", fontSize = 15.sp, color = Color.Green)
                                                                                            //         }
                                                                                            //         Row() {
                                                                                                //             Text(text = "hello xiaomi ", fontSize = 15.sp, color = Color.Red)
                                                                                                //             Text(text = "hello ??????", fontSize = 15.sp, color = Color.Red)
                                                                                                //         }
                                                                                                //     }

                                                                                                // }

                                                                                                // @Preview
                                                                                                // @Composable
                                                                                                // fun DefaultPreview() {
                                                                                                    //         MaterialTheme {
                                                                                                        //                 Greeting("NYC Jetpack Compose")
                                                                                                        //             }
                                                                                                        // }
                                                                                                        //}
