package com.pjh.linkument_android_app.core.di

import com.pjh.linkument_android_app.core.repository.FirststepRepositoryImpl
import com.pjh.linkument_android_app.data.data.repository.FirstStepRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface LinkumentRepositoryModule {
    @Binds
    fun provideFirstStepRepository(impl: FirststepRepositoryImpl): FirstStepRepository
}