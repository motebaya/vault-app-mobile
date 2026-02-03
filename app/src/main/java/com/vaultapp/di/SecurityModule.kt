package com.vaultapp.di

import android.content.Context
import com.vaultapp.security.crypto.Bip39Generator
import com.vaultapp.security.crypto.DekManager
import com.vaultapp.security.crypto.EncryptionService
import com.vaultapp.security.crypto.KdfService
import com.vaultapp.security.keystore.KeystoreManager
import com.vaultapp.security.container.ContainerService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Hilt module providing security-related dependencies.
 * 
 * All security components are singletons to ensure:
 * - Consistent key management
 * - Proper lifecycle handling
 * - Centralized security state
 */
@Module
@InstallIn(SingletonComponent::class)
object SecurityModule {

    @Provides
    @Singleton
    fun provideKeystoreManager(
        @ApplicationContext context: Context
    ): KeystoreManager {
        return KeystoreManager(context)
    }

    @Provides
    @Singleton
    fun provideKdfService(): KdfService {
        return KdfService()
    }

    @Provides
    @Singleton
    fun provideEncryptionService(): EncryptionService {
        return EncryptionService()
    }

    @Provides
    @Singleton
    fun provideDekManager(
        keystoreManager: KeystoreManager,
        encryptionService: EncryptionService
    ): DekManager {
        return DekManager(keystoreManager, encryptionService)
    }

    @Provides
    @Singleton
    fun provideContainerService(
        kdfService: KdfService,
        encryptionService: EncryptionService
    ): ContainerService {
        return ContainerService(kdfService, encryptionService)
    }

    @Provides
    @Singleton
    fun provideBip39Generator(
        @ApplicationContext context: Context
    ): Bip39Generator {
        return Bip39Generator(context)
    }
}
