package com.google.android.gms.internal;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.R;
import com.google.android.gms.ads.internal.zzbt;
import java.util.Map;

@zzabh
public final class zzyg extends zzyn {
    private final Context mContext;
    private final Map<String, String> zzbwu;

    public zzyg(zzaof zzaof, Map<String, String> map) {
        super(zzaof, "storePicture");
        this.zzbwu = map;
        this.mContext = zzaof.zztj();
    }

    public final void execute() {
        if (this.mContext == null) {
            zzbm("Activity context is not available");
            return;
        }
        zzbt.zzel();
        if (zzaij.zzal(this.mContext).zzjc()) {
            String str = (String) this.zzbwu.get("iurl");
            String lastPathSegment;
            if (TextUtils.isEmpty(str)) {
                zzbm("Image url cannot be empty.");
                return;
            } else if (URLUtil.isValidUrl(str)) {
                lastPathSegment = Uri.parse(str).getLastPathSegment();
                zzbt.zzel();
                if (zzaij.zzck(lastPathSegment)) {
                    Resources resources = zzbt.zzep().getResources();
                    zzbt.zzel();
                    Builder zzak = zzaij.zzak(this.mContext);
                    zzak.setTitle(resources != null ? resources.getString(R.string.s1) : "Save image");
                    zzak.setMessage(resources != null ? resources.getString(R.string.s2) : "Allow Ad to store image in Picture gallery?");
                    zzak.setPositiveButton(resources != null ? resources.getString(R.string.s3) : "Accept", new zzyh(this, str, lastPathSegment));
                    zzak.setNegativeButton(resources != null ? resources.getString(R.string.s4) : "Decline", new zzyi(this));
                    zzak.create().show();
                    return;
                }
                str = "Image type not recognized: ";
                lastPathSegment = String.valueOf(lastPathSegment);
                zzbm(lastPathSegment.length() != 0 ? str.concat(lastPathSegment) : new String(str));
                return;
            } else {
                lastPathSegment = "Invalid image url: ";
                str = String.valueOf(str);
                zzbm(str.length() != 0 ? lastPathSegment.concat(str) : new String(lastPathSegment));
                return;
            }
        }
        zzbm("Feature is not supported by the device.");
    }
}
