#include "com_example_java_HelloJni.h"
#include <cstdio>
JNIEXPORT void JNICALL Java_com_example_java_HelloJni_sayHello
  (JNIEnv *, jobject){
      puts("Hello World");
      return;
  }