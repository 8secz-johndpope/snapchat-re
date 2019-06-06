package com.snap.composer;

import android.content.Context;
import android.view.View;
import com.snap.composer.attributes.AttributesBinder;
import com.snap.composer.context.ComposerViewOwner;
import com.snap.composer.jsmodules.ComposerJSRuntime;
import com.snap.composer.views.ComposerView;
import com.snapchat.client.composer.ModuleFactory;
import defpackage.ajxw;
import defpackage.akbl;

public interface IComposerViewLoader {
    Context getContext();

    void getJSRuntime(akbl<? super ComposerJSRuntime, ajxw> akbl);

    void inflateViewAsync(ComposerView composerView, String str, String str2, Object obj, Object obj2, ComposerViewOwner composerViewOwner, akbl<? super Throwable, ajxw> akbl);

    <T extends View> void registerAttributesBinder(AttributesBinder<T> attributesBinder);

    void registerNativeModuleFactory(String str, ModuleFactory moduleFactory);

    void setHotReloadEnabled(boolean z);

    void unloadAllJsModules();
}
