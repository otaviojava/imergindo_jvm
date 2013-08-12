#include <jni.h>  
#include "HelloWorld.h"
#include <stdio.h>  

JNIEXPORT void JNICALL Java_HelloWorld_chamarMensagem(JNIEnv * env, jobject obj,jstring nome){
    const char * nomeNativo=(*env)->GetStringUTFChars(env, nome, NULL);  
    printf("Hello World!!!!  %s\n", nomeNativo);  
    return;  
}

JNIEXPORT jint JNICALL Java_HelloWorld_dobrar(JNIEnv * env, jclass classe, jint valor){

	return 2*valor;
}
