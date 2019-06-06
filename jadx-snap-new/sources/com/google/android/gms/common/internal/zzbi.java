package com.google.android.gms.common.internal;

import defpackage.ppy;
import java.util.ArrayList;
import java.util.List;

public final class zzbi {
    private final Object zzdht;
    private final List<String> zzgho;

    private zzbi(Object obj) {
        this.zzdht = zzbq.checkNotNull(obj);
        this.zzgho = new ArrayList();
    }

    /* synthetic */ zzbi(Object obj, zzbh zzbh) {
        this(obj);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(100);
        stringBuilder.append(this.zzdht.getClass().getSimpleName());
        stringBuilder.append('{');
        int size = this.zzgho.size();
        for (int i = 0; i < size; i++) {
            stringBuilder.append((String) this.zzgho.get(i));
            if (i < size - 1) {
                stringBuilder.append(ppy.d);
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final zzbi zzg(String str, Object obj) {
        List list = this.zzgho;
        str = (String) zzbq.checkNotNull(str);
        String valueOf = String.valueOf(obj);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(valueOf).length());
        stringBuilder.append(str);
        stringBuilder.append("=");
        stringBuilder.append(valueOf);
        list.add(stringBuilder.toString());
        return this;
    }
}
