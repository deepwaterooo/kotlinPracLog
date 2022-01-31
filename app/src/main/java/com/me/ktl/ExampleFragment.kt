package com.me.ktl

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import androidx.compose.View
import androidx.compose.ViewGroup
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment

class ExampleFragment : Fragment() {

    
//     override fun onCreateView(
//             inflater: LayoutInflater,
//             container: ViewGroup?,
//             savedInstanceState: Bundle?
// ): View = LinearLayout(inflater, container, savedInstanceState).apply {
//         addView(ComposeView(...).apply { // 这里需要找个例子出业看一下，
//                     id = R.id.compose_view1
//                         ...
//         })
//         addView(TextView(...))
//         addView(ComposeView(...).apply {
//                     id = R.id.compose_view2
//                         ...
//         })
//     }
// 上面的代码也不难，里面需要注意一点，ComposeView ID 需要在 res/values/ids.xml 文件中进行定义：
// 但是可能现在已经不用了，需要证实一下
// <resources>
// <item name="compose_view_x" type="id" />
// <item name="compose_view_y" type="id" />
// </resources>

    // override fun onCreateView(
    //     inflater: LayoutInflater,
    //     container: ViewGroup?,
    //     savedInstanceState: Bundle?
    // ): View {
    //     // Inflate the layout for this fragment
    //     return inflater.inflate(
    //         R.layout.layout_compose_view, container, false
    //     ).apply {
    //         findViewById<ComposeView>(R.id.compose_view).setContent {
    //             // In Compose world
    //             MaterialTheme {
    //                 Text("Hello Compose!")
    //             }
    //         }
    //     }
    //     // // 当然也可以直接 new 出一个 Compose 来进行操作
    //     // return ComposeView(requireContext()).apply {
    //     //     setContent {
    //     //         MaterialTheme {
    //     //             // In Compose world
    //     //             Text("Hello Compose!")
    //     //         }
    //     //     }
    // }
}
