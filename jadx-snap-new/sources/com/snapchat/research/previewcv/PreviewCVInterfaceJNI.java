package com.snapchat.research.previewcv;

public class PreviewCVInterfaceJNI {
    static {
        System.loadLibrary("c++_shared");
        System.loadLibrary("libjpeg");
        System.loadLibrary("libpng");
        System.loadLibrary("opencv");
        System.loadLibrary("protobuf");
        System.loadLibrary("catalyst");
        System.loadLibrary("dnn");
        System.loadLibrary("fastdnn");
        System.loadLibrary("segmentation.1.0.506a50e71227.3867");
        System.loadLibrary("shaderprocess.1.0.506a50e71227.3867");
        System.loadLibrary("PreviewCV");
    }

    public static final native long CloudMoji_run__SWIG_0(long j, CloudMoji cloudMoji, long j2, int i);

    public static final native long CloudMoji_run__SWIG_1(long j, CloudMoji cloudMoji, long j2);

    public static final native long ColorFill_SWIGUpcast(long j);

    public static final native void ColorFill_preprocess(long j, ColorFill colorFill, long j2, long j3, long j4);

    public static final native long ColorFill_run(long j, ColorFill colorFill, long j2, long j3, long j4, long j5, long j6);

    public static final native long ContextFilter_SWIGUpcast(long j);

    public static final native int ContextFilter_getDNNStatusCode(long j, ContextFilter contextFilter);

    public static final native long ContextFilter_getMask__SWIG_0(long j, ContextFilter contextFilter, long j2, String[] strArr, long j3);

    public static final native long ContextFilter_getMask__SWIG_1(long j, ContextFilter contextFilter, long j2, String[] strArr);

    public static final native long ContextFilter_preprocessAsset__SWIG_0(long j, ContextFilter contextFilter, long j2, long j3, String[] strArr, boolean z);

    public static final native long ContextFilter_preprocessAsset__SWIG_1(long j, ContextFilter contextFilter, long j2, long j3, String[] strArr);

    public static final native long ContextFilter_run(long j, ContextFilter contextFilter, long j2, long j3, long j4, String[] strArr);

    public static final native void ContextFilter_setCropRandomSeed(long j, ContextFilter contextFilter, long j2);

    public static final native void ContextFilter_setDetectionThresh(long j, ContextFilter contextFilter, float f);

    public static final native void ContextFilter_setGFRadius(long j, ContextFilter contextFilter, int i);

    public static final native void ContextFilter_setSoftmaxThresh(long j, ContextFilter contextFilter, float f);

    public static final native boolean ContextFilter_shouldEnableContextFilter(long j, ContextFilter contextFilter, long j2, String[] strArr, long j3);

    public static final native void FloatVec_add(long j, FloatVec floatVec, float f);

    public static final native long FloatVec_capacity(long j, FloatVec floatVec);

    public static final native void FloatVec_clear(long j, FloatVec floatVec);

    public static final native float FloatVec_get(long j, FloatVec floatVec, int i);

    public static final native boolean FloatVec_isEmpty(long j, FloatVec floatVec);

    public static final native void FloatVec_reserve(long j, FloatVec floatVec, long j2);

    public static final native void FloatVec_set(long j, FloatVec floatVec, int i, float f);

    public static final native long FloatVec_size(long j, FloatVec floatVec);

    public static final native long LaplacianBlending_blend(long j, LaplacianBlending laplacianBlending);

    public static final native long MomentFilter_SWIGUpcast(long j);

    public static final native long MomentFilter_getConfidenceThresholds(long j, MomentFilter momentFilter);

    public static final native boolean MomentFilter_getInitializationStatus(long j, MomentFilter momentFilter);

    public static final native long MomentFilter_getInputImageSize(long j, MomentFilter momentFilter);

    public static final native long MomentFilter_getLabels(long j, MomentFilter momentFilter);

    public static final native long MomentFilter_getMean(long j, MomentFilter momentFilter);

    public static final native long MomentFilter_predict(long j, MomentFilter momentFilter, long j2, String[] strArr);

    public static final native long MomentFilter_preprocess(long j, MomentFilter momentFilter, long j2);

    public static final native void MomentFilter_setConfidenceThresholds(long j, MomentFilter momentFilter, long j2, FloatVec floatVec);

    public static final native void MomentFilter_setLabels(long j, MomentFilter momentFilter, long j2, StringVec stringVec);

