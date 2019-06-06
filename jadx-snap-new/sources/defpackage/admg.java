package defpackage;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.SystemClock;
import com.brightcove.player.event.Event;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import defpackage.admm.a;
import defpackage.admm.b;
import defpackage.akdd.c;
import defpackage.akdd.d;
import java.io.FileDescriptor;
import java.util.List;

/* renamed from: admg */
public final class admg implements admm {
    final jwb a;
    final adme b;
    final admj c;
    final admn d;
    final admn e;
    final ilv f;
    private final adgb g;

    /* renamed from: admg$f */
    static final class f extends akcs implements akbl<Integer, ajdp<jwu>> {
        private /* synthetic */ admg a;
        private /* synthetic */ ide b;
        private /* synthetic */ idd c;
        private /* synthetic */ FileDescriptor d;
        private /* synthetic */ List e;
        private /* synthetic */ abtl f;
        private /* synthetic */ ajei g = null;

        f(admg admg, ide ide, idd idd, FileDescriptor fileDescriptor, List list, abtl abtl, ajei ajei) {
            this.a = admg;
            this.b = ide;
            this.c = idd;
            this.d = fileDescriptor;
            this.e = list;
            this.f = abtl;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            admg admg = this.a;
            ide ide = this.b;
            idd idd = this.c;
            FileDescriptor fileDescriptor = this.d;
            List list = this.e;
            abtl abtl = this.f;
            ajei ajei = this.g;
            akcr.b(ide, "feature");
            akcr.b(idd, "callSite");
            akcr.b(fileDescriptor, "videoFileDescriptor");
            akcr.b(list, "offsetListInMs");
            String idd2 = idd.toString();
            d dVar = new d();
            dVar.a = 0;
            d dVar2 = new d();
            dVar2.a = 0;
            c cVar = new c();
            cVar.a = 0;
            admg admg2 = admg;
            c cVar2 = cVar;
            d dVar3 = dVar2;
            d dVar4 = dVar;
            String str = idd2;
            abtl abtl2 = abtl;
            Object a = ajdp.a((ajdr) new h(admg2, intValue, fileDescriptor, ide, abtl, idd, list, dVar, dVar3, ajei, cVar2));
            akcr.a(a, "Observable.create<MediaT…)\n            }\n        }");
            return admi.a(a, new i(admg2, str, abtl2, list, cVar2, dVar4, dVar3, intValue), new j(admg, str, abtl2));
        }
    }

    /* renamed from: admg$g */
    static final class g extends akcs implements akbl<Integer, ajdp<jwu>> {
        private /* synthetic */ admg a;
        private /* synthetic */ ide b;
        private /* synthetic */ idd c;
        private /* synthetic */ FileDescriptor d;
        private /* synthetic */ List e;
        private /* synthetic */ abtl f;
        private /* synthetic */ ajei g = null;

        g(admg admg, ide ide, idd idd, FileDescriptor fileDescriptor, List list, abtl abtl, ajei ajei) {
            this.a = admg;
            this.b = ide;
            this.c = idd;
            this.d = fileDescriptor;
            this.e = list;
            this.f = abtl;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            admg admg = this.a;
            ide ide = this.b;
            idd idd = this.c;
            FileDescriptor fileDescriptor = this.d;
            List list = this.e;
            abtl abtl = this.f;
            ajei ajei = this.g;
            akcr.b(ide, "feature");
            akcr.b(idd, "callSite");
            akcr.b(fileDescriptor, "videoFileDescriptor");
            akcr.b(list, "offsetListInMs");
            d dVar = new d();
            dVar.a = 0;
            d dVar2 = new d();
            dVar2.a = 0;
            c cVar = new c();
            cVar.a = 0;
            admg admg2 = admg;
            String idd2 = idd.toString();
            c cVar2 = cVar;
            d dVar3 = dVar2;
            d dVar4 = dVar;
            abtl abtl2 = abtl;
            Object a = ajdp.a((ajdr) new k(admg2, intValue, fileDescriptor, ide, list, cVar, dVar, dVar2, abtl, idd2, ajei));
            akcr.a(a, "Observable.create<MediaT…)\n            }\n        }");
            return admi.a(a, new l(admg2, idd2, abtl2, list, intValue, cVar2, dVar4, dVar2), new m(admg, idd2, abtl2));
        }
    }

