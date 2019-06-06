package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.base.Charsets;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.io.BaseEncoding;
import com.mapbox.services.android.telemetry.permissions.PermissionsManager;
import com.snapchat.android.framework.misc.AppContext;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ify */
public final class ify {
    final abrk a;
    private final ifs b;
    private final ajwo<aajt> c;
    private final Supplier<SharedPreferences> d;
    private final Supplier<SharedPreferences> e;
    private final AtomicBoolean f;

    /* renamed from: ify$a */
    public enum a {
        NO_USER(aauc.NO_USER),
        NOT_GRANTED(aauc.NOT_GRANTED),
        GRANTED(aauc.GRANTED);
        
        public final aauc grandfatherResult;

        private a(aauc aauc) {
            this.grandfatherResult = aauc;
        }
    }

    public ify(abrk abrk, ifs ifs, ajwo<aajt> ajwo, Context context) {
        this(abrk, ifs, ajwo, Suppliers.memoize(new -$$Lambda$ify$JqKlS8HJV-voKP-8WbDFvoYG2kI(context)), Suppliers.memoize(new -$$Lambda$ify$e4Lr1d31Dl8pndNjoL0uR8V-O_s(context)));
    }

    private ify(abrk abrk, ifs ifs, ajwo<aajt> ajwo, Supplier<SharedPreferences> supplier, Supplier<SharedPreferences> supplier2) {
        this.f = new AtomicBoolean();
        this.a = abrk;
        this.b = ifs;
        this.c = ajwo;
        this.d = supplier;
        this.e = supplier2;
    }

    static String a(String str) {
        return String.format(Locale.US, "DENIED_USER_ID_%s", new Object[]{str});
    }

    private void a(aauc aauc) {
        Object abhq = new abhq();
        abhq.a = aauc;
        this.c.a(abhq);
    }

    static String e() {
        abss.a();
        return abss.a(abss.a(AppContext.get()));
    }

    private boolean g() {
        return a().contains("granted");
    }

    private void h() {
        a().edit().putBoolean("granted", true).apply();
    }

    private aauc i() {
        return (!this.b.a(PermissionsManager.FINE_LOCATION_PERMISSION) ? a.NOT_GRANTED : d()).grandfatherResult;
    }

    private void j() {
        if (!g()) {
            k();
        }
    }

    private void k() {
        aauc i = i();
        h();
        a(i);
    }

    /* Access modifiers changed, original: final */
    public final SharedPreferences a() {
        return (SharedPreferences) this.d.get();
    }

    /* Access modifiers changed, original: final */
    public final void a(String str, String str2) {
        a().edit().putString(str, str2).apply();
    }

    /* Access modifiers changed, original: final */
    public final String b() {
        String string = ((SharedPreferences) this.e.get()).getString("key_user_id", null);
        if (string == null || string.isEmpty()) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.reset();
            return BaseEncoding.base64Url().encode(instance.digest(string.getBytes(Charsets.UTF_8)));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean c() {
        abss.a();
        j();
        String b = b();
        return b == null ? false : a().contains(b);
    }

    public final a d() {
        String b = b();
        if (b == null) {
            return a.NO_USER;
        }
        a(b, ify.e());
        return a.GRANTED;
    }

    public final boolean f() {
        j();
        String b = b();
        if (b == null) {
            return false;
        }
        return a().contains(ify.a(b));
    }
}
