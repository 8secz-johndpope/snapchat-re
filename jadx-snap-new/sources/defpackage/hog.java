package defpackage;

import com.snap.core.db.column.FeatureType;
import java.util.List;

/* renamed from: hog */
public final class hog {
    final FeatureType a = FeatureType.DISCOVER_FEED;
    final zfw b;
    final hoh c;
    final hge d;
    final gwd e;

    /* renamed from: hog$a */
    static final class a<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ hog a;
        private /* synthetic */ String b;
        private /* synthetic */ vii c;

        /* renamed from: hog$a$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "it");
                return Long.valueOf(((gwu) list.get(0)).b);
            }
        }

        a(hog hog, String str, vii vii) {
            this.a = hog;
            this.b = str;
            this.c = vii;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (Long) obj;
            akcr.b(obj, "cachedStoryRowId");
            if (obj.longValue() >= 0) {
                return ajdx.b(obj);
            }
            gwd gwd = this.a.e;
            String str = this.b;
            Object h = this.c.h();
            akcr.a(h, "card.publisherStoryCard");
            return gwd.a(ajzl.a(ajxs.a(str, defpackage.gwr.a.a(str, h))), this.a.a).f(1.a);
        }
    }

    /* renamed from: hog$b */
    static final class b<T> implements ajfb<Long> {
        private /* synthetic */ hog a;
        private /* synthetic */ vii b;
        private /* synthetic */ String c;
        private /* synthetic */ vhr d;

        b(hog hog, vii vii, String str, vhr vhr) {
            this.a = hog;
            this.b = vii;
            this.c = str;
            this.d = vhr;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Long) obj;
            hge hge = this.a.d;
            akcr.a(obj, "storyRowId");
            long longValue = obj.longValue();
            vii vii = this.b;
            String str = this.c;
            Long valueOf = Long.valueOf(this.d.d());
            akcr.b(vii, "publisherStoryCard");
            akcr.b(str, "cardItemId");
            hjx hjx = (hjx) hge.b.get(Long.valueOf(longValue));
            if (valueOf != null) {
                long longValue2 = valueOf.longValue();
                Object obj2 = 1;
                if (hjx != null) {
                    hbj d = hjx.a().d();
                    if (d == null || hgf.a[d.ordinal()] != 1) {
                        throw new ajxl("DF deeplink only supports publisher story/snaps for now!");
                    }
                    if (String.valueOf(longValue2).equals(((hjf) hjx.c()).W())) {
                        obj2 = null;
                    }
                }
                if (obj2 == null) {
                    return;
                }
            }
            hjx a = ((hpg) hge.a.b()).a(vii, str, "", false, "", hje.f, valueOf != null ? String.valueOf(valueOf.longValue()) : null);
            if (a != null) {
                akcr.b(a, "clientModel");
                hge.b.put(Long.valueOf(longValue), a);
            }
        }
    }

    /* renamed from: hog$c */
    static final class c<T, R> implements ajfc<T, R> {
        private /* synthetic */ hog a;
        private /* synthetic */ String b;
        private /* synthetic */ String c;

        c(hog hog, String str, String str2) {
            this.a = hog;
            this.b = str;
            this.c = str2;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0072 in {5, 6, 10, 12} preds:[]
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
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r5) {
            /*
            r4 = this;
            r5 = (defpackage.agmh) r5;
            r0 = "it";
            defpackage.akcr.b(r5, r0);
            r0 = r5.f;
            r0 = r0.a;
            r1 = "it.channelList.channels";
            defpackage.akcr.a(r0, r1);
            r0 = (java.lang.Iterable) r0;
            r0 = r0.iterator();
            r1 = r0.hasNext();
            if (r1 == 0) goto L_0x002e;
            r1 = r0.next();
            r2 = r1;
            r2 = (defpackage.agll) r2;
            r2 = r2.e;
            r3 = r4.b;
            r2 = r2.equals(r3);
            if (r2 == 0) goto L_0x0016;
            goto L_0x002f;
            r1 = 0;
            r1 = (defpackage.agll) r1;
            if (r1 == 0) goto L_0x0047;
            r5 = r5.g;
            r0 = "it.chunk";
            defpackage.akcr.a(r5, r0);
            r0 = defpackage.hog.a(r1);
            r5 = defpackage.hog.a(r5, r0);
            r5 = defpackage.ajxs.a(r1, r5);
            return r5;
            r5 = new java.lang.StringBuilder;
            r0 = "Cannot find deeplinked channel [name=";
            r5.<init>(r0);
            r0 = r4.b;
            r5.append(r0);
            r0 = ", editionId=";
            r5.append(r0);
            r0 = r4.c;
            r5.append(r0);
            r0 = 93;
            r5.append(r0);
            r5 = r5.toString();
            r0 = new java.lang.IllegalStateException;
            r5 = r5.toString();
            r0.<init>(r5);
            r0 = (java.lang.Throwable) r0;
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.hog$c.apply(java.lang.Object):java.lang.Object");
        }
    }

    public hog(ajwy<zgb> ajwy, hoh hoh, hge hge, gwd gwd) {
        akcr.b(ajwy, "schedulersProvider");
        akcr.b(hoh, "deeplinkValidator");
        akcr.b(hge, "deepLinkStoryCache");
        akcr.b(gwd, "publisherStorySnapMediaRepository");
        this.c = hoh;
        this.d = hge;
        this.e = gwd;
        ajwy.get();
        this.b = zgb.a(hbn.f, "DiscoverFeedDeepLinkStoryProcessor");
    }

    static vhr a(agly agly, vhv vhv) {
        vhr vhr = new vhr();
        String str = agly.c;
        if (str == null) {
            str = hiz.REGULAR.name();
        }
        vhr.c(str);
        Object obj = agly.b;
        akcr.a(obj, "response.dsnapId");
        vhr.a(obj.longValue());
        vhr.e = vhv;
        Integer num = agly.f;
        obj = 1;
        if (num != null && num.intValue() == 1) {
            obj = null;
        }
        if (obj == null) {
            num = null;
        }
        if (num != null) {
            num.intValue();
            vhr.b(agly.d);
        }
        String str2 = agly.a;
        if (str2 != null) {
            vhr.a(str2);
        }
        str2 = agly.e;
        if (str2 != null) {
            agly.e = str2;
        }
        return vhr;
    }

    static vhv a(agll agll) {
        vhv vhv = new vhv();
        vhv.a(agll.e);
        return vhv;
    }
}
