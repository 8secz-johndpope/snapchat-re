package defpackage;

import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.Arrays;

/* renamed from: bk */
public final class bk {
    public int a = -1;
    int b = -1;
    public int c = 0;
    public float d;
    float[] e = new float[7];
    int f;
    public int g = 0;
    private String h;
    private bf[] i = new bf[8];
    private int j = 0;

    public bk(int i) {
        this.f = i;
    }

    public final void a() {
        this.h = null;
        this.f = 5;
        this.c = 0;
        this.a = -1;
        this.b = -1;
        this.d = MapboxConstants.MINIMUM_ZOOM;
        this.j = 0;
        this.g = 0;
    }

    public final void a(bf bfVar) {
        int i = 0;
        while (true) {
            int i2 = this.j;
            if (i >= i2) {
                bf[] bfVarArr = this.i;
                if (i2 >= bfVarArr.length) {
                    this.i = (bf[]) Arrays.copyOf(bfVarArr, bfVarArr.length << 1);
                }
                bfVarArr = this.i;
                i2 = this.j;
                bfVarArr[i2] = bfVar;
                this.j = i2 + 1;
                return;
            } else if (this.i[i] != bfVar) {
                i++;
            } else {
                return;
            }
        }
    }

    public final void b(bf bfVar) {
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.i[i2] == bfVar) {
                for (int i3 = 0; i3 < (i - i2) - 1; i3++) {
                    bf[] bfVarArr = this.i;
                    int i4 = i2 + i3;
                    bfVarArr[i4] = bfVarArr[i4 + 1];
                }
                this.j--;
                return;
            }
        }
    }

    public final void c(bf bfVar) {
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].d.a(this.i[i2], bfVar);
        }
        this.j = 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(null);
        return stringBuilder.toString();
    }
}
