package com.snap.composer;

import android.content.Context;
import android.view.View;
import com.snap.composer.attributes.AttributesBinder;
import com.snap.composer.attributes.impl.ButtonAttributesBinder;
import com.snap.composer.attributes.impl.ComposerViewAttributesBinder;
import com.snap.composer.attributes.impl.ScrollViewAttributesBinder;
import com.snap.composer.attributes.impl.ViewAttributesBinder;
import com.snap.composer.attributes.impl.ViewGroupAttributesBinder;
import com.snap.composer.attributes.impl.fonts.FontCache;
import com.snap.composer.bundle.BundleManagerImpl;
import com.snap.composer.context.ContextManager;
import com.snap.composer.logger.Logger;
import com.snap.composer.nativebridge.ComposerViewManager;
import com.snap.composer.nativebridge.MainThreadDispatcher;
import com.snap.composer.nativebridge.ViewLoaderNative;
import com.snap.composer.reloader.DaemonClientProvider;
import com.snap.composer.reloader.IComposerReloader;
import com.snap.composer.utils.IScheduler;
import com.snap.composer.utils.MainThreadUtils;
import com.snapchat.client.composer.BundleManager;
import com.snapchat.client.composer.DaemonClient;
import com.snapchat.client.composer.NativeBridge;
import com.snapchat.client.composer.utils.NativeHandleWrapper;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;

public final class ComposerViewLoaderManager implements DaemonClientProvider {
    private final NativeBridge a = new NativeBridge();
    private final ComposerViewManager b = new ComposerViewManager(this.h, this.i);
    private final ContextManager c;
    private final NativeHandleWrapper d;
    private final ajxe<ComposerViewLoader> e = ajxh.a(new b(this));
    private final ajxe f = this.e;
    private boolean g;
    private final Context h;
    private final Logger i;
    private final FontCache j;
    private final IComposerReloader k;
    private final IScheduler l;

    static final class a extends akcs implements akbk<ajxw> {
        private /* synthetic */ ComposerViewLoaderManager a;

        a(ComposerViewLoaderManager composerViewLoaderManager) {
            this.a = composerViewLoaderManager;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            NativeBridge.clearViewPools(this.a.d.getNativeHandle());
            return ajxw.a;
        }
    }

    static final class b extends akcs implements akbk<ComposerViewLoader> {
        private /* synthetic */ ComposerViewLoaderManager a;

