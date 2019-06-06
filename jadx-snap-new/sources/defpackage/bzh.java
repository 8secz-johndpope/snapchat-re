package defpackage;

import com.snap.ui.view.multisnap.MultiSnapThumbnailView;
import java.util.ArrayList;
import java.util.Comparator;

/* renamed from: bzh */
public final class bzh {
    public static final Comparator<a> a = new 1();
    public static final Comparator<a> b = new 2();
    public final int c = MultiSnapThumbnailView.MIN_SEGMENT_DURATION_MS;
    public final ArrayList<a> d = new ArrayList();
    public final a[] e = new a[5];
    public int f = -1;
    public int g;
    public int h;
    public int i;

    /* renamed from: bzh$1 */
    static class 1 implements Comparator<a> {
        1() {
        }

        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return ((a) obj).a - ((a) obj2).a;
        }
    }

    /* renamed from: bzh$2 */
    static class 2 implements Comparator<a> {
        2() {
        }

        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            a aVar = (a) obj;
            a aVar2 = (a) obj2;
            return aVar.c < aVar2.c ? -1 : aVar2.c < aVar.c ? 1 : 0;
        }
    }

    /* renamed from: bzh$a */
    public static class a {
        public int a;
        public int b;
        public float c;

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }
}
