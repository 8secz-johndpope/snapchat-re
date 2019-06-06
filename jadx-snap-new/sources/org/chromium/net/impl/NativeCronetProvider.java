package org.chromium.net.impl;

import android.content.Context;
import defpackage.akou.a;
import defpackage.akow;
import defpackage.akoy;
import defpackage.akpy;
import java.util.Arrays;
import org.chromium.base.annotations.UsedByReflection;

public class NativeCronetProvider extends akow {
    @UsedByReflection
    public NativeCronetProvider(Context context) {
        super(context);
    }

    public final a a() {
        return new akoy.a(new akpy(this.b));
    }

    public final String b() {
        return "App-Packaged-Cronet-Provider";
    }

    public final String c() {
        return "69.0.3497.100";
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof NativeCronetProvider) && this.b.equals(((NativeCronetProvider) obj).b));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{NativeCronetProvider.class, this.b});
    }
}
