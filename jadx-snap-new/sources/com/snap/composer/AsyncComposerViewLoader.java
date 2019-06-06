package com.snap.composer;

import android.content.Context;
import android.view.View;
import com.snap.composer.attributes.AttributesBinder;
import com.snap.composer.context.ComposerViewOwner;
import com.snap.composer.jsmodules.ComposerJSRuntime;
import com.snap.composer.utils.IScheduler;
import com.snap.composer.utils.MainThreadUtils;
import com.snap.composer.views.ComposerView;
import com.snapchat.client.composer.ModuleFactory;
import defpackage.ajxe;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;

public class AsyncComposerViewLoader implements IComposerViewLoader {
    private final Context a;
    private final IScheduler b;
    private final ajxe<IComposerViewLoader> c;

    static final class a extends akcs implements akbl<IComposerViewLoader, ajxw> {
        private /* synthetic */ akbl a;

        a(akbl akbl) {
            this.a = akbl;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            IComposerViewLoader iComposerViewLoader = (IComposerViewLoader) obj;
            akcr.b(iComposerViewLoader, "it");
            iComposerViewLoader.getJSRuntime(this.a);
            return ajxw.a;
        }
    }

    static final class b extends akcs implements akbk<ajxw> {
        final /* synthetic */ akbl a;
        private /* synthetic */ AsyncComposerViewLoader b;

        b(AsyncComposerViewLoader asyncComposerViewLoader, akbl akbl) {
            this.b = asyncComposerViewLoader;
            this.a = akbl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            final IComposerViewLoader iComposerViewLoader = (IComposerViewLoader) this.b.c.b();
            MainThreadUtils.runOnMainThreadIfNeeded(new akbk<ajxw>(this) {
                private /* synthetic */ b a;

                public final /* bridge */ /* synthetic */ Object invoke() {
                    this.a.a.invoke(iComposerViewLoader);
                    return ajxw.a;
                }
            });
            return ajxw.a;
        }
    }

    static final class c extends akcs implements akbl<IComposerViewLoader, ajxw> {
        private /* synthetic */ ComposerView a;
        private /* synthetic */ String b;
        private /* synthetic */ String c;
        private /* synthetic */ Object d;
        private /* synthetic */ Object e;
        private /* synthetic */ ComposerViewOwner f;
        private /* synthetic */ akbl g;

        c(ComposerView composerView, String str, String str2, Object obj, Object obj2, ComposerViewOwner composerViewOwner, akbl akbl) {
            this.a = composerView;
            this.b = str;
            this.c = str2;
            this.d = obj;
            this.e = obj2;
            this.f = composerViewOwner;
            this.g = akbl;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            IComposerViewLoader iComposerViewLoader = (IComposerViewLoader) obj;
            akcr.b(iComposerViewLoader, "it");
            iComposerViewLoader.inflateViewAsync(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
            return ajxw.a;
        }
    }

    static final class d extends akcs implements akbl<IComposerViewLoader, ajxw> {
        private /* synthetic */ AttributesBinder a;

        d(AttributesBinder attributesBinder) {
            this.a = attributesBinder;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            IComposerViewLoader iComposerViewLoader = (IComposerViewLoader) obj;
            akcr.b(iComposerViewLoader, "it");
            iComposerViewLoader.registerAttributesBinder(this.a);
            return ajxw.a;
        }
    }

    static final class e extends akcs implements akbl<IComposerViewLoader, ajxw> {
        private /* synthetic */ String a;
        private /* synthetic */ ModuleFactory b;

        e(String str, ModuleFactory moduleFactory) {
            this.a = str;
            this.b = moduleFactory;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            IComposerViewLoader iComposerViewLoader = (IComposerViewLoader) obj;
            akcr.b(iComposerViewLoader, "it");
            iComposerViewLoader.registerNativeModuleFactory(this.a, this.b);
            return ajxw.a;
        }
    }

    static final class f extends akcs implements akbl<IComposerViewLoader, ajxw> {
        private /* synthetic */ boolean a;

        f(boolean z) {
            this.a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            IComposerViewLoader iComposerViewLoader = (IComposerViewLoader) obj;
            akcr.b(iComposerViewLoader, "it");
            iComposerViewLoader.setHotReloadEnabled(this.a);
            return ajxw.a;
        }
    }

    static final class g extends akcs implements akbl<IComposerViewLoader, ajxw> {
        public static final g a = new g();

        g() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            IComposerViewLoader iComposerViewLoader = (IComposerViewLoader) obj;
            akcr.b(iComposerViewLoader, "it");
            iComposerViewLoader.unloadAllJsModules();
            return ajxw.a;
        }
    }

    public AsyncComposerViewLoader(Context context, IScheduler iScheduler, ajxe<? extends IComposerViewLoader> ajxe) {
        akcr.b(context, "context");
        akcr.b(iScheduler, "scheduler");
        akcr.b(ajxe, "factory");
        this.a = context;
        this.b = iScheduler;
        this.c = ajxe;
    }

    public Context getContext() {
        return this.a;
    }

    public void getJSRuntime(akbl<? super ComposerJSRuntime, ajxw> akbl) {
        akcr.b(akbl, "block");
        getViewLoader(new a(akbl));
    }

    public final void getViewLoader(akbl<? super IComposerViewLoader, ajxw> akbl) {
        akcr.b(akbl, "completion");
        if (this.c.a()) {
            akbl.invoke(this.c.b());
        } else {
            this.b.schedule(new b(this, akbl));
        }
    }

    public void inflateViewAsync(ComposerView composerView, String str, String str2, Object obj, Object obj2, ComposerViewOwner composerViewOwner, akbl<? super Throwable, ajxw> akbl) {
        ComposerView composerView2 = composerView;
        akcr.b(composerView, "rootView");
        String str3 = str;
        akcr.b(str, "bundleName");
        String str4 = str2;
        akcr.b(str2, "viewName");
        akbl cVar = new c(composerView2, str3, str4, obj, obj2, composerViewOwner, akbl);
        getViewLoader(cVar);
    }

    public <T extends View> void registerAttributesBinder(AttributesBinder<T> attributesBinder) {
        akcr.b(attributesBinder, "attributesBinder");
        getViewLoader(new d(attributesBinder));
    }

    public void registerNativeModuleFactory(String str, ModuleFactory moduleFactory) {
        akcr.b(str, "moduleName");
        akcr.b(moduleFactory, "moduleFactory");
        getViewLoader(new e(str, moduleFactory));
    }

    public void setHotReloadEnabled(boolean z) {
        getViewLoader(new f(z));
    }

    public void unloadAllJsModules() {
        getViewLoader(g.a);
    }
}
