package ru.egorbugay.mywallet.di

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import dagger.BindsInstance
import dagger.Component
import jakarta.inject.Singleton
import ru.egorbugay.mywallet.WalletApplication

@Singleton
@Component(
    modules = [
        AppModule::class
    ]
)
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun inject(application: WalletApplication)

    val viewModelFactory: ViewModelProvider.Factory
}