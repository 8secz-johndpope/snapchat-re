package defpackage;

import android.opengl.GLES20;
import com.google.common.base.Preconditions;
import defpackage.adhd.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: adhe */
public final class adhe {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    private final String e;
    private final adhk f;
    private final a g;
    private final int h;
    private final List<adhd> i;
    private final Set<adhd> j;
    private boolean k;

    /* renamed from: adhe$a */
    public static class a {
        public static adhe a(int i, int i2, int i3) {
            return new adhe(i, i2, i3);
        }
    }

    public adhe(int i, int i2, int i3) {
        this(i, i2, i3, adhk.a, new a());
    }

    private adhe(int i, int i2, int i3, adhk adhk, a aVar) {
        this.e = "CapturedFramePool";
        this.k = false;
        Preconditions.checkArgument(i > 0);
        Preconditions.checkArgument(i2 > 0);
        Preconditions.checkArgument(i3 > 0);
        this.a = i;
        this.b = i2;
        this.c = (i / 4) << 2;
        this.d = (i2 / 4) << 2;
        Preconditions.checkArgument(this.c > 0, String.format(Locale.US, "original width=%d", new Object[]{Integer.valueOf(i)}));
        Preconditions.checkArgument(this.d > 0, String.format(Locale.US, "original height=%d", new Object[]{Integer.valueOf(i2)}));
        this.f = adhk;
        this.g = aVar;
        int[] iArr = new int[1];
        adhk.a(iArr);
        GLES20.glBindRenderbuffer(36161, iArr[0]);
        GLES20.glRenderbufferStorage(36161, 33189, this.c, this.d);
        GLES20.glBindRenderbuffer(36161, 0);
        this.h = iArr[0];
        this.i = a(i3);
        this.j = new HashSet();
    }

    private List<adhd> a(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new adhd(this.c, this.d, this.h));
        }
        return arrayList;
    }

    public final void a(adhd adhd) {
        Preconditions.checkState(this.k ^ 1, "Cannot check in frame. Already released.");
        Preconditions.checkState(this.j.remove(adhd), "Cannot check in frame. Frame not checked out.");
        this.i.add(adhd);
    }

    public final boolean a() {
        Preconditions.checkState(this.k ^ 1, "Bad call. Attempt to check if any frames available after release.");
        return !this.i.isEmpty();
    }

    public final adhd b() {
        Preconditions.checkState(this.k ^ 1, "Cannot check out frame. Already released.");
        Preconditions.checkState(a(), "Cannot check out frame. None available.");
        List list = this.i;
        adhd adhd = (adhd) list.remove(list.size() - 1);
        this.j.add(adhd);
        return adhd;
    }

    public final void c() {
        for (adhd b : this.j) {
            b.b();
        }
        for (adhd b2 : this.i) {
            b2.b();
        }
        this.j.clear();
        this.i.clear();
        GLES20.glDeleteRenderbuffers(1, new int[]{this.h}, 0);
        this.k = true;
    }
}
