/*
ORIGINAL PACKAGE: package br.com.devsrsouza.kotlinbukkitapi.serialization
ORIGINAL REPOSITORY: https://github.com/DevSrSouza/KotlinBukkitAPI
AUTHOR: https://github.com/DevSrSouza

Thanks DevSrSouza for KotlinBukkitAPI
 */

package tech.carcadex.kotlinbukkitkit.serialization.interceptor

import kotlinx.serialization.descriptors.SerialDescriptor

internal class ClearSerializationEncodeInterceptor : SerializationEncodeInterceptor {
    override fun encodeBoolean(descriptor: SerialDescriptor, index: Int, value: Boolean): Boolean = value

    override fun encodeByte(descriptor: SerialDescriptor, index: Int, value: Byte): Byte = value

    override fun encodeChar(descriptor: SerialDescriptor, index: Int, value: Char): Char = value

    override fun encodeDouble(descriptor: SerialDescriptor, index: Int, value: Double): Double = value

    override fun encodeFloat(descriptor: SerialDescriptor, index: Int, value: Float): Float = value

    override fun encodeInt(descriptor: SerialDescriptor, index: Int, value: Int): Int = value

    override fun encodeLong(descriptor: SerialDescriptor, index: Int, value: Long): Long = value

    override fun encodeShort(descriptor: SerialDescriptor, index: Int, value: Short): Short = value

    override fun encodeString(descriptor: SerialDescriptor, index: Int, value: String): String = value
}
