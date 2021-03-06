/*
 * Copyright 2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.android.attrs

import java.io.File

public data class NameValue(
        val name: String = "",
        val value: String = "")

public data class Attr(
        val name: String = "",
        val format: List<String> = listOf(),
        val flags: List<NameValue>? = null,
        val enum: List<NameValue>? = null)

public val NoAttr: Attr = Attr()

public data class Styleable(
        val name: String = "",
        val attrs: List<Attr> = listOf())

public data class Attrs(
        val free: List<Attr> = listOf(),
        val styleables: Map<String, Styleable> = mapOf())

public fun readResource(filename: String): String {
    return Attrs::class.java.classLoader.getResourceAsStream(filename)?.reader()?.readText()
            ?: File(filename).readText()
}