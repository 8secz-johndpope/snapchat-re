package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: zkd */
public final class zkd {
    public final int a;
    public final RecyclerView b;

    /* renamed from: zkd$a */
    public enum a {
        ;

        static {
            a = new int[]{1, 2};
        }

        public static int[] a() {
            return (int[]) a.clone();
        }
    }

    public zkd(int i, RecyclerView recyclerView) {
        this.a = i;
        this.b = recyclerView;
    }
}
