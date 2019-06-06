package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import com.samsung.android.sdk.camera.SCamera;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

@zzabh
public class zzpz implements zzpv {
    private final Context mContext;
    private final Object mLock = new Object();
    private final zzala zzapq;
    private zzagt zzaqg;
    private final zzaan zzarm;
    private String zzarn;
    private final zzpw zzbyu;
    private final JSONObject zzbyx;
    private final zzpx zzbyy;
    private final zzcv zzbyz;
    boolean zzbza;
    private WeakReference<View> zzbzb = null;

    public zzpz(Context context, zzpw zzpw, zzaan zzaan, zzcv zzcv, JSONObject jSONObject, zzpx zzpx, zzala zzala, String str) {
        this.mContext = context;
        this.zzbyu = zzpw;
        this.zzarm = zzaan;
        this.zzbyz = zzcv;
        this.zzbyx = jSONObject;
        this.zzbyy = zzpx;
        this.zzapq = zzala;
        this.zzarn = str;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x00f9 */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:22|23|34) */
    /* JADX WARNING: Missing block: B:23:?, code skipped:
            com.google.android.gms.internal.zzaky.zzcz("Unable to get asset views information");
     */
    private final org.json.JSONObject zza(java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r13, android.view.View r14) {
        /*
        r12 = this;
        r0 = new org.json.JSONObject;
        r0.<init>();
        if (r13 == 0) goto L_0x0105;
    L_0x0007:
        if (r14 != 0) goto L_0x000b;
    L_0x0009:
        goto L_0x0105;
    L_0x000b:
        r14 = zzm(r14);
        monitor-enter(r13);
        r1 = r13.entrySet();	 Catch:{ all -> 0x0102 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0102 }
    L_0x0018:
        r2 = r1.hasNext();	 Catch:{ all -> 0x0102 }
        if (r2 == 0) goto L_0x0100;
    L_0x001e:
        r2 = r1.next();	 Catch:{ all -> 0x0102 }
        r2 = (java.util.Map.Entry) r2;	 Catch:{ all -> 0x0102 }
        r3 = r2.getValue();	 Catch:{ all -> 0x0102 }
        r3 = (java.lang.ref.WeakReference) r3;	 Catch:{ all -> 0x0102 }
        r3 = r3.get();	 Catch:{ all -> 0x0102 }
        r3 = (android.view.View) r3;	 Catch:{ all -> 0x0102 }
        if (r3 == 0) goto L_0x0018;
    L_0x0032:
        r4 = zzm(r3);	 Catch:{ all -> 0x0102 }
        r5 = new org.json.JSONObject;	 Catch:{ all -> 0x0102 }
        r5.<init>();	 Catch:{ all -> 0x0102 }
        r6 = new org.json.JSONObject;	 Catch:{ all -> 0x0102 }
        r6.<init>();	 Catch:{ all -> 0x0102 }
        r7 = "width";
        r8 = r3.getMeasuredWidth();	 Catch:{ JSONException -> 0x00f9 }
        r8 = r12.zzt(r8);	 Catch:{ JSONException -> 0x00f9 }
        r6.put(r7, r8);	 Catch:{ JSONException -> 0x00f9 }
        r7 = "height";
        r8 = r3.getMeasuredHeight();	 Catch:{ JSONException -> 0x00f9 }
        r8 = r12.zzt(r8);	 Catch:{ JSONException -> 0x00f9 }
        r6.put(r7, r8);	 Catch:{ JSONException -> 0x00f9 }
        r7 = "x";
        r8 = 0;
        r9 = r4[r8];	 Catch:{ JSONException -> 0x00f9 }
        r10 = r14[r8];	 Catch:{ JSONException -> 0x00f9 }
        r9 = r9 - r10;
        r9 = r12.zzt(r9);	 Catch:{ JSONException -> 0x00f9 }
        r6.put(r7, r9);	 Catch:{ JSONException -> 0x00f9 }
        r7 = "y";
        r9 = 1;
        r10 = r4[r9];	 Catch:{ JSONException -> 0x00f9 }
        r11 = r14[r9];	 Catch:{ JSONException -> 0x00f9 }
        r10 = r10 - r11;
        r10 = r12.zzt(r10);	 Catch:{ JSONException -> 0x00f9 }
        r6.put(r7, r10);	 Catch:{ JSONException -> 0x00f9 }
        r7 = "relative_to";
        r10 = "ad_view";
        r6.put(r7, r10);	 Catch:{ JSONException -> 0x00f9 }
        r7 = "frame";
        r5.put(r7, r6);	 Catch:{ JSONException -> 0x00f9 }
        r6 = new android.graphics.Rect;	 Catch:{ JSONException -> 0x00f9 }
        r6.<init>();	 Catch:{ JSONException -> 0x00f9 }
        r7 = r3.getLocalVisibleRect(r6);	 Catch:{ JSONException -> 0x00f9 }
        if (r7 == 0) goto L_0x0094;
    L_0x008f:
        r4 = r12.zzb(r6);	 Catch:{ JSONException -> 0x00f9 }
        goto L_0x00c7;
    L_0x0094:
        r6 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x00f9 }
        r6.<init>();	 Catch:{ JSONException -> 0x00f9 }
        r7 = "width";
        r6.put(r7, r8);	 Catch:{ JSONException -> 0x00f9 }
        r7 = "height";
        r6.put(r7, r8);	 Catch:{ JSONException -> 0x00f9 }
        r7 = "x";
        r10 = r4[r8];	 Catch:{ JSONException -> 0x00f9 }
        r8 = r14[r8];	 Catch:{ JSONException -> 0x00f9 }
        r10 = r10 - r8;
        r8 = r12.zzt(r10);	 Catch:{ JSONException -> 0x00f9 }
        r6.put(r7, r8);	 Catch:{ JSONException -> 0x00f9 }
        r7 = "y";
        r4 = r4[r9];	 Catch:{ JSONException -> 0x00f9 }
        r8 = r14[r9];	 Catch:{ JSONException -> 0x00f9 }
        r4 = r4 - r8;
        r4 = r12.zzt(r4);	 Catch:{ JSONException -> 0x00f9 }
        r6.put(r7, r4);	 Catch:{ JSONException -> 0x00f9 }
        r4 = "relative_to";
        r7 = "ad_view";
        r6.put(r4, r7);	 Catch:{ JSONException -> 0x00f9 }
        r4 = r6;
    L_0x00c7:
        r6 = "visible_bounds";
        r5.put(r6, r4);	 Catch:{ JSONException -> 0x00f9 }
        r4 = r3 instanceof android.widget.TextView;	 Catch:{ JSONException -> 0x00f9 }
        if (r4 == 0) goto L_0x00ee;
    L_0x00d0:
        r3 = (android.widget.TextView) r3;	 Catch:{ JSONException -> 0x00f9 }
        r4 = "text_color";
        r6 = r3.getCurrentTextColor();	 Catch:{ JSONException -> 0x00f9 }
        r5.put(r4, r6);	 Catch:{ JSONException -> 0x00f9 }
        r4 = "font_size";
        r6 = r3.getTextSize();	 Catch:{ JSONException -> 0x00f9 }
        r6 = (double) r6;	 Catch:{ JSONException -> 0x00f9 }
        r5.put(r4, r6);	 Catch:{ JSONException -> 0x00f9 }
        r4 = "text";
        r3 = r3.getText();	 Catch:{ JSONException -> 0x00f9 }
        r5.put(r4, r3);	 Catch:{ JSONException -> 0x00f9 }
    L_0x00ee:
        r2 = r2.getKey();	 Catch:{ JSONException -> 0x00f9 }
        r2 = (java.lang.String) r2;	 Catch:{ JSONException -> 0x00f9 }
        r0.put(r2, r5);	 Catch:{ JSONException -> 0x00f9 }
        goto L_0x0018;
    L_0x00f9:
        r2 = "Unable to get asset views information";
        com.google.android.gms.internal.zzaky.zzcz(r2);	 Catch:{ all -> 0x0102 }
        goto L_0x0018;
    L_0x0100:
        monitor-exit(r13);	 Catch:{ all -> 0x0102 }
        return r0;
    L_0x0102:
        r14 = move-exception;
        monitor-exit(r13);	 Catch:{ all -> 0x0102 }
        throw r14;
    L_0x0105:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzpz.zza(java.util.Map, android.view.View):org.json.JSONObject");
    }

    private final void zza(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6) {
        String str2 = "has_custom_click_handler";
        zzbq.zzgn("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.zzbyx);
            if (jSONObject2 != null) {
                jSONObject7.put("asset_view_signal", jSONObject2);
            }
            if (jSONObject != null) {
                jSONObject7.put("ad_view_signal", jSONObject);
            }
            if (jSONObject5 != null) {
                jSONObject7.put("click_signal", jSONObject5);
            }
            if (jSONObject3 != null) {
                jSONObject7.put("scroll_view_signal", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject7.put("lock_screen_signal", jSONObject4);
            }
            jSONObject = new JSONObject();
            jSONObject.put("asset_id", str);
            jSONObject.put("template", this.zzbyy.zzke());
            zzbt.zzen();
            jSONObject.put("is_privileged_process", zzaip.zzrk());
            boolean z = true;
            jSONObject.put(str2, this.zzbyu.zzs(this.zzbyy.getCustomTemplateId()) != null);
            if (this.zzbyu.zzs(this.zzbyy.getCustomTemplateId()) == null) {
                z = false;
            }
            jSONObject7.put(str2, z);
            try {
                jSONObject2 = this.zzbyx.optJSONObject("tracking_urls_and_actions");
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                jSONObject.put("click_signals", this.zzbyz.zzae().zza(this.mContext, jSONObject2.optString("click_string"), view));
            } catch (Exception e) {
                zzaky.zzb("Exception obtaining click signals", e);
            }
            jSONObject7.put("click", jSONObject);
            if (jSONObject6 != null) {
                jSONObject7.put("provided_signals", jSONObject6);
            }
            jSONObject7.put("ads_id", this.zzarn);
            zzalg.zza(this.zzarm.zzi(jSONObject7), "NativeAdEngineImpl.performClick");
        } catch (JSONException e2) {
            zzaky.zzb("Unable to create click JSON.", e2);
        }
    }

    private final boolean zza(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        zzbq.zzgn("recordImpression must be called on the main UI thread.");
        if (this.zzbza) {
            return true;
        }
        this.zzbza = true;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzbyx);
            jSONObject6.put("ads_id", this.zzarn);
            if (jSONObject2 != null) {
                jSONObject6.put("asset_view_signal", jSONObject2);
            }
            if (jSONObject != null) {
                jSONObject6.put("ad_view_signal", jSONObject);
            }
            if (jSONObject3 != null) {
                jSONObject6.put("scroll_view_signal", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject6.put("lock_screen_signal", jSONObject4);
            }
            if (jSONObject5 != null) {
                jSONObject6.put("provided_signals", jSONObject5);
            }
            zzalg.zza(this.zzarm.zzj(jSONObject6), "NativeAdEngineImpl.recordImpression");
            this.zzbyu.zza((zzpv) this);
            this.zzbyu.zzcb();
            return true;
        } catch (JSONException e) {
            zzaky.zzb("Unable to create impression JSON.", e);
            return false;
        }
    }

    private final boolean zzar(String str) {
        JSONObject jSONObject = this.zzbyx;
        jSONObject = jSONObject == null ? null : jSONObject.optJSONObject("allow_pub_event_reporting");
        return jSONObject == null ? false : jSONObject.optBoolean(str, false);
    }

    private final JSONObject zzb(Rect rect) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", zzt(rect.right - rect.left));
        jSONObject.put("height", zzt(rect.bottom - rect.top));
        jSONObject.put("x", zzt(rect.left));
        jSONObject.put("y", zzt(rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    private static boolean zzl(View view) {
        return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
    }

    private static int[] zzm(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    private final JSONObject zzn(View view) {
        String str = "window";
        String str2 = "relative_to";
        String str3 = "y";
        String str4 = "x";
        String str5 = "height";
        String str6 = "width";
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            Object zzb;
            int[] zzm = zzm(view);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(str6, zzt(view.getMeasuredWidth()));
            jSONObject2.put(str5, zzt(view.getMeasuredHeight()));
            jSONObject2.put(str4, zzt(zzm[0]));
            jSONObject2.put(str3, zzt(zzm[1]));
            jSONObject2.put(str2, str);
            jSONObject.put("frame", jSONObject2);
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                zzb = zzb(rect);
            } else {
                zzb = new JSONObject();
                zzb.put(str6, 0);
                zzb.put(str5, 0);
                zzb.put(str4, zzt(zzm[0]));
                zzb.put(str3, zzt(zzm[1]));
                zzb.put(str2, str);
            }
            jSONObject.put("visible_bounds", zzb);
        } catch (Exception unused) {
            zzaky.zzcz("Unable to get native ad view bounding box");
        }
        return jSONObject;
    }

    private static JSONObject zzo(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            zzbt.zzel();
            jSONObject.put("contained_in_scroll_view", zzaij.zzw(view) != -1);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private final JSONObject zzp(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            zzbt.zzel();
            jSONObject.put("can_show_on_lock_screen", zzaij.zzv(view));
            zzbt.zzel();
            jSONObject.put("is_keyguard_locked", zzaij.zzar(this.mContext));
        } catch (JSONException unused) {
            zzaky.zzcz("Unable to get lock screen information");
        }
        return jSONObject;
    }

    private final int zzt(int i) {
        zzlc.zzij();
        return zzako.zzb(this.mContext, i);
    }

    public final Context getContext() {
        return this.mContext;
    }

    public final void performClick(Bundle bundle) {
        if (bundle == null) {
            zzaky.zzby("Click data is null. No click is reported.");
        } else if (zzar("click_reporting")) {
            zza(null, null, null, null, null, bundle.getBundle("click_signal").getString("asset_id"), null, zzbt.zzel().zza(bundle, null));
        } else {
            zzaky.e("The ad slot cannot handle external click events. You must be whitelisted to be able to report your click events.");
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        if (zzar("impression_reporting")) {
            return zza(null, null, null, null, zzbt.zzel().zza(bundle, null));
        }
        zzaky.e("The ad slot cannot handle external impression events. You must be whitelisted to whitelisted to be able to report your impression events.");
        return false;
    }

    public final void reportTouchEvent(Bundle bundle) {
        if (bundle == null) {
            zzaky.zzby("Touch event data is null. No touch event is reported.");
        } else if (zzar("touch_reporting")) {
            this.zzbyz.zzae().zza((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
        } else {
            zzaky.e("The ad slot cannot handle external touch events. You must be whitelisted to be able to report your touch events.");
        }
    }

    public View zza(OnClickListener onClickListener, boolean z) {
        zzph zzkf = this.zzbyy.zzkf();
        if (zzkf == null) {
            return null;
        }
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        if (!z) {
            int zzjz = zzkf.zzjz();
            if (zzjz != 0) {
                if (zzjz == 2) {
                    layoutParams.addRule(12);
                } else if (zzjz != 3) {
                    layoutParams.addRule(10);
                } else {
                    layoutParams.addRule(12);
                }
                layoutParams.addRule(11);
            } else {
                layoutParams.addRule(10);
            }
            layoutParams.addRule(9);
        }
        zzpi zzpi = new zzpi(this.mContext, zzkf, layoutParams);
        zzpi.setOnClickListener(onClickListener);
        zzpi.setContentDescription((CharSequence) zzlc.zzio().zzd(zzoi.zzbsr));
        return zzpi;
    }

    public final void zza(View view, zzpt zzpt) {
        if (!zzb(view, zzpt)) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            ((FrameLayout) view).removeAllViews();
            zzpx zzpx = this.zzbyy;
            if (zzpx instanceof zzpy) {
                zzpy zzpy = (zzpy) zzpx;
                if (zzpy.getImages() != null && zzpy.getImages().size() > 0) {
                    Object obj = zzpy.getImages().get(0);
                    zzqs zzk = obj instanceof IBinder ? zzqt.zzk((IBinder) obj) : null;
                    if (zzk != null) {
                        try {
                            IObjectWrapper zzkb = zzk.zzkb();
                            if (zzkb != null) {
                                Drawable drawable = (Drawable) zzn.zzy(zzkb);
                                ImageView imageView = new ImageView(this.mContext);
                                imageView.setImageDrawable(drawable);
                                imageView.setScaleType(ScaleType.CENTER_INSIDE);
                                ((FrameLayout) view).addView(imageView, layoutParams);
                            }
                        } catch (RemoteException unused) {
                            zzaky.zzcz("Could not get drawable from image");
                        }
                    }
                }
            }
        }
    }

    public final void zza(View view, String str, Bundle bundle, Map<String, WeakReference<View>> map, View view2) {
        JSONObject jSONObject;
        Throwable e;
        JSONObject zza = zza((Map) map, view2);
        JSONObject zzn = zzn(view2);
        JSONObject zzo = zzo(view2);
        JSONObject zzp = zzp(view2);
        JSONObject jSONObject2 = null;
        try {
            JSONObject zza2 = zzbt.zzel().zza(bundle, null);
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("click_point", zza2);
                jSONObject3.put("asset_id", str);
                jSONObject = jSONObject3;
            } catch (Exception e2) {
                e = e2;
                jSONObject2 = jSONObject3;
                zzaky.zzb("Error occurred while grabbing click signals.", e);
                jSONObject = jSONObject2;
                zza(view, zzn, zza, zzo, zzp, str, jSONObject, null);
            }
        } catch (Exception e3) {
            e = e3;
            zzaky.zzb("Error occurred while grabbing click signals.", e);
            jSONObject = jSONObject2;
            zza(view, zzn, zza, zzo, zzp, str, jSONObject, null);
        }
        zza(view, zzn, zza, zzo, zzp, str, jSONObject, null);
    }

    public void zza(View view, Map<String, WeakReference<View>> map) {
        zza(zzn(view), zza((Map) map, view), zzo(view), zzp(view), null);
    }

    public void zza(View view, Map<String, WeakReference<View>> map, Bundle bundle, View view2) {
        String str;
        zzbq.zzgn("performClick must be called on the main UI thread.");
        if (map != null) {
            synchronized (map) {
                for (Entry entry : map.entrySet()) {
                    if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                        zza(view, (String) entry.getKey(), bundle, (Map) map, view2);
                        return;
                    }
                }
            }
        }
        if ("6".equals(this.zzbyy.zzke())) {
            str = "3099";
        } else {
            if ("2".equals(this.zzbyy.zzke())) {
                str = "2099";
            } else {
                if (SCamera.CAMERA_ID_FRONT.equals(this.zzbyy.zzke())) {
                    zza(view, "1099", bundle, (Map) map, view2);
                }
                return;
            }
        }
        zza(view, str, bundle, (Map) map, view2);
    }

    public void zza(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, OnTouchListener onTouchListener, OnClickListener onClickListener) {
        if (((Boolean) zzlc.zzio().zzd(zzoi.zzbsp)).booleanValue()) {
            view.setOnTouchListener(onTouchListener);
            view.setClickable(true);
            view.setOnClickListener(onClickListener);
            if (map != null) {
                synchronized (map) {
                    for (Entry value : map.entrySet()) {
                        View view2 = (View) ((WeakReference) value.getValue()).get();
                        if (view2 != null) {
                            view2.setOnTouchListener(onTouchListener);
                            view2.setClickable(true);
                            view2.setOnClickListener(onClickListener);
                        }
                    }
                }
            }
            if (map2 != null) {
                synchronized (map2) {
                    for (Entry value2 : map2.entrySet()) {
                        View view3 = (View) ((WeakReference) value2.getValue()).get();
                        if (view3 != null) {
                            view3.setOnTouchListener(onTouchListener);
                        }
                    }
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x0053 in {2, 5, 13, 15, 18} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public void zzb(android.view.View r4, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5) {
        /*
        r3 = this;
        r0 = com.google.android.gms.internal.zzoi.zzbso;
        r1 = com.google.android.gms.internal.zzlc.zzio();
        r0 = r1.zzd(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x0013;
        return;
        r0 = 0;
        r4.setOnTouchListener(r0);
        r1 = 0;
        r4.setClickable(r1);
        r4.setOnClickListener(r0);
        if (r5 != 0) goto L_0x0021;
        return;
        monitor-enter(r5);
        r4 = r5.entrySet();	 Catch:{ all -> 0x0050 }
        r4 = r4.iterator();	 Catch:{ all -> 0x0050 }
        r2 = r4.hasNext();	 Catch:{ all -> 0x0050 }
        if (r2 == 0) goto L_0x004e;	 Catch:{ all -> 0x0050 }
        r2 = r4.next();	 Catch:{ all -> 0x0050 }
        r2 = (java.util.Map.Entry) r2;	 Catch:{ all -> 0x0050 }
        r2 = r2.getValue();	 Catch:{ all -> 0x0050 }
        r2 = (java.lang.ref.WeakReference) r2;	 Catch:{ all -> 0x0050 }
        r2 = r2.get();	 Catch:{ all -> 0x0050 }
        r2 = (android.view.View) r2;	 Catch:{ all -> 0x0050 }
        if (r2 == 0) goto L_0x002a;	 Catch:{ all -> 0x0050 }
        r2.setOnTouchListener(r0);	 Catch:{ all -> 0x0050 }
        r2.setClickable(r1);	 Catch:{ all -> 0x0050 }
        r2.setOnClickListener(r0);	 Catch:{ all -> 0x0050 }
        goto L_0x002a;	 Catch:{ all -> 0x0050 }
        monitor-exit(r5);	 Catch:{ all -> 0x0050 }
        return;	 Catch:{ all -> 0x0050 }
        r4 = move-exception;	 Catch:{ all -> 0x0050 }
        monitor-exit(r5);	 Catch:{ all -> 0x0050 }
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzpz.zzb(android.view.View, java.util.Map):void");
    }

    public final boolean zzb(View view, zzpt zzpt) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        View zzkg = this.zzbyy.zzkg();
        if (zzkg == null) {
            return false;
        }
        ViewParent parent = zzkg.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(zzkg);
        }
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        frameLayout.addView(zzkg, layoutParams);
        this.zzbyu.zza(zzpt);
        return true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:41:0x0061 in {6, 11, 28, 31, 35, 37, 40} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final void zzc(android.view.View r4, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5) {
        /*
        r3 = this;
        r0 = r3.mLock;
        monitor-enter(r0);
        r1 = r3.zzbza;	 Catch:{ all -> 0x005e }
        if (r1 == 0) goto L_0x0009;	 Catch:{ all -> 0x005e }
        monitor-exit(r0);	 Catch:{ all -> 0x005e }
        return;	 Catch:{ all -> 0x005e }
        r1 = zzl(r4);	 Catch:{ all -> 0x005e }
        if (r1 == 0) goto L_0x0014;	 Catch:{ all -> 0x005e }
        r3.zza(r4, r5);	 Catch:{ all -> 0x005e }
        monitor-exit(r0);	 Catch:{ all -> 0x005e }
        return;	 Catch:{ all -> 0x005e }
        r1 = com.google.android.gms.internal.zzoi.zzbsw;	 Catch:{ all -> 0x005e }
        r2 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ all -> 0x005e }
        r1 = r2.zzd(r1);	 Catch:{ all -> 0x005e }
        r1 = (java.lang.Boolean) r1;	 Catch:{ all -> 0x005e }
        r1 = r1.booleanValue();	 Catch:{ all -> 0x005e }
        if (r1 == 0) goto L_0x005c;	 Catch:{ all -> 0x005e }
        if (r5 == 0) goto L_0x005c;	 Catch:{ all -> 0x005e }
        monitor-enter(r5);	 Catch:{ all -> 0x005e }
        r1 = r5.entrySet();	 Catch:{ all -> 0x0059 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0059 }
        r2 = r1.hasNext();	 Catch:{ all -> 0x0059 }
        if (r2 == 0) goto L_0x0057;	 Catch:{ all -> 0x0059 }
        r2 = r1.next();	 Catch:{ all -> 0x0059 }
        r2 = (java.util.Map.Entry) r2;	 Catch:{ all -> 0x0059 }
        r2 = r2.getValue();	 Catch:{ all -> 0x0059 }
        r2 = (java.lang.ref.WeakReference) r2;	 Catch:{ all -> 0x0059 }
        r2 = r2.get();	 Catch:{ all -> 0x0059 }
        r2 = (android.view.View) r2;	 Catch:{ all -> 0x0059 }
        if (r2 == 0) goto L_0x0031;	 Catch:{ all -> 0x0059 }
        r2 = zzl(r2);	 Catch:{ all -> 0x0059 }
        if (r2 == 0) goto L_0x0031;	 Catch:{ all -> 0x0059 }
        r3.zza(r4, r5);	 Catch:{ all -> 0x0059 }
        monitor-exit(r5);	 Catch:{ all -> 0x0059 }
        monitor-exit(r0);	 Catch:{ all -> 0x005e }
        return;
        monitor-exit(r5);	 Catch:{ all -> 0x0059 }
        goto L_0x005c;	 Catch:{ all -> 0x0059 }
        r4 = move-exception;	 Catch:{ all -> 0x0059 }
        monitor-exit(r5);	 Catch:{ all -> 0x0059 }
        throw r4;	 Catch:{ all -> 0x005e }
        monitor-exit(r0);	 Catch:{ all -> 0x005e }
        return;	 Catch:{ all -> 0x005e }
        r4 = move-exception;	 Catch:{ all -> 0x005e }
        monitor-exit(r0);	 Catch:{ all -> 0x005e }
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzpz.zzc(android.view.View, java.util.Map):void");
    }

    public final void zzd(MotionEvent motionEvent) {
        this.zzbyz.zza(motionEvent);
    }

    public final void zzh(Map<String, WeakReference<View>> map) {
        if (this.zzbyy.zzkg() != null) {
            if ("2".equals(this.zzbyy.zzke())) {
                zzbt.zzep().zzqe().zza(this.zzbyu.getAdUnitId(), this.zzbyy.zzke(), map.containsKey("2011"));
                return;
            }
            if (SCamera.CAMERA_ID_FRONT.equals(this.zzbyy.zzke())) {
                zzbt.zzep().zzqe().zza(this.zzbyu.getAdUnitId(), this.zzbyy.zzke(), map.containsKey("1009"));
            }
        }
    }

    public final void zzi(View view) {
        if (((Boolean) zzlc.zzio().zzd(zzoi.zzbrm)).booleanValue()) {
            zzcv zzcv = this.zzbyz;
            if (zzcv != null) {
                zzcr zzae = zzcv.zzae();
                if (zzae != null) {
                    zzae.zzb(view);
                }
            }
        }
    }

    public final void zzk(View view) {
        this.zzbzb = new WeakReference(view);
    }

    public boolean zzkm() {
        zzph zzkf = this.zzbyy.zzkf();
        return zzkf != null && zzkf.zzka();
    }

    public boolean zzkn() {
        JSONObject jSONObject = this.zzbyx;
        return jSONObject != null && jSONObject.optBoolean("allow_pub_owned_ad_view", false);
    }

    public zzaof zzkq() {
        JSONObject jSONObject = this.zzbyx;
        if (jSONObject == null || jSONObject.optJSONObject("overlay") == null) {
            return null;
        }
        zzaol zzem = zzbt.zzem();
        Context context = this.mContext;
        zzko zzf = zzko.zzf(context);
        zzaof zza = zzem.zza(context, zzaqa.zzc(zzf), zzf.zzbia, false, false, this.zzbyz, this.zzapq, null, null, null, zziu.zzhp());
        if (zza != null) {
            zza.getView().setVisibility(8);
            new zzqb(zza).zza(this.zzarm);
        }
        return zza;
    }

    public void zzkr() {
        this.zzarm.zzmd();
    }

    public void zzks() {
        this.zzbyu.zzcu();
    }

    public final View zzkt() {
        WeakReference weakReference = this.zzbzb;
        return weakReference != null ? (View) weakReference.get() : null;
    }

    public final zzagt zzku() {
        if (!zzbt.zzfh().zzs(this.mContext)) {
            return null;
        }
        if (this.zzaqg == null) {
            this.zzaqg = new zzagt(this.mContext, this.zzbyu.getAdUnitId());
        }
        return this.zzaqg;
    }
}
