package defpackage;

import com.snapchat.android.R;

/* renamed from: abry */
public final class abry {
    public static final b a = new b(a.AVENIR_NEXT_REGULAR, a.AVENIR_NEXT_MEDIUM, a.AVENIR_NEXT_DEMI_BOLD, a.AVENIR_NEXT_DEMI_BOLD_ITALIC, a.AVENIR_NEXT_BOLD);

    /* renamed from: abry$a */
    public enum a {
        ALTERNATE_GOT_NO3D(R.font.alternate_got_no3d),
        FUTURA_PT_HEAVY(R.font.futura_pt_heavy),
        AVENIR_NEXT_BOLD(R.font.avenir_next_bold),
        AVENIR_NEXT_DEMI_BOLD(R.font.avenir_next_demi_bold),
        AVENIR_NEXT_DEMI_BOLD_ITALIC(R.font.avenir_next_demi_bold_italic),
        AVENIR_NEXT_MEDIUM(R.font.avenir_next_medium),
        AVENIR_NEXT_REGULAR(R.font.avenir_next_regular),
        DEFAULT(R.font.avenir_next_regular);
        
        public final int mResId;

        private a(int i) {
            this.mResId = i;
        }
    }

    /* renamed from: abry$b */
    public static class b {
        public final a a;
        private final a b;
        private final a c;
        private final a d;
        private final a e;

        public b(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
            this.b = aVar;
            this.c = aVar2;
            this.a = aVar3;
            this.d = aVar4;
            this.e = aVar5;
        }

        public final a a() {
            return this.c;
        }

        public final a b() {
            return this.a;
        }

        public final a c() {
            return this.e;
        }
    }
}