    public static final native void NeonMoji_run(long j, NeonMoji neonMoji, long j2, long j3, long j4);

    public static final native long PortraitFilter_SWIGUpcast(long j);

    public static final native long PortraitFilter_run__SWIG_0(long j, PortraitFilter portraitFilter, long j2, long j3, String[] strArr);

    public static final native long PortraitFilter_run__SWIG_1(long j, PortraitFilter portraitFilter, long j2, long j3, long j4, String[] strArr);

    public static final native void PortraitFilter_setBokehRadius(long j, PortraitFilter portraitFilter, int i);

    public static final native void PortraitFilter_setColorMode(long j, PortraitFilter portraitFilter, int i);

    public static final native long SkyFilter_SWIGUpcast(long j);

    public static final native int SkyFilter_getMinProcessingDimension(int i);

    public static final native long SkyFilter_run__SWIG_0(long j, SkyFilter skyFilter, long j2, long j3, long j4, String[] strArr);

    public static final native long SkyFilter_run__SWIG_1(long j, SkyFilter skyFilter, long j2, long j3, long j4, long j5, String[] strArr);

    public static final native void SkyFilter_setCartoonFlag(long j, SkyFilter skyFilter, boolean z);

    public static final native void SkyFilter_setColorMode(long j, SkyFilter skyFilter, int i);

    public static final native long SnapCutExt_SWIGUpcast(long j);

    public static final native int SnapCutExt_extractFace(long j, SnapCutExt snapCutExt, long j2, long j3, int[] iArr);

    public static final native int SnapCutExt_getResultType(long j, SnapCutExt snapCutExt);

    public static final native boolean SnapCut_errored(long j, SnapCut snapCut);

    public static final native long SnapCut_extractCut(long j, SnapCut snapCut, long j2, long j3, long j4);

    public static final native long SnapCut_extractMask(long j, SnapCut snapCut, long j2, long j3, long j4);

    public static final native String SnapCut_getErrorMessage(long j, SnapCut snapCut);

    public static final native int SnapCut_getOffsetX(long j, SnapCut snapCut);

    public static final native int SnapCut_getOffsetY(long j, SnapCut snapCut);

    public static final native int SnapFillBase_getShortestDim(long j, SnapFillBase snapFillBase);

    public static final native int SnapFillBase_mMode_get(long j, SnapFillBase snapFillBase);

    public static final native void SnapFillBase_mMode_set(long j, SnapFillBase snapFillBase, int i);

    public static final native long SnapFill_SWIGUpcast(long j);

    public static final native void SnapFill_fillMask(long j, SnapFill snapFill, long j2);

    public static final native void SnapFill_preprocess(long j, SnapFill snapFill, long j2, long j3);

    public static final native long SnapFill_run__SWIG_0(long j, SnapFill snapFill, long j2, long j3);

    public static final native long SnapFill_run__SWIG_1(long j, SnapFill snapFill, long j2, long j3, long j4);

    public static final native void StringVec_add(long j, StringVec stringVec, String str);

    public static final native long StringVec_capacity(long j, StringVec stringVec);

    public static final native void StringVec_clear(long j, StringVec stringVec);

    public static final native String StringVec_get(long j, StringVec stringVec, int i);

    public static final native boolean StringVec_isEmpty(long j, StringVec stringVec);

    public static final native void StringVec_reserve(long j, StringVec stringVec, long j2);

    public static final native void StringVec_set(long j, StringVec stringVec, int i, String str);

    public static final native long StringVec_size(long j, StringVec stringVec);

    public static final native long UniversalFilter_SWIGUpcast(long j);

    public static final native long UniversalFilter_run__SWIG_0(long j, UniversalFilter universalFilter, long j2, float f, int i);

    public static final native long UniversalFilter_run__SWIG_1(long j, UniversalFilter universalFilter, long j2, float f);

    public static final native long UniversalFilter_run__SWIG_2(long j, UniversalFilter universalFilter, long j2);

    public static final native void UniversalFilter_setEnhancementFactor(long j, UniversalFilter universalFilter, float f);

    public static final native void UniversalFilter_setStartLevel(long j, UniversalFilter universalFilter, int i);

    public static final native long compressPNGImage(long j);

    public static final native void delete_CloudMoji(long j);

    public static final native void delete_ColorFill(long j);

    public static final native void delete_ContextFilter(long j);

    public static final native void delete_FloatVec(long j);

    public static final native void delete_LaplacianBlending(long j);

