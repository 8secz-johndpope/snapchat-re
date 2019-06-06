package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* renamed from: acj */
public class acj implements zd {
    public final ack b;
    public URL c;
    private final URL d;
    private final String e;
    private String f;
    private volatile byte[] g;
    private int h;

    public acj(String str) {
        this(str, ack.a);
    }

    private acj(String str, ack ack) {
        this.d = null;
        this.e = ahl.a(str);
        this.b = (ack) ahl.a((Object) ack, "Argument must not be null");
    }

    public acj(URL url) {
        this(url, ack.a);
    }

    private acj(URL url, ack ack) {
        String str = "Argument must not be null";
        this.d = (URL) ahl.a((Object) url, str);
        this.e = null;
        this.b = (ack) ahl.a((Object) ack, str);
    }

    private String c() {
        String str = this.e;
        return str != null ? str : ((URL) ahl.a(this.d, "Argument must not be null")).toString();
    }

    public final String a() {
        return b();
    }

    public final void a(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = c().getBytes(a);
        }
        messageDigest.update(this.g);
    }

    public final String b() {
        if (TextUtils.isEmpty(this.f)) {
            String str = this.e;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) ahl.a(this.d, "Argument must not be null")).toString();
            }
            this.f = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof acj) {
            acj acj = (acj) obj;
            if (c().equals(acj.c()) && this.b.equals(acj.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.h == 0) {
            this.h = c().hashCode();
            this.h = (this.h * 31) + this.b.hashCode();
        }
        return this.h;
    }

    public String toString() {
        return c();
    }
}
