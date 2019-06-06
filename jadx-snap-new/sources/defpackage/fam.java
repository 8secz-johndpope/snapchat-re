package defpackage;

import android.os.Build;
import android.util.Base64;
import com.google.protobuf.nano.MessageNano;
import java.util.Locale;

/* renamed from: fam */
public final class fam implements eze {
    final aipn<eys> a;
    final aipn<iet> b;
    private final zfw c = zgb.a(eym.f, "CognacUserContextServiceImpl");
    private final aipn<gpb> d;

    /* renamed from: fam$a */
    static final class a<T> implements ajfl<abkq> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            abkq abkq = (abkq) obj;
            akcr.b(abkq, "it");
            CharSequence charSequence = abkq.a;
            obj = (charSequence == null || charSequence.length() == 0) ? 1 : null;
            return obj == null;
        }
    }

    /* renamed from: fam$b */
    static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            abkq abkq = (abkq) obj;
            akcr.b(abkq, "it");
            return abkq.a;
        }
    }

    /* renamed from: fam$c */
    static final class c<T, R> implements ajfc<T, R> {
        private /* synthetic */ fam a;

        c(fam fam) {
            this.a = fam;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "userId");
            Object obj2 = this.a.a.get();
            akcr.a(obj2, "locationFetcher.get()");
            String a = ((eys) obj2).a();
            ies a2 = ((iet) this.a.b.get()).a();
            acea a3 = new acea().c(Locale.getDefault().toString()).a(str);
            if (a != null) {
                a3.b(a);
            }
            acdy a4 = new acdy().a().a(Build.MODEL);
            if (a2 != null) {
                a4.a = new acdz().a(a2.a).b(a2.b).c(a2.c);
                a3.a = a4;
            }
            return Base64.encodeToString(MessageNano.toByteArray(a3), 2);
        }
    }

    public fam(aipn<gpb> aipn, aipn<eys> aipn2, aipn<iet> aipn3, zgb zgb) {
        akcr.b(aipn, "authStore");
        akcr.b(aipn2, "locationFetcher");
        akcr.b(aipn3, "gpuProvider");
        akcr.b(zgb, "schedulersProvider");
        this.d = aipn;
        this.a = aipn2;
        this.b = aipn3;
    }

    public final ajdx<String> a() {
        Object f = ((gpb) this.d.get()).c().a((ajfl) a.a).p(b.a).e().b((ajdw) this.c.b()).f(new c(this));
        akcr.a(f, "authStore.get().observeU…O_WRAP)\n                }");
        return f;
    }
}
