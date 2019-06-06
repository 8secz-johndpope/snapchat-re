package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzako;
import com.google.android.gms.internal.zzlc;

@zzabh
public final class zzo extends FrameLayout implements OnClickListener {
    private final ImageButton zzcnv;
    private final zzw zzcnw;

    public zzo(Context context, zzp zzp, zzw zzw) {
        super(context);
        this.zzcnw = zzw;
        setOnClickListener(this);
        this.zzcnv = new ImageButton(context);
        this.zzcnv.setImageResource(17301527);
        this.zzcnv.setBackgroundColor(0);
        this.zzcnv.setOnClickListener(this);
        ImageButton imageButton = this.zzcnv;
        zzlc.zzij();
        int zza = zzako.zza(context, zzp.paddingLeft);
        zzlc.zzij();
        int zza2 = zzako.zza(context, 0);
        zzlc.zzij();
        int zza3 = zzako.zza(context, zzp.paddingRight);
        zzlc.zzij();
        imageButton.setPadding(zza, zza2, zza3, zzako.zza(context, zzp.paddingBottom));
        this.zzcnv.setContentDescription("Interstitial close button");
        zzlc.zzij();
        zzako.zza(context, zzp.size);
        imageButton = this.zzcnv;
        zzlc.zzij();
        zza = zzako.zza(context, (zzp.size + zzp.paddingLeft) + zzp.paddingRight);
        zzlc.zzij();
        addView(imageButton, new LayoutParams(zza, zzako.zza(context, zzp.size + zzp.paddingBottom), 17));
    }

    public final void onClick(View view) {
        zzw zzw = this.zzcnw;
        if (zzw != null) {
            zzw.zznh();
        }
    }

    public final void zza(boolean z, boolean z2) {
        ImageButton imageButton;
        int i;
        if (!z2) {
            imageButton = this.zzcnv;
            i = 0;
        } else if (z) {
            imageButton = this.zzcnv;
            i = 4;
        } else {
            imageButton = this.zzcnv;
            i = 8;
        }
        imageButton.setVisibility(i);
    }
}
