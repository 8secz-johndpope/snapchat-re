package defpackage;

/* renamed from: mg */
public final class mg implements mi {
    private mi a;
    private int b = 0;
    private int c = -1;
    private int d = -1;
    private Object e = null;

    public mg(mi miVar) {
        this.a = miVar;
    }

    public final void a() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                this.a.onInserted(this.c, this.d);
            } else if (i == 2) {
                this.a.onRemoved(this.c, this.d);
            } else if (i == 3) {
                this.a.onChanged(this.c, this.d, this.e);
            }
            this.e = null;
            this.b = 0;
        }
    }

    public final void onChanged(int i, int i2, Object obj) {
        if (this.b == 3) {
            int i3 = this.c;
            int i4 = this.d;
            if (i <= i3 + i4) {
                int i5 = i + i2;
                if (i5 >= i3 && this.e == obj) {
                    i4 += i3;
                    this.c = Math.min(i, i3);
                    this.d = Math.max(i4, i5) - this.c;
                    return;
                }
            }
        }
        a();
        this.c = i;
        this.d = i2;
        this.e = obj;
        this.b = 3;
    }

    public final void onInserted(int i, int i2) {
        if (this.b == 1) {
            int i3 = this.c;
            if (i >= i3) {
                int i4 = this.d;
                if (i <= i3 + i4) {
                    this.d = i4 + i2;
                    this.c = Math.min(i, i3);
                    return;
                }
            }
        }
        a();
        this.c = i;
        this.d = i2;
        this.b = 1;
    }

    public final void onMoved(int i, int i2) {
        a();
        this.a.onMoved(i, i2);
    }

    public final void onRemoved(int i, int i2) {
        if (this.b == 2) {
            int i3 = this.c;
            if (i3 >= i && i3 <= i + i2) {
                this.d += i2;
                this.c = i;
                return;
            }
        }
        a();
        this.c = i;
        this.d = i2;
        this.b = 2;
    }
}
