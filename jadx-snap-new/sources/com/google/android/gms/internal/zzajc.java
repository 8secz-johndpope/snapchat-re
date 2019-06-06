package com.google.android.gms.internal;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.zzbt;
import java.util.ArrayList;
import java.util.List;

@zzabh
public final class zzajc {
    private final Context mContext;
    private int mState;
    private String zzapp;
    private String zzavp;
    private final float zzclx;
    private String zzcwt;
    private String zzdfy;
    private float zzdfz;
    private float zzdga;
    private float zzdgb;

    public zzajc(Context context) {
        this.mState = 0;
        this.mContext = context;
        this.zzclx = context.getResources().getDisplayMetrics().density;
    }

    public zzajc(Context context, String str) {
        this(context);
        this.zzdfy = str;
    }

    private static int zza(List<String> list, String str, boolean z) {
        if (!z) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    private final void zza(int i, float f, float f2) {
        if (i == 0) {
            this.mState = 0;
            this.zzdfz = f;
            this.zzdga = f2;
            this.zzdgb = f2;
            return;
        }
        int i2 = this.mState;
        if (i2 != -1) {
            if (i == 2) {
                if (f2 > this.zzdga) {
                    this.zzdga = f2;
                } else if (f2 < this.zzdgb) {
                    this.zzdgb = f2;
                }
                if (this.zzdga - this.zzdgb > this.zzclx * 30.0f) {
                    this.mState = -1;
                    return;
                }
                i = this.mState;
                if (i == 0 || i == 2 ? f - this.zzdfz < this.zzclx * 50.0f : !(i == 1 || i == 3) || f - this.zzdfz > this.zzclx * -50.0f) {
                    this.zzdfz = f;
                    this.mState++;
                }
                i = this.mState;
                if (i == 1 || i == 3) {
                    if (f > this.zzdfz) {
                        this.zzdfz = f;
                    }
                } else if (i == 2 && f < this.zzdfz) {
                    this.zzdfz = f;
                }
            } else if (i == 1 && i2 == 4) {
                showDialog();
            }
        }
    }

    /* JADX WARNING: Missing block: B:11:0x006c, code skipped:
            if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x0071;
     */
    private final void zzrn() {
        /*
        r5 = this;
        r0 = r5.mContext;
        r0 = r0 instanceof android.app.Activity;
        if (r0 != 0) goto L_0x000c;
    L_0x0006:
        r0 = "Can not create dialog without Activity Context";
        com.google.android.gms.internal.zzaky.zzcy(r0);
        return;
    L_0x000c:
        r0 = r5.zzdfy;
        r1 = android.text.TextUtils.isEmpty(r0);
        if (r1 != 0) goto L_0x006f;
    L_0x0014:
        r1 = "\\+";
        r2 = "%20";
        r0 = r0.replaceAll(r1, r2);
        r1 = new android.net.Uri$Builder;
        r1.<init>();
        r0 = r1.encodedQuery(r0);
        r0 = r0.build();
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        com.google.android.gms.ads.internal.zzbt.zzel();
        r0 = com.google.android.gms.internal.zzaij.zzf(r0);
        r2 = r0.keySet();
        r2 = r2.iterator();
    L_0x003d:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x0060;
    L_0x0043:
        r3 = r2.next();
        r3 = (java.lang.String) r3;
        r1.append(r3);
        r4 = " = ";
        r1.append(r4);
        r3 = r0.get(r3);
        r3 = (java.lang.String) r3;
        r1.append(r3);
        r3 = "\n\n";
        r1.append(r3);
        goto L_0x003d;
    L_0x0060:
        r0 = r1.toString();
        r0 = r0.trim();
        r1 = android.text.TextUtils.isEmpty(r0);
        if (r1 != 0) goto L_0x006f;
    L_0x006e:
        goto L_0x0071;
    L_0x006f:
        r0 = "No debug information";
    L_0x0071:
        r1 = new android.app.AlertDialog$Builder;
        r2 = r5.mContext;
        r1.<init>(r2);
        r1.setMessage(r0);
        r2 = "Ad Information";
        r1.setTitle(r2);
        r2 = new com.google.android.gms.internal.zzaje;
        r2.<init>(r5, r0);
        r0 = "Share";
        r1.setPositiveButton(r0, r2);
        r0 = new com.google.android.gms.internal.zzajf;
        r0.<init>(r5);
        r2 = "Close";
        r1.setNegativeButton(r2, r0);
        r0 = r1.create();
        r0.show();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzajc.zzrn():void");
    }

    private final void zzro() {
        zzaky.zzby("Debug mode [Creative Preview] selected.");
        zzaid.zzb(new zzajg(this));
    }

    private final void zzrp() {
        zzaky.zzby("Debug mode [Troubleshooting] selected.");
        zzaid.zzb(new zzajh(this));
    }

    public final void setAdUnitId(String str) {
        this.zzapp = str;
    }

    public final void showDialog() {
        if (!((Boolean) zzlc.zzio().zzd(zzoi.zzbus)).booleanValue()) {
            if (!((Boolean) zzlc.zzio().zzd(zzoi.zzbur)).booleanValue()) {
                zzrn();
                return;
            }
        }
        if (this.mContext instanceof Activity) {
            String str = !TextUtils.isEmpty(zzbt.zzev().zzrq()) ? "Creative Preview (Enabled)" : "Creative Preview";
            String str2 = zzbt.zzev().zzrr() ? "Troubleshooting (Enabled)" : "Troubleshooting";
            List arrayList = new ArrayList();
            int zza = zza(arrayList, "Ad Information", true);
            int zza2 = zza(arrayList, str, ((Boolean) zzlc.zzio().zzd(zzoi.zzbur)).booleanValue());
            int zza3 = zza(arrayList, str2, ((Boolean) zzlc.zzio().zzd(zzoi.zzbus)).booleanValue());
            Builder builder = new Builder(this.mContext, zzbt.zzen().zzrl());
            builder.setTitle("Select a Debug Mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new zzajd(this, zza, zza2, zza3));
            builder.create().show();
            return;
        }
        zzaky.zzcy("Can not create dialog without Activity Context");
    }

    public final void zzcq(String str) {
        this.zzavp = str;
    }

    public final void zzcr(String str) {
        this.zzdfy = str;
    }

    public final void zzcs(String str) {
        this.zzcwt = str;
    }

    public final void zze(MotionEvent motionEvent) {
        int historySize = motionEvent.getHistorySize();
        for (int i = 0; i < historySize; i++) {
            zza(motionEvent.getActionMasked(), motionEvent.getHistoricalX(0, i), motionEvent.getHistoricalY(0, i));
        }
        zza(motionEvent.getActionMasked(), motionEvent.getX(), motionEvent.getY());
    }
}
