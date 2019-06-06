package defpackage;

import defpackage.bly.a;
import defpackage.bly.b;

/* renamed from: bsg */
public abstract class bsg extends bly {
    protected final bly b;

    public bsg(bly bly) {
        this.b = bly;
    }

    public int a(int i, int i2, boolean z) {
        return this.b.a(i, i2, z);
    }

    public final int a(Object obj) {
        return this.b.a(obj);
    }

    public final int a(boolean z) {
        return this.b.a(z);
    }

    public final a a(int i, a aVar, boolean z) {
        return this.b.a(i, aVar, z);
    }

    public final b a(int i, b bVar, boolean z, long j) {
        return this.b.a(i, bVar, z, j);
    }

    public final int b() {
        return this.b.b();
    }

    public final int b(boolean z) {
        return this.b.b(z);
    }

    public final int c() {
        return this.b.c();
    }
}
