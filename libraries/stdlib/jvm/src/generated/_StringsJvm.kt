/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license 
 * that can be found in the license/LICENSE.txt file.
 */

@file:kotlin.jvm.JvmMultifileClass
@file:kotlin.jvm.JvmName("StringsKt")

package kotlin.text

//
// NOTE THIS FILE IS AUTO-GENERATED by the GenerateStandardLib.kt
// See: https://github.com/JetBrains/kotlin/tree/master/libraries/stdlib
//

import kotlin.*
import kotlin.text.*
import kotlin.comparisons.*

/**
 * Returns a [SortedSet][java.util.SortedSet] of all characters.
 */
public fun CharSequence.toSortedSet(): java.util.SortedSet<Char> {
    return toCollection(java.util.TreeSet<Char>())
}