    public static final native void delete_MomentFilter(long j);

    public static final native void delete_NeonMoji(long j);

    public static final native void delete_PortraitFilter(long j);

    public static final native void delete_SkyFilter(long j);

    public static final native void delete_SnapCut(long j);

    public static final native void delete_SnapCutExt(long j);

    public static final native void delete_SnapFill(long j);

    public static final native void delete_SnapFillBase(long j);

    public static final native void delete_StringVec(long j);

    public static final native void delete_UniversalFilter(long j);

    public static final native void delete_vectoruc(long j);

    public static final native long new_CloudMoji();

    public static final native long new_ColorFill__SWIG_0(int i, int i2);

    public static final native long new_ColorFill__SWIG_1(int i);

    public static final native long new_ColorFill__SWIG_2();

    public static final native long new_FloatVec__SWIG_0();

    public static final native long new_FloatVec__SWIG_1(long j);

    public static final native long new_LaplacianBlending(long j, long j2, long j3, int i);

    public static final native long new_MomentFilter__SWIG_0(String str, long j, StringVec stringVec, long j2, FloatVec floatVec, long j3, FloatVec floatVec2, int i, boolean z);

    public static final native long new_MomentFilter__SWIG_1(String str, long j, StringVec stringVec, long j2, FloatVec floatVec, long j3, FloatVec floatVec2, int i);

    public static final native long new_MomentFilter__SWIG_2(String str, long j, StringVec stringVec, long j2, FloatVec floatVec, long j3, FloatVec floatVec2);

    public static final native long new_MomentFilter__SWIG_3(String str, long j, StringVec stringVec, long j2, FloatVec floatVec);

    public static final native long new_NeonMoji();

    public static final native long new_PortraitFilter__SWIG_0(String str, int i, boolean z);

    public static final native long new_PortraitFilter__SWIG_1(String str, int i);

    public static final native long new_PortraitFilter__SWIG_2(String str);

    public static final native long new_PortraitFilter__SWIG_3(int i);

    public static final native long new_PortraitFilter__SWIG_4();

    public static final native long new_SkyFilter__SWIG_0(String str, int i, boolean z, boolean z2);

    public static final native long new_SkyFilter__SWIG_1(String str, int i, boolean z);

    public static final native long new_SkyFilter__SWIG_2(String str, int i);

    public static final native long new_SkyFilter__SWIG_3(String str);

    public static final native long new_SkyFilter__SWIG_4(int i, boolean z);

    public static final native long new_SkyFilter__SWIG_5(int i);

    public static final native long new_SnapCutExt__SWIG_0();

    public static final native long new_SnapCutExt__SWIG_1(int i, boolean z, String str, boolean z2);

    public static final native long new_SnapCutExt__SWIG_2(int i, boolean z, String str);

    public static final native long new_SnapCutExt__SWIG_3(int i, boolean z);

    public static final native long new_SnapCutExt__SWIG_4(int i);

    public static final native long new_SnapCut__SWIG_0(int i, boolean z);

    public static final native long new_SnapCut__SWIG_1(int i);

    public static final native long new_SnapCut__SWIG_2();

    public static final native long new_SnapFill__SWIG_0(int i, int i2);

    public static final native long new_SnapFill__SWIG_1(int i);

    public static final native long new_SnapFill__SWIG_2();

    public static final native long new_StringVec__SWIG_0();

    public static final native long new_StringVec__SWIG_1(long j);

    public static final native long new_UniversalFilter__SWIG_0(int i);

    public static final native long new_UniversalFilter__SWIG_1();

    public static final native long new_vectoruc__SWIG_0();

    public static final native long new_vectoruc__SWIG_1(long j);

    public static final native long uncompressPNGImage(long j, vectoruc vectoruc);

    public static final native void vectoruc_add(long j, vectoruc vectoruc, short s);

    public static final native long vectoruc_capacity(long j, vectoruc vectoruc);

    public static final native void vectoruc_clear(long j, vectoruc vectoruc);

    public static final native short vectoruc_get(long j, vectoruc vectoruc, int i);

    public static final native boolean vectoruc_isEmpty(long j, vectoruc vectoruc);

    public static final native void vectoruc_reserve(long j, vectoruc vectoruc, long j2);

    public static final native void vectoruc_set(long j, vectoruc vectoruc, int i, short s);

    public static final native long vectoruc_size(long j, vectoruc vectoruc);
}
