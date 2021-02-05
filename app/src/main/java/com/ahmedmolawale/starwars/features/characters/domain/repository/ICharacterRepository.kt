package com.ahmedmolawale.starwars.features.characters.domain.repository

import com.ahmedmolawale.starwars.core.functional.Either
import com.ahmedmolawale.starwars.core.exception.Failure
import com.ahmedmolawale.starwars.features.characters.domain.model.Film
import com.ahmedmolawale.starwars.features.characters.domain.model.Planet
import com.ahmedmolawale.starwars.features.characters.domain.model.SCharacter
import com.ahmedmolawale.starwars.features.characters.domain.model.Specie
import kotlinx.coroutines.flow.Flow


interface ICharacterRepository {
    suspend fun searchCharacters(characterName: String): Flow<Either<Failure, List<SCharacter>>>
    suspend fun recentCharacters(): Flow<Either<Failure, List<SCharacter>>>
    suspend fun getFilms(filmUrls: List<String>): Flow<Either<Failure, List<Film>>>
    suspend fun getPlanet(planetUrl: String): Flow<Either<Failure, Planet>>
    suspend fun getSpecies(speciesUrls: List<String>): Flow<Either<Failure, List<Specie>>>
}