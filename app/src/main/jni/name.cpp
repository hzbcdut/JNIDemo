//
// Created by huzhengbiao on 2018/10/30.
//

#include "com_example_huzhengbiao_jnidemo_MyJniUtils.h"
#include <string>

extern "C" JNIEXPORT jstring

JNICALL Java_com_example_huzhengbiao_jnidemo_MyJniUtils_getName
  (JNIEnv *env, jobject){

   std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
