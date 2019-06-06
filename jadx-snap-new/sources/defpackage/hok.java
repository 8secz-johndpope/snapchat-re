package defpackage;

import android.net.Uri;
import android.os.PatternMatcher;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.hoq.b;
import defpackage.hoq.c;
import defpackage.hoq.d;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: hok */
public final class hok implements hol {
    private static final List<PatternMatcher> c;
    final List<hol> a;
    private final hoq b;

    /* renamed from: hok$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: hok$b */
    static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ hok a;

        b(hok hok) {
            this.a = hok;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0041 in {5, 6, 10, 12} preds:[]
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
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r4) {
            /*
            r3 = this;
            r4 = (android.net.Uri) r4;
            r0 = "resolved";
            defpackage.akcr.b(r4, r0);
            r0 = r3.a;
            r0 = r0.a;
            r0 = (java.lang.Iterable) r0;
            r0 = r0.iterator();
            r1 = r0.hasNext();
            if (r1 == 0) goto L_0x0025;
            r1 = r0.next();
            r2 = r1;
            r2 = (defpackage.hol) r2;
            r2 = r2.a(r4);
            if (r2 == 0) goto L_0x0011;
            goto L_0x0026;
            r1 = 0;
            r1 = (defpackage.hol) r1;
            if (r1 == 0) goto L_0x002f;
            r4 = r1.b(r4);
            return r4;
            r0 = new java.lang.IllegalStateException;
            r4 = java.lang.String.valueOf(r4);
            r1 = "No providers can handle ";
            r4 = r1.concat(r4);
            r0.<init>(r4);
            r0 = (java.lang.Throwable) r0;
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.hok$b.apply(java.lang.Object):java.lang.Object");
        }
    }

    static {
        a aVar = new a();
        PatternMatcher[] patternMatcherArr = new PatternMatcher[2];
        Object toLowerCase = "http://www.snapchat.com/discover/.*".toLowerCase();
        String str = "(this as java.lang.String).toLowerCase()";
        akcr.a(toLowerCase, str);
        patternMatcherArr[0] = new PatternMatcher(toLowerCase, 2);
        Object toLowerCase2 = "https://www.snapchat.com/discover/.*".toLowerCase();
        akcr.a(toLowerCase2, str);
        patternMatcherArr[1] = new PatternMatcher(toLowerCase2, 2);
        c = ajym.b((Object[]) patternMatcherArr);
    }

    public hok(hoq hoq, hop hop, hoo hoo) {
        akcr.b(hoq, "snapDeepLinkClient");
        akcr.b(hop, "showProfileNavigableProvider");
        akcr.b(hoo, "publisherProfileNavigableProvider");
        this.b = hoq;
        this.a = ajym.b((Object[]) new hol[]{hop, hoo});
    }

    public final int a() {
        return 1;
    }

    public final boolean a(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        Iterable<PatternMatcher> iterable = c;
        if (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty())) {
            for (PatternMatcher patternMatcher : iterable) {
                Object uri2 = uri.toString();
                akcr.a(uri2, "uri.toString()");
                if (uri2 != null) {
                    uri2 = uri2.toLowerCase();
                    akcr.a(uri2, "(this as java.lang.String).toLowerCase()");
                    if (patternMatcher.match(uri2)) {
                        return true;
                    }
                }
                throw new ajxt("null cannot be cast to non-null type java.lang.String");
            }
        }
        return false;
    }

    public final ajdx<acig<zjm, zjk>> b(Uri uri) {
        Object b;
        String str = MessageMediaRefModel.URI;
        akcr.b(uri, str);
        hoq hoq = this.b;
        akcr.b(uri, str);
        String path = uri.getPath();
        if (path == null) {
            b = ajdx.b((Throwable) new IllegalArgumentException("URI path must not be null"));
            str = "Single.error(IllegalArgu… path must not be null\"))";
        } else {
            b = ajdx.c((Callable) new hor(new b(hoq.c))).b((ajdw) ((zfw) hoq.a.b()).h()).a((ajfc) new c(hoq, path)).f(d.a);
            str = "Single.fromCallable(http…link\"))\n                }";
        }
        akcr.a(b, str);
        b = b.a((ajfc) new b(this));
        akcr.a(b, "snapDeepLinkClient\n     …solved)\n                }");
        return b;
    }
}
