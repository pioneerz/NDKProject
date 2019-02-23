//
// Created by Administrator on 2019/2/23 0023.
//

#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_timcoder_ndkproject_NativeHelper_buttonFromJNI(
        JNIEnv *env,
        jobject) {
    std::string hello = "C++ call";
    return env->NewStringUTF(hello.c_str());
}