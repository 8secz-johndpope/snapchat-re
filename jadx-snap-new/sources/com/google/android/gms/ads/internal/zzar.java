package com.google.android.gms.ads.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzahd;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzaof;
import com.google.android.gms.internal.zzqs;
import com.google.android.gms.internal.zzqt;
import com.google.android.gms.internal.zzwr;
import com.google.android.gms.internal.zzwu;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import org.json.JSONObject;

@zzabh
public final class zzar {
    static zzt<zzaof> zza(zzwr zzwr, zzwu zzwu, zzab zzab) {
        return new zzaw(zzwr, zzab, zzwu);
    }

    private static String zza(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap == null) {
            zzaky.zzcz("Bitmap is null. Returning empty string");
            return "";
        }
        bitmap.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
        String str = "data:image/png;base64,";
        String valueOf = String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    private static String zza(zzqs zzqs) {
        if (zzqs == null) {
            zzaky.zzcz("Image is null. Returning empty string");
            return "";
        }
        try {
            Uri uri = zzqs.getUri();
            if (uri != null) {
                return uri.toString();
            }
        } catch (RemoteException unused) {
            zzaky.zzcz("Unable to get image uri. Trying data uri next");
        }
        return zzb(zzqs);
    }

    private static JSONObject zza(Bundle bundle, String str) {
        JSONObject jSONObject = new JSONObject();
        if (!(bundle == null || TextUtils.isEmpty(str))) {
            JSONObject jSONObject2 = new JSONObject(str);
            Iterator keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                if (bundle.containsKey(str2)) {
                    Object obj;
                    if ("image".equals(jSONObject2.getString(str2))) {
                        obj = bundle.get(str2);
                        if (obj instanceof Bitmap) {
                            obj = zza((Bitmap) obj);
                            jSONObject.put(str2, obj);
                        } else {
                            str2 = "Invalid type. An image type extra should return a bitmap";
                        }
                    } else if (bundle.get(str2) instanceof Bitmap) {
                        str2 = "Invalid asset type. Bitmap should be returned only for image type";
                    } else {
                        obj = String.valueOf(bundle.get(str2));
                        jSONObject.put(str2, obj);
                    }
                    zzaky.zzcz(str2);
                }
            }
        }
        return jSONObject;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x013c  */
    public static boolean zza(com.google.android.gms.internal.zzaof r25, com.google.android.gms.internal.zzvw r26, java.util.concurrent.CountDownLatch r27) {
        /*
        r0 = r25;
        r1 = r26;
        r7 = r27;
        r8 = 0;
        r2 = r25.getView();	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        if (r2 != 0) goto L_0x0014;
    L_0x000d:
        r0 = "AdWebView is null";
    L_0x000f:
        com.google.android.gms.internal.zzaky.zzcz(r0);	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        goto L_0x013a;
    L_0x0014:
        r3 = 4;
        r2.setVisibility(r3);	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r2 = r1.zzcje;	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r2 = r2.zzchr;	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        if (r2 == 0) goto L_0x012b;
    L_0x001e:
        r3 = r2.isEmpty();	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        if (r3 == 0) goto L_0x0026;
    L_0x0024:
        goto L_0x012b;
    L_0x0026:
        r3 = r25.zzua();	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r4 = "/nativeExpressAssetsLoaded";
        r5 = new com.google.android.gms.ads.internal.zzau;	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r5.<init>(r7);	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r3.zza(r4, r5);	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r3 = r25.zzua();	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r4 = "/nativeExpressAssetsLoadingFailed";
        r5 = new com.google.android.gms.ads.internal.zzav;	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r5.<init>(r7);	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r3.zza(r4, r5);	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r3 = r1.zzcjf;	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r3 = r3.zzmp();	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r4 = r1.zzcjf;	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r4 = r4.zzmq();	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r5 = "2";
        r5 = r2.contains(r5);	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r6 = 0;
        if (r5 == 0) goto L_0x00b1;
    L_0x0057:
        if (r3 == 0) goto L_0x00b1;
    L_0x0059:
        r2 = new com.google.android.gms.internal.zzpk;	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r10 = r3.getHeadline();	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r11 = r3.getImages();	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r12 = r3.getBody();	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r13 = r3.zzkc();	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r14 = r3.getCallToAction();	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r15 = r3.getStarRating();	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r17 = r3.getStore();	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r18 = r3.getPrice();	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r19 = 0;
        r20 = r3.getExtras();	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r21 = 0;
        r4 = r3.zzmx();	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        if (r4 == 0) goto L_0x0094;
    L_0x0089:
        r4 = r3.zzmx();	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r4 = com.google.android.gms.dynamic.zzn.zzy(r4);	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r6 = r4;
        r6 = (android.view.View) r6;	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
    L_0x0094:
        r22 = r6;
        r23 = r3.zzkh();	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r24 = 0;
        r9 = r2;
        r9.<init>(r10, r11, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24);	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r3 = r1.zzcje;	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r3 = r3.zzchq;	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r4 = r25.zzua();	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r5 = new com.google.android.gms.ads.internal.zzas;	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r5.<init>(r2, r3, r0);	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
    L_0x00ad:
        r4.zza(r5);	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        goto L_0x0108;
    L_0x00b1:
        r3 = "1";
        r2 = r2.contains(r3);	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        if (r2 == 0) goto L_0x0127;
    L_0x00b9:
        if (r4 == 0) goto L_0x0127;
    L_0x00bb:
        r2 = new com.google.android.gms.internal.zzpm;	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r10 = r4.getHeadline();	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r11 = r4.getImages();	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r12 = r4.getBody();	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r13 = r4.zzkj();	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r14 = r4.getCallToAction();	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r15 = r4.getAdvertiser();	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r16 = 0;
        r17 = r4.getExtras();	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r18 = 0;
        r3 = r4.zzmx();	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        if (r3 == 0) goto L_0x00ee;
    L_0x00e3:
        r3 = r4.zzmx();	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r3 = com.google.android.gms.dynamic.zzn.zzy(r3);	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r6 = r3;
        r6 = (android.view.View) r6;	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
    L_0x00ee:
        r19 = r6;
        r20 = r4.zzkh();	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r21 = 0;
        r9 = r2;
        r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21);	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r3 = r1.zzcje;	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r3 = r3.zzchq;	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r4 = r25.zzua();	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r5 = new com.google.android.gms.ads.internal.zzat;	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r5.<init>(r2, r3, r0);	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        goto L_0x00ad;
    L_0x0108:
        r2 = r1.zzcje;	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r3 = r2.zzcho;	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r1 = r1.zzcje;	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        r2 = r1.zzchp;	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        if (r2 == 0) goto L_0x011d;
    L_0x0112:
        r4 = "text/html";
        r5 = "UTF-8";
        r6 = 0;
        r1 = r25;
        r1.loadDataWithBaseURL(r2, r3, r4, r5, r6);	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
        goto L_0x0124;
    L_0x011d:
        r1 = "text/html";
        r2 = "UTF-8";
        r0.loadData(r3, r1, r2);	 Catch:{ RemoteException -> 0x0134, RuntimeException -> 0x012f }
    L_0x0124:
        r0 = 1;
        r8 = 1;
        goto L_0x013a;
    L_0x0127:
        r0 = "No matching template id and mapper";
        goto L_0x000f;
    L_0x012b:
        r0 = "No template ids present in mediation response";
        goto L_0x000f;
    L_0x012f:
        r0 = move-exception;
        r27.countDown();
        throw r0;
    L_0x0134:
        r0 = move-exception;
        r1 = "Unable to invoke load assets";
        com.google.android.gms.internal.zzaky.zzc(r1, r0);
    L_0x013a:
        if (r8 != 0) goto L_0x013f;
    L_0x013c:
        r27.countDown();
    L_0x013f:
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzar.zza(com.google.android.gms.internal.zzaof, com.google.android.gms.internal.zzvw, java.util.concurrent.CountDownLatch):boolean");
    }

    private static String zzb(zzqs zzqs) {
        String str = "";
        String str2;
        try {
            IObjectWrapper zzkb = zzqs.zzkb();
            if (zzkb == null) {
                zzaky.zzcz("Drawable is null. Returning empty string");
                return str;
            }
            Drawable drawable = (Drawable) zzn.zzy(zzkb);
            if (drawable instanceof BitmapDrawable) {
                return zza(((BitmapDrawable) drawable).getBitmap());
            }
            str2 = "Drawable is not an instance of BitmapDrawable. Returning empty string";
            zzaky.zzcz(str2);
            return str;
        } catch (RemoteException unused) {
            str2 = "Unable to get drawable. Returning empty string";
        }
    }

    private static void zzc(zzaof zzaof) {
        OnClickListener onClickListener = zzaof.getOnClickListener();
        if (onClickListener != null) {
            onClickListener.onClick(zzaof.getView());
        }
    }

    private static zzqs zzd(Object obj) {
        return obj instanceof IBinder ? zzqt.zzk((IBinder) obj) : null;
    }

    public static View zze(zzahd zzahd) {
        if (zzahd == null) {
            zzaky.e("AdState is null");
            return null;
        } else if (zzf(zzahd) && zzahd.zzcnm != null) {
            return zzahd.zzcnm.getView();
        } else {
            try {
                IObjectWrapper view = zzahd.zzcjf != null ? zzahd.zzcjf.getView() : null;
                if (view != null) {
                    return (View) zzn.zzy(view);
                }
                zzaky.zzcz("View in mediation adapter is null.");
                return null;
            } catch (RemoteException e) {
                zzaky.zzc("Could not get View from mediation adapter.", e);
                return null;
            }
        }
    }

    public static boolean zzf(zzahd zzahd) {
        return (zzahd == null || !zzahd.zzcto || zzahd.zzcje == null || zzahd.zzcje.zzcho == null) ? false : true;
    }
}
