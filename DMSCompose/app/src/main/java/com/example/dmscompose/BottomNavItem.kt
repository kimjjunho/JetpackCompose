package com.example.dmscompose

sealed class BottomNavItem(val title:String, val icon:Int, val screen_route:String){
    object Menu : BottomNavItem("급식",R.drawable.ic_baseline_restaurant_menu_24,"menu")
    object Check : BottomNavItem("신청",R.drawable.ic_baseline_check_24,"check")
    object Alarm : BottomNavItem("공지",R.drawable.ic_baseline_add_alarm_24,"alarm")
    object MyPage : BottomNavItem("마이페이지",R.drawable.ic_baseline_mypage_24,"myPage")
}
