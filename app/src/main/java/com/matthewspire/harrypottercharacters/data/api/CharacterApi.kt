package com.matthewspire.harrypottercharacters.data.api

import com.matthewspire.harrypottercharacters.data.api.model.Character
import retrofit2.http.GET

interface CharacterApi {
    @GET(ApiConstants.ENDPOINT)
    suspend fun getCharacter(): List<Character>
}