package com.sugarmanz.bazel.distribution

import com.vendor.LibV
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LibATest {

    @Test fun `name is used in toString`() {
        val name = "some-unique-name"
        val version = "1.0.0"
        assertEquals("$name-$version", LibA(name, LibV(version)).toString())
    }

}
