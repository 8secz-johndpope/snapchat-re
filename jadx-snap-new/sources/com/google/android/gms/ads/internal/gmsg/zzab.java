package com.google.android.gms.ads.internal.gmsg;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.brightcove.player.captioning.TTMLParser.Tags;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzagx;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzala;
import com.google.android.gms.internal.zzaof;
import com.google.android.gms.internal.zzapa;
import com.google.android.gms.internal.zzapb;
import com.google.android.gms.internal.zzapo;
import com.google.android.gms.internal.zzapr;
import com.google.android.gms.internal.zzapt;
import com.google.android.gms.internal.zzcv;
import com.google.android.gms.internal.zzcw;
import com.google.android.gms.internal.zzkf;
import com.google.android.gms.internal.zzyd;
import com.samsung.android.sdk.camera.SCamera;
import java.net.URISyntaxException;
import java.util.Map;

@zzabh
public final class zzab<T extends zzapa & zzapb & zzapo & zzapr & zzapt> implements zzt<T> {
    private final Context mContext;
    private zzala zzarg;
    private zzkf zzbgt;
    private zzb zzcbc;
    private zzw zzccm;
    private zzyd zzccn;
    private final zzcv zzccq;
    private zzt zzccr;
    private zzn zzccs;
    private zzaof zzcct = null;

    public zzab(Context context, zzala zzala, zzcv zzcv, zzt zzt, zzkf zzkf, zzb zzb, zzn zzn, zzw zzw, zzyd zzyd) {
        this.mContext = context;
        this.zzarg = zzala;
        this.zzccq = zzcv;
        this.zzccr = zzt;
        this.zzbgt = zzkf;
        this.zzcbc = zzb;
        this.zzccm = zzw;
        this.zzccn = zzyd;
        this.zzccs = zzn;
    }

    static String zza(Context context, zzcv zzcv, String str, View view, Activity activity) {
        if (zzcv == null) {
            return str;
        }
        try {
            Uri parse = Uri.parse(str);
            if (zzcv.zzc(parse)) {
                parse = zzcv.zza(parse, context, view, activity);
            }
            return parse.toString();
        } catch (zzcw unused) {
            return str;
        } catch (Exception e) {
            zzbt.zzep().zza(e, "OpenGmsgHandler.maybeAddClickSignalsToUrl");
            return str;
        }
    }

    private static boolean zzk(Map<String, String> map) {
        return SCamera.CAMERA_ID_FRONT.equals(map.get("custom_close"));
    }

    private static int zzl(Map<String, String> map) {
        String str = (String) map.get("o");
        if (str != null) {
            if (Tags.CAPTION.equalsIgnoreCase(str)) {
                return zzbt.zzen().zzrh();
            }
            if ("l".equalsIgnoreCase(str)) {
                return zzbt.zzen().zzrg();
            }
            if ("c".equalsIgnoreCase(str)) {
                return zzbt.zzen().zzri();
            }
        }
        return -1;
    }

    private final void zzl(boolean z) {
        zzyd zzyd = this.zzccn;
        if (zzyd != null) {
            zzyd.zzm(z);
        }
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        String str = "OpenGmsgHandler.onGmsg";
        zzapa zzapa = (zzapa) obj;
        String zzb = zzagx.zzb((String) map.get("u"), zzapa.getContext());
        String str2 = (String) map.get("a");
        if (str2 == null) {
            zzaky.zzcz("Action missing from an open GMSG.");
            return;
        }
        zzw zzw = this.zzccm;
        if (zzw != null && !zzw.zzcz()) {
            this.zzccm.zzt(zzb);
        } else if ("expand".equalsIgnoreCase(str2)) {
            if (((zzapb) zzapa).zzud()) {
                zzaky.zzcz("Cannot expand WebView that is already expanded.");
                return;
            }
            zzl(false);
            ((zzapo) zzapa).zza(zzk(map), zzl(map));
        } else if ("webapp".equalsIgnoreCase(str2)) {
            zzl(false);
            if (zzb != null) {
                ((zzapo) zzapa).zza(zzk(map), zzl(map), zzb);
            } else {
                ((zzapo) zzapa).zza(zzk(map), zzl(map), (String) map.get("html"), (String) map.get("baseurl"));
            }
        } else {
            if ("app".equalsIgnoreCase(str2)) {
                if ("true".equalsIgnoreCase((String) map.get("system_browser"))) {
                    zzl(true);
                    zzapa.getContext();
                    if (TextUtils.isEmpty(zzb)) {
                        zzaky.zzcz("Destination url cannot be empty.");
                        return;
                    }
                    try {
                        ((zzapo) zzapa).zza(new zzc(new zzac(zzapa.getContext(), ((zzapr) zzapa).zzuc(), ((zzapt) zzapa).getView()).zzm(map)));
                        return;
                    } catch (ActivityNotFoundException e) {
                        zzaky.zzcz(e.getMessage());
                        return;
                    }
                }
            }
            zzl(true);
            str2 = (String) map.get("intent_url");
            Intent intent = null;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    intent = Intent.parseUri(str2, 0);
                } catch (URISyntaxException e2) {
                    String str3 = "Error parsing the url: ";
                    str2 = String.valueOf(str2);
                    zzaky.zzb(str2.length() != 0 ? str3.concat(str2) : new String(str3), e2);
                }
            }
            if (!(intent == null || intent.getData() == null)) {
                Uri data = intent.getData();
                String uri = data.toString();
                if (!TextUtils.isEmpty(uri)) {
                    try {
                        uri = zza(zzapa.getContext(), ((zzapr) zzapa).zzuc(), uri, ((zzapt) zzapa).getView(), zzapa.zztj());
                    } catch (Exception e3) {
                        zzaky.zzb("Error occurred while adding signals.", e3);
                        zzbt.zzep().zza(e3, str);
                    }
                    try {
                        data = Uri.parse(uri);
                    } catch (Exception e32) {
                        String str4 = "Error parsing the uri: ";
                        uri = String.valueOf(uri);
                        zzaky.zzb(uri.length() != 0 ? str4.concat(uri) : new String(str4), e32);
                        zzbt.zzep().zza(e32, str);
                    }
                }
                intent.setData(data);
            }
            if (intent != null) {
                ((zzapo) zzapa).zza(new zzc(intent));
                return;
            }
            if (!TextUtils.isEmpty(zzb)) {
                zzb = zza(zzapa.getContext(), ((zzapr) zzapa).zzuc(), zzb, ((zzapt) zzapa).getView(), zzapa.zztj());
            }
            ((zzapo) zzapa).zza(new zzc((String) map.get("i"), zzb, (String) map.get("m"), (String) map.get(Tags.CAPTION), (String) map.get("c"), (String) map.get("f"), (String) map.get("e")));
        }
    }
}
