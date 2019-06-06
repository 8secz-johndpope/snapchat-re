package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import defpackage.jxj.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: jzr */
public final class jzr {
    private ajr a;
    private jwa b;
    private jzw c;
    private a d = new a(this.a);
    private Supplier<aiq<Drawable, Drawable>> e = Suppliers.memoize(-$$Lambda$F_aDOoOuz1x6DFXrJynARdTbjY8.INSTANCE);
    private Supplier<akw<Uri, Drawable>> f;
    private ajwy<jwi> g;
    private ajwy<jwo> h;
    private zgb i;

    /* renamed from: jzr$a */
    static class a {
        private final Map<String, c> a = new HashMap();
        private final Map<String, amg> b = new HashMap();
        private final ajr c;

        public a(ajr ajr) {
            this.c = ajr;
        }

        private synchronized c b(alz alz, aim aim) {
            String c = a.c(alz, aim);
            if (this.a.containsKey(c)) {
                return (c) this.a.get(c);
            }
            c cVar = new c(alz, this.c, aim);
            this.a.put(c, cVar);
            return cVar;
        }

        private static String c(alz alz, aim aim) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(alz.a());
            stringBuilder.append(aim.name());
            return stringBuilder.toString();
        }

        public final synchronized amg a(alz alz, aim aim) {
            String c = a.c(alz, aim);
            if (this.b.containsKey(c)) {
                return (amg) this.b.get(c);
            }
            amg amg = new amg(b(alz, aim), new b(this.c, aim.PREFER_ARGB_8888));
            this.b.put(c, amg);
            return amg;
        }
    }

    /* renamed from: jzr$c */
    static class c extends amk {
        public c(alz alz, ajr ajr, aim aim) {
            super(alz, ajr, aim);
        }

        public final ajn<Bitmap> a(InputStream inputStream, int i, int i2) {
            try {
                ajn a = super.a(inputStream, i, i2);
                if (!(a == null || a.a() == null)) {
                    ((Bitmap) a.a()).prepareToDraw();
                }
                return a;
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new IOException(e2);
            }
        }
    }

    /* renamed from: jzr$b */
    static class b extends amb {
        public b(ajr ajr, aim aim) {
            super(ajr, aim);
        }

        public final ajn<Bitmap> a(ParcelFileDescriptor parcelFileDescriptor, int i, int i2) {
            try {
                ajn a = super.a(parcelFileDescriptor, i, i2);
                if (!(a == null || a.a() == null)) {
                    ((Bitmap) a.a()).prepareToDraw();
                }
                return a;
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new IOException(e2);
            }
        }
    }

    public jzr(Context context, ihh ihh, ajwy<jwk> ajwy, ajwy<jwn> ajwy2, ajwy<jwi> ajwy3, ajwy<jwo> ajwy4, zgb zgb) {
        context = context.getApplicationContext();
        this.a = ahx.a(context).d;
        this.b = new jzh(this.a, ajwy, jwp.a);
        this.c = new jzw(ajwy2, ajwy, ihh);
        this.g = ajwy3;
        this.h = ajwy4;
        this.i = zgb;
        this.f = Suppliers.memoize(new -$$Lambda$jzr$Z46d6ewAPDToia4B4YzlY2Nl_Do(context));
    }

    public final <T> ahq<T> a(aib aib, T t, jxa jxa, int i) {
        aiq jzq;
        ahq ahq = (ahq) Preconditions.checkNotNull(aib.a((Object) t).a());
        if (jxa.b()) {
            ahq.b(jxa.b, jxa.c);
        }
        List list = jxa.f;
        if (i == 2) {
            list = jxa.g;
        }
        if (list == null || list.isEmpty()) {
            ahq.a();
        } else {
            ahq.a(jzs.a(this.b, list));
        }
        if (jxa.h != null) {
            jzq = new jzq(jxa.h);
        } else {
            aim aim = jxa.e ? aim.PREFER_RGB_565 : aim.PREFER_ARGB_8888;
            ajwy ajwy = this.h;
            alz alz = (ajwy == null || !((jwo) ajwy.get()).b()) ? alz.a : jzb.a;
            if (jxa.d) {
                alz = alz.b;
            }
            if (i == 2) {
                aim = aim.PREFER_RGB_565;
                alz = alz.b;
            }
            jzq = this.d.a(alz, aim);
        }
        ahq.a(jzq);
        return ahq;
    }

    public final aht<Uri, Drawable, Drawable, Drawable> a(aib aib, Uri uri) {
        return aib.a((akw) this.f.get(), Drawable.class).a(Uri.class).a(Drawable.class).b((aiq) this.e.get()).a((Object) uri);
    }

    public final <T> Optional<ajcx> a(T t, idd idd) {
        if (!(t instanceof jwh) || this.g == null || this.i == null) {
            return Optional.absent();
        }
        if (idd == null) {
            idd = jwp.a.callsite(t.toString());
        }
        zfw a = zgb.a(idd);
        return Optional.of(ajcx.a(new -$$Lambda$jzr$8AGOGCN4vh78tW2ABRoJ6sjJLGQ(this, t)).b((ajdw) a.f()).a((ajdw) a.l()));
    }

    public final jzp a(a aVar, Uri uri, idd idd) {
        return this.c.a(aVar, uri.toString(), idd);
    }

    public final boolean a() {
        return this.g != null;
    }
}
