package defpackage;

import android.net.Uri;
import com.google.common.base.Supplier;
import defpackage.leq.a;
import defpackage.miq.d;
import java.util.Map;

/* renamed from: ldv */
final class ldv {

    /* renamed from: ldv$a */
    static final class a extends akcs implements akbl<defpackage.miq.d.a, Uri> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            defpackage.miq.d.a aVar = (defpackage.miq.d.a) obj;
            akcr.b(aVar, "it");
            String a = defpackage.gfr.a.a();
            akcr.b(aVar, "receiver$0");
            akcr.b(a, "authority");
            obj = Uri.parse(defpackage.miq.d.a.a(mir.a(a), aVar.b).a());
            akcr.a(obj, "it.withAuthority(SnapCon…RITY).uri.let(Uri::parse)");
            return obj;
        }
    }

    /* renamed from: ldv$b */
    static final class b extends akcs implements akbw<gfu, ide, leq> {
        private /* synthetic */ kqf a;
        private /* synthetic */ lci b;
        private /* synthetic */ zgb c;

        b(kqf kqf, lci lci, zgb zgb) {
            this.a = kqf;
            this.b = lci;
            this.c = zgb;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            lce lce;
            gfu gfu = (gfu) obj;
            ide ide = (ide) obj2;
            akcr.b(gfu, "snapContentResolver");
            akcr.b(ide, "attributedFeature");
            kqf kqf = this.a;
            if (kqf != null) {
                lce lce2 = new lce(gfu, this.b, zgb.a(ide.callsite("ResourceDownloadAnalyticsReporter")), kqf, ide);
            } else {
                lce = a.a;
            }
            return lce;
        }
    }

    /* renamed from: ldv$c */
    static final class c extends akcs implements akbk<lcn> {
        private /* synthetic */ Supplier a;
        private /* synthetic */ ide b;
        private /* synthetic */ zgb c;
        private /* synthetic */ akbl d;

        c(Supplier supplier, ide ide, zgb zgb, akbl akbl) {
            this.a = supplier;
            this.b = ide;
            this.c = zgb;
            this.d = akbl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object obj = this.a.get();
            akcr.a(obj, "snapContentResolver.get()");
            String str = "ResourceResolverFactory";
            return new lcn((gfu) obj, this.b.getAttributionFor(str), zgb.a(this.b.callsite(str)), this.d);
        }
    }

    static {
        new aken[1][0] = new akda(akde.a(ldv.class), "resourceResolverFactory", "<v#0>");
        ldv ldv = new ldv();
    }

    private ldv() {
    }

    public static final akbl<moc, ajdw> a(zfw zfw) {
        akcr.b(zfw, "qualifiedSchedulers");
        return new lco(zfw);
    }

    public static final akbw<gfu, ide, leq> a(kqf kqf, lci lci, zgb zgb) {
        akcr.b(lci, "uriBuilder");
        akcr.b(zgb, "schedulersProvider");
        return new b(kqf, lci, zgb);
    }

    public static final lci a() {
        return new lct();
    }

    public static final lci a(Map<String, lci> map) {
        akcr.b(map, "builderMap");
        return new lcd(map);
    }

    public static final lci a(lcq lcq) {
        akcr.b(lcq, "encryptionRegistry");
        return new lfa(lcq);
    }

    public static final mof a(Supplier<gfu> supplier, zgb zgb, akbl<d.a, Uri> akbl, ide ide) {
        akcr.b(supplier, "snapContentResolver");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(akbl, "contentUriTransformer");
        akcr.b(ide, "attributedFeature");
        return (mof) ajxh.a(new c(supplier, ide, zgb, akbl)).b();
    }

    public static final mok<moc> a(zfw zfw, ide ide, lci lci, Supplier<gfu> supplier, akbl<moc, ajdw> akbl, sah sah, akbw<gfu, ide, leq> akbw) {
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(ide, "attributedFeature");
        akcr.b(lci, "contentUriBuilder");
        akcr.b(supplier, "snapContentResolver");
        akcr.b(akbl, "resourceSchedulerResolver");
        akcr.b(sah, "noNetworkExponentialBackOffController");
        akcr.b(akbw, "resourceDownloadAnalyticsReporterFactory");
        return new lbw(new lcf(lci, supplier, akbl, sah, zfw, ide, akbw));
    }

    public static final zfw a(zgb zgb, ide ide) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ide, "attributedFeature");
        return zgb.a(ide.callsite("ContentManagerUriResolver"));
    }

    public static final lci b() {
        return new lcz();
    }

    public static final lci c() {
        return new lcw();
    }

    public static final lci d() {
        return new lev();
    }

    public static final lci e() {
        return new lcl();
    }

    public static final lci f() {
        return new lca();
    }

    public static final lci g() {
        return new lby();
    }
}
