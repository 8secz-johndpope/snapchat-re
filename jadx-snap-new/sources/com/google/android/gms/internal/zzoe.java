package com.google.android.gms.internal;

import android.content.SharedPreferences.Editor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

@zzabh
public final class zzoe {
    private final Collection<zzny<?>> zzbkt = new ArrayList();
    private final Collection<zzny<String>> zzbku = new ArrayList();
    private final Collection<zzny<String>> zzbkv = new ArrayList();

    public final void zza(Editor editor, int i, JSONObject jSONObject) {
        for (zzny zzny : this.zzbkt) {
            if (zzny.getSource() == 1) {
                zzny.zza(editor, zzny.zzb(jSONObject));
            }
        }
    }

    public final void zza(zzny zzny) {
        this.zzbkt.add(zzny);
    }

    public final void zzb(zzny<String> zzny) {
        this.zzbku.add(zzny);
    }

    public final void zzc(zzny<String> zzny) {
        this.zzbkv.add(zzny);
    }

    public final List<String> zzjf() {
        ArrayList arrayList = new ArrayList();
        for (zzny zzd : this.zzbku) {
            String str = (String) zzlc.zzio().zzd(zzd);
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final List<String> zzjg() {
        List zzjf = zzjf();
        for (zzny zzd : this.zzbkv) {
            String str = (String) zzlc.zzio().zzd(zzd);
            if (str != null) {
                zzjf.add(str);
            }
        }
        return zzjf;
    }
}
