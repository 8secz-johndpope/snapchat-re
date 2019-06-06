package defpackage;

import com.brightcove.player.event.Event;
import java.util.Iterator;
import java.util.List;

/* renamed from: hmk */
public abstract class hmk<T> implements ajej {
    public final hme<T> a;
    private final ajei b = new ajei();
    private final hmg c;
    private final zfw d;

    /* renamed from: hmk$1 */
    static final class 1 extends akcq implements akbl<List<? extends hmj>, ajxw> {
        1(hmk hmk) {
            super(1, hmk);
        }

        public final String getName() {
            return "storiesAdded";
        }

        public final akej getOwner() {
            return akde.a(hmk.class);
        }

        public final String getSignature() {
            return "storiesAdded(Ljava/util/List;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List list = (List) obj;
            akcr.b(list, "p1");
            hme hme = ((hmk) this.receiver).a;
            akcr.b(list, "stories");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
            hme.a();
            return ajxw.a;
        }
    }

    /* renamed from: hmk$2 */
    static final class 2 extends akcq implements akbl<List<? extends hmj>, ajxw> {
        2(hmk hmk) {
            super(1, hmk);
        }

        public final String getName() {
            return "storiesRemoved";
        }

        public final akej getOwner() {
            return akde.a(hmk.class);
        }

        public final String getSignature() {
            return "storiesRemoved(Ljava/util/List;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List<hmj> list = (List) obj;
            akcr.b(list, "p1");
            hme hme = ((hmk) this.receiver).a;
            akcr.b(list, "stories");
            for (hmj hmj : list) {
                synchronized (hme.b) {
                    ajej ajej = (ajej) hme.d.remove(hmj);
                    if (ajej != null) {
                        ajej.dispose();
                    } else {
                        new StringBuilder("Story removed from prefetch snapshot ").append(hmj);
                    }
                }
            }
            hme.a();
            return ajxw.a;
        }
    }