        b(ComposerViewLoaderManager composerViewLoaderManager) {
            this.a = composerViewLoaderManager;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ComposerViewLoaderManager composerViewLoaderManager = this.a;
            return composerViewLoaderManager.a(new BundleManagerImpl(composerViewLoaderManager.getLogger(), this.a.getContext(), this.a.getScheduler()), false, true);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ComposerViewLoaderManager.class), "mainViewLoader", "getMainViewLoader()Lcom/snap/composer/ComposerViewLoader;");
    }

    public ComposerViewLoaderManager(Context context, Logger logger, FontCache fontCache, IComposerReloader iComposerReloader, IScheduler iScheduler) {
        akcr.b(context, "context");
        akcr.b(logger, "logger");
        akcr.b(fontCache, "fontCache");
        akcr.b(iComposerReloader, "reloader");
        akcr.b(iScheduler, "scheduler");
        this.h = context;
        this.i = logger;
        this.j = fontCache;
        this.k = iComposerReloader;
        this.l = iScheduler;
        r9 = new AttributesBinder[5];
        int i = 0;
        r9[0] = new ViewAttributesBinder(this.h, this.i);
        r9[1] = new ViewGroupAttributesBinder();
        r9[2] = new ComposerViewAttributesBinder();
        r9[3] = new ButtonAttributesBinder(this.h);
        r9[4] = new ScrollViewAttributesBinder();
        while (i < 5) {
            registerAttributesBinder(r9[i]);
            i++;
        }
        this.c = new ContextManager(this.a, this.i);
        NativeBridge nativeBridge = this.a;
        MainThreadDispatcher mainThreadDispatcher = new MainThreadDispatcher(this.i);
        ComposerViewManager composerViewManager = this.b;
        Logger logger2 = this.i;
        ContextManager contextManager = this.c;
        Object resources = this.h.getResources();
        akcr.a(resources, "context.resources");
        long createViewLoaderManager = nativeBridge.createViewLoaderManager(mainThreadDispatcher, composerViewManager, logger2, contextManager, resources.getDisplayMetrics().density);
        this.d = new NativeHandleWrapper(createViewLoaderManager, createViewLoaderManager) {
            private /* synthetic */ long a;

            public final void destroyHandle(long j) {
                NativeBridge.deleteViewLoaderManager(j);
            }
        };
    }

    private final ComposerViewLoader a(BundleManager bundleManager, boolean z, boolean z2) {
        long createViewLoader = this.a.createViewLoader(this.d.getNativeHandle(), bundleManager);
        ComposerViewLoader composerViewLoader = new ComposerViewLoader(new ViewLoaderNative(this.a, createViewLoader), this.h, this.i, z, z2, this);
        NativeBridge.setViewLoaderAttachedObject(createViewLoader, composerViewLoader);
        return composerViewLoader;
    }

    public final void clearViewPools() {
        MainThreadUtils.runOnMainThreadIfNeeded(new a(this));
    }

    public final ComposerViewLoader createViewLoader(BundleManager bundleManager, boolean z) {
        akcr.b(bundleManager, "bundleManager");
        return a(bundleManager, z, false);
    }

    public final void destroy() {
        if (this.e.a()) {
            ((ComposerViewLoader) this.e.b()).destroy();
        }
        this.d.destroy();
        this.k.stopListening();
    }

    public final void forceBindAllAttributes() {
        for (String forceBindAttributes : this.b.getAllRegisteredClassNames()) {
            NativeBridge.forceBindAttributes(this.d.getNativeHandle(), forceBindAttributes);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0039 in {6, 8, 10, 12} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final java.util.List<com.snap.composer.ComposerViewLoader> getAllViewLoaders() {
        /*
        r5 = this;
        r0 = r5.d;
        r0 = r0.getNativeHandle();
        r0 = com.snapchat.client.composer.NativeBridge.getAllViewLoaderAttachedObjects(r0);
        if (r0 == 0) goto L_0x0031;
        r0 = (java.lang.Object[]) r0;
        r1 = new java.util.ArrayList;
        r2 = r0.length;
        r1.<init>(r2);
        r1 = (java.util.Collection) r1;
        r2 = r0.length;
        r3 = 0;
        if (r3 >= r2) goto L_0x002e;
        r4 = r0[r3];
        if (r4 == 0) goto L_0x0026;
        r4 = (com.snap.composer.ComposerViewLoader) r4;
        r1.add(r4);
        r3 = r3 + 1;
        goto L_0x0018;
        r0 = new ajxt;
        r1 = "null cannot be cast to non-null type com.snap.composer.ComposerViewLoader";
        r0.<init>(r1);
        throw r0;
        r1 = (java.util.List) r1;
        return r1;
        r0 = new ajxt;
        r1 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any>";
        r0.<init>(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.ComposerViewLoaderManager.getAllViewLoaders():java.util.List");
    }

    public final <T extends View> AttributesBinder<T> getAttributesBinderForClass(Class<T> cls) {
        akcr.b(cls, "cls");
        return this.b.getAttributesBinderForClass(cls);
    }

    public final Context getContext() {
        return this.h;
    }

    public final DebugMessagePresenter getDebugMessagePresenter() {
        return this.b.getDebugMessagePresenter();
    }

    public final FontCache getFontCache() {
        return this.j;
    }

    public final boolean getHotReloadEnabled() {
        return this.g;
    }

    public final Logger getLogger() {
        return this.i;
    }

    public final ComposerViewLoader getMainViewLoader() {
        return (ComposerViewLoader) this.f.b();
    }

    public final IComposerReloader getReloader() {
        return this.k;
    }

    public final IScheduler getScheduler() {
        return this.l;
    }

    public final DaemonClient newDaemonClient() {
        Object createDaemonClient = NativeBridge.createDaemonClient(this.d.getNativeHandle());
        if (createDaemonClient != null) {
            return (DaemonClient) createDaemonClient;
        }
        throw new ajxt("null cannot be cast to non-null type com.snapchat.client.composer.DaemonClient");
    }

    public final <T extends View> void registerAttributesBinder(AttributesBinder<T> attributesBinder) {
        akcr.b(attributesBinder, "attributesBinder");
        this.b.registerAttributesBinder(attributesBinder);
    }

    public final void registerClassReplacement(Class<?> cls, Class<?> cls2) {
        akcr.b(cls, "sourceClass");
        akcr.b(cls2, "newClass");
        this.b.registerClassReplacement(cls, cls2);
    }

    public final void setDebugMessagePresenter(DebugMessagePresenter debugMessagePresenter) {
        this.b.setDebugMessagePresenter(debugMessagePresenter);
    }

    public final void setHotReloadEnabled(boolean z) {
        if (z != this.g) {
            this.g = z;
            if (z) {
                this.k.startListening(this);
                return;
            }
            this.k.stopListening();
        }
    }
}
