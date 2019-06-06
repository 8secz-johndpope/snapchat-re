package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.ui.avatar.Avatar;
import com.snap.ui.avatar.AvatarView;
import com.snap.ui.view.TakeSnapButton;
import com.snapchat.android.R;

/* renamed from: acno */
public final class acno implements acot {
    private LinearLayout a;
    private Integer b;
    private acqx c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final alhq i;
    private final nbo j;

    /* renamed from: acno$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public acno(String str, String str2, String str3, String str4, String str5, alhq alhq, nbo nbo) {
        akcr.b(str, "friendUserId");
        akcr.b(str2, "friendUsername");
        akcr.b(str3, "friendDisplayName");
        akcr.b(alhq, "friendLocation");
        akcr.b(nbo, "friendLocationManager");
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = alhq;
        this.j = nbo;
    }

    public final View a(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        akcr.b(viewGroup, "carouselLayout");
        akcr.b(layoutInflater, "layoutInflater");
        Object resources = viewGroup.getResources();
        akcr.a(resources, "carouselLayout.resources");
        this.c = new acqx(resources, new ihl());
        View inflate = layoutInflater.inflate(R.layout.snap_map_carousel_friend_card, viewGroup, false);
        if (inflate != null) {
            Uri a;
            LinearLayout linearLayout = (LinearLayout) inflate;
            this.a = linearLayout;
            View view = linearLayout;
            viewGroup.addView(view);
            Object obj = (TextView) linearLayout.findViewById(R.id.friend_name);
            TextUtils.isEmpty(this.f);
            akcr.a(obj, "friendName");
            obj.setText(this.f);
            obj = (TextView) linearLayout.findViewById(R.id.friend_timestamp);
            acqx acqx = this.c;
            if (acqx == null) {
                akcr.a("timeAgoFormatter");
            }
            if (!TextUtils.isEmpty(acqx.a(this.i.e()))) {
                Object string = linearLayout.getResources().getString(R.string.last_seen, new Object[]{r2});
                akcr.a(string, "cardView.resources.getSt…                 timeAgo)");
                akcr.a(obj, "friendTimestamp");
                obj.setText((CharSequence) string);
            }
            AvatarView avatarView = (AvatarView) linearLayout.findViewById(R.id.friend_bitmoji);
            String str = this.g;
            if (str != null) {
                String str2 = this.h;
                if (str2 == null) {
                    str2 = "6972338";
                }
                a = dds.a(str, str2, afnd.PROFILE, false, 0, 24);
            } else {
                a = null;
            }
            AvatarView.setAvatarInfo$default(avatarView, new Avatar(this.e, a, null, null, 12, null), null, false, false, adcw.a(), 14, null);
            return view;
        }
        throw new ajxt("null cannot be cast to non-null type android.widget.LinearLayout");
    }

    public final void a(aclg aclg) {
        akcr.b(aclg, "snapMap");
        Object j = aclg.j();
        String str = "snapMap.viewHost";
        akcr.a(j, str);
        Object j2 = j.j();
        if (j2 != null) {
            akcr.a(j2, "snapMap.viewHost.mapController ?: return");
            j = aclg.j();
            akcr.a(j, str);
            if (j.e()) {
                double c;
                float d;
                alhm b = this.j.b(this.d);
                if (b == null) {
                    c = (double) this.i.c();
                    d = this.i.d();
                } else {
                    c = (double) b.b();
                    d = b.c();
                }
                cgi a = cgo.a(c, (double) d);
                String str2 = "mapController.viewHolder";
                if (this.b == null) {
                    Object p = j2.p();
                    akcr.a(p, str2);
                    p = p.a();
                    akcr.a(p, "mapController.viewHolder.mapView");
                    this.b = Integer.valueOf(p.getResources().getDimensionPixelSize(R.dimen.map_host_carousel_card_height));
                }
                Integer num = this.b;
                if (num != null) {
                    int intValue = num.intValue();
                    Object p2 = j2.p();
                    akcr.a(p2, str2);
                    j2.a(0, adby.a(p2.a(), b, 0.08f, MapboxConstants.MINIMUM_ZOOM), 0, intValue);
                }
                j2.a(a, 12.0d, (int) TakeSnapButton.LONG_PRESS_TIME, null);
                aclg.k().a(this.d);
            }
        }
    }
}
