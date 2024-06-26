package com.example.newsapp.domain.useCase

import com.example.newsapp.domain.manager.LocalUserManager

class SaveAppEntry(private val localUserManager: LocalUserManager) {

    suspend operator fun invoke(){
        localUserManager.saveAppEntry()
    }
}