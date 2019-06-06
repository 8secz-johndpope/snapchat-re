package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

@zzabh
public final class zzahd {
    public final int errorCode;
    public final int orientation;
    public final boolean zzaqw;
    public final List<String> zzchw;
    public final List<String> zzchx;
    public final List<String> zzchz;
    public final long zzcic;
    public final zzvp zzcje;
    public final zzwi zzcjf;
    public final String zzcjg;
    public final zzvs zzcjh;
    public final zzaof zzcnm;
    public final zzkk zzcrv;
    public final String zzcry;
    private long zzctn;
    public final boolean zzcto;
    private long zzctp;
    public final List<String> zzctq;
    public final String zzctt;
    public final zzagd zzcuc;
    public final List<String> zzcue;
    public final boolean zzcuf;
    private zzacl zzcug;
    public final String zzcuj;
    public final JSONObject zzdch;
    public boolean zzdci;
    public final zzvq zzdcj;
    public final String zzdck;
    public final zzko zzdcl;
    public final List<String> zzdcm;
    public final long zzdcn;
    public final long zzdco;
    public final zzpx zzdcp;
    public boolean zzdcq;
    public boolean zzdcr;
    public boolean zzdcs;
    public boolean zzdct;
    public final zziu zzdcu;
    public final boolean zzdcv;

    public zzahd(zzahe zzahe, zzaof zzaof, zzvp zzvp, zzwi zzwi, String str, zzvs zzvs, zzpx zzpx, String str2) {
        zzahe zzahe2 = zzahe;
        this(zzahe2.zzcvm.zzcrv, null, zzahe2.zzdcw.zzchw, zzahe2.errorCode, zzahe2.zzdcw.zzchx, zzahe2.zzdcw.zzctq, zzahe2.zzdcw.orientation, zzahe2.zzdcw.zzcic, zzahe2.zzcvm.zzcry, zzahe2.zzdcw.zzcto, null, null, null, zzahe2.zzdcj, null, zzahe2.zzdcw.zzctp, zzahe2.zzaud, zzahe2.zzdcw.zzctn, zzahe2.zzdcn, zzahe2.zzdco, zzahe2.zzdcw.zzctt, zzahe2.zzdch, null, zzahe2.zzdcw.zzcuc, zzahe2.zzdcw.zzcud, zzahe2.zzdcw.zzcud, zzahe2.zzdcw.zzcuf, zzahe2.zzdcw.zzcug, null, zzahe2.zzdcw.zzchz, zzahe2.zzdcw.zzcuj, zzahe2.zzdcu, zzahe2.zzdcw.zzaqw, zzahe2.zzdcv);
    }

    public zzahd(zzkk zzkk, zzaof zzaof, List<String> list, int i, List<String> list2, List<String> list3, int i2, long j, String str, boolean z, zzvp zzvp, zzwi zzwi, String str2, zzvq zzvq, zzvs zzvs, long j2, zzko zzko, long j3, long j4, long j5, String str3, JSONObject jSONObject, zzpx zzpx, zzagd zzagd, List<String> list4, List<String> list5, boolean z2, zzacl zzacl, String str4, List<String> list6, String str5, zziu zziu, boolean z3, boolean z4) {
        this.zzdcq = false;
        this.zzdcr = false;
        this.zzdcs = false;
        this.zzdct = false;
        this.zzcrv = zzkk;
        this.zzcnm = zzaof;
        this.zzchw = zzq(list);
        this.errorCode = i;
        this.zzchx = zzq(list2);
        this.zzctq = zzq(list3);
        this.orientation = i2;
        this.zzcic = j;
        this.zzcry = str;
        this.zzcto = z;
        this.zzcje = zzvp;
        this.zzcjf = zzwi;
        this.zzcjg = str2;
        this.zzdcj = zzvq;
        this.zzcjh = zzvs;
        this.zzctp = j2;
        this.zzdcl = zzko;
        this.zzctn = j3;
        this.zzdcn = j4;
        this.zzdco = j5;
        this.zzctt = str3;
        this.zzdch = jSONObject;
        this.zzdcp = zzpx;
        this.zzcuc = zzagd;
        this.zzdcm = zzq(list4);
        this.zzcue = zzq(list5);
        this.zzcuf = z2;
        this.zzcug = zzacl;
        this.zzdck = str4;
        this.zzchz = zzq(list6);
        this.zzcuj = str5;
        this.zzdcu = zziu;
        this.zzaqw = z3;
        this.zzdcv = z4;
    }

    private static <T> List<T> zzq(List<T> list) {
        return list == null ? null : Collections.unmodifiableList(list);
    }

    public final boolean zzfz() {
        zzaof zzaof = this.zzcnm;
        return (zzaof == null || zzaof.zzua() == null) ? false : this.zzcnm.zzua().zzfz();
    }
}