    /* renamed from: admg$k */
    static final class k<T> implements ajdr<T> {
        final /* synthetic */ admg a;
        final /* synthetic */ int b;
        final /* synthetic */ FileDescriptor c;
        final /* synthetic */ ide d;
        final /* synthetic */ List e;
        final /* synthetic */ c f;
        final /* synthetic */ d g;
        final /* synthetic */ d h;
        final /* synthetic */ abtl i;
        final /* synthetic */ String j;
        final /* synthetic */ ajei k;

        k(admg admg, int i, FileDescriptor fileDescriptor, ide ide, List list, c cVar, d dVar, d dVar2, abtl abtl, String str, ajei ajei) {
            this.a = admg;
            this.b = i;
            this.c = fileDescriptor;
            this.d = ide;
            this.e = list;
            this.f = cVar;
            this.g = dVar;
            this.h = dVar2;
            this.i = abtl;
            this.j = str;
            this.k = ajei;
        }

        public final void subscribe(final ajdq<jwu> ajdq) {
            akcr.b(ajdq, Event.EMITTER);
            admg.a(ajdq, new akbk<ajxw>(this) {
                final /* synthetic */ k a;

                public final /* synthetic */ Object invoke() {
                    if (this.a.c.valid()) {
                        final jwa a = this.a.a.a.a(this.a.d);
                        FileDescriptor fileDescriptor = this.a.c;
                        akcr.b(fileDescriptor, "videoFileDescriptor");
                        MediaMetadataRetriever a2 = admj.a(fileDescriptor);
                        akbl 1 = new akbl<MediaMetadataRetriever, ajxw>(this) {
                            private /* synthetic */ 1 a;

                            public final /* synthetic */ Object invoke(Object obj) {
                                MediaMetadataRetriever mediaMetadataRetriever = (MediaMetadataRetriever) obj;
                                akcr.b(mediaMetadataRetriever, "mediaMetadataRetriever");
                                int i = this.a.a.b;
                                int size = this.a.a.e.size();
                                while (i < size) {
                                    long longValue = ((Number) this.a.a.e.get(i)).longValue();
                                    Object obj2 = ajdq;
                                    String str = Event.EMITTER;
                                    akcr.a(obj2, str);
                                    if (obj2.isDisposed()) {
                                        break;
                                    }
                                    long elapsedRealtime = SystemClock.elapsedRealtime();
                                    Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(1000 * longValue, 2);
                                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                    if (frameAtTime != null) {
                                        String str2;
                                        c cVar = this.a.a.f;
                                        cVar.a++;
                                        d dVar = this.a.a.g;
                                        dVar.a += elapsedRealtime2;
                                        this.a.a.h.a = abpf.a(this.a.a.h.a, elapsedRealtime2);
                                        if (this.a.a.i == null || this.a.a.i.b() >= frameAtTime.getWidth() || this.a.a.i.c() >= frameAtTime.getHeight()) {
                                            obj2 = a.a(frameAtTime, this.a.a.j);
                                            str2 = "bitmapFactory.createBitmap(bitmap, caller)";
                                        } else {
                                            abtl a = admo.a(frameAtTime.getWidth(), frameAtTime.getHeight(), this.a.a.i.b(), this.a.a.i.c());
                                            obj2 = a.a(frameAtTime, a.b(), a.c(), false, this.a.a.j);
                                            str2 = "bitmapFactory.createScal…                  caller)";
                                        }
                                        akcr.a(obj2, str2);
                                        Object obj3 = ajdq;
                                        akcr.a(obj3, str);
                                        admg.a(obj3, obj2, this.a.a.k, longValue);
                                        i++;
                                    } else {
                                        throw new RuntimeException("Null bitmap from software decoder");
                                    }
                                }
                                return ajxw.a;
                            }
                        };
                        akcr.b(a2, "receiver$0");
                        akcr.b(1, "block");
                        try {
                            1.invoke(a2);
                            ajdq.a();
                            return ajxw.a;
                        } finally {
                            a2.release();
                        }
                    } else {
                        throw new RuntimeException("invalid file descriptor");
                    }
                }
            });
        }
    }

