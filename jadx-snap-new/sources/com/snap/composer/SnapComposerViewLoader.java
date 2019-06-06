package com.snap.composer;

import android.content.Context;
import android.view.View;
import android.view.View.OnSystemUiVisibilityChangeListener;
import com.snap.composer.attributes.AttributesBinder;
import com.snap.composer.attributes.impl.fonts.FontCache;
import com.snap.composer.attributes.impl.fonts.FontWeight;
import com.snap.composer.context.ComposerViewOwner;
import com.snap.composer.jsmodules.ComposerApplicationModule;
import com.snap.composer.jsmodules.ComposerDateFormattingModule;
import com.snap.composer.jsmodules.ComposerDeviceModule;
import com.snap.composer.jsmodules.ComposerJSRuntime;
import com.snap.composer.jsmodules.ComposerMapStringsModule;
import com.snap.composer.jsmodules.ComposerNumberFormattingModule;
import com.snap.composer.jsmodules.ComposerStringsModule;
import com.snap.composer.logger.Logger;
import com.snap.composer.utils.LoggerUtilsKt;
import com.snap.composer.views.ComposerView;
import com.snapchat.client.composer.ModuleFactory;
import defpackage.absi;
import defpackage.absn;
import defpackage.ajei;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;

public final class SnapComposerViewLoader implements IComposerViewLoader {
    private final ComposerDeviceModule a;
    private boolean b;
    private final ComposerViewLoader c;

    static final class a implements OnSystemUiVisibilityChangeListener {
        private /* synthetic */ SnapComposerViewLoader a;

        a(SnapComposerViewLoader snapComposerViewLoader) {
            this.a = snapComposerViewLoader;
        }

        public final void onSystemUiVisibilityChange(int i) {
            this.a.a(i);
        }
    }

    static final class b extends akcs implements akbl<Throwable, ajxw> {
        private /* synthetic */ SnapComposerViewLoader a;
        private /* synthetic */ String b;
        private /* synthetic */ String c;
        private /* synthetic */ akbl d;

        b(SnapComposerViewLoader snapComposerViewLoader, String str, String str2, akbl akbl) {
            this.a = snapComposerViewLoader;
            this.b = str;
            this.c = str2;
            this.d = akbl;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                Logger logger = this.a.c.getLogger();
                StringBuilder stringBuilder = new StringBuilder("Failed to inflate root view ");
                stringBuilder.append(this.b);
                stringBuilder.append(" in bundle ");
                stringBuilder.append(this.c);
                stringBuilder.append(": ");
                stringBuilder.append(th.getMessage());
                LoggerUtilsKt.error(logger, stringBuilder.toString());
            }
            akbl akbl = this.d;
            if (akbl != null) {
                akbl.invoke(th);
            }
            return ajxw.a;
        }
    }

    public SnapComposerViewLoader(ComposerViewLoader composerViewLoader) {
        akcr.b(composerViewLoader, "innerViewLoader");
        this.c = composerViewLoader;
        composerViewLoader = this.c;
        this.a = new ComposerDeviceModule(composerViewLoader, composerViewLoader.getContext(), composerViewLoader.getLogger());
        composerViewLoader.registerNativeModuleFactory("Device", this.a);
        composerViewLoader.registerNativeModuleFactory("Application", new ComposerApplicationModule(composerViewLoader.getContext(), new ajei(), composerViewLoader.getLogger()));
        composerViewLoader.registerNativeModuleFactory("Strings", new ComposerStringsModule(composerViewLoader.getContext()));
        composerViewLoader.registerNativeModuleFactory("DateFormatting", new ComposerDateFormattingModule(composerViewLoader.getContext()));
        composerViewLoader.registerNativeModuleFactory("NumberFormatting", new ComposerNumberFormattingModule(composerViewLoader.getContext()));
        composerViewLoader.registerNativeModuleFactory("MapStrings", new ComposerMapStringsModule(composerViewLoader.getContext()));
        ComposerViewLoaderManager manager = composerViewLoader.getManager();
        FontCache fontCache = manager != null ? manager.getFontCache() : null;
        if (fontCache != null) {
            int i;
            String[] strArr = new String[]{"Regular", "Medium", "DemiBold", "Bold"};
            for (i = 0; i < 4; i++) {
                fontCache.getTypeface(null, "AvenirNext-".concat(String.valueOf(strArr[i])), null, null);
            }
            for (FontWeight typeface : FontWeight.values()) {
                fontCache.getTypeface("Avenir Next", null, typeface, null);
            }
        }
    }

    private final void a(int i) {
        boolean z = true;
        this.b = true;
        if ((i & 2) != 0) {
            z = false;
        }
        i = absi.a().b(z);
        ComposerDeviceModule composerDeviceModule = this.a;
        Object a = absn.a();
        akcr.a(a, "TranslucentNavigationEnabler.getInstance()");
        composerDeviceModule.updateInsets(a.c() ? (double) i : 0.0d);
    }

    public final Context getContext() {
        return this.c.getContext();
    }

    public final void getJSRuntime(akbl<? super ComposerJSRuntime, ajxw> akbl) {
        akcr.b(akbl, "block");
        this.c.getJSRuntime(akbl);
    }

    public final ComposerViewLoaderManager getManager() {
        return this.c.getManager();
    }

    public final void inflateViewAsync(ComposerView composerView, String str, String str2, Object obj, Object obj2, ComposerViewOwner composerViewOwner, akbl<? super Throwable, ajxw> akbl) {
        ComposerView composerView2 = composerView;
        String str3 = str;
        String str4 = str2;
        akcr.b(composerView, "rootView");
        akcr.b(str, "bundleName");
        akcr.b(str2, "viewName");
        composerView.setOnSystemUiVisibilityChangeListener(new a(this));
        if (!this.b) {
            a(composerView.getSystemUiVisibility());
        }
        this.c.inflateViewAsync(composerView, str, str2, obj, obj2, composerViewOwner, new b(this, str2, str, akbl));
    }

    public final <T extends View> void registerAttributesBinder(AttributesBinder<T> attributesBinder) {
        akcr.b(attributesBinder, "attributesBinder");
        this.c.registerAttributesBinder(attributesBinder);
    }

    public final void registerNativeModuleFactory(String str, ModuleFactory moduleFactory) {
        akcr.b(str, "moduleName");
        akcr.b(moduleFactory, "moduleFactory");
        this.c.registerNativeModuleFactory(str, moduleFactory);
    }

    public final void setHotReloadEnabled(boolean z) {
        this.c.setHotReloadEnabled(z);
    }

    public final void unloadAllJsModules() {
        this.c.unloadAllJsModules();
    }
}
