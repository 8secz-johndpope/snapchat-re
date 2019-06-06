package defpackage;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.google.common.base.Preconditions;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: saq */
public final class saq<PayloadType> {
    public final Map<String, String> a;
    public final int b;
    final String c;
    final int d;
    public final String e;
    public final Throwable f;
    public final san g;
    public final PayloadType h;

    /* renamed from: saq$a */
    public static class a<PayloadType> {
        public int a;
        Map<String, String> b = new HashMap();
        public String c;
        public Throwable d;
        public san e;
        public PayloadType f;
        public int g = 3;
        public String h;
        private sar i = sas.c;

        public a(saq<PayloadType> saq) {
            this.a = saq.b;
            this.c = saq.e;
            this.d = saq.f;
            this.f = saq.h;
            this.b = new HashMap(saq.a);
            this.h = saq.c;
            this.g = saq.d;
            this.e = saq.g;
        }

        public final a<PayloadType> a(PayloadType payloadType) {
            this.f = payloadType;
            return this;
        }

        public final a<PayloadType> a(String str) {
            this.c = str;
            return this;
        }

        public final a<PayloadType> a(Map<String, String> map) {
            this.b = new HashMap((Map) Preconditions.checkNotNull(map));
            return this;
        }

        public final saq<PayloadType> a() {
            return new saq(this, (byte) 0);
        }
    }

    private saq(a<PayloadType> aVar) {
        this.e = aVar.c;
        this.b = aVar.a;
        this.h = aVar.f;
        this.f = aVar.d;
        this.a = Collections.unmodifiableMap(aVar.b);
        this.c = aVar.h;
        this.d = aVar.g;
        this.g = aVar.e;
    }

    /* synthetic */ saq(a aVar, byte b) {
        this(aVar);
    }

    public final int a() {
        return this.b;
    }

    public final boolean b() {
        int i = this.b;
        return i >= Callback.DEFAULT_DRAG_ANIMATION_DURATION && i < MapboxConstants.ANIMATION_DURATION && this.f == null;
    }

    public final String c() {
        return this.e;
    }

    public final Throwable d() {
        return this.f;
    }

    public final san e() {
        return this.g;
    }

    public final a<PayloadType> f() {
        return new a(this);
    }

    public final PayloadType g() {
        return this.h;
    }

    public final Map<String, String> h() {
        return this.a;
    }

    public final int i() {
        return this.d;
    }

    public final String j() {
        return this.c;
    }
}
