package ru.egorbugay.mywallet

import android.app.Application
import ru.egorbugay.mywallet.di.AppComponent
import ru.egorbugay.mywallet.di.DaggerAppComponent

class WalletApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.factory().create(this)

        appComponent.inject(this)
    }
}