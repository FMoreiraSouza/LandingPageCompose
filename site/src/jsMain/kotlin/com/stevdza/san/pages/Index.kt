package com.stevdza.san.pages

import androidx.compose.runtime.*
import com.stevdza.san.components.BackToTopButton
import com.stevdza.san.components.OverflowMenu
import com.stevdza.san.sections.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.core.Page

@Page
@Composable
fun HomePage() {
    var menuOpened by remember{
        mutableStateOf(false)

    }
//    // TODO: Replace the following with your own content
//    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
//        Text("THIS PAGE INTENTIONALLY LEFT BLANK")
//    }
//    println("Hello World!")
//    println("stedvza-San")
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            MainSection(onMenuClicked = { menuOpened = true

            })
            AboutSection()
            ServiceSection()
            PortfolioSection()
            AchievementsSection()
            TestimonialSection()
            ExperienceSection()
            ContactSection()
            FooterSection()
        }
        BackToTopButton()
        if(menuOpened){
            OverflowMenu (
                onMenuClosed = {menuOpened = false}
            )



        }
    }

}
