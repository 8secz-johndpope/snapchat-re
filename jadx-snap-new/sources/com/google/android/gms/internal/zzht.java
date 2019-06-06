package com.google.android.gms.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

@zzabh
public final class zzht {
    private final int zzbad;
    private final int zzbae;
    private final int zzbaf;
    private final zzhs zzbag = new zzhx();

    public zzht(int i) {
        this.zzbae = i;
        this.zzbad = 6;
        this.zzbaf = 0;
    }

    private final String zzz(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return "";
        }
        zzhv zzhv = new zzhv();
        PriorityQueue priorityQueue = new PriorityQueue(this.zzbae, new zzhu(this));
        for (String zzb : split) {
            String[] zzb2 = zzhw.zzb(zzb, false);
            if (zzb2.length != 0) {
                zzhz.zza(zzb2, this.zzbae, this.zzbad, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzhv.write(this.zzbag.zzy(((zzia) it.next()).zzbak));
            } catch (IOException e) {
                zzaky.zzb("Error while writing hash to byteStream", e);
            }
        }
        return zzhv.toString();
    }

    public final String zza(ArrayList<String> arrayList) {
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            stringBuilder.append(((String) obj).toLowerCase(Locale.US));
            stringBuilder.append(10);
        }
        return zzz(stringBuilder.toString());
    }
}
