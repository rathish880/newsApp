package com.sdk.novelty.di

import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.KoinAppDeclaration

expect fun platformModule(): Module

fun initKoin(appDeclaration: KoinAppDeclaration = { }) {
    startKoin {
        appDeclaration()
        modules(
            appModule,
            platformModule()
        )
    }
}