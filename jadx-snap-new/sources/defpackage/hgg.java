package defpackage;

import android.content.res.AssetFileDescriptor;
import com.google.common.base.Optional;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: hgg */
public final class hgg {
    public final long a = TimeUnit.HOURS.toMillis(24);
    final HashMap<Long, ajwj<vii>> b = new HashMap();
    public final ajwy<ihh> c;
    final ajwy<ygi> d;
    private final ajxe e;
    private final ajxe f;

    /* renamed from: hgg$h */
    static final class h extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        h(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(hbn.f, "DiscoverFeedDeepLinkStoryRepository");
        }
    }

    /* renamed from: hgg$i */
    static final class i extends akcs implements akbk<iha> {
        private /* synthetic */ ajwy a;

        i(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (iha) this.a.get();
        }
    }

    /* renamed from: hgg$a */
    public static final class a<V> implements Callable<T> {
        private /* synthetic */ hgg a;

        public a(hgg hgg) {
            this.a = hgg;
        }

        public final /* synthetic */ Object call() {
            return (ygi) this.a.d.get();
        }
    }

    /* renamed from: hgg$c */
    public static final class c<V> implements Callable<T> {
        private /* synthetic */ hgg a;

        public c(hgg hgg) {
            this.a = hgg;
        }

        public final /* synthetic */ Object call() {
            return (ygi) this.a.d.get();
        }
    }

    /* renamed from: hgg$e */
    public static final class e<V> implements Callable<T> {
        private /* synthetic */ hgg a;
        private /* synthetic */ long b;

        public e(hgg hgg, long j) {
            this.a = hgg;
            this.b = j;
        }

        public final /* synthetic */ Object call() {
            hgg hgg = this.a;
            ajwj ajwj = (ajwj) hgg.b.get(Long.valueOf(this.b));
            Object obj = null;
            if (ajwj != null) {
                if ((ajwj.b > ((ihh) hgg.c.get()).a() ? 1 : null) == null) {
                    ajwj = null;
                }
                if (ajwj != null) {
                    obj = (vii) ajwj.a;
                }
            }
            Object fromNullable = Optional.fromNullable(obj);
            akcr.a(fromNullable, "Optional.fromNullable(\n … { it.value() }\n        )");
            return fromNullable;
        }
    }

    /* renamed from: hgg$b */
    public static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ String a;
        private /* synthetic */ vii b;
        private /* synthetic */ long c;

        public b(String str, vii vii, long j) {
            this.a = str;
            this.b = vii;
            this.c = j;
        }

        private boolean a(ygi ygi) {
            akcr.b(ygi, "it");
            defpackage.yes.b a = ygi.a((ygp) hpz.DEEPLINK_STORY_CARD, this.a, 1);
            if (a == null) {
                return false;
            }
            Object obj;
            try {
                a.d().write(MessageNano.toByteArray(this.b));
                a.a(this.c);
                a.f();
                obj = Boolean.TRUE;
            } catch (Throwable th) {
                obj = ajxo.a(th);
            }
            if (ajxn.a(obj) == null) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                a.h();
                return booleanValue;
            }
            a.h();
            return false;
        }

        public final /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(a((ygi) obj));
        }
    }

    /* renamed from: hgg$d */
    public static final class d<T, R> implements ajfc<T, R> {
        private /* synthetic */ hgg a;
        private /* synthetic */ String b;

        public d(hgg hgg, String str) {
            this.a = hgg;
            this.b = str;
        }

        private Optional<vii> a(ygi ygi) {
            akcr.b(ygi, "it");
            AssetFileDescriptor a = ((ygi) this.a.d.get()).a(hpz.DEEPLINK_STORY_CARD, this.b);
            if (a == null) {
                return Optional.absent();
            }
            Object obj;
            Closeable createInputStream;
            try {
                createInputStream = a.createInputStream();
                obj = (FileInputStream) createInputStream;
                akcr.a(obj, "input");
                obj = vii.a(CodedInputByteBufferNano.newInstance(akaw.a((InputStream) obj)));
                akax.a(createInputStream, null);
            } catch (Throwable th) {
                obj = ajxo.a(th);
            }
            if (ajxn.a(obj) == null) {
                Optional of = Optional.of((vii) obj);
                a.close();
                return of;
            }
            a.close();
            return Optional.absent();
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((ygi) obj);
        }
    }

    /* renamed from: hgg$f */
    public static final class f<T> implements ajfl<Optional<vii>> {
        public static final f a = new f();

        f() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "it");
            return optional.isPresent();
        }
    }

    /* renamed from: hgg$g */
    public static final class g<T> implements ajfb<Boolean> {
        private /* synthetic */ hgg a;
        private /* synthetic */ long b;
        private /* synthetic */ vii c;
        private /* synthetic */ long d;

        public g(hgg hgg, long j, vii vii, long j2) {
            this.a = hgg;
            this.b = j;
            this.c = vii;
            this.d = j2;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.b.put(Long.valueOf(this.b), new ajwj(this.c, this.d, TimeUnit.MILLISECONDS));
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(hgg.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(hgg.class), "serializer", "getSerializer()Lcom/snap/framework/serialization/SerializationHelper;")};
    }

    public hgg(zgb zgb, ajwy<iha> ajwy, ajwy<ihh> ajwy2, ajwy<ygi> ajwy3) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "SerializationHelperProvider");
        akcr.b(ajwy2, "clock");
        akcr.b(ajwy3, "fileManager");
        this.c = ajwy2;
        this.d = ajwy3;
        this.e = ajxh.a(new h(zgb));
        this.f = ajxh.a(new i(ajwy));
    }

    public final zfw a() {
        return (zfw) this.e.b();
    }
}
