package defpackage;

import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.Arrays;

/* renamed from: be */
public final class be {
    int a = 0;
    final bf b;
    final bg c;
    int[] d;
    int[] e;
    float[] f;
    int g;
    private int h = 8;
    private bk i = null;
    private int j;
    private boolean k;

    be(bf bfVar, bg bgVar) {
        int i = this.h;
        this.d = new int[i];
        this.e = new int[i];
        this.f = new float[i];
        this.g = -1;
        this.j = -1;
        this.k = false;
        this.b = bfVar;
        this.c = bgVar;
    }

    static boolean a(bk bkVar) {
        return bkVar.g <= 1;
    }

    public final float a(bk bkVar, boolean z) {
        if (bkVar == null) {
            this.i = null;
        }
        int i = this.g;
        if (i == -1) {
            return MapboxConstants.MINIMUM_ZOOM;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.a) {
            if (this.d[i] == bkVar.a) {
                if (i == this.g) {
                    this.g = this.e[i];
                } else {
                    int[] iArr = this.e;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    bkVar.b(this.b);
                }
                bkVar.g--;
                this.a--;
                this.d[i] = -1;
                if (this.k) {
                    this.j = i;
                }
                return this.f[i];
            }
            i2++;
            i3 = i;
            i = this.e[i];
        }
        return MapboxConstants.MINIMUM_ZOOM;
    }

