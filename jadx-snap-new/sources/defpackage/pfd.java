package defpackage;

import android.net.Uri;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.abyy.a;
import defpackage.ovh.d;
import defpackage.ovh.k;
import defpackage.pij.b;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.lang.reflect.Type;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

@ftr(a = "memories_metadata_path")
/* renamed from: pfd */
public final class pfd extends pef {
    final pfc i;
    final pij j;
    final oms k;
    final ajdx<iha> l;
    private final String m = "MemoriesSnapEditsUriHandler";
    private final String n = ".edits";
    private final boolean o = true;
    private final ovh p;

    /* renamed from: pfd$a */
    static final class a<V> implements Callable<T> {
        private /* synthetic */ pfd a;
        private /* synthetic */ oqr b;
        private /* synthetic */ Set c;
        private /* synthetic */ Set d;

        a(pfd pfd, oqr oqr, Set set, Set set2) {
            this.a = pfd;
            this.b = oqr;
            this.c = set;
            this.d = set2;
        }

        public final /* synthetic */ Object call() {
            String b = this.a.b(this.b);
            geo geo = this.a.i;
            Set set = this.c;
            pfd pfd = this.a;
            ajdx a = pfd.j.a(ajyl.a(this.b.b), b.OVERLAY_METADATA).a((ajfc) new c(pfd)).a((ajfc) d.a);
            akcr.a((Object) a, "snapMetadataDownloader\n …ose() }\n                }");
            return new gew(b, null, gem.a(a, "edits"), this.a.a(this.b), geo, set, this.d, 260);
        }
    }

    /* renamed from: pfd$c */
    static final class c<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ pfd a;

