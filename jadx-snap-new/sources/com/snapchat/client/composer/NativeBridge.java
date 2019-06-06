package com.snapchat.client.composer;

public class NativeBridge {
    public static native void addViewToPool(long j, String str, Object obj);

    public static native void calculateLayout(long j, long j2, int i, int i2, int i3, int i4);

    public static native void callOnJsThread(long j, Object obj);

    public static native void callSyncWithJsThread(long j, Object obj);

    public static native void clearViewPools(long j);

    public static native Object createDaemonClient(long j);

    public static native void deleteNativeHandle(long j);

    public static native void deleteViewLoaderManager(long j);

    public static native void forceBindAttributes(long j, String str);

    public static native Object getAllViewLoaderAttachedObjects(long j);

    public static native Object getJSRuntime(long j);

    public static native Object getValueForAttribute(long j, long j2, String str);

    public static native Object getViewLoaderAttachedObject(long j);

    public static native Object getViewLoaderAttachedObjectFromContext(long j);

    public static native long getViewNodeChildrenSize(long j, long j2);

    public static native String getViewNodeDebugDescription(long j);

    public static native long getViewNodePosition(long j, long j2);

    public static native int getViewNodeRtlOffsetX(long j, long j2);

    public static native long getViewNodeSize(long j, long j2);

    public static native boolean invalidateLayout(long j);

    public static native boolean isViewNodeRightToLeft(long j);

    public static native Object performAction(long j, Object[] objArr);

    public static native void performCallback(long j);

    public static native Object retainViewNode(long j);

    public static native boolean setUserDefinedViewPort(long j, long j2, int i, int i2, int i3, int i4);

    public static native void setValueForAttribute(long j, long j2, String str, Object obj);

    public static native void setViewLoaderAttachedObject(long j, Object obj);

    public static native void unloadAllJsModules(long j);

    public static native void valueChangedForAttribute(long j, long j2, String str, Object obj);

    public native void addCSSClass(long j, long j2, Object obj, String str);

    public native void callJSFunction(long j, long j2, String str, Object[] objArr);

    public native Object createContext(long j, String str, String str2);

    public native void createContextAsync(long j, Object obj, String str, String str2, Object obj2, Object obj3, Object obj4);

    public native Object createContextFull(long j, String str, String str2, Object obj, Object obj2);

    public native long createViewLoader(long j, Object obj);

    public native long createViewLoaderManager(Object obj, Object obj2, Object obj3, Object obj4, float f);

    public native void deleteViewLoader(long j);

    public native void destroyContext(long j, long j2);

    public native String getBundleNameInContext(long j);

    public native String getComponentPathInContext(long j);

    public native String getNodeId(long j);

    public native Object getParentContext(long j);

    public native Object getRootView(long j);

    public native Object getViewInContextForId(long j, String str);

    public native void registerNativeModuleFactory(long j, String str, Object obj);

    public native void reloadViewsForDocumentName(long j, String str, String str2);

    public native void removeCSSClass(long j, long j2, Object obj, String str);

    public native void render(long j, long j2);

    public native void renderWithRootView(long j, long j2, Object obj);

    public native void replaceDocument(long j, byte[] bArr);

    public native void setDocument(long j, byte[] bArr);

    public native void setJS(long j, String str, String str2, byte[] bArr);

    public native void setViewModel(long j, long j2, Object obj);

    public native void updateCSS(long j, long j2);

    public native void updateResource(long j, byte[] bArr, String str, String str2);
}
