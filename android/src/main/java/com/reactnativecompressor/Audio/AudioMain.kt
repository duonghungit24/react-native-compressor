package com.reactnativecompressor.Audio

import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReadableMap

class AudioMain(private val reactContext: ReactApplicationContext) {
  fun compress_audio(
    fileUrl: String,
    optionMap: ReadableMap,
    promise: Promise) {
    try {

      // Skip compression on Android to avoid libandroidlame dependency
      // Return the original file URL without compression
      promise.resolve(fileUrl)
    } catch (ex: Exception) {
      promise.reject(ex)
    }
  }
}
