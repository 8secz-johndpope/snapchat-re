package defpackage;

/* renamed from: akaj */
public class akaj {

    /* renamed from: akaj$a */
    public static final class a extends akaq {
        private int b;
        private /* synthetic */ akad c;
        private /* synthetic */ akbw d;
        private /* synthetic */ Object e;

        public a(akad akad, akad akad2, akbw akbw, Object obj) {
            this.c = akad;
            this.d = akbw;
            this.e = obj;
            super(akad2);
        }

        public final Object a(Object obj) {
            int i = this.b;
            if (i == 0) {
                this.b = 1;
                akad akad = this;
                akbw akbw = this.d;
                if (akbw != null) {
                    return ((akbw) akdg.f(akbw)).invoke(this.e, akad);
                }
                throw new ajxt("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            } else if (i == 1) {
                this.b = 2;
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: akaj$b */
    public static final class b extends akan {
        private int b;
        private /* synthetic */ akad c;
        private /* synthetic */ akaf d;
        private /* synthetic */ akbw e;
        private /* synthetic */ Object f;

        public b(akad akad, akaf akaf, akad akad2, akaf akaf2, akbw akbw, Object obj) {
            this.c = akad;
            this.d = akaf;
            this.e = akbw;
            this.f = obj;
            super(akad2, akaf2);
        }

        public final Object a(Object obj) {
            int i = this.b;
            if (i == 0) {
                this.b = 1;
                akad akad = this;
                akbw akbw = this.e;
                if (akbw != null) {
                    return ((akbw) akdg.f(akbw)).invoke(this.f, akad);
                }
                throw new ajxt("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            } else if (i == 1) {
                this.b = 2;
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    public static final <R, T> akad<ajxw> a(akbw<? super R, ? super akad<? super T>, ? extends Object> akbw, R r, akad<? super T> akad) {
        akcr.b(akbw, "receiver$0");
        String str = "completion";
        akcr.b(akad, str);
        akcr.b(akad, str);
        if (akbw instanceof akal) {
            return ((akal) akbw).a(r, akad);
        }
        akaf a = akad.a();
        return a == akag.a ? new a(akad, akad, akbw, r) : new b(akad, a, akad, a, akbw, r);
    }
}