    /* renamed from: hmk$a */
    static final class a<T> implements ajfl<hpb> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            hpb hpb = (hpb) obj;
            akcr.b(hpb, "it");
            return hpb.a <= 80;
        }
    }

    /* renamed from: hmk$b */
    static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            hpb hpb = (hpb) obj;
            akcr.b(hpb, "it");
            return hpb.b;
        }
    }

    /* renamed from: hmk$d */
    static final class d<T, R> implements ajfc<T, R> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            hpd hpd = (hpd) obj;
            akcr.b(hpd, "it");
            return hpd.a();
        }
    }

    /* renamed from: hmk$c */
    static final class c extends akcq implements akbl<List<? extends hoz>, ajxw> {
        c(hmk hmk) {
            super(1, hmk);
        }

        public final String getName() {
            return "updateSnapshot";
        }

        public final akej getOwner() {
            return akde.a(hmk.class);
        }

        public final String getSignature() {
            return "updateSnapshot(Ljava/util/List;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List list = (List) obj;
            akcr.b(list, "p1");
            ((hmk) this.receiver).a(list);
            return ajxw.a;
        }
    }

    /* renamed from: hmk$e */
    static final class e extends akcq implements akbl<List<? extends hoz>, ajxw> {
        e(hmk hmk) {
            super(1, hmk);
        }

        public final String getName() {
            return "updateSnapshot";
        }

        public final akej getOwner() {
            return akde.a(hmk.class);
        }

        public final String getSignature() {
            return "updateSnapshot(Ljava/util/List;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List list = (List) obj;
            akcr.b(list, "p1");
            ((hmk) this.receiver).a(list);
            return ajxw.a;
        }
    }

    public hmk(hmg hmg, hmo<T> hmo, hmm hmm, zfw zfw) {
        akcr.b(hmg, "snapshot");
        akcr.b(hmo, "downloader");
        akcr.b(hmm, Event.CONFIGURATION);
        akcr.b(zfw, "schedulers");
        this.c = hmg;
        this.d = zfw;
        this.a = new hme(this.c, hmo, hmm);
        hmk hmk = this;
        ajej f = this.c.a.a((ajdw) this.d.b()).f((ajfb) new hml(new 1(hmk)));
        akcr.a((Object) f, "snapshot.observeStoriesA…subscribe(::storiesAdded)");
        ajvv.a(f, this.b);
        f = this.c.b.a((ajdw) this.d.b()).f((ajfb) new hml(new 2(hmk)));
        akcr.a((Object) f, "snapshot.observeStoriesR…bscribe(::storiesRemoved)");
        ajvv.a(f, this.b);
    }

    public final ajej a(hpa hpa) {
        akcr.b(hpa, "feedImpressionEventListener");
        ajei ajei = new ajei();
        hmk hmk = this;
        ajej f = hpa.b().a((ajdw) this.d.b()).a((ajfl) a.a).p(b.a).f((ajfb) new hml(new c(hmk)));
        String str = "feedImpressionEventListe…ibe(this::updateSnapshot)";
        akcr.a((Object) f, str);
        ajvv.a(f, ajei);
        ajej f2 = hpa.a().a((ajdw) this.d.b()).p(d.a).f((ajfb) new hml(new e(hmk)));
        akcr.a((Object) f2, str);
        ajvv.a(f2, ajei);
        return ajei;
    }

    public final void a() {
        this.a.a.set(false);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x0064 in {8, 15, 17, 20} preds:[]
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
    public final void a(java.lang.String r7) {
        /*
        r6 = this;
        r0 = "storyId";
        defpackage.akcr.b(r7, r0);
        r0 = r6.a;
        r1 = "storyId";
        defpackage.akcr.b(r7, r1);
        r1 = r0.b;
        monitor-enter(r1);
        r2 = r0.d;	 Catch:{ all -> 0x0061 }
        r2 = r2.keySet();	 Catch:{ all -> 0x0061 }
        r2 = (java.lang.Iterable) r2;	 Catch:{ all -> 0x0061 }
        r3 = new java.util.ArrayList;	 Catch:{ all -> 0x0061 }
        r3.<init>();	 Catch:{ all -> 0x0061 }
        r3 = (java.util.Collection) r3;	 Catch:{ all -> 0x0061 }
        r2 = r2.iterator();	 Catch:{ all -> 0x0061 }
        r4 = r2.hasNext();	 Catch:{ all -> 0x0061 }
        if (r4 == 0) goto L_0x003d;	 Catch:{ all -> 0x0061 }
        r4 = r2.next();	 Catch:{ all -> 0x0061 }
        r5 = r4;	 Catch:{ all -> 0x0061 }
        r5 = (defpackage.hmj) r5;	 Catch:{ all -> 0x0061 }
        r5 = r5.a;	 Catch:{ all -> 0x0061 }
        r5 = defpackage.akcr.a(r5, r7);	 Catch:{ all -> 0x0061 }
        r5 = r5 ^ 1;	 Catch:{ all -> 0x0061 }
        if (r5 == 0) goto L_0x0022;	 Catch:{ all -> 0x0061 }
        r3.add(r4);	 Catch:{ all -> 0x0061 }
        goto L_0x0022;	 Catch:{ all -> 0x0061 }
        r3 = (java.util.List) r3;	 Catch:{ all -> 0x0061 }
        r3 = (java.lang.Iterable) r3;	 Catch:{ all -> 0x0061 }
        r7 = r3.iterator();	 Catch:{ all -> 0x0061 }
        r2 = r7.hasNext();	 Catch:{ all -> 0x0061 }
        if (r2 == 0) goto L_0x005f;	 Catch:{ all -> 0x0061 }
        r2 = r7.next();	 Catch:{ all -> 0x0061 }
        r2 = (defpackage.hmj) r2;	 Catch:{ all -> 0x0061 }
        r3 = r0.d;	 Catch:{ all -> 0x0061 }
        r2 = r3.remove(r2);	 Catch:{ all -> 0x0061 }
        r2 = (defpackage.ajej) r2;	 Catch:{ all -> 0x0061 }
        if (r2 == 0) goto L_0x0045;	 Catch:{ all -> 0x0061 }
        r2.dispose();	 Catch:{ all -> 0x0061 }
        goto L_0x0045;
        monitor-exit(r1);
        return;
        r7 = move-exception;
        monitor-exit(r1);
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hmk.a(java.lang.String):void");
    }

    public abstract void a(List<? extends hoz> list);

    public final void a(hmh... hmhArr) {
        akcr.b(hmhArr, "sections");
        for (hmh a : hmhArr) {
            this.c.a(a);
        }
    }

    public final void b() {
        hme hme = this.a;
        hme.a.set(true);
        hme.a();
    }

    public void dispose() {
        this.b.a();
    }

    public boolean isDisposed() {
        return this.b.isDisposed();
    }
}
