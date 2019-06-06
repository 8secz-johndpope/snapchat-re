package defpackage;

import android.view.View;
import android.view.ViewParent;

/* renamed from: ju */
public final class ju {
    public boolean a;
    private ViewParent b;
    private ViewParent c;
    private final View d;
    private int[] e;

    public ju(View view) {
        this.d = view;
    }

    private void a(int i, ViewParent viewParent) {
        if (i != 0) {
            if (i == 1) {
                this.c = viewParent;
            }
            return;
        }
        this.b = viewParent;
    }

    private ViewParent c(int i) {
        return i != 0 ? i != 1 ? null : this.c : this.b;
    }

    public final void a(boolean z) {
        if (this.a) {
            kb.a.w(this.d);
        }
        this.a = z;
    }

    public final boolean a(float f, float f2) {
        if (this.a) {
            ViewParent c = c(0);
            if (c != null) {
                return ke.a.a(c, this.d, f, f2);
            }
        }
        return false;
    }

    public final boolean a(float f, float f2, boolean z) {
        if (this.a) {
            ViewParent c = c(0);
            if (c != null) {
                return ke.a.a(c, this.d, f, f2, z);
            }
        }
        return false;
    }

    public final boolean a(int i) {
        return c(i) != null;
    }

    public final boolean a(int i, int i2) {
        if (a(i2)) {
            return true;
        }
        if (this.a) {
            ViewParent parent = this.d.getParent();
            View view = this.d;
            while (parent != null) {
                View view2 = this.d;
                boolean z = parent instanceof jw;
                boolean a = z ? ((jw) parent).a(view, view2, i, i2) : i2 == 0 ? ke.a.a(parent, view, view2, i) : false;
                if (a) {
                    a(i2, parent);
                    View view3 = this.d;
                    if (z) {
                        ((jw) parent).b(view3, i);
                    } else if (i2 == 0) {
                        ke.a.b(parent, view, view3, i);
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
                parent = parent.getParent();
            }
        }
        return false;
    }

    public final boolean a(int i, int i2, int i3, int i4, int[] iArr) {
        return a(i, i2, i3, i4, iArr, 0);
    }

    public final boolean a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        int[] iArr2 = iArr;
        if (this.a) {
            ViewParent c = c(i5);
            if (c == null) {
                return false;
            }
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                int i6;
                int i7;
                if (iArr2 != null) {
                    this.d.getLocationInWindow(iArr2);
                    i6 = iArr2[0];
                    i7 = iArr2[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                ke.a(c, this.d, i, i2, i3, i4, i5);
                if (iArr2 != null) {
                    this.d.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i6;
                    iArr2[1] = iArr2[1] - i7;
                }
                return true;
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        }
        return false;
    }

    public final boolean a(int i, int i2, int[] iArr, int[] iArr2) {
        return a(i, i2, iArr, iArr2, 0);
    }

    public final boolean a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        if (this.a) {
            ViewParent c = c(i3);
            if (c == null) {
                return false;
            }
            if (i != 0 || i2 != 0) {
                int i4;
                int i5;
                if (iArr2 != null) {
                    this.d.getLocationInWindow(iArr2);
                    i4 = iArr2[0];
                    i5 = iArr2[1];
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                if (iArr == null) {
                    if (this.e == null) {
                        this.e = new int[2];
                    }
                    iArr = this.e;
                }
                iArr[0] = 0;
                iArr[1] = 0;
                ke.a(c, this.d, i, i2, iArr, i3);
                if (iArr2 != null) {
                    this.d.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i4;
                    iArr2[1] = iArr2[1] - i5;
                }
                return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        }
        return false;
    }

    public final void b(int i) {
        ViewParent c = c(i);
        if (c != null) {
            View view = this.d;
            if (c instanceof jw) {
                ((jw) c).c(view, i);
            } else if (i == 0) {
                ke.a.a(c, view);
            }
            a(i, null);
        }
    }
}
