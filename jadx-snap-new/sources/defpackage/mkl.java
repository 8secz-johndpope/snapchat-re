package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.brightcove.player.event.Event;
import com.looksery.sdk.io.HierarchicalResourceResolver.NodeType;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.miq.c;
import defpackage.miq.d.a;
import defpackage.moe.b;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: mkl */
public final class mkl implements mka {
    final ConcurrentHashMap<a, a> a = new ConcurrentHashMap();
    final zfw b;
    private final mof c;

    /* renamed from: mkl$a */
    final class a implements ajfa, moe {
        final moe a;
        private ajej b;
        private final defpackage.miq.d.a c;
        private final zfw d;
        private /* synthetic */ mkl e;

        /* renamed from: mkl$a$a */
        static final class a extends akcq implements akbk<ajxw> {
            a(a aVar) {
                super(0, aVar);
            }

            public final String getName() {
                return "disposeAction";
            }

            public final akej getOwner() {
                return akde.a(a.class);
            }

            public final String getSignature() {
                return "disposeAction()V";
            }

            public final /* synthetic */ Object invoke() {
                ((a) this.receiver).a();
                return ajxw.a;
            }
        }

        public a(mkl mkl, moe moe, defpackage.miq.d.a aVar, zfw zfw) {
            akcr.b(moe, "resolver");
            akcr.b(aVar, MessageMediaRefModel.URI);
            akcr.b(zfw, "qualifiedSchedulers");
            this.e = mkl;
            this.a = moe;
            this.c = aVar;
            this.d = zfw;
            Object obj = ajfq.INSTANCE;
            akcr.a(obj, "Disposables.disposed()");
            this.b = obj;
        }

        public final String a(String str) {
            akcr.b(str, MessageMediaRefModel.URI);
            return this.a.a(str);
        }

