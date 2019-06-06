package defpackage;

import android.util.Pair;
import com.google.common.base.Joiner;
import com.google.common.base.Strings;
import com.google.common.io.BaseEncoding;
import com.snap.framework.developer.BuildConfigInfo;
import com.snap.security.SecurityHttpInterface;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: wid */
public final class wid implements abna {
    private static final Joiner a = Joiner.on('|');
    private final iha b;
    private final SecurityHttpInterface c;
    private final whj d;
    private final igc e;
    private final BuildConfigInfo f;
    private final zfw g = zgb.a(whl.a.callsite("MushroomDeviceTokenManager"));
    private AtomicReference<abmz> h = new AtomicReference();
    private AtomicBoolean i = new AtomicBoolean(false);

    public wid(iha iha, SecurityHttpInterface securityHttpInterface, whj whj, igc igc, BuildConfigInfo buildConfigInfo) {
        this.b = iha;
        this.c = securityHttpInterface;
        this.d = whj;
        this.e = igc;
        this.f = buildConfigInfo;
    }

    private static String a(abmz abmz, String str, String str2, String str3) {
        String str4 = "HmacSHA256";
        try {
            byte[] bytes = abmz.b.getBytes(StandardCharsets.UTF_8);
            Mac instance = Mac.getInstance(str4);
            instance.init(new SecretKeySpec(bytes, str4));
            return BaseEncoding.base16().encode(Arrays.copyOf(instance.doFinal(a.join(Strings.nullToEmpty(str), Strings.nullToEmpty(str2), Strings.nullToEmpty(str3)).getBytes(StandardCharsets.UTF_8)), 10));
        } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private void a(abmz abmz) {
        this.i.set(false);
        Closeable closeable = null;
        if (this.h.compareAndSet(null, abmz)) {
            File c = c();
            if (c != null) {
                try {
                    closeable = iga.b(c);
                    closeable.write(this.b.a((Object) abmz));
                } catch (IOException unused) {
                } finally {
                    aklc.a(closeable);
                }
            }
        }
    }

    private abmz b() {
        Throwable th;
        File c = c();
        if (c != null && c.exists()) {
            Closeable a;
            try {
                a = iga.a(c);
                try {
                    abmz abmz = (abmz) this.b.a((InputStream) a, abmz.class);
                    abqt.a(a);
                    return abmz;
                } catch (IOException unused) {
                    abqt.a(a);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    abqt.a(a);
                    throw th;
                }
            } catch (IOException unused2) {
                a = null;
                abqt.a(a);
                return null;
            } catch (Throwable th3) {
                th = th3;
                a = null;
                abqt.a(a);
                throw th;
            }
        }
        return null;
    }

    private static boolean b(abmz abmz) {
        return (abmz == null || abmz.a == null || abmz.b == null) ? false : true;
    }

    private File c() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(((File) this.e.b().b()).getAbsolutePath());
        stringBuilder.append("/Snapchat");
        File file = new File(stringBuilder.toString());
        return (file.exists() || file.mkdirs()) ? new File(file, "device_token_3") : null;
    }

    private void d() {
        if (this.i.compareAndSet(false, true)) {
            try {
                aenu aenu = (aenu) this.c.getDeviceToken(this.d.a(new aedh())).b();
                a(new abmz(aenu.a, aenu.b));
            } catch (Exception unused) {
            }
        }
    }

    private /* synthetic */ Boolean e() {
        if (this.h.get() != null) {
            return Boolean.TRUE;
        }
        abmz b = b();
        return !this.h.compareAndSet(null, b) ? Boolean.TRUE : wid.b(b) ? Boolean.TRUE : Boolean.FALSE;
    }

    public final abmz a(boolean z) {
        if (this.h.get() == null) {
            abmz b = b();
            if (this.h.compareAndSet(null, b) && !wid.b(b) && z) {
                d();
            }
        }
        return (abmz) this.h.get();
    }

    public final ajcx a() {
        return ajdx.c(new -$$Lambda$wid$xmV9Vk8_YZUrFVyMlZJzAyNsx84(this)).b((ajdw) this.g.f()).a((ajdw) this.g.g()).f(new -$$Lambda$wid$v2Z3cbRHmYJslepRN65JMGlC548(this)).e();
    }

    public final Pair<String, String> a(String str, String str2, String str3) {
        abmz a = a(false);
        if (!wid.b(a)) {
            return null;
        }
        return Pair.create(a.a, wid.a(a, str, str2, str3));
    }
}
