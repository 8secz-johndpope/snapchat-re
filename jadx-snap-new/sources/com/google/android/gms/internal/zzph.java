package com.google.android.gms.internal;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

@zzabh
public final class zzph extends zzqp {
    private static final int zzbxf = Color.rgb(12, 174, 206);
    private static final int zzbxg;
    private static int zzbxh;
    private static int zzbxi = zzbxf;
    private final int mTextColor;
    private final String zzbxj;
    private final List<zzpj> zzbxk = new ArrayList();
    private final List<zzqs> zzbxl = new ArrayList();
    private final int zzbxm;
    private final int zzbxn;
    private final int zzbxo;
    private final int zzbxp;
    private final boolean zzbxq;

    static {
        int rgb = Color.rgb(204, 204, 204);
        zzbxg = rgb;
        zzbxh = rgb;
    }

    public zzph(String str, List<zzpj> list, Integer num, Integer num2, Integer num3, int i, int i2, boolean z) {
        this.zzbxj = str;
        if (list != null) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                zzpj zzpj = (zzpj) list.get(i3);
                this.zzbxk.add(zzpj);
                this.zzbxl.add(zzpj);
            }
        }
        this.zzbxm = num != null ? num.intValue() : zzbxh;
        this.mTextColor = num2 != null ? num2.intValue() : zzbxi;
        this.zzbxn = num3 != null ? num3.intValue() : 12;
        this.zzbxo = i;
        this.zzbxp = i2;
        this.zzbxq = z;
    }

    public final int getBackgroundColor() {
        return this.zzbxm;
    }

    public final String getText() {
        return this.zzbxj;
    }

    public final int getTextColor() {
        return this.mTextColor;
    }

    public final int getTextSize() {
        return this.zzbxn;
    }

    public final List<zzqs> zzjw() {
        return this.zzbxl;
    }

    public final List<zzpj> zzjx() {
        return this.zzbxk;
    }

    public final int zzjy() {
        return this.zzbxo;
    }

    public final int zzjz() {
        return this.zzbxp;
    }

    public final boolean zzka() {
        return this.zzbxq;
    }
}
