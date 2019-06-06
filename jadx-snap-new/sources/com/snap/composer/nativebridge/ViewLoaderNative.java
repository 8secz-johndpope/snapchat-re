package com.snap.composer.nativebridge;

import com.snap.composer.actions.ComposerRunnableAction;
import com.snap.composer.context.ComposerContext;
import com.snap.composer.exceptions.ComposerException;
import com.snap.composer.views.ComposerView;
import com.snapchat.client.composer.JSRuntime;
import com.snapchat.client.composer.ModuleFactory;
import com.snapchat.client.composer.NativeBridge;
import com.snapchat.client.composer.utils.NativeHandleWrapper;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akca;
import defpackage.akcr;
import defpackage.akcs;

public final class ViewLoaderNative extends NativeHandleWrapper {
    private final NativeBridge a;

    static final class a extends akcs implements akbl {
        private /* synthetic */ akca a;

        a(akca akca) {
            this.a = akca;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Object composerException;
            Object[] objArr = (Object[]) obj;
            akcr.b(objArr, "it");
            int i = 0;
            Object obj2 = objArr[0];
            if (!(obj2 instanceof ComposerContext)) {
                obj2 = null;
            }
            ComposerContext composerContext = (ComposerContext) obj2;
            Object obj3 = objArr[1];
            if (!(obj3 instanceof Boolean)) {
                obj3 = null;
            }
            Boolean bool = (Boolean) obj3;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            obj = objArr[2];
            if (!(obj instanceof String)) {
                obj = null;
            }
            String str = (String) obj;
            if (str != null) {
                if (str.length() > 0) {
                    i = 1;
                }
                if (i != 0) {
                    composerException = new ComposerException(str);
                    this.a.invoke(composerContext, Boolean.valueOf(booleanValue), composerException);
                    return null;
                }
            }
            composerException = null;
            this.a.invoke(composerContext, Boolean.valueOf(booleanValue), composerException);
            return null;
        }
    }

    public ViewLoaderNative(NativeBridge nativeBridge, long j) {
        akcr.b(nativeBridge, "nativeBridge");
        super(j);
        this.a = nativeBridge;
    }

    public final void callOnJsThread(Runnable runnable) {
        akcr.b(runnable, "runnable");
        NativeBridge.callOnJsThread(getNativeHandle(), runnable);
    }

    public final ComposerContext createContext(String str, String str2, Object obj, Object obj2) {
        akcr.b(str, "bundleName");
        akcr.b(str2, "documentName");
        Object createContextFull = this.a.createContextFull(getNativeHandle(), str, str2, obj, obj2);
        if (createContextFull != null) {
            return (ComposerContext) createContextFull;
        }
        throw new ajxt("null cannot be cast to non-null type com.snap.composer.context.ComposerContext");
    }

    public final void createContextAsync(ComposerView composerView, String str, String str2, Object obj, Object obj2, akca<? super ComposerContext, ? super Boolean, ? super Throwable, ajxw> akca) {
        akca<? super ComposerContext, ? super Boolean, ? super Throwable, ajxw> akca2 = akca;
        ComposerView composerView2 = composerView;
        akcr.b(composerView, "rootView");
        String str3 = str;
        akcr.b(str, "bundleName");
        String str4 = str2;
        akcr.b(str2, "documentName");
        akcr.b(akca2, "completion");
        this.a.createContextAsync(getNativeHandle(), composerView2, str3, str4, obj, obj2, new ComposerRunnableAction(new a(akca2)));
    }

    public final void destroyHandle(long j) {
        this.a.deleteViewLoader(j);
    }

    public final JSRuntime getJSRuntime() {
        Object jSRuntime = NativeBridge.getJSRuntime(getNativeHandle());
        if (jSRuntime != null) {
            return (JSRuntime) jSRuntime;
        }
        throw new ajxt("null cannot be cast to non-null type com.snapchat.client.composer.JSRuntime");
    }

    public final void registerNativeModuleFactory(String str, ModuleFactory moduleFactory) {
        akcr.b(str, "moduleName");
        akcr.b(moduleFactory, "moduleFactory");
        this.a.registerNativeModuleFactory(getNativeHandle(), str, moduleFactory);
    }

    public final void replaceDocument(byte[] bArr) {
        akcr.b(bArr, "document");
        this.a.replaceDocument(getNativeHandle(), bArr);
    }

    public final void setDocument(byte[] bArr) {
        akcr.b(bArr, "document");
        this.a.setDocument(getNativeHandle(), bArr);
    }

    public final void setJS(String str, String str2, byte[] bArr) {
        akcr.b(str, "bundleName");
        akcr.b(str2, "jsPath");
        akcr.b(bArr, "jsData");
        this.a.setJS(getNativeHandle(), str, str2, bArr);
    }

    public final void unloadAllJsModules() {
        NativeBridge.unloadAllJsModules(getNativeHandle());
    }

    public final void updateResource(byte[] bArr, String str, String str2) {
        akcr.b(bArr, "resource");
        akcr.b(str, "bundleName");
        akcr.b(str2, "filePathWithinBundle");
        this.a.updateResource(getNativeHandle(), bArr, str, str2);
    }
}
