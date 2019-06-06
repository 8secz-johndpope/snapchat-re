package defpackage;

import android.net.Uri;
import com.google.common.base.Optional;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.ghx.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@ftr(a = "memories_playback")
/* renamed from: pfa */
public final class pfa extends ggm {
    final ajxe a;
    final pew b;
    final gel c;
    final rzx d;
    final pkh e;
    final pep f;
    private final pfi g;
    private final pez h;
    private final pfd i;

    /* renamed from: pfa$a */
    static final class a<T1, T2, T3, T4, R> implements ajfe<pem, pem, Optional<pem>, pem, gej> {
        private /* synthetic */ pfa a;
        private /* synthetic */ List b;
        private /* synthetic */ Uri c;

        a(pfa pfa, List list, Uri uri) {
            this.a = pfa;
            this.b = list;
            this.c = uri;
        }

        /* JADX WARNING: Missing block: B:19:0x009a, code skipped:
            if (r10.a() != false) goto L_0x009e;
     */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
            /*
            r7 = this;
            r8 = (defpackage.pem) r8;
            r9 = (defpackage.pem) r9;
            r10 = (com.google.common.base.Optional) r10;
            r11 = (defpackage.pem) r11;
            r0 = "edits";
            defpackage.akcr.b(r8, r0);
            r0 = "media";
            defpackage.akcr.b(r9, r0);
            r0 = "overlay";
            defpackage.akcr.b(r10, r0);
            r0 = "thumbnail";
            defpackage.akcr.b(r11, r0);
            r0 = 2;
            r1 = new defpackage.pem[r0];
            r2 = 0;
            r1[r2] = r8;
            r3 = 1;
            r1[r3] = r9;
            r1 = defpackage.ajym.b(r1);
            r1 = (java.lang.Iterable) r1;
            r1 = r1.iterator();
        L_0x002f:
            r4 = r1.hasNext();
            r5 = 0;
            if (r4 == 0) goto L_0x0061;
        L_0x0036:
            r4 = r1.next();
            r4 = (defpackage.pem) r4;
            r6 = r4 instanceof defpackage.pek;
            if (r6 == 0) goto L_0x002f;
        L_0x0040:
            r8 = r7.b;
            r8 = (java.lang.Iterable) r8;
            r8 = r8.iterator();
        L_0x0048:
            r9 = r8.hasNext();
            if (r9 == 0) goto L_0x0058;
        L_0x004e:
            r9 = r8.next();
            r9 = (defpackage.gej) r9;
            r9.close();
            goto L_0x0048;
        L_0x0058:
            r4 = (defpackage.pek) r4;
            r8 = r4.a;
            r8 = defpackage.ghx.a.a(r8, r5);
            return r8;
        L_0x0061:
            r1 = 4;
            r1 = new defpackage.pem[r1];
            r1[r2] = r8;
            r1[r3] = r9;
            r8 = r10.orNull();
            r8 = (defpackage.pem) r8;
            r1[r0] = r8;
            r8 = 3;
            r1[r8] = r11;
            r8 = defpackage.ajym.b(r1);
            r8 = (java.lang.Iterable) r8;
            r9 = new java.util.ArrayList;
            r9.<init>();
            r9 = (java.util.Collection) r9;
            r8 = r8.iterator();
        L_0x0084:
            r10 = r8.hasNext();
            if (r10 == 0) goto L_0x00a4;
        L_0x008a:
            r10 = r8.next();
            r10 = (defpackage.pem) r10;
            if (r10 == 0) goto L_0x009d;
        L_0x0092:
            r10 = r10.b;
            if (r10 == 0) goto L_0x009d;
        L_0x0096:
            r11 = r10.a();
            if (r11 == 0) goto L_0x009d;
        L_0x009c:
            goto L_0x009e;
        L_0x009d:
            r10 = r5;
        L_0x009e:
            if (r10 == 0) goto L_0x0084;
        L_0x00a0:
            r9.add(r10);
            goto L_0x0084;
        L_0x00a4:
            r9 = (java.util.List) r9;
            r8 = r7.a;
            r8 = r8.c;
            r9 = (java.lang.Iterable) r9;
            r10 = r7.c;
            r10 = r10.toString();
            r11 = "uri.toString()";
            defpackage.akcr.a(r10, r11);
            r8 = r8.a(r9, r10);
            return r8;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.pfa$a.apply(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: pfa$b */
    static final class b<T> implements ajfb<Throwable> {
        private /* synthetic */ List a;

