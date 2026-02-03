package com.vaultapp.di

import com.vaultapp.data.repository.AuthRepositoryImpl
import com.vaultapp.data.repository.CredentialRepositoryImpl
import com.vaultapp.data.repository.PlatformRepositoryImpl
import com.vaultapp.data.repository.VaultRepositoryImpl
import com.vaultapp.domain.repository.AuthRepository
import com.vaultapp.domain.repository.CredentialRepository
import com.vaultapp.domain.repository.PlatformRepository
import com.vaultapp.domain.repository.VaultRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Hilt module that binds repository interfaces to their implementations.
 */
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCredentialRepository(
        impl: CredentialRepositoryImpl
    ): CredentialRepository

    @Binds
    @Singleton
    abstract fun bindPlatformRepository(
        impl: PlatformRepositoryImpl
    ): PlatformRepository

    @Binds
    @Singleton
    abstract fun bindVaultRepository(
        impl: VaultRepositoryImpl
    ): VaultRepository

    @Binds
    @Singleton
    abstract fun bindAuthRepository(
        impl: AuthRepositoryImpl
    ): AuthRepository
}
