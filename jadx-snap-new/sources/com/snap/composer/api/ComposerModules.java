package com.snap.composer.api;

import android.content.Context;
import com.snap.composer.AsyncComposerViewLoader;
import com.snap.composer.ComposerFeature;
import com.snap.composer.ComposerViewLoaderManager;
import com.snap.composer.IComposerViewLoader;
import com.snap.composer.SnapComposerViewLoader;
import com.snapchat.client.composer.ModuleFactory;
import defpackage.abss;
import defpackage.aipn;
import defpackage.ajxh;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.zgb;
import java.util.Map;

public final class ComposerModules {

    public static final class AppModule {

        static final class a extends akcs implements akbk<SnapComposerViewLoader> {
            private /* synthetic */ aipn a;

            a(aipn aipn) {
                this.a = aipn;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return new SnapComposerViewLoader(((ComposerViewLoaderManager) this.a.get()).getMainViewLoader());
            }
        }

        public final AsyncComposerViewLoader providesViewLoader(Context context, aipn<ComposerViewLoaderManager> aipn, zgb zgb) {
            akcr.b(context, "context");
            akcr.b(aipn, "viewLoaderManager");
            akcr.b(zgb, "schedulersProvider");
            return new AsyncComposerViewLoader(context, new ComposerModules$AppModule$providesViewLoader$schedulerImpl$1(zgb.a(ComposerFeature.INSTANCE, "Composer").h()), ajxh.a(new a(aipn)));
        }

        public final ComposerViewLoaderManager providesViewLoaderManager(Context context, zgb zgb) {
            akcr.b(context, "context");
            akcr.b(zgb, "schedulersProvider");
            ComposerViewLoaderManager create = SnapComposerViewLoaderManagerFactory.INSTANCE.create(context, zgb);
            try {
                if (abss.a().b()) {
                    create.setHotReloadEnabled(true);
                }
            } catch (NullPointerException unused) {
                create.setHotReloadEnabled(true);
            }
            return create;
        }
    }

    public static final class UserModule {
        public final IComposerViewLoader providesComposerViewLoader(UserScopedViewLoader userScopedViewLoader) {
            akcr.b(userScopedViewLoader, "userScopedViewLoader");
            return userScopedViewLoader.getViewLoader();
        }
    }

    public static abstract class AbstractAppModule {
        public abstract Map<String, ModuleFactory> moduleFactories();
    }
}
