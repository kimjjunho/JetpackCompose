package com.example.dmscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Alignment.Companion.End
import androidx.compose.ui.Alignment.Companion.Start
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.font.FontWeight.Companion.Light
import androidx.compose.ui.text.font.FontWeight.Companion.Medium
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.dmscompose.bottomnavi.BottomNavigationCustom
import com.example.dmscompose.bottomnavi.NavigationGraph
import com.example.dmscompose.mypage.BottomFourView
import com.example.dmscompose.mypage.CenterMintBar
import com.example.dmscompose.ui.shadow.drawColoredShadow
import com.example.dmscompose.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DMSComposeTheme (darkTheme = true){
                MainScreenView()
            }
        }
    }
}

@Composable
fun Menu() {
    Text(text = "Menu")
}

@Composable
fun Check() {
    Text(text = "Check")
}

@Composable
fun Alarm() {
    Text(text = "Alarm")
}

@Composable
fun MyPage() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(230.dp)
    ) {
        Column(
            modifier = Modifier
                .background(MaterialTheme.colors.primary)
                .fillMaxWidth()
                .height(230.dp)
        ) {
            Row(
                modifier = Modifier
                    .absolutePadding(20.dp, 15.dp,25.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column() {
                    Text(
                        text = "김준호",
                        color = Color.White,
                        fontFamily = font,
                        fontWeight = Bold,
                        fontSize = 18.sp,
                    )
                    Text(text = "2학년 1반 7반", color = whiteGray)
                }
                Image(
                    painterResource(id = R.drawable.ic_baseline_brightness_5_24),
                    contentDescription = "",
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(align = End)
                        .clickable { }
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(align = CenterHorizontally)
                    .padding(0.dp, 20.dp)
                    .width(315.dp)
                    .height(60.dp)
            ) {
               Column(
                   Modifier
                       .width(105.dp)
                       .fillMaxHeight()
               ) {
                   Image( painterResource(id = R.drawable.ic_baseline_warning_24),
                       contentDescription = "",
                       modifier = Modifier
                           .fillMaxWidth()
                           .wrapContentWidth(align = CenterHorizontally)
                           .clickable { } )
                   TextButton(onClick = {},
                       Modifier
                           .fillMaxWidth()
                           .wrapContentWidth(align = CenterHorizontally)
                   ) {
                       Text(text = "시설 고장 신고", style = MyPageFont.body1)
                   }
               }
                Column(
                    Modifier
                        .width(105.dp)
                        .fillMaxHeight()
                ) {
                    Image( painterResource(id = R.drawable.ic_baseline_description_24),
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentWidth(align = CenterHorizontally)
                            .clickable { } )
                    TextButton(onClick = {},
                        Modifier
                            .fillMaxWidth()
                            .wrapContentWidth(align = CenterHorizontally)
                    ) {
                        Text(text = "설문 조사", style = MyPageFont.body1)
                    }
                }
                Column(
                    Modifier
                        .width(105.dp)
                        .fillMaxHeight()
                ) {
                    Image( painterResource(id = R.drawable.ic_baseline_bug_report_24),
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentWidth(align = CenterHorizontally)
                            .clickable { } )
                    TextButton(onClick = {},
                        Modifier
                            .fillMaxWidth()
                            .wrapContentWidth(align = CenterHorizontally)
                    ) {
                        Text(text = "버그 신고", style = MyPageFont.body1)
                    }
                }
            }
        }
    }
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(50.dp, 200.dp, 50.dp)
    ) {
        Row(
            modifier = Modifier
                .height(60.dp)
                .fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .height(60.dp)
                    .width(120.dp)
                    .wrapContentWidth(align = Start)

            ) {
                Image(
                    painterResource(id = R.drawable.mypage_textbox), contentDescription = "",
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .wrapContentHeight(align = CenterVertically)
                        .wrapContentWidth(align = CenterHorizontally)
                        .drawColoredShadow(color = MaterialTheme.colors.primary, offsetY = 5.dp)
                )
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp)
                        .wrapContentHeight(align = CenterVertically)
                ) {
                    Text(
                        text = "13",
                        color = Color.Black,
                        fontFamily = font,
                        fontWeight = Medium,
                        fontSize = 20.sp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentWidth(align = CenterHorizontally)
                    )
                    Text(
                        text = "상점",
                        color = Color.Black,
                        fontFamily = font,
                        fontWeight = Light,
                        fontSize = 10.sp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentWidth(align = CenterHorizontally)
                    )
                }
            }
            Spacer(modifier = Modifier.weight(1f))
            Box(
                modifier = Modifier
                    .height(60.dp)
                    .width(120.dp)
//                .wrapContentWidth(align = End)
            ) {
                Image(
                    painterResource(id = R.drawable.mypage_textbox), contentDescription = "",
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .wrapContentHeight(align = CenterVertically)
                        .wrapContentWidth(align = CenterHorizontally)
                        .drawColoredShadow(color = MaterialTheme.colors.primary, offsetY = 5.dp)
                )
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp)
                        .wrapContentHeight(align = CenterVertically)
                ) {
                    Text(
                        text = "13",
                        color = Color.Black,
                        fontFamily = font,
                        fontWeight = Medium,
                        fontSize = 20.sp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentWidth(align = CenterHorizontally)
                    )
                    Text(
                        text = "벌점",
                        color = Color.Black,
                        fontFamily = font,
                        fontWeight = Light,
                        fontSize = 10.sp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentWidth(align = CenterHorizontally)
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(30.dp))
        
        CenterMintBar(text = "건웅쌤이 지켜보는 중입니다!!")
        
        Spacer(modifier = Modifier.height(15.dp))
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .padding(0.dp, 0.dp, 0.dp, 60.dp)
        ) {
            BottomFourView(mintText = "로그아웃", longText = "기기내 계정에서 로그아웃합니다.", size = 0.25F)
            BottomFourView(mintText = "비밀번호 변경", longText = "비밀번호를 변경합니다.", size = 0.33F)
            BottomFourView(mintText = "상 / 벌점 내역", longText = "우정관 상 / 발점 내역을 확인합니다.", size = 0.5F)
            BottomFourView(mintText = "개발자 소개", longText = "DMS앱의 개발자를 소개합니다.", size = 1F)
        }
    }
}

@Composable
fun MainScreenView() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigationCustom(navController = navController) }
    ) {
        NavigationGraph(navController = navController)
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun DefaultPreview() {
    DMSComposeTheme (darkTheme = true){
        MyPage()
    }

}