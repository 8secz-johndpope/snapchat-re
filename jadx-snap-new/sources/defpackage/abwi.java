package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: abwi */
public final class abwi implements abvv, abwk, abwx {
    private int a = 0;
    private final Map<Integer, aknd<abwk, abvv, abwx>> b = new HashMap();
    private final List<abwk> c = new ArrayList();
    private final List<abvv> d = new ArrayList();
    private final List<abwx> e = new ArrayList();
    private final Map<abwk, a> f = new HashMap();
    private final Map<abwk, Rect> g = new HashMap();
    private final Map<abvv, Rect> h = new HashMap();
    private final Map<abwx, Rect> i = new HashMap();
    private final Map<abwx, Boolean> j = new HashMap();
    private abwx k = null;

    /* renamed from: abwi$a */
    static class a {
        final int a;
        final int b;

        private a(int i, int i2) {
            this.a = i2;
            this.b = i;
        }

        /* synthetic */ a(int i, int i2, byte b) {
            this(i, 1);
        }
    }

    public final int a(abwk abwk, abvv abvv, abwx abwx, int i) {
        this.c.add(abwk);
        this.d.add(abvv);
        this.e.add(abwx);
        Rect rect = new Rect();
        this.g.put(abwk, rect);
        this.h.put(abvv, rect);
        this.f.put(abwk, new a(i, 1, (byte) 0));
        this.i.put(abwx, rect);
        i = this.a;
        this.a = i + 1;
        this.b.put(Integer.valueOf(i), aknd.a(abwk, abvv, abwx));
        return i;
    }

    public final <T extends abwk & abvv> int a(T t, abwx abwx, int i) {
        return a((abwk) t, (abvv) t, abwx, i);
    }

    public final void a(int i) {
        aknd aknd = (aknd) this.b.get(Integer.valueOf(i));
        if (aknd != null) {
            abwk abwk = (abwk) aknd.a();
            abvv abvv = (abvv) aknd.b();
            abwx abwx = (abwx) aknd.c();
            this.c.remove(abwk);
            this.d.remove(abvv);
            this.e.remove(abwx);
            this.g.remove(abwk);
            this.h.remove(abvv);
            this.f.remove(abwk);
            this.i.remove(abwx);
        }
    }

    public final void a(View view, abxs abxs, int i, int i2) {
        int i3;
        abxs abxs2 = abxs;
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        int makeMeasureSpec = mode == AudioPlayer.INFINITY_LOOP_COUNT ? MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE) : i;
        int makeMeasureSpec2 = mode2 == AudioPlayer.INFINITY_LOOP_COUNT ? MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE) : i2;
        int size3 = this.c.size();
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < size3; i6++) {
            abwk abwk = (abwk) this.c.get(i6);
            Rect rect = (Rect) this.g.get(abwk);
            abwk.a(view, abxs2, makeMeasureSpec, makeMeasureSpec2);
            i4 = Math.max(i4, abxs2.a);
            i5 = Math.max(i5, abxs2.b);
            rect.set(0, 0, abxs2.a, abxs2.b);
        }
        if (mode == AudioPlayer.INFINITY_LOOP_COUNT) {
            abxs2.a = size;
            i3 = Integer.MIN_VALUE;
        } else {
            i3 = Integer.MIN_VALUE;
            if (mode == Integer.MIN_VALUE) {
                abxs2.a = Math.min(size, i4);
            } else {
                abxs2.a = i4;
            }
        }
        if (mode2 == AudioPlayer.INFINITY_LOOP_COUNT) {
            abxs2.b = size2;
        } else if (mode2 == i3) {
            abxs2.b = Math.min(size2, i5);
        } else {
            abxs2.b = i5;
        }
        for (mode = 0; mode < size3; mode++) {
            abwk abwk2 = (abwk) this.c.get(mode);
            a aVar = (a) this.f.get(abwk2);
            Rect rect2 = (Rect) this.g.get(abwk2);
            size2 = aVar.b;
            size2 = size2 != 2 ? size2 != 3 ? 0 : (abxs2.a - rect2.right) / 2 : abxs2.a - rect2.right;
            mode2 = aVar.a;
            mode2 = mode2 != 2 ? mode2 != 3 ? 0 : (abxs2.b - rect2.bottom) / 2 : abxs2.b - rect2.bottom;
            rect2.offset(size2, mode2);
        }
    }

    public final void a(View view, Canvas canvas, abxs abxs) {
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            abvv abvv = (abvv) this.d.get(i);
            Rect rect = (Rect) this.h.get(abvv);
            canvas.translate((float) rect.left, (float) rect.top);
            abxs.a = rect.width();
            abxs.b = rect.height();
            abvv.a(view, canvas, abxs);
            abxs.a = rect.width();
            abxs.b = rect.height();
            abvv.b(view, canvas, abxs);
            canvas.translate((float) (-rect.left), (float) (-rect.top));
        }
    }

    public final void a(View view, boolean z, int i, int i2, int i3, int i4) {
        i = this.c.size();
        for (i2 = 0; i2 < i; i2++) {
            abwk abwk = (abwk) this.c.get(i2);
            Rect rect = (Rect) this.g.get(abwk);
            abwk.a(view, z, rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    public final boolean a(MotionEvent motionEvent) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            abwx abwx = (abwx) this.e.get(size);
            if (this.j.containsKey(abwx) && ((Boolean) this.j.get(abwx)).booleanValue() && abwx.a(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(View view, MotionEvent motionEvent) {
        int size;
        abwx abwx;
        float f;
        if (motionEvent.getActionMasked() == 0) {
            this.k = null;
            for (size = this.e.size() - 1; size >= 0; size--) {
                Map map;
                Object obj;
                abwx = (abwx) this.e.get(size);
                if (((Rect) this.i.get(abwx)).contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    map = this.j;
                    obj = Boolean.TRUE;
                } else {
                    map = this.j;
                    obj = Boolean.FALSE;
                }
                map.put(abwx, obj);
            }
        }
        abwx abwx2 = this.k;
        if (abwx2 != null) {
            Rect rect = (Rect) this.i.get(abwx2);
            motionEvent.offsetLocation((float) (-rect.left), (float) (-rect.top));
            this.k.a(view, motionEvent);
            f = (float) rect.left;
            size = rect.top;
        } else {
            for (size = this.e.size() - 1; size >= 0; size--) {
                abwx = (abwx) this.e.get(size);
                if (this.j.containsKey(abwx) && ((Boolean) this.j.get(abwx)).booleanValue()) {
                    Rect rect2 = (Rect) this.i.get(abwx);
                    motionEvent.offsetLocation((float) (-rect2.left), (float) (-rect2.top));
                    if (abwx.a(view, motionEvent)) {
                        this.k = abwx;
                        f = (float) rect2.left;
                        size = rect2.top;
                    } else {
                        motionEvent.offsetLocation((float) rect2.left, (float) rect2.top);
                    }
                }
            }
            return false;
        }
        motionEvent.offsetLocation(f, (float) size);
        return true;
    }

    public final void b(View view, Canvas canvas, abxs abxs) {
    }
}
