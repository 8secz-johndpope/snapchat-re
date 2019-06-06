package com.google.android.gms.internal;

import java.io.IOException;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

@zzabh
public final class zzic {
    private final int zzbae;
    private final zzhs zzbag;
    private String zzbao;
    private String zzbap;
    private final boolean zzbaq = false;
    private final int zzbar;
    private final int zzbas;

    public zzic(int i, int i2, int i3) {
        this.zzbae = i;
        if (i2 > 64 || i2 < 0) {
            this.zzbar = 64;
        } else {
            this.zzbar = i2;
        }
        if (i3 <= 0) {
            this.zzbas = 1;
        } else {
            this.zzbas = i3;
        }
        this.zzbag = new zzib(this.zzbar);
    }

    private final boolean zza(String str, HashSet<String> hashSet) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return true;
        }
        for (String str2 : split) {
            String str22;
            int i;
            Object obj;
            int i2;
            if (str22.indexOf("'") != -1) {
                StringBuilder stringBuilder = new StringBuilder(str22);
                i = 1;
                obj = null;
                while (true) {
                    i2 = i + 2;
                    if (i2 > stringBuilder.length()) {
                        break;
                    }
                    if (stringBuilder.charAt(i) == '\'') {
                        if (stringBuilder.charAt(i - 1) != ' ') {
                            int i3 = i + 1;
                            if ((stringBuilder.charAt(i3) == 's' || stringBuilder.charAt(i3) == 'S') && (i2 == stringBuilder.length() || stringBuilder.charAt(i2) == ' ')) {
                                stringBuilder.insert(i, ' ');
                                i = i2;
                                obj = 1;
                            }
                        }
                        stringBuilder.setCharAt(i, ' ');
                        obj = 1;
                    }
                    i++;
                }
                String stringBuilder2 = obj != null ? stringBuilder.toString() : null;
                if (stringBuilder2 != null) {
                    this.zzbap = stringBuilder2;
                    str22 = stringBuilder2;
                }
            }
            String[] zzb = zzhw.zzb(str22, true);
            if (zzb.length >= this.zzbas) {
                for (int i4 = 0; i4 < zzb.length; i4++) {
                    Object obj2;
                    obj = "";
                    for (i = 0; i < this.zzbas; i++) {
                        i2 = i4 + i;
                        if (i2 >= zzb.length) {
                            obj2 = null;
                            break;
                        }
                        if (i > 0) {
                            obj = String.valueOf(obj).concat(" ");
                        }
                        String valueOf = String.valueOf(obj);
                        String valueOf2 = String.valueOf(zzb[i2]);
                        obj = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                    }
                    obj2 = 1;
                    if (obj2 == null) {
                        break;
                    }
                    hashSet.add(obj);
                    if (hashSet.size() >= this.zzbae) {
                        return false;
                    }
                }
                if (hashSet.size() >= this.zzbae) {
                    return false;
                }
            }
        }
        return true;
    }

    public final String zza(ArrayList<String> arrayList, ArrayList<zzhr> arrayList2) {
        Collections.sort(arrayList2, new zzid(this));
        HashSet hashSet = new HashSet();
        int i = 0;
        while (i < arrayList2.size() && zza(Normalizer.normalize((CharSequence) arrayList.get(((zzhr) arrayList2.get(i)).zzhg()), Form.NFKC).toLowerCase(Locale.US), hashSet)) {
            i++;
        }
        zzhv zzhv = new zzhv();
        this.zzbao = "";
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                zzhv.write(this.zzbag.zzy((String) it.next()));
            } catch (IOException e) {
                zzaky.zzb("Error while writing hash to byteStream", e);
            }
        }
        return zzhv.toString();
    }
}
