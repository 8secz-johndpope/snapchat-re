package defpackage;

import android.graphics.Typeface;
import defpackage.abwy.a;

/* renamed from: abxh */
public final class abxh extends abwy {
    private final abwn c;

    /* renamed from: abxh$b */
    public static class b extends a {
        public float d = 14.0f;
        public int e = -16777216;
        public Typeface f;
        abwm g = abwm.FLUSH_LEFT;
        public Float h;
        public int i = Integer.MAX_VALUE;
        public boolean j;
        float k = 1.0f;
        abxq<Float> l;
        final String m;

        public b(String str) {
            akcr.b(str, "text");
            this.m = str;
        }

        public final abwy a() {
            return new abxh(this);
        }

        public final void a(abwm abwm) {
            akcr.b(abwm, "<set-?>");
            this.g = abwm;
        }

        public final void a(abxq<Float> abxq) {
            akcr.b(abxq, "animatingAlpha");
            this.l = abxq;
        }
    }

    /* renamed from: abxh$a */
    static final class a extends akcs implements akbk<Float> {
        private /* synthetic */ b a;

        a(b bVar) {
            this.a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Float.valueOf(this.a.k);
        }
    }

    /* renamed from: abxh$c */
    static final class c extends akcs implements akbk<Float> {
        private /* synthetic */ abxq a;

        c(abxq abxq) {
            this.a = abxq;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Float.valueOf(((Number) this.a.a()).floatValue());
        }
    }

    public abxh(b bVar) {
        akcr.b(bVar, "builder");
        super(bVar);
        abwn abwn = new abwn();
        abwn.a = bVar.m;
        abwn.f.setTextSize(bVar.d);
        abwn.d = bVar.j;
        abwn.c = bVar.i;
        abwn.g = bVar.e;
        Object obj = bVar.f;
        if (obj != null) {
            akcr.b(obj, "typeface");
            if (abwn.f.getTypeface() == null || (akcr.a(abwn.f.getTypeface(), obj) ^ 1) != 0) {
                abwn.f.setTypeface(obj);
            }
        }
        abwm abwm = bVar.g;
        akcr.b(abwm, "<set-?>");
        abwn.b = abwm;
        abwn.e = bVar.h;
        abxq abxq = bVar.l;
        if (abxq != null) {
            abwn.a(new c(abxq));
        }
        if (bVar.l == null) {
            abwn.a(new a(bVar));
        }
        this.c = abwn;
    }

    public final abwk a() {
        return this.c;
    }

    public final abvv b() {
        return this.c;
    }
}
