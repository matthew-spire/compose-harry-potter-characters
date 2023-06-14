package com.matthewspire.harrypottercharacters.data.repository

import com.matthewspire.harrypottercharacters.data.api.CharacterApi
import com.matthewspire.harrypottercharacters.data.api.model.Character
import javax.inject.Inject

class CharacterRepository @Inject constructor(
    private val characterApi: CharacterApi
) {
    suspend fun getCharacters(): List<Character> {
        return characterApi.getCharacter()
    }
}