package defpackage;

import com.snapchat.android.R;

/* renamed from: zkh */
public final class zkh {
    public static final b a = new b(a.AVENIR_NEXT_REGULAR, a.AVENIR_NEXT_MEDIUM, a.AVENIR_NEXT_DEMI_BOLD, a.AVENIR_NEXT_DEMI_BOLD_ITALIC, a.AVENIR_NEXT_BOLD);

    /* renamed from: zkh$a */
    public enum a {
        ALTERNATE_GOT_NO3D(R.font.alternate_got_no3d),
        AVENIR_NEXT_BOLD(R.font.avenir_next_bold),
        AVENIR_NEXT_DEMI_BOLD(R.font.avenir_next_demi_bold),
        AVENIR_NEXT_DEMI_BOLD_ITALIC(R.font.avenir_next_demi_bold_italic),
        AVENIR_NEXT_MEDIUM(R.font.avenir_next_medium),
        AVENIR_NEXT_REGULAR(R.font.avenir_next_regular),
        DEFAULT(R.font.avenir_next_regular);
        
        final int mResId;

        private a(int i) {
            this.mResId = i;
        }
    }

    /* renamed from: zkh$b */
    public static class b {
        final a a;
        final a b;
        final a c;
        final a d;
        final a e;

        public b(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
            this.a = aVar;
            this.b = aVar2;
            this.c = aVar3;
            this.d = aVar4;
            this.e = aVar5;
        }
    }
}
