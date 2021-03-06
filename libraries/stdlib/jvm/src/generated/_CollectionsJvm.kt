@file:kotlin.jvm.JvmMultifileClass
@file:kotlin.jvm.JvmName("CollectionsKt")
@file:kotlin.jvm.JvmVersion

package kotlin.collections

//
// NOTE THIS FILE IS AUTO-GENERATED by the GenerateStandardLib.kt
// See: https://github.com/JetBrains/kotlin/tree/master/libraries/stdlib
//

import kotlin.*
import kotlin.text.*
import kotlin.comparisons.*

/**
 * Returns a list containing all elements that are instances of specified class.
 */
public fun <R> Iterable<*>.filterIsInstance(klass: Class<R>): List<R> {
    return filterIsInstanceTo(ArrayList<R>(), klass)
}

/**
 * Appends all elements that are instances of specified class to the given [destination].
 */
public fun <C : MutableCollection<in R>, R> Iterable<*>.filterIsInstanceTo(destination: C, klass: Class<R>): C {
    @Suppress("UNCHECKED_CAST")
    for (element in this) if (klass.isInstance(element)) destination.add(element as R)
    return destination
}

/**
 * Reverses elements in the list in-place.
 */
public actual fun <T> MutableList<T>.reverse(): Unit {
    java.util.Collections.reverse(this)
}

/**
 * Returns a [SortedSet][java.util.SortedSet] of all elements.
 */
public fun <T : Comparable<T>> Iterable<T>.toSortedSet(): java.util.SortedSet<T> {
    return toCollection(java.util.TreeSet<T>())
}

/**
 * Returns a [SortedSet][java.util.SortedSet] of all elements.
 * 
 * Elements in the set returned are sorted according to the given [comparator].
 */
public fun <T> Iterable<T>.toSortedSet(comparator: Comparator<in T>): java.util.SortedSet<T> {
    return toCollection(java.util.TreeSet<T>(comparator))
}

