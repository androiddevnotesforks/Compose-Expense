package com.wisnu.kurniawan.wallee.runtime.navigation

import androidx.compose.runtime.MutableState
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.navigation
import com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi
import com.google.accompanist.navigation.material.bottomSheet
import com.wisnu.kurniawan.wallee.features.localized.ui.LanguageScreen
import com.wisnu.kurniawan.wallee.features.localized.ui.LocalizedViewModel
import com.wisnu.kurniawan.wallee.features.logout.ui.LogoutScreen
import com.wisnu.kurniawan.wallee.features.logout.ui.LogoutViewModel
import com.wisnu.kurniawan.wallee.features.setting.ui.SettingScreen
import com.wisnu.kurniawan.wallee.features.setting.ui.SettingViewModel
import com.wisnu.kurniawan.wallee.features.theme.ui.ThemeScreen
import com.wisnu.kurniawan.wallee.features.theme.ui.ThemeViewModel

@OptIn(ExperimentalMaterialNavigationApi::class)
fun NavGraphBuilder.SettingNavHost(
    navController: NavHostController,
    bottomSheetConfig: MutableState<BottomSheetConfig>
) {
    navigation(startDestination = SettingFlow.Setting.route, route = SettingFlow.Root.route) {
        bottomSheet(SettingFlow.Setting.route) {
            val viewModel = hiltViewModel<SettingViewModel>()
            bottomSheetConfig.value = DefaultBottomSheetConfig
            SettingScreen(
                navController = navController,
                viewModel = viewModel
            )
        }
        bottomSheet(SettingFlow.Theme.route) {
            val viewModel = hiltViewModel<ThemeViewModel>()
            bottomSheetConfig.value = DefaultBottomSheetConfig
            ThemeScreen(
                navController = navController,
                viewModel = viewModel
            )
        }
        bottomSheet(SettingFlow.Logout.route) {
            val viewModel = hiltViewModel<LogoutViewModel>()
            bottomSheetConfig.value = DefaultBottomSheetConfig
            LogoutScreen(
                navController = navController,
                viewModel = viewModel
            )
        }
        bottomSheet(SettingFlow.Language.route) {
            val viewModel = hiltViewModel<LocalizedViewModel>()
            bottomSheetConfig.value = DefaultBottomSheetConfig
            LanguageScreen(
                navController = navController,
                viewModel = viewModel
            )
        }
    }
}