package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.brightcove.player.event.Event;
import com.snapchat.android.R;

/* renamed from: acty */
public final class acty {
    private final Activity a;

    public acty(Activity activity) {
        akcr.b(activity, Event.ACTIVITY);
        this.a = activity;
    }

    public final View a(String str, actx actx, LayoutParams layoutParams, boolean z) {
        View inflate;
        Drawable drawable;
        akcr.b(str, "text");
        akcr.b(actx, "type");
        akcr.b(layoutParams, "layoutParams");
        LayoutInflater layoutInflater = this.a.getLayoutInflater();
        String str2 = "null cannot be cast to non-null type android.widget.FrameLayout";
        if (z) {
            inflate = layoutInflater.inflate(R.layout.map_status_label_small, null, false);
            if (inflate == null) {
                throw new ajxt(str2);
            }
        }
        inflate = layoutInflater.inflate(R.layout.map_status_label, null, false);
        if (inflate == null) {
            throw new ajxt(str2);
        }
        FrameLayout frameLayout = (FrameLayout) inflate;
        Object obj = (TextView) frameLayout.findViewById(R.id.title);
        String str3 = "null cannot be cast to non-null type android.graphics.drawable.NinePatchDrawable";
        if (z) {
            drawable = this.a.getResources().getDrawable(actx.smallRes);
            if (drawable == null) {
                throw new ajxt(str3);
            }
        }
        drawable = this.a.getResources().getDrawable(actx.res);
        if (drawable == null) {
            throw new ajxt(str3);
        }
        NinePatchDrawable ninePatchDrawable = (NinePatchDrawable) drawable;
        ninePatchDrawable.setAutoMirrored(true);
        if (actx.mirrored) {
            frameLayout.setLayoutDirection(1);
        } else {
            frameLayout.setLayoutDirection(0);
        }
        frameLayout.setBackground(ninePatchDrawable);
        akcr.a(obj, "title");
        obj.setText(str);
        frameLayout.setLayoutParams(layoutParams);
        return frameLayout;
    }
}