        /* Access modifiers changed, original: final|declared_synchronized */
        /* JADX WARNING: Missing block: B:19:0x0029, code skipped:
            return;
     */
        public final synchronized void a() {
            /*
            r3 = this;
            monitor-enter(r3);
            r0 = r3.isDisposed();	 Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x0028;
        L_0x0007:
            r0 = r3.b;	 Catch:{ all -> 0x002a }
            r0 = r0.isDisposed();	 Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x0028;
        L_0x000f:
            r0 = r3.e;	 Catch:{ all -> 0x002a }
            r0 = r0.a;	 Catch:{ all -> 0x002a }
            monitor-enter(r0);	 Catch:{ all -> 0x002a }
            r1 = r3.a;	 Catch:{ all -> 0x0025 }
            r1.dispose();	 Catch:{ all -> 0x0025 }
            r1 = r3.e;	 Catch:{ all -> 0x0025 }
            r1 = r1.a;	 Catch:{ all -> 0x0025 }
            r2 = r3.c;	 Catch:{ all -> 0x0025 }
            r1.remove(r2);	 Catch:{ all -> 0x0025 }
            monitor-exit(r0);	 Catch:{ all -> 0x002a }
            monitor-exit(r3);
            return;
        L_0x0025:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x002a }
            throw r1;	 Catch:{ all -> 0x002a }
        L_0x0028:
            monitor-exit(r3);
            return;
        L_0x002a:
            r0 = move-exception;
            throw r0;	 Catch:{ all -> 0x002c }
        L_0x002c:
            r0 = move-exception;
            monitor-exit(r3);
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mkl$a.a():void");
        }

        public final AssetFileDescriptor b(String str) {
            akcr.b(str, MessageMediaRefModel.URI);
            return this.a.b(str);
        }

        public final InputStream c(String str) {
            akcr.b(str, MessageMediaRefModel.URI);
            return this.a.c(str);
        }

        public final synchronized void cancel() {
            this.b.dispose();
        }

        public final boolean d(String str) {
            akcr.b(str, MessageMediaRefModel.URI);
            return this.a.d(str);
        }

        public final synchronized void dispose() {
            if (this.b.isDisposed()) {
                Object a = this.d.f().a(new mkn(new a(this)), 5, TimeUnit.SECONDS);
                akcr.a(a, "qualifiedSchedulers.io()…ion, 5, TimeUnit.SECONDS)");
                this.b = a;
            }
        }

        public final int e(String str) {
            akcr.b(str, MessageMediaRefModel.URI);
            return this.a.e(str);
        }

        public final List<String> f(String str) {
            akcr.b(str, MessageMediaRefModel.URI);
            return this.a.f(str);
        }

        public final b g(String str) {
            akcr.b(str, MessageMediaRefModel.URI);
            return this.a.g(str);
        }

        public final boolean isDisposed() {
            return this.a.isDisposed();
        }
    }

    /* renamed from: mkl$b */
    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ mkl a;
        private /* synthetic */ a b;

        b(mkl mkl, a aVar) {
            this.a = mkl;
            this.b = aVar;
        }

        /* JADX WARNING: Missing block: B:6:0x001b, code skipped:
            if (r1 == null) goto L_0x001d;
     */
        private defpackage.mkl.a a(defpackage.moe r6) {
            /*
            r5 = this;
            r0 = "newResolver";
            defpackage.akcr.b(r6, r0);
            r0 = r5.a;
            r0 = r0.a;
            monitor-enter(r0);
            r1 = r5.a;	 Catch:{ all -> 0x0037 }
            r1 = r1.a;	 Catch:{ all -> 0x0037 }
            r2 = r5.b;	 Catch:{ all -> 0x0037 }
            r1 = r1.get(r2);	 Catch:{ all -> 0x0037 }
            r1 = (defpackage.mkl.a) r1;	 Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x001d;
        L_0x0018:
            r6.dispose();	 Catch:{ all -> 0x0037 }
            if (r1 != 0) goto L_0x0035;
        L_0x001d:
            r1 = new mkl$a;	 Catch:{ all -> 0x0037 }
            r2 = r5.a;	 Catch:{ all -> 0x0037 }
            r3 = r5.b;	 Catch:{ all -> 0x0037 }
            r4 = r5.a;	 Catch:{ all -> 0x0037 }
            r4 = r4.b;	 Catch:{ all -> 0x0037 }
            r1.<init>(r2, r6, r3, r4);	 Catch:{ all -> 0x0037 }
            r6 = r5.a;	 Catch:{ all -> 0x0037 }
            r6 = r6.a;	 Catch:{ all -> 0x0037 }
            r6 = (java.util.Map) r6;	 Catch:{ all -> 0x0037 }
            r2 = r5.b;	 Catch:{ all -> 0x0037 }
            r6.put(r2, r1);	 Catch:{ all -> 0x0037 }
        L_0x0035:
            monitor-exit(r0);
            return r1;
        L_0x0037:
            r6 = move-exception;
            monitor-exit(r0);
            throw r6;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mkl$b.a(moe):mkl$a");
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((moe) obj);
        }
    }

    /* renamed from: mkl$c */
    static final class c<T> implements ajdm<T> {
        private /* synthetic */ mkl a;
        private /* synthetic */ a b;

        c(mkl mkl, a aVar) {
            this.a = mkl;
            this.b = aVar;
        }

        public final void a(ajdk<ajej> ajdk) {
            Object obj;
            akcr.b(ajdk, Event.EMITTER);
            synchronized (this.a.a) {
                obj = (a) this.a.a.get(this.b);
            }
            if (obj != null) {
                obj.cancel();
                if (!ajdk.isDisposed()) {
                    if (obj.isDisposed()) {
                        ajdk.a();
                    } else {
                        ajdk.a(obj);
                    }
                }
            } else if (!ajdk.isDisposed()) {
                ajdk.a();
            }
        }
    }

    public mkl(mof mof, zfw zfw) {
        akcr.b(mof, "resourceResolverFactory");
        akcr.b(zfw, "schedulers");
        this.c = mof;
        this.b = zfw;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x004d in {6, 7, 11, 14, 16} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private final defpackage.mkl.a a(java.lang.String r4) {
        /*
        r3 = this;
        r0 = r3.a;	 Catch:{ all -> 0x004b }
        r0 = r0.values();	 Catch:{ all -> 0x004b }
        r1 = "openedResources.values";	 Catch:{ all -> 0x004b }
        defpackage.akcr.a(r0, r1);	 Catch:{ all -> 0x004b }
        r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x004b }
        r0 = r0.iterator();	 Catch:{ all -> 0x004b }
        r1 = r0.hasNext();	 Catch:{ all -> 0x004b }
        if (r1 == 0) goto L_0x0025;	 Catch:{ all -> 0x004b }
        r1 = r0.next();	 Catch:{ all -> 0x004b }
        r2 = r1;	 Catch:{ all -> 0x004b }
        r2 = (defpackage.mkl.a) r2;	 Catch:{ all -> 0x004b }
        r2 = r2.d(r4);	 Catch:{ all -> 0x004b }
        if (r2 == 0) goto L_0x0011;	 Catch:{ all -> 0x004b }
        goto L_0x0026;	 Catch:{ all -> 0x004b }
        r1 = 0;	 Catch:{ all -> 0x004b }
        r1 = (defpackage.mkl.a) r1;	 Catch:{ all -> 0x004b }
        if (r1 == 0) goto L_0x0030;
        r4 = "trace(\"\") {\n        open…l updateResource?\")\n    }";
        defpackage.akcr.a(r1, r4);
        return r1;
        r0 = new java.io.IOException;	 Catch:{ all -> 0x004b }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x004b }
        r2 = "No reference found for ";	 Catch:{ all -> 0x004b }
        r1.<init>(r2);	 Catch:{ all -> 0x004b }
        r1.append(r4);	 Catch:{ all -> 0x004b }
        r4 = ". Did you forget to call updateResource?";	 Catch:{ all -> 0x004b }
        r1.append(r4);	 Catch:{ all -> 0x004b }
        r4 = r1.toString();	 Catch:{ all -> 0x004b }
        r0.<init>(r4);	 Catch:{ all -> 0x004b }
        r0 = (java.lang.Throwable) r0;	 Catch:{ all -> 0x004b }
        throw r0;	 Catch:{ all -> 0x004b }
        r4 = move-exception;
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mkl.a(java.lang.String):mkl$a");
    }

    public final ajdx<ajej> a(a aVar) {
        akcr.b(aVar, MessageMediaRefModel.URI);
        Object a = ajdj.a((ajdm) new c(this, aVar));
        akcr.a(a, "Maybe.create<Disposable>…          }\n            }");
        Object f = this.c.a(aVar).f(new b(this, aVar));
        akcr.a(f, "resourceResolverFactory.…  }\n                    }");
        f = a.a((ajeb) f);
        akcr.a(f, "tryRestore(uri).switchIfEmpty(createResolver(uri))");
        return f;
    }

    public final c.a b(a aVar) {
        akcr.b(aVar, MessageMediaRefModel.URI);
        return miq.a.a(a(aVar.a()).a.a(aVar.a()));
    }

    public final String[] childNamesForNode(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        String uri2 = uri.toString();
        akcr.a((Object) uri2, "uri.toString()");
        List f = a(uri2).f(uri2);
        if (f.isEmpty()) {
            return null;
        }
        Collection collection = f;
        if (collection != null) {
            Object[] toArray = collection.toArray(new String[0]);
            if (toArray != null) {
                return (String[]) toArray;
            }
            throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new ajxt("null cannot be cast to non-null type java.util.Collection<T>");
    }

    public final NodeType nodeType(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        String uri2 = uri.toString();
        akcr.a((Object) uri2, "uri.toString()");
        int i = mkm.a[a(uri2).e(uri2) - 1];
        if (i == 1) {
            return NodeType.RegularFile;
        }
        if (i == 2) {
            return NodeType.Directory;
        }
        if (i == 3) {
            return null;
        }
        throw new ajxk();
    }

    public final InputStream openResource(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        String uri2 = uri.toString();
        akcr.a((Object) uri2, "uri.toString()");
        return a(uri2).c(uri2);
    }

    public final AssetFileDescriptor openResourceFd(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        String uri2 = uri.toString();
        akcr.a((Object) uri2, "uri.toString()");
        return a(uri2).b(uri2);
    }
}
