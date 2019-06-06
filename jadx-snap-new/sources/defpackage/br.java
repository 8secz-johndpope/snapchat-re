package defpackage;

import java.util.Arrays;

/* renamed from: br */
public class br extends bo {
    protected bo[] V = new bo[4];
    protected int W = 0;

    public final void B() {
        this.W = 0;
    }

    public final void a(bo boVar) {
        int i = this.W + 1;
        bo[] boVarArr = this.V;
        if (i > boVarArr.length) {
            this.V = (bo[]) Arrays.copyOf(boVarArr, boVarArr.length << 1);
        }
        bo[] boVarArr2 = this.V;
        int i2 = this.W;
        boVarArr2[i2] = boVar;
        this.W = i2 + 1;
    }
}
