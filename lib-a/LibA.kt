package com.sugarmanz.bazel.distribution

import com.vendor.LibV

class LibA(val name: String, val libV: LibV) {

    override fun toString() = "$name-${libV.version}"

}