    /* renamed from: admg$l */
    static final class l extends akcs implements akbl<Integer, ajxw> {
        private /* synthetic */ admg a;
        private /* synthetic */ String b;
        private /* synthetic */ abtl c;
        private /* synthetic */ List d;
        private /* synthetic */ int e;
        private /* synthetic */ c f;
        private /* synthetic */ d g;
        private /* synthetic */ d h;

        l(admg admg, String str, abtl abtl, List list, int i, c cVar, d dVar, d dVar2) {
            this.a = admg;
            this.b = str;
            this.c = abtl;
            this.d = list;
            this.e = i;
            this.f = cVar;
            this.g = dVar;
            this.h = dVar2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            admg.a(this.a, aami.MEDIA_METADATA_RETRIEVER, this.a.e, this.b, this.c, this.d.size() - this.e, this.f.a, this.g.a, this.h.a, ((Number) obj).intValue() == this.d.size() - this.e);
            return ajxw.a;
        }
    }

    /* renamed from: admg$m */
    static final class m extends akcs implements akbl<Throwable, ajxw> {
        private /* synthetic */ admg a;
        private /* synthetic */ String b;
        private /* synthetic */ abtl c;

        m(admg admg, String str, abtl abtl) {
            this.a = admg;
            this.b = str;
            this.c = abtl;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "e");
            admg admg = this.a;
            aami aami = aami.MEDIA_METADATA_RETRIEVER;
            admn admn = this.a.e;
            String message = th.getMessage();
            if (message == null) {
                message = "unknown";
            }
            admg.a(admg, aami, admn, message, this.b, this.c);
            return ajxw.a;
        }
    }

    /* renamed from: admg$a */
    static final class a<T> implements ajfb<jwu> {
        private /* synthetic */ c a;

        a(c cVar) {
            this.a = cVar;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            c cVar = this.a;
            cVar.a++;
        }
    }

    /* renamed from: admg$b */
    static final class b<T, R> implements ajfc<Throwable, ajdt<? extends jwu>> {
        private /* synthetic */ admg a;
        private /* synthetic */ c b;
        private /* synthetic */ akbl[] c;

        b(admg admg, c cVar, akbl[] akblArr) {
            this.a = admg;
            this.b = cVar;
            this.c = akblArr;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "error");
            String message = th.getMessage();
            boolean z = false;
            if (message == null || !akgc.a((CharSequence) message, (CharSequence) "invalid file descriptor", false)) {
                z = true;
            }
            return (ajdt) (z ? this.c[1].invoke(Integer.valueOf(this.b.a)) : ajdp.b(th));
        }
    }

    /* renamed from: admg$c */
    static final class c extends akcs implements akbl<Integer, ajxw> {
        private /* synthetic */ admg a;
        private /* synthetic */ idd b;
        private /* synthetic */ List c;

        c(admg admg, idd idd, List list) {
            this.a = admg;
            this.b = idd;
            this.c = list;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            this.a.f.c(iol.VIDEO_FRAME_RETRIEVE_OVERALL.a("callSite", admg.a(this.b.a.getName())).a("num", String.valueOf(this.c.size())).a("result", admg.a(((Number) obj).intValue() == this.c.size())), 1);
            return ajxw.a;
        }
    }

    /* renamed from: admg$d */
    static final class d extends akcs implements akbl<Throwable, ajxw> {
        private /* synthetic */ admg a;
        private /* synthetic */ idd b;
        private /* synthetic */ List c;

        d(admg admg, idd idd, List list) {
            this.a = admg;
            this.b = idd;
            this.c = list;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "it");
            String str = "num";
            this.a.f.c(iol.VIDEO_FRAME_RETRIEVE_OVERALL.a("callSite", admg.a(this.b.a.getName())).a(str, String.valueOf(this.c.size())).a("result", "failure"), 1);
            return ajxw.a;
        }
    }

    /* renamed from: admg$e */
    static final class e<T> implements ajfb<ajej> {
        private /* synthetic */ idd a;
        private /* synthetic */ a b;
        private /* synthetic */ List c;

        e(idd idd, a aVar, List list) {
            this.a = idd;
            this.b = aVar;
            this.c = list;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: admg$h */
    static final class h<T> implements ajdr<T> {
        final /* synthetic */ admg a;
        final /* synthetic */ int b;
        final /* synthetic */ FileDescriptor c;
        final /* synthetic */ ide d;
        final /* synthetic */ abtl e;
        final /* synthetic */ idd f;
        final /* synthetic */ List g;
        final /* synthetic */ d h;
        final /* synthetic */ d i;
        final /* synthetic */ ajei j;
        final /* synthetic */ c k;

        h(admg admg, int i, FileDescriptor fileDescriptor, ide ide, abtl abtl, idd idd, List list, d dVar, d dVar2, ajei ajei, c cVar) {
            this.a = admg;
            this.b = i;
            this.c = fileDescriptor;
            this.d = ide;
            this.e = abtl;
            this.f = idd;
            this.g = list;
            this.h = dVar;
            this.i = dVar2;
            this.j = ajei;
            this.k = cVar;
        }

        public final void subscribe(final ajdq<jwu> ajdq) {
            akcr.b(ajdq, Event.EMITTER);
            admg.a(ajdq, new akbk<ajxw>(this) {
                private /* synthetic */ h a;

                /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:36:0x00fd in {13, 15, 17, 19, 21, 23, 24, 26, 29, 31, 33, 35} preds:[]
                    	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
                    	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
                    	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
                    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
                    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
                    	at java.util.ArrayList.forEach(ArrayList.java:1257)
                    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
                    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
                    	at java.util.ArrayList.forEach(ArrayList.java:1257)
                    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
                    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
                    	at java.util.ArrayList.forEach(ArrayList.java:1257)
                    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:32)
                    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
                    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
                    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
                    */
                public final /* synthetic */ java.lang.Object invoke() {
                    /*
                    r18 = this;
                    r1 = r18;
                    r0 = "emitter";
                    r2 = r1.a;
                    r2 = r2.c;
                    r2 = r2.valid();
                    if (r2 == 0) goto L_0x00f3;
                    r2 = r1.a;
                    r2 = r2.a;
                    r2 = r2.a;
                    r3 = r1.a;
                    r3 = r3.d;
                    r2 = r2.a(r3);
                    r3 = r1.a;
                    r3 = r3.a;
                    r3 = r3.b;
                    r4 = r1.a;
                    r9 = r4.c;
                    r4 = r1.a;
                    r10 = r4.e;
                    r4 = r1.a;
                    r11 = r4.f;
                    r4 = "fileDescriptor";
                    defpackage.akcr.b(r9, r4);
                    r4 = "callsite";
                    defpackage.akcr.b(r11, r4);
                    r4 = new admc;
                    r6 = r3.a;
                    r7 = r3.b;
                    r8 = r3.d;
                    r12 = r3.c;
                    r5 = r4;
                    r5.<init>(r6, r7, r8, r9, r10, r11, r12);
                    r4.a();
                    r4 = (java.io.Closeable) r4;
                    r5 = r4;	 Catch:{ Throwable -> 0x00e9, all -> 0x00e5 }
                    r5 = (defpackage.admc) r5;	 Catch:{ Throwable -> 0x00e9, all -> 0x00e5 }
                    r6 = r1.a;	 Catch:{ Throwable -> 0x00e9, all -> 0x00e5 }
                    r6 = r6.b;	 Catch:{ Throwable -> 0x00e9, all -> 0x00e5 }
                    r7 = r1.a;	 Catch:{ Throwable -> 0x00e9, all -> 0x00e5 }
                    r7 = r7.g;	 Catch:{ Throwable -> 0x00e9, all -> 0x00e5 }
                    r7 = r7.size();	 Catch:{ Throwable -> 0x00e9, all -> 0x00e5 }
                    if (r6 >= r7) goto L_0x00d8;	 Catch:{ Throwable -> 0x00e9, all -> 0x00e5 }
                    r8 = r2;	 Catch:{ Throwable -> 0x00e9, all -> 0x00e5 }
                    defpackage.akcr.a(r8, r0);	 Catch:{ Throwable -> 0x00e9, all -> 0x00e5 }
                    r8 = r8.isDisposed();	 Catch:{ Throwable -> 0x00e9, all -> 0x00e5 }
                    if (r8 != 0) goto L_0x00d8;	 Catch:{ Throwable -> 0x00e9, all -> 0x00e5 }
                    r8 = r1.a;	 Catch:{ Throwable -> 0x00e9, all -> 0x00e5 }
                    r8 = r8.g;	 Catch:{ Throwable -> 0x00e9, all -> 0x00e5 }
                    r8 = r8.get(r6);	 Catch:{ Throwable -> 0x00e9, all -> 0x00e5 }
                    r8 = (java.lang.Number) r8;	 Catch:{ Throwable -> 0x00e9, all -> 0x00e5 }
                    r8 = r8.longValue();	 Catch:{ Throwable -> 0x00e9, all -> 0x00e5 }
                    r10 = android.os.SystemClock.elapsedRealtime();	 Catch:{ Throwable -> 0x00e9, all -> 0x00e5 }
                    r12 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ Throwable -> 0x00e9, all -> 0x00e5 }
                    r12 = r12 * r8;	 Catch:{ Throwable -> 0x00e9, all -> 0x00e5 }
                    r12 = r5.a(r2, r12);	 Catch:{ Throwable -> 0x00e9, all -> 0x00e5 }
                    r13 = android.os.SystemClock.elapsedRealtime();	 Catch:{ Throwable -> 0x00e9, all -> 0x00e5 }
                    r13 = r13 - r10;	 Catch:{ Throwable -> 0x00e9, all -> 0x00e5 }
                    if (r12 == 0) goto L_0x00c9;	 Catch:{ Throwable -> 0x00e9, all -> 0x00e5 }
                    r10 = r1.a;	 Catch:{ Throwable -> 0x00e9, all -> 0x00e5 }
                    r10 = r10.h;	 Catch:{ Throwable -> 0x00e9, all -> 0x00e5 }
                    r11 = r4;
                    r3 = r10.a;	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    r3 = r3 + r13;	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    r10.a = r3;	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    r3 = r1.a;	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    r3 = r3.i;	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    r4 = 2;	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    r4 = new long[r4];	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    r10 = 0;	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    r15 = r1.a;	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    r15 = r15.i;	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    r16 = r5;	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    r17 = r6;	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    r5 = r15.a;	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    r4[r10] = r5;	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    r5 = 1;	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    r4[r5] = r13;	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    r13 = defpackage.abpf.a(r4);	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    r3.a = r13;	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    r3 = r2;	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    defpackage.akcr.a(r3, r0);	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    r4 = r1.a;	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    r4 = r4.j;	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    defpackage.admg.a(r3, r12, r4, r8);	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    r3 = r1.a;	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    r3 = r3.k;	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    r4 = r3.a;	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    r4 = r4 + r5;	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    r3.a = r4;	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    r6 = r17 + 1;	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    r4 = r11;	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    r5 = r16;	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    goto L_0x005a;	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    r11 = r4;	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    r0 = new java.lang.RuntimeException;	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    r2 = "Null bitmap from hardware decoder";	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    r0.<init>(r2);	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    r0 = (java.lang.Throwable) r0;	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    throw r0;	 Catch:{ Throwable -> 0x00d6, all -> 0x00d4 }
                    r0 = move-exception;
                    goto L_0x00e7;
                    r0 = move-exception;
                    goto L_0x00eb;
                    r11 = r4;
                    r2 = 0;
                    defpackage.akax.a(r11, r2);
                    r0 = r2;
                    r0.a();
                    r0 = defpackage.ajxw.a;
                    return r0;
                    r0 = move-exception;
                    r11 = r4;
                    r2 = 0;
                    goto L_0x00ef;
                    r0 = move-exception;
                    r11 = r4;
                    r3 = r0;
                    throw r3;	 Catch:{ all -> 0x00ed }
                    r0 = move-exception;
                    r2 = r3;
                    defpackage.akax.a(r11, r2);
                    throw r0;
                    r0 = new java.lang.RuntimeException;
                    r2 = "invalid file descriptor";
                    r0.<init>(r2);
                    r0 = (java.lang.Throwable) r0;
                    throw r0;
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.admg$h$1.invoke():java.lang.Object");
                }
            });
        }
    }

    /* renamed from: admg$i */
    static final class i extends akcs implements akbl<Integer, ajxw> {
        private /* synthetic */ admg a;
        private /* synthetic */ String b;
        private /* synthetic */ abtl c;
        private /* synthetic */ List d;
        private /* synthetic */ c e;
        private /* synthetic */ d f;
        private /* synthetic */ d g;
        private /* synthetic */ int h;

        i(admg admg, String str, abtl abtl, List list, c cVar, d dVar, d dVar2, int i) {
            this.a = admg;
            this.b = str;
            this.c = abtl;
            this.d = list;
            this.e = cVar;
            this.f = dVar;
            this.g = dVar2;
            this.h = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            admg.a(this.a, aami.FRAME_FETCHER, this.a.d, this.b, this.c, this.d.size(), this.e.a, this.f.a, this.g.a, ((Number) obj).intValue() == this.d.size() - this.h);
            return ajxw.a;
        }
    }

    /* renamed from: admg$j */
    static final class j extends akcs implements akbl<Throwable, ajxw> {
        private /* synthetic */ admg a;
        private /* synthetic */ String b;
        private /* synthetic */ abtl c;

        j(admg admg, String str, abtl abtl) {
            this.a = admg;
            this.b = str;
            this.c = abtl;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "e");
            admg admg = this.a;
            aami aami = aami.FRAME_FETCHER;
            admn admn = this.a.d;
            String message = th.getMessage();
            if (message == null) {
                message = "unknown";
            }
            admg.a(admg, aami, admn, message, this.b, this.c);
            return ajxw.a;
        }
    }

    public admg(jwb jwb, adme adme, admj admj, admn admn, admn admn2, ilv ilv, adgb adgb) {
        akcr.b(jwb, "bitmapFactoryProvider");
        akcr.b(adme, "frameFetcherProvider");
        akcr.b(admj, "mediaMetadataRetrieverProvider");
        akcr.b(admn, "frameFetcherMetric");
        akcr.b(admn2, "mediaMetadataRetrieverMetric");
        akcr.b(ilv, "graphene");
        akcr.b(adgb, "compositeMediaEngineConfiguration");
        this.a = jwb;
        this.b = adme;
        this.c = admj;
        this.d = admn;
        this.e = admn2;
        this.f = ilv;
        this.g = adgb;
    }

    static String a(boolean z) {
        return z ? "success" : "partial_success";
    }

    public static final /* synthetic */ void a(admg admg, aami aami, admn admn, String str, abtl abtl, int i, int i2, long j, long j2, boolean z) {
        admg admg2 = admg;
        int i3 = i2;
        Enum enumR = aami;
        String str2 = "api";
        admg2.f.c(iol.VIDEO_FRAME_RETRIEVING.a("result", admg.a(z)).a(str2, enumR), 1);
        if (i3 != 0) {
            String str3 = "function";
            admg2.f.a(iol.VIDEO_FRAME_RETRIEVING.a(str2, enumR).a(str3, "avg"), j / ((long) i3));
            admg2.f.a(iol.VIDEO_FRAME_RETRIEVING.a(str2, enumR).a(str3, "max"), j2);
        } else {
            long j3 = j2;
        }
        Integer num = null;
        Integer valueOf = abtl != null ? Integer.valueOf(abtl.b()) : null;
        if (abtl != null) {
            num = Integer.valueOf(abtl.c());
        }
        admn.a(admn, aami, true, str, valueOf, num, i, i2, j, j2, null, RasterSource.DEFAULT_TILE_SIZE);
    }

    public static final /* synthetic */ void a(ajdq ajdq, akbk akbk) {
        try {
            akbk.invoke();
        } catch (Exception e) {
            ajdq.b(new b(e.getMessage(), e));
        }
    }

    public static final /* synthetic */ void a(ajdq ajdq, kaz kaz, ajei ajei, long j) {
        if (ajdq.isDisposed()) {
            kaz.dispose();
            return;
        }
        if (ajei != null) {
            ajei.a((ajej) kaz);
        }
        ajdq.a((Object) new jwu(kaz, (int) j));
    }

    public final ajdp<jwu> a(ide ide, idd idd, FileDescriptor fileDescriptor, List<Long> list, abtl abtl, a aVar) {
        Object a;
        String str;
        idd idd2 = idd;
        List<Long> list2 = list;
        akcr.b(ide, "feature");
        akcr.b(idd2, "callSite");
        akcr.b(fileDescriptor, "videoFileDescriptor");
        akcr.b(list2, "offsetListInMs");
        a aVar2 = aVar;
        akcr.b(aVar2, "frameRetrieverCodecStrategy");
        if (list.isEmpty()) {
            a = ajvo.a(ajot.a);
            str = "Observable.empty()";
        } else {
            akbl[] akblArr;
            a aVar3 = this.g.d() ? a.HARDWARE_FIRST : aVar2;
            c cVar = new c();
            cVar.a = 0;
            ide ide2 = ide;
            idd idd3 = idd;
            FileDescriptor fileDescriptor2 = fileDescriptor;
            List<Long> list3 = list;
            abtl abtl2 = abtl;
            akbl fVar = new f(this, ide2, idd3, fileDescriptor2, list3, abtl2, null);
            akbl gVar = new g(this, ide2, idd3, fileDescriptor2, list3, abtl2, null);
            int i = admh.a[aVar3.ordinal()];
            if (i == 1) {
                akblArr = new akbl[]{fVar, gVar};
            } else if (i == 2) {
                akblArr = new akbl[]{gVar, fVar};
            } else {
                throw new ajxk();
            }
            a = ((ajdp) akblArr[0].invoke(Integer.valueOf(0))).d((ajfb) new a(cVar)).q(new b(this, cVar, akblArr));
            akcr.a(a, "fetchers[0].invoke(0)\n  …     }\n                })");
            a = admi.a(a, new c(this, idd2, list2), new d(this, idd2, list2)).e((ajfb) new e(idd2, aVar3, list2));
            str = "fetchers[0].invoke(0)\n  …size}\")\n                }";
        }
        akcr.a(a, str);
        return a;
    }
}