        b(List list) {
            this.a = list;
        }

        public final /* synthetic */ void accept(Object obj) {
            for (gej close : this.a) {
                close.close();
            }
        }
    }

    /* renamed from: pfa$c */
    static final class c<T> implements ajfb<gej> {
        private /* synthetic */ List a;

        c(List list) {
            this.a = list;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (gej) obj;
            List list = this.a;
            akcr.a(obj, "it");
            list.add(obj);
        }
    }

    /* renamed from: pfa$d */
    static final class d<T, R> implements ajfc<T, R> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            pem pem = (pem) obj;
            akcr.b(pem, "it");
            return pem.b;
        }
    }

    /* renamed from: pfa$e */
    static final class e<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ pfa a;
        final /* synthetic */ gcp b;
        private /* synthetic */ Set c;

        e(pfa pfa, Set set, gcp gcp) {
            this.a = pfa;
            this.c = set;
            this.b = gcp;
        }

        public final /* synthetic */ Object apply(Object obj) {
            gej gej = (gej) obj;
            akcr.b(gej, "it");
            final Object hashSet = new HashSet(this.c);
            return (gej.a() && this.b.a()) ? this.a.f.a(gej).b((ajdw) ((zfw) this.a.a.b()).b()).f(new ajfc<T, R>(this) {
                private /* synthetic */ e a;

                public final /* synthetic */ Object apply(Object obj) {
                    abyy abyy = (abyy) obj;
                    akcr.b(abyy, "edits");
                    if (this.a.a.e.a(this.a.b, abyy)) {
                        hashSet.add(gdy.READ_CACHE_ONLY);
                    }
                    return hashSet;
                }
            }).c(hashSet) : ajdx.b(hashSet);
        }
    }

    /* renamed from: pfa$f */
    static final class f<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ List a;
        private /* synthetic */ pfa b;
        private /* synthetic */ String c;
        private /* synthetic */ Set d;
        private /* synthetic */ boolean e;

        /* renamed from: pfa$f$1 */
        static final class 1<T> implements ajfb<gej> {
            private /* synthetic */ f a;

            1(f fVar) {
                this.a = fVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                obj = (gej) obj;
                List list = this.a.a;
                akcr.a(obj, "result");
                list.add(obj);
            }
        }

        f(pfa pfa, String str, Set set, boolean z, List list) {
            this.b = pfa;
            this.c = str;
            this.d = set;
            this.e = z;
            this.a = list;
        }

        public final /* synthetic */ Object apply(Object obj) {
            HashSet hashSet = (HashSet) obj;
            akcr.b(hashSet, "it");
            obj = this.b.b.a(pfa.a(this.c, oyc.MEDIA), this.d, this.e, (Set) hashSet).c((ajfb) new 1(this));
            akcr.a(obj, "memoriesMediaUriHandler.… -> results.add(result) }");
            return pfq.a(obj, "MemoriesMediaUriHandler", this.b.d);
        }
    }

    /* renamed from: pfa$g */
    static final class g<T> implements ajfb<gej> {
        private /* synthetic */ List a;

        g(List list) {
            this.a = list;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (gej) obj;
            List list = this.a;
            akcr.a(obj, "it");
            list.add(obj);
        }
    }

    /* renamed from: pfa$h */
    static final class h<T, R> implements ajfc<T, R> {
        public static final h a = new h();

        h() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            pem pem = (pem) obj;
            akcr.b(pem, "it");
            return Optional.of(pem);
        }
    }

    /* renamed from: pfa$i */
    static final class i<T> implements ajfb<gej> {
        private /* synthetic */ List a;

        i(List list) {
            this.a = list;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (gej) obj;
            List list = this.a;
            akcr.a(obj, "it");
            list.add(obj);
        }
    }

    /* renamed from: pfa$j */
    static final class j extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;
        private /* synthetic */ oiy b;

        j(zgb zgb, oiy oiy) {
            this.a = zgb;
            this.b = oiy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(this.b.callsite("MemoriesPlaybackUriHandler"));
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(pfa.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
    }

    public pfa(zgb zgb, oiy oiy, pfi pfi, pew pew, pez pez, pfd pfd, gel gel, rzx rzx, pkh pkh, pep pep) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(oiy, "attributedFeature");
        akcr.b(pfi, "memoriesThumbnailUriHandler");
        akcr.b(pew, "memoriesMediaUriHandler");
        akcr.b(pez, "memoriesOverlayBlobUriHandler");
        akcr.b(pfd, "memoriesSnapEditsUriHandler");
        akcr.b(gel, "contentResultFactory");
        akcr.b(rzx, "noNetworkDetector");
        akcr.b(pkh, "streamingHelper");
        akcr.b(pep, "editsContentResultUtils");
        this.g = pfi;
        this.b = pew;
        this.h = pez;
        this.i = pfd;
        this.c = gel;
        this.d = rzx;
        this.e = pkh;
        this.f = pep;
        this.a = ajxh.a(new j(zgb, oiy));
    }

    private static ajdx<gej> a(String str) {
        Object b = ajdx.b(a.a((Throwable) new IllegalArgumentException(str), null));
        akcr.a(b, "Single.just(FailedConten…ption(message)\n        ))");
        return b;
    }

    public static Uri a(String str, oyc oyc) {
        akcr.b(str, "snapId");
        akcr.b(oyc, "fileType");
        switch (pfb.a[oyc.ordinal()]) {
            case 1:
                return pnj.a(str, false);
            case 2:
                return pnj.e(str);
            case 3:
                return pnj.b(str);
            case 4:
                return pnj.d(str);
            case 5:
            case 6:
                throw new IllegalStateException("Unrecognized file type used for MemoriesPlaybackUriHandler");
            default:
                throw new ajxk();
        }
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        Uri uri2 = uri;
        Set<rzg> set3 = set;
        boolean z2 = z;
        Set<? extends gdy> set4 = set2;
        String str = MessageMediaRefModel.URI;
        akcr.b(uri2, str);
        String str2 = "schedulingContexts";
        akcr.b(set3, str2);
        String str3 = "cacheAccessControls";
        akcr.b(set4, str3);
        String queryParameter = uri2.getQueryParameter("ID");
        if (queryParameter == null) {
            return pfa.a("missing ID");
        }
        String queryParameter2 = uri2.getQueryParameter("SNAP_TYPE");
        if (queryParameter2 != null) {
            gcp a = gcp.a.a(queryParameter2);
            if (a != null) {
                Object c;
                boolean booleanQueryParameter = uri2.getBooleanQueryParameter("HAS_OVERLAY_IMAGE", false);
                akcr.b(uri2, str);
                akcr.b(queryParameter, "snapId");
                akcr.b(a, "snapType");
                akcr.b(set3, str2);
                akcr.b(set4, str3);
                List arrayList = new ArrayList();
                Object c2 = this.i.a(pfa.a(queryParameter, oyc.OVERLAY_METADATA), (Set) set3, z2, (Set) set4).c((ajfb) new c(arrayList));
                akcr.a(c2, "memoriesSnapEditsUriHand…ccess { results.add(it) }");
                ajdx a2 = pfq.a(c2, "MemoriesSnapEditsUriHandler", this.d).a();
                c2 = a2.f(d.a).a((ajfc) new e(this, set4, a)).a((ajfc) new f(this, queryParameter, set, z, arrayList));
                akcr.a(c2, "editsContentResult\n     …tector)\n                }");
                if (booleanQueryParameter) {
                    c = this.h.a(pfa.a(queryParameter, oyc.OVERLAY), (Set) set3, z2, (Set) set4).c((ajfb) new g(arrayList));
                    akcr.a(c, "memoriesOverlayBlobUriHa…ccess { results.add(it) }");
                    c = pfq.a(c).f(h.a);
                } else {
                    c = ajdx.b(Optional.absent());
                }
                akcr.a(c, "if (hasOverlayImage) {\n …ional.absent())\n        }");
                Object c3 = this.g.a(pfa.a(queryParameter, oyc.THUMBNAIL), (Set) set3, z2, (Set) set4).c((ajfb) new i(arrayList));
                akcr.a(c3, "memoriesThumbnailUriHand…ccess { results.add(it) }");
                ajdx d = ajdx.a(a2, (ajeb) c2, (ajeb) c, pfq.a(c3), new a(this, arrayList, uri2)).d((ajfb) new b(arrayList));
                akcr.a((Object) d, "Single.zip(\n            …ose() }\n                }");
                return gem.a(d, z2);
            }
        }
        return pfa.a("missing snap type");
    }
}
