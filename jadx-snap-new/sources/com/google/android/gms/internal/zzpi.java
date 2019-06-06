package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.dynamic.zzn;
import java.util.List;

@zzabh
public final class zzpi extends RelativeLayout {
    private static final float[] zzbxr = new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    private AnimationDrawable zzbxs;

    public zzpi(Context context, zzph zzph, LayoutParams layoutParams) {
        super(context);
        zzbq.checkNotNull(zzph);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(zzbxr, null, null));
        shapeDrawable.getPaint().setColor(zzph.getBackgroundColor());
        setLayoutParams(layoutParams);
        zzbt.zzen().setBackground(this, shapeDrawable);
        layoutParams = new LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(zzph.getText())) {
            LayoutParams layoutParams2 = new LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams2);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(zzph.getText());
            textView.setTextColor(zzph.getTextColor());
            textView.setTextSize((float) zzph.getTextSize());
            zzlc.zzij();
            int zza = zzako.zza(context, 4);
            zzlc.zzij();
            textView.setPadding(zza, 0, zzako.zza(context, 4), 0);
            addView(textView);
            layoutParams.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams);
        imageView.setId(1195835394);
        List<zzpj> zzjx = zzph.zzjx();
        String str = "Error while getting drawable.";
        if (zzjx != null && zzjx.size() > 1) {
            this.zzbxs = new AnimationDrawable();
            for (zzpj zzkb : zzjx) {
                try {
                    this.zzbxs.addFrame((Drawable) zzn.zzy(zzkb.zzkb()), zzph.zzjy());
                } catch (Exception e) {
                    zzaky.zzb(str, e);
                }
            }
            zzbt.zzen().setBackground(imageView, this.zzbxs);
        } else if (zzjx.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) zzn.zzy(((zzpj) zzjx.get(0)).zzkb()));
            } catch (Exception e2) {
                zzaky.zzb(str, e2);
            }
        }
        addView(imageView);
    }

    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.zzbxs;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
