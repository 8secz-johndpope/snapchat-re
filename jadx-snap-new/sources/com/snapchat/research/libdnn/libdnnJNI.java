package com.snapchat.research.libdnn;

public class libdnnJNI {
    static {
        System.loadLibrary("c++_shared");
        System.loadLibrary("protobuf");
        System.loadLibrary("catalyst");
        System.loadLibrary("dnn");
    }

    public static final native void FloatVector_add(long j, FloatVector floatVector, float f);

    public static final native long FloatVector_capacity(long j, FloatVector floatVector);

    public static final native void FloatVector_clear(long j, FloatVector floatVector);

    public static final native float FloatVector_get(long j, FloatVector floatVector, int i);

    public static final native boolean FloatVector_isEmpty(long j, FloatVector floatVector);

    public static final native void FloatVector_reserve(long j, FloatVector floatVector, long j2);

    public static final native void FloatVector_set(long j, FloatVector floatVector, int i, float f);

    public static final native long FloatVector_size(long j, FloatVector floatVector);

    public static final native void IntVector_add(long j, IntVector intVector, int i);

    public static final native long IntVector_capacity(long j, IntVector intVector);

    public static final native void IntVector_clear(long j, IntVector intVector);

    public static final native int IntVector_get(long j, IntVector intVector, int i);

    public static final native boolean IntVector_isEmpty(long j, IntVector intVector);

    public static final native void IntVector_reserve(long j, IntVector intVector, long j2);

    public static final native void IntVector_set(long j, IntVector intVector, int i, int i2);

    public static final native long IntVector_size(long j, IntVector intVector);

    public static final native byte[] LibdnnInterface_GetNetParameter(long j, LibdnnInterface libdnnInterface);

    public static final native long LibdnnInterface_Inference(long j, LibdnnInterface libdnnInterface, long j2, IntVector intVector, long j3, FloatVector floatVector);

    public static final native long LibdnnInterface_InferenceWithMultipleInputs(long j, LibdnnInterface libdnnInterface, long j2, StringVector stringVector, long j3, VectorOfIntVector vectorOfIntVector, long j4, VectorOfFloatVector vectorOfFloatVector, long j5, StringVector stringVector2);

    public static final native long LibdnnInterface_InferenceWithNames(long j, LibdnnInterface libdnnInterface, long j2, IntVector intVector, long j3, FloatVector floatVector, long j4, StringVector stringVector);

    public static final native int LibdnnInterface_Initialize(long j, LibdnnInterface libdnnInterface, String str);

    public static final native int LibdnnInterface_InitializeWithBytes(long j, LibdnnInterface libdnnInterface, byte[] bArr, int i);

    public static final native long LibdnnInterface_Train(long j, LibdnnInterface libdnnInterface, long j2, IntVector intVector, long j3, FloatVector floatVector, long j4, IntVector intVector2, long j5, IntVector intVector3, float f);

    public static final native void StringVector_add(long j, StringVector stringVector, String str);

    public static final native long StringVector_capacity(long j, StringVector stringVector);

    public static final native void StringVector_clear(long j, StringVector stringVector);

    public static final native String StringVector_get(long j, StringVector stringVector, int i);

    public static final native boolean StringVector_isEmpty(long j, StringVector stringVector);

    public static final native void StringVector_reserve(long j, StringVector stringVector, long j2);

    public static final native void StringVector_set(long j, StringVector stringVector, int i, String str);

    public static final native long StringVector_size(long j, StringVector stringVector);

    public static final native void VectorOfFloatVector_add(long j, VectorOfFloatVector vectorOfFloatVector, long j2, FloatVector floatVector);

    public static final native long VectorOfFloatVector_capacity(long j, VectorOfFloatVector vectorOfFloatVector);

    public static final native void VectorOfFloatVector_clear(long j, VectorOfFloatVector vectorOfFloatVector);

    public static final native long VectorOfFloatVector_get(long j, VectorOfFloatVector vectorOfFloatVector, int i);

    public static final native boolean VectorOfFloatVector_isEmpty(long j, VectorOfFloatVector vectorOfFloatVector);

    public static final native void VectorOfFloatVector_reserve(long j, VectorOfFloatVector vectorOfFloatVector, long j2);

    public static final native void VectorOfFloatVector_set(long j, VectorOfFloatVector vectorOfFloatVector, int i, long j2, FloatVector floatVector);

    public static final native long VectorOfFloatVector_size(long j, VectorOfFloatVector vectorOfFloatVector);

    public static final native void VectorOfIntVector_add(long j, VectorOfIntVector vectorOfIntVector, long j2, IntVector intVector);

    public static final native long VectorOfIntVector_capacity(long j, VectorOfIntVector vectorOfIntVector);

    public static final native void VectorOfIntVector_clear(long j, VectorOfIntVector vectorOfIntVector);

    public static final native long VectorOfIntVector_get(long j, VectorOfIntVector vectorOfIntVector, int i);

    public static final native boolean VectorOfIntVector_isEmpty(long j, VectorOfIntVector vectorOfIntVector);

    public static final native void VectorOfIntVector_reserve(long j, VectorOfIntVector vectorOfIntVector, long j2);

    public static final native void VectorOfIntVector_set(long j, VectorOfIntVector vectorOfIntVector, int i, long j2, IntVector intVector);

    public static final native long VectorOfIntVector_size(long j, VectorOfIntVector vectorOfIntVector);

    public static final native void delete_FloatVector(long j);

    public static final native void delete_IntVector(long j);

    public static final native void delete_LibdnnInterface(long j);

    public static final native void delete_StringVector(long j);

    public static final native void delete_VectorOfFloatVector(long j);

    public static final native void delete_VectorOfIntVector(long j);

    public static final native long new_FloatVector__SWIG_0();

    public static final native long new_FloatVector__SWIG_1(long j);

    public static final native long new_IntVector__SWIG_0();

    public static final native long new_IntVector__SWIG_1(long j);

    public static final native long new_LibdnnInterface();

    public static final native long new_StringVector__SWIG_0();

    public static final native long new_StringVector__SWIG_1(long j);

    public static final native long new_VectorOfFloatVector__SWIG_0();

    public static final native long new_VectorOfFloatVector__SWIG_1(long j);

    public static final native long new_VectorOfIntVector__SWIG_0();

    public static final native long new_VectorOfIntVector__SWIG_1(long j);
}
