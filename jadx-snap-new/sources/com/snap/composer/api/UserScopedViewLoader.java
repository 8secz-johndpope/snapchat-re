package com.snap.composer.api;

import com.snap.composer.AsyncComposerViewLoader;
import com.snap.composer.ComposerViewLoaderManager;
import com.snap.composer.IComposerViewLoader;
import com.snap.composer.SnapComposerViewLoader;
import com.snap.composer.reloader.IComposerReloader;
import com.snapchat.client.composer.ModuleFactory;
import defpackage.abkq;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajek;
import defpackage.ajev;
import defpackage.ajfb;
import defpackage.ajvv;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.gpb;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

public final class UserScopedViewLoader {
    private final AsyncComposerViewLoader a;
    private final ajei b;

    public UserScopedViewLoader(AsyncComposerViewLoader asyncComposerViewLoader, gpb gpb, ajei ajei, final InAppNotifDebugMessagePresenter inAppNotifDebugMessagePresenter, final Map<String, ModuleFactory> map) {
        akcr.b(asyncComposerViewLoader, "viewLoader");
        akcr.b(gpb, "authStore");
        akcr.b(ajei, "userSessionDisposable");
        akcr.b(inAppNotifDebugMessagePresenter, "debugMessagePresenter");
        akcr.b(map, "moduleFactories");
        this.a = asyncComposerViewLoader;
        this.b = ajei;
        this.a.getViewLoader(new akbl<IComposerViewLoader, ajxw>(this) {
            private /* synthetic */ UserScopedViewLoader a;

            public final /* synthetic */ Object invoke(Object obj) {
                final IComposerViewLoader iComposerViewLoader = (IComposerViewLoader) obj;
                akcr.b(iComposerViewLoader, "it");
                for (Entry entry : map.entrySet()) {
                    iComposerViewLoader.registerNativeModuleFactory((String) entry.getKey(), (ModuleFactory) entry.getValue());
                }
                this.a.b.a(ajek.a((ajev) new ajev() {
                    public final void run() {
                        iComposerViewLoader.unloadAllJsModules();
                    }
                }));
                return ajxw.a;
            }
        });
        ajej f = gpb.c().f((ajfb) new ajfb<abkq>(this) {
            private /* synthetic */ UserScopedViewLoader b;

            public final /* synthetic */ void accept(Object obj) {
                final String str = ((abkq) obj).b;
                if (str != null) {
                    this.b.getViewLoader().getViewLoader(new akbl<IComposerViewLoader, ajxw>(this) {
                        private /* synthetic */ AnonymousClass2 a;

                        public final /* synthetic */ Object invoke(Object obj) {
                            IComposerViewLoader iComposerViewLoader = (IComposerViewLoader) obj;
                            akcr.b(iComposerViewLoader, "it");
                            if (iComposerViewLoader instanceof SnapComposerViewLoader) {
                                ComposerViewLoaderManager manager = ((SnapComposerViewLoader) iComposerViewLoader).getManager();
                                if (manager != null) {
                                    IComposerReloader reloader = manager.getReloader();
                                    Object asList = Arrays.asList(new String[]{str});
                                    akcr.a(asList, "Arrays.asList(username)");
                                    reloader.setUsernames((Collection) asList);
                                    manager.setDebugMessagePresenter(inAppNotifDebugMessagePresenter);
                                }
                            }
                            return ajxw.a;
                        }
                    });
                }
            }
        });
        akcr.a((Object) f, "authStore\n              …      }\n                }");
        ajvv.a(f, this.b);
    }

    public final AsyncComposerViewLoader getViewLoader() {
        return this.a;
    }
}
