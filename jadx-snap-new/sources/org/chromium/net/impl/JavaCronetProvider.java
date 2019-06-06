package org.chromium.net.impl;

import android.content.Context;
import defpackage.akou.a;
import defpackage.akow;
import defpackage.akoy;
import defpackage.akpv;
import java.util.Arrays;

public class JavaCronetProvider extends akow {
    public JavaCronetProvider(Context context) {
        super(context);
    }

    public final a a() {
        return new akoy.a(new akpv(this.b));
    }

    public final String b() {
        return "Fallback-Cronet-Provider";
    }

    public final String c() {
        return "69.0.3497.100";
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof JavaCronetProvider) && this.b.equals(((JavaCronetProvider) obj).b));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{JavaCronetProvider.class, this.b});
    }
}
