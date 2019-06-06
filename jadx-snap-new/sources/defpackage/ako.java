package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;

/* renamed from: ako */
public class ako {
    public final akp a;
    public URL b;
    private final URL c;
    private final String d;
    private String e;

    public ako(String str) {
        this(str, akp.a);
    }

    private ako(String str, akp akp) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("String url must not be empty or null: ".concat(String.valueOf(str)));
        } else if (akp != null) {
            this.d = str;
            this.c = null;
            this.a = akp;
        } else {
            throw new IllegalArgumentException("Headers must not be null");
        }
    }

    public ako(URL url) {
        this(url, akp.a);
    }

    private ako(URL url, akp akp) {
        if (url == null) {
            throw new IllegalArgumentException("URL must not be null!");
        } else if (akp != null) {
            this.c = url;
            this.d = null;
            this.a = akp;
        } else {
            throw new IllegalArgumentException("Headers must not be null");
        }
    }

    public final String a() {
        if (TextUtils.isEmpty(this.e)) {
            String str = this.d;
            if (TextUtils.isEmpty(str)) {
                str = this.c.toString();
            }
            this.e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%");
        }
        return this.e;
    }

    public final String b() {
        String str = this.d;
        return str != null ? str : this.c.toString();
    }

    public boolean equals(Object obj) {
        if (obj instanceof ako) {
            ako ako = (ako) obj;
            if (b().equals(ako.b()) && this.a.equals(ako.a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (b().hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(b());
        stringBuilder.append(10);
        stringBuilder.append(this.a.toString());
        return stringBuilder.toString();
    }
}