    /* Access modifiers changed, original: final */
    public final bk a(int i) {
        int i2 = this.g;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            if (i3 == i) {
                return this.c.c[this.d[i2]];
            }
            i2 = this.e[i2];
            i3++;
        }
        return null;
    }

    /* Access modifiers changed, original: final */
    public final bk a(boolean[] zArr, bk bkVar) {
        int i = this.g;
        int i2 = 0;
        bk bkVar2 = null;
        float f = MapboxConstants.MINIMUM_ZOOM;
        while (i != -1 && i2 < this.a) {
            if (this.f[i] < MapboxConstants.MINIMUM_ZOOM) {
                bk bkVar3 = this.c.c[this.d[i]];
                if ((zArr == null || !zArr[bkVar3.a]) && bkVar3 != bkVar && (bkVar3.f == 3 || bkVar3.f == 4)) {
                    float f2 = this.f[i];
                    if (f2 < f) {
                        bkVar2 = bkVar3;
                        f = f2;
                    }
                }
            }
            i = this.e[i];
            i2++;
        }
        return bkVar2;
    }

    public final void a() {
        int i = this.g;
        int i2 = 0;
        while (i != -1 && i2 < this.a) {
            bk bkVar = this.c.c[this.d[i]];
            if (bkVar != null) {
                bkVar.b(this.b);
            }
            i = this.e[i];
            i2++;
        }
        this.g = -1;
        this.j = -1;
        this.k = false;
        this.a = 0;
    }

    /* Access modifiers changed, original: final */
    public final void a(bf bfVar, bf bfVar2) {
        int i = this.g;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.a) {
                if (this.d[i] == bfVar2.a.a) {
                    float f = this.f[i];
                    a(bfVar2.a, false);
                    be beVar = bfVar2.d;
                    int i3 = beVar.g;
                    int i4 = 0;
                    while (i3 != -1 && i4 < beVar.a) {
                        a(this.c.c[beVar.d[i3]], beVar.f[i3] * f, false);
                        i3 = beVar.e[i3];
                        i4++;
                    }
                    bfVar.b += bfVar2.b * f;
                    i = this.g;
                } else {
                    i = this.e[i];
                    i2++;
                }
            }
            return;
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(bf bfVar, bf[] bfVarArr) {
        int i = this.g;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.a) {
                bk bkVar = this.c.c[this.d[i]];
                if (bkVar.b != -1) {
                    float f = this.f[i];
                    a(bkVar, true);
                    bf bfVar2 = bfVarArr[bkVar.b];
                    if (!bfVar2.e) {
                        be beVar = bfVar2.d;
                        int i3 = beVar.g;
                        int i4 = 0;
                        while (i3 != -1 && i4 < beVar.a) {
                            a(this.c.c[beVar.d[i3]], beVar.f[i3] * f, true);
                            i3 = beVar.e[i3];
                            i4++;
                        }
                    }
                    bfVar.b += bfVar2.b * f;
                    bfVar2.a.b(bfVar);
                    i = this.g;
                } else {
                    i = this.e[i];
                    i2++;
                }
            }
            return;
        }
    }

    public final void a(bk bkVar, float f) {
        if (f == MapboxConstants.MINIMUM_ZOOM) {
            a(bkVar, true);
            return;
        }
        int i = this.g;
        int i2;
        int[] iArr;
        if (i == -1) {
            this.g = 0;
            float[] fArr = this.f;
            int i3 = this.g;
            fArr[i3] = f;
            this.d[i3] = bkVar.a;
            this.e[this.g] = -1;
            bkVar.g++;
            bkVar.a(this.b);
            this.a++;
            if (!this.k) {
                this.j++;
                i2 = this.j;
                iArr = this.d;
                if (i2 >= iArr.length) {
                    this.k = true;
                    this.j = iArr.length - 1;
                }
            }
            return;
        }
        int[] iArr2;
        int i4 = 0;
        int i5 = -1;
        while (i != -1 && i4 < this.a) {
            if (this.d[i] == bkVar.a) {
                this.f[i] = f;
                return;
            }
            if (this.d[i] < bkVar.a) {
                i5 = i;
            }
            i = this.e[i];
            i4++;
        }
        i = this.j;
        i4 = i + 1;
        if (this.k) {
            iArr2 = this.d;
            if (iArr2[i] != -1) {
                i = iArr2.length;
            }
        } else {
            i = i4;
        }
        iArr2 = this.d;
        if (i >= iArr2.length && this.a < iArr2.length) {
            i4 = 0;
            while (true) {
                int[] iArr3 = this.d;
                if (i4 >= iArr3.length) {
                    break;
                } else if (iArr3[i4] == -1) {
                    i = i4;
                    break;
                } else {
                    i4++;
                }
            }
        }
        iArr2 = this.d;
        if (i >= iArr2.length) {
            i = iArr2.length;
            this.h <<= 1;
            this.k = false;
            this.j = i - 1;
            this.f = Arrays.copyOf(this.f, this.h);
            this.d = Arrays.copyOf(this.d, this.h);
            this.e = Arrays.copyOf(this.e, this.h);
        }
        this.d[i] = bkVar.a;
        this.f[i] = f;
        if (i5 != -1) {
            iArr = this.e;
            iArr[i] = iArr[i5];
            iArr[i5] = i;
        } else {
            this.e[i] = this.g;
            this.g = i;
        }
        bkVar.g++;
        bkVar.a(this.b);
        this.a++;
        if (!this.k) {
            this.j++;
        }
        if (this.a >= this.d.length) {
            this.k = true;
        }
        i2 = this.j;
        iArr = this.d;
        if (i2 >= iArr.length) {
            this.k = true;
            this.j = iArr.length - 1;
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(bk bkVar, float f, boolean z) {
        if (f != MapboxConstants.MINIMUM_ZOOM) {
            int i = this.g;
            int i2;
            int i3;
            int[] iArr;
            if (i == -1) {
                this.g = 0;
                float[] fArr = this.f;
                i2 = this.g;
                fArr[i2] = f;
                this.d[i2] = bkVar.a;
                this.e[this.g] = -1;
                bkVar.g++;
                bkVar.a(this.b);
                this.a++;
                if (!this.k) {
                    this.j++;
                    i3 = this.j;
                    iArr = this.d;
                    if (i3 >= iArr.length) {
                        this.k = true;
                        this.j = iArr.length - 1;
                    }
                }
                return;
            }
            int[] iArr2;
            int i4 = 0;
            int i5 = -1;
            while (i != -1 && i4 < this.a) {
                if (this.d[i] == bkVar.a) {
                    float[] fArr2 = this.f;
                    fArr2[i] = fArr2[i] + f;
                    if (fArr2[i] == MapboxConstants.MINIMUM_ZOOM) {
                        if (i == this.g) {
                            this.g = this.e[i];
                        } else {
                            iArr = this.e;
                            iArr[i5] = iArr[i];
                        }
                        if (z) {
                            bkVar.b(this.b);
                        }
                        if (this.k) {
                            this.j = i;
                        }
                        bkVar.g--;
                        this.a--;
                    }
                    return;
                }
                if (this.d[i] < bkVar.a) {
                    i5 = i;
                }
                i = this.e[i];
                i4++;
            }
            int i6 = this.j;
            i2 = i6 + 1;
            if (this.k) {
                iArr2 = this.d;
                if (iArr2[i6] != -1) {
                    i6 = iArr2.length;
                }
            } else {
                i6 = i2;
            }
            iArr2 = this.d;
            if (i6 >= iArr2.length && this.a < iArr2.length) {
                i2 = 0;
                while (true) {
                    int[] iArr3 = this.d;
                    if (i2 >= iArr3.length) {
                        break;
                    } else if (iArr3[i2] == -1) {
                        i6 = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            iArr2 = this.d;
            if (i6 >= iArr2.length) {
                i6 = iArr2.length;
                this.h <<= 1;
                this.k = false;
                this.j = i6 - 1;
                this.f = Arrays.copyOf(this.f, this.h);
                this.d = Arrays.copyOf(this.d, this.h);
                this.e = Arrays.copyOf(this.e, this.h);
            }
            this.d[i6] = bkVar.a;
            this.f[i6] = f;
            if (i5 != -1) {
                iArr = this.e;
                iArr[i6] = iArr[i5];
                iArr[i5] = i6;
            } else {
                this.e[i6] = this.g;
                this.g = i6;
            }
            bkVar.g++;
            bkVar.a(this.b);
            this.a++;
            if (!this.k) {
                this.j++;
            }
            i3 = this.j;
            iArr = this.d;
            if (i3 >= iArr.length) {
                this.k = true;
                this.j = iArr.length - 1;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final float b(int i) {
        int i2 = this.g;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            if (i3 == i) {
                return this.f[i2];
            }
            i2 = this.e[i2];
            i3++;
        }
        return MapboxConstants.MINIMUM_ZOOM;
    }

    public final float b(bk bkVar) {
        int i = this.g;
        int i2 = 0;
        while (i != -1 && i2 < this.a) {
            if (this.d[i] == bkVar.a) {
                return this.f[i];
            }
            i = this.e[i];
            i2++;
        }
        return MapboxConstants.MINIMUM_ZOOM;
    }

    public final String toString() {
        int i = this.g;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" -> ");
            str = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(this.f[i]);
            stringBuilder.append(" : ");
            str = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(this.c.c[this.d[i]]);
            str = stringBuilder.toString();
            i = this.e[i];
            i2++;
        }
        return str;
    }
}