        c(pfd pfd) {
            this.a = pfd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            agtt agtt = (agtt) obj;
            akcr.b(agtt, "it");
            obj = agtt.a;
            akcr.a(obj, "it.snaps");
            obj = (agtc) ajyu.f((List) obj);
            akcr.a(obj, "serverSnap");
            if (obj.f() == agvr.SERVICE_OK) {
                pfd pfd = this.a;
                oms oms = pfd.k;
                String str = obj.f;
                Object obj2 = obj.Q;
                akcr.a(obj2, "serverSnap.gzippedOverlay");
                boolean booleanValue = obj2.booleanValue();
                obj = obj.a;
                akcr.a(obj, "serverSnap.snapId");
                obj = oms.a(str, booleanValue, obj).a((ajfc) new e(pfd));
                akcr.a(obj, "editsConverter\n         …      }\n                }");
                return obj;
            }
            StringBuilder stringBuilder = new StringBuilder("[downloadEdits] error from server: ");
            stringBuilder.append(obj.F);
            throw new pfj(stringBuilder.toString(), 2);
        }
    }

    /* renamed from: pfd$d */
    static final class d<T, R> implements ajfc<T, ajeb<? extends R>> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "it");
            final Object byteArrayInputStream = new ByteArrayInputStream(str.getBytes(akky.a(Charset.defaultCharset())));
            return ajdx.b(byteArrayInputStream).c((ajev) new ajev() {
                public final void run() {
                    byteArrayInputStream.close();
                }
            });
        }
    }

    /* renamed from: pfd$e */
    static final class e<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ pfd a;

        e(pfd pfd) {
            this.a = pfd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final a aVar = (a) obj;
            akcr.b(aVar, "builder");
            return this.a.l.f(new ajfc<T, R>() {
                public final /* synthetic */ Object apply(Object obj) {
                    iha iha = (iha) obj;
                    akcr.b(iha, "it");
                    return iha.a(aVar.a(), (Type) abyy.class);
                }
            });
        }
    }

    /* renamed from: pfd$b */
    static final class b extends akcs implements akbw<idd, odx, odp> {
        public static final b a = new b();

        b() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            odx odx = (odx) obj2;
            akcr.b((idd) obj, "<anonymous parameter 0>");
            akcr.b(odx, "reader");
            FileInputStream d = odx.d();
            Long l = null;
            Supplier ofInstance = d != null ? Suppliers.ofInstance(d) : null;
            d = odx.d();
            if (d != null) {
                FileChannel channel = d.getChannel();
                if (channel != null) {
                    l = Long.valueOf(channel.size());
                }
            }
            return new odp("edits", ofInstance, null, l, 4);
        }
    }

    public pfd(Uri uri, gee gee, pfc pfc, gel gel, oiy oiy, ygi ygi, odu odu, zgb zgb, pij pij, owc owc, pfl pfl, ovh ovh, oms oms, ajdx<iha> ajdx, ajwy<gqr> ajwy) {
        pfc pfc2 = pfc;
        pij pij2 = pij;
        ovh ovh2 = ovh;
        oms oms2 = oms;
        ajdx<iha> ajdx2 = ajdx;
        Uri uri2 = uri;
        akcr.b(uri2, "baseUrl");
        gee gee2 = gee;
        akcr.b(gee2, "contentManager");
        akcr.b(pfc2, "memoriesEditsContentType");
        gel gel2 = gel;
        akcr.b(gel2, "contentResultFactory");
        oiy oiy2 = oiy;
        akcr.b(oiy2, "attributedFeature");
        ygi ygi2 = ygi;
        akcr.b(ygi2, "fileManager");
        odu odu2 = odu;
        akcr.b(odu2, "mediaPackageManager");
        zgb zgb2 = zgb;
        akcr.b(zgb2, "schedulersProvider");
        akcr.b(pij2, "snapMetadataDownloader");
        akcr.b(owc, "uploadSessionsRepository");
        akcr.b(pfl, "uriHandlerAnalytics");
        akcr.b(ovh2, "downloadRepository");
        akcr.b(oms2, "editsConverter");
        akcr.b(ajdx2, "serializationHelper");
        ajwy<gqr> ajwy2 = ajwy;
        akcr.b(ajwy2, "exceptionTrackerProvider");
        super(uri2, gee2, pfc2, gel2, oiy2, ygi2, odu2, zgb2, pij, owc, pfl, ajwy2);
        this.i = pfc2;
        this.j = pij2;
        this.p = ovh;
        this.k = oms;
        this.l = ajdx;
    }

    public final ajdj<oqr> a(String str) {
        akcr.b(str, "id");
        ovh ovh = this.p;
        akcr.b(str, "snapId");
        Object b = ajdj.b((Callable) new k(ovh, str)).b((ajdw) ovh.c().i());
        akcr.a(b, "Maybe.fromCallable<Strin…eOn(schedulers.queries())");
        b = b.f(d.a);
        akcr.a(b, "getSourceSnapId(snapId)\n…      )\n                }");
        return b;
    }

    public final ajdx<gej> a(Uri uri, abyi abyi, orl orl, boolean z) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(abyi, "mediaPackage");
        akcr.b(orl, "uploadSession");
        return a(abyi, uri, b.a);
    }

    /* Access modifiers changed, original: protected|final */
    public final ajdx<geg> a(oqr oqr, Set<rzg> set, gfl gfl, Set<? extends gdy> set2) {
        akcr.b(oqr, "requestInfo");
        akcr.b(set, "schedulingContexts");
        akcr.b(gfl, "payloadProcessor");
        akcr.b(set2, "cacheAccessControls");
        Object c = ajdx.c((Callable) new a(this, oqr, set, set2));
        akcr.a(c, "Single.fromCallable {\n  …s\n            )\n        }");
        return c;
    }

    public final gfl a(oqr oqr) {
        akcr.b(oqr, "requestInfo");
        return gii.a("edits");
    }

    /* Access modifiers changed, original: protected|final */
    public final String c() {
        return this.m;
    }

    /* Access modifiers changed, original: protected|final */
    public final String d() {
        return this.n;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean e() {
        return true;
    }

    public final gfl f() {
        return gii.a("edits");
    }
}
