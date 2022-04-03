package com.damlayagmur.unittestcase

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty user name returns false`(){

        val result = RegistrationUtil.validateRegisterationInput(
            "",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`(){

        val result = RegistrationUtil.validateRegisterationInput(
            "Damla",
            "123",
            "123"
        )

        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`(){

        val result = RegistrationUtil.validateRegisterationInput(
            "Carl",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }

    // empty password
    // password was repeated incorrectly
    // password contains less than 2 digits


    @Test
    fun `empty password returns false`(){

        val result = RegistrationUtil.validateRegisterationInput(
            "Damla",
            "",
            ""
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `password repeated incorrectly returns false`(){

        val result = RegistrationUtil.validateRegisterationInput(
            "Damla",
            "123",
            "1234"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `password contains less than 2 digits returns false`(){

        val result = RegistrationUtil.validateRegisterationInput(
            "Damla",
            "abcdefg5",
            "abcdefg5"
        )

        assertThat(result).isFalse()
    }
}