package com.sugarmanz.bazel.distribution

class LibB(val libA: LibA) {

    override fun toString() = libA.toString()

}