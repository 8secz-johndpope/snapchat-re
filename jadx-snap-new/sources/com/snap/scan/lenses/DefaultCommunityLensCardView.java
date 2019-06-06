package com.snap.scan.lenses;

import android.content.Context;
import android.net.Uri;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.imageloading.view.SnapImageView;
import com.snap.ui.view.button.ScButton;
import com.snap.ui.view.button.SnapFontButton;
import com.snapchat.android.R;
import defpackage.ajdp;
import defpackage.ajpy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajym;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.aqd;
import defpackage.cfl;
import defpackage.vpg;
import defpackage.vsw;
import defpackage.vsw.b;
import defpackage.vsw.b.a.c;
import defpackage.vua;

public final class DefaultCommunityLensCardView extends ConstraintLayout implements vsw {
    TextView d;
    ImageView e;
    View f;
    ScButton g;
    View h;
    View i;
    SnapFontButton j;
    View k;
    View l;
    private SnapImageView m;
    private TextView n;
    private final ajxe o;

    static final class a extends akcs implements akbk<ajdp<defpackage.vsw.a>> {
        private /* synthetic */ DefaultCommunityLensCardView a;

        a(DefaultCommunityLensCardView defaultCommunityLensCardView) {
            this.a = defaultCommunityLensCardView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ajdp[] ajdpArr = new ajdp[9];
            ImageView imageView = this.a.e;
            if (imageView == null) {
                akcr.a("shareButton");
            }
            ajdpArr[0] = cfl.c(imageView).p(AnonymousClass1.a);
            View view = this.a.f;
            if (view == null) {
                akcr.a("reportButton");
            }
            ajdpArr[1] = cfl.c(view).p(AnonymousClass2.a);
            ScButton scButton = this.a.g;
            if (scButton == null) {
                akcr.a("unlockLens");
            }
            ajdpArr[2] = cfl.c(scButton).p(AnonymousClass3.a);
            view = this.a.h;
            if (view == null) {
                akcr.a("sendToFriend");
            }
            ajdpArr[3] = cfl.c(view).p(AnonymousClass4.a);
            view = this.a.i;
            if (view == null) {
                akcr.a("takeSnap");
            }
            ajdpArr[4] = cfl.c(view).p(AnonymousClass5.a);
            SnapFontButton snapFontButton = this.a.j;
            if (snapFontButton == null) {
                akcr.a("moreLenses");
            }
            ajdpArr[5] = cfl.c(snapFontButton).p(AnonymousClass6.a);
            view = this.a.k;
            if (view == null) {
                akcr.a("removeLens");
            }
            ajdpArr[6] = cfl.c(view).p(AnonymousClass7.a);
            view = this.a.l;
            if (view == null) {
                akcr.a("cancelButton");
            }
            ajdpArr[7] = cfl.c(view).p(AnonymousClass8.a);
            TextView textView = this.a.d;
            if (textView == null) {
                akcr.a("lensAuthor");
            }
            ajdpArr[8] = cfl.c(textView).p(AnonymousClass9.a);
            return ajpy.k(ajdp.c((Iterable) ajym.b((Object[]) ajdpArr))).a();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(DefaultCommunityLensCardView.class), aqd.a, "getEvents()Lio/reactivex/Observable;");
    }

    public DefaultCommunityLensCardView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private DefaultCommunityLensCardView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, (byte) 0);
        this.o = ajxh.a(new a(this));
    }

    private final void a(vua vua) {
        SnapImageView snapImageView = this.m;
        if (snapImageView == null) {
            akcr.a("lensIcon");
        }
        Object parse = Uri.parse(vua.a);
        akcr.a(parse, "Uri.parse(details.icon)");
        snapImageView.setImageUri(parse, vpg.b);
        TextView textView = this.n;
        if (textView == null) {
            akcr.a("lensName");
        }
        textView.setText(vua.b);
        textView = this.d;
        String str = "lensAuthor";
        if (textView == null) {
            akcr.a(str);
        }
        textView.setText(getResources().getString(R.string.scan_card_created_by, new Object[]{vua.c}));
        textView = this.d;
        if (textView == null) {
            akcr.a(str);
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, vua.e ? R.drawable.profile_arrow_right : 0, 0);
    }

    public final ajdp<defpackage.vsw.a> ab_() {
        return (ajdp) this.o.b();
    }

    public final /* synthetic */ void accept(Object obj) {
        obj = (b) obj;
        akcr.b(obj, MapboxEvent.KEY_MODEL);
        String str = "removeLens";
        String str2 = "moreLenses";
        String str3 = "takeSnap";
        String str4 = "reportButton";
        int i = 0;
        String str5 = "unlockLens";
        View view;
        SnapFontButton snapFontButton;
        ScButton scButton;
        if (obj instanceof c) {
            view = this.i;
            if (view == null) {
                akcr.a(str3);
            }
            view.setVisibility(8);
            snapFontButton = this.j;
            if (snapFontButton == null) {
                akcr.a(str2);
            }
            snapFontButton.setVisibility(8);
            view = this.k;
            if (view == null) {
                akcr.a(str);
            }
            view.setVisibility(8);
            view = this.f;
            if (view == null) {
                akcr.a(str4);
            }
            view.setVisibility(8);
            ScButton scButton2;
            if (obj instanceof defpackage.vsw.b.a.c.a) {
                defpackage.vsw.b.a.c.a aVar = (defpackage.vsw.b.a.c.a) obj;
                a(aVar.a);
                String str6 = aVar.a.d;
                CharSequence charSequence = str6;
                if (charSequence == null || charSequence.length() == 0) {
                    i = 1;
                }
                if ((i ^ 1) == 0) {
                    str6 = null;
                }
                scButton = this.g;
                if (scButton == null) {
                    akcr.a(str5);
                }
                scButton.setText(str6);
            } else if (obj instanceof c.c) {
                scButton2 = this.g;
                if (scButton2 == null) {
                    akcr.a(str5);
                }
                scButton2.setText(getResources().getString(R.string.scan_card_unlocking));
                scButton2 = this.g;
                if (scButton2 == null) {
                    akcr.a(str5);
                }
                scButton2.setClickable(false);
                scButton2 = this.g;
                if (scButton2 == null) {
                    akcr.a(str5);
                }
                scButton2.setSpinnerVisibility(true);
            } else {
                if (obj instanceof c.b) {
                    scButton2 = this.g;
                    if (scButton2 == null) {
                        akcr.a(str5);
                    }
                    scButton2.setText(getResources().getString(R.string.scan_card_unlocked));
                    scButton2 = this.g;
                    if (scButton2 == null) {
                        akcr.a(str5);
                    }
                    scButton2.setSpinnerVisibility(false);
                    scButton2 = this.g;
                    if (scButton2 == null) {
                        akcr.a(str5);
                    }
                    scButton2.setClickable(true);
                }
            }
        } else if (obj instanceof defpackage.vsw.b.a.a) {
            scButton = this.g;
            if (scButton == null) {
                akcr.a(str5);
            }
            scButton.setVisibility(8);
            snapFontButton = this.j;
            if (snapFontButton == null) {
                akcr.a(str2);
            }
            snapFontButton.setVisibility(8);
            view = this.k;
            if (view == null) {
                akcr.a(str);
            }
            view.setVisibility(8);
            view = this.f;
            if (view == null) {
                akcr.a(str4);
            }
            view.setVisibility(0);
            a(((defpackage.vsw.b.a.a) obj).a);
        } else if (obj instanceof defpackage.vsw.b.a.b) {
            scButton = this.g;
            if (scButton == null) {
                akcr.a(str5);
            }
            scButton.setVisibility(8);
            view = this.i;
            if (view == null) {
                akcr.a(str3);
            }
            view.setVisibility(8);
            view = this.f;
            if (view == null) {
                akcr.a(str4);
            }
            view.setVisibility(0);
            a(((defpackage.vsw.b.a.b) obj).a);
        } else {
            akcr.a(obj, b.b.a);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        Object findViewById = findViewById(R.id.scan_card_item_lens_icon);
        akcr.a(findViewById, "findViewById(R.id.scan_card_item_lens_icon)");
        this.m = (SnapImageView) findViewById;
        findViewById = findViewById(R.id.scan_card_item_lens_name);
        akcr.a(findViewById, "findViewById(R.id.scan_card_item_lens_name)");
        this.n = (TextView) findViewById;
        findViewById = findViewById(R.id.scan_card_item_lens_author);
        akcr.a(findViewById, "findViewById(R.id.scan_card_item_lens_author)");
        this.d = (TextView) findViewById;
        findViewById = findViewById(R.id.scan_card_item_share_button);
        akcr.a(findViewById, "findViewById(R.id.scan_card_item_share_button)");
        this.e = (ImageView) findViewById;
        ImageView imageView = this.e;
        if (imageView == null) {
            akcr.a("shareButton");
        }
        imageView.setColorFilter(-3355444);
        findViewById = findViewById(R.id.scan_card_item_report_button);
        akcr.a(findViewById, "findViewById(R.id.scan_card_item_report_button)");
        this.f = findViewById;
        findViewById = findViewById(R.id.scan_card_item_unlock_lens);
        akcr.a(findViewById, "findViewById(R.id.scan_card_item_unlock_lens)");
        this.g = (ScButton) findViewById;
        findViewById = findViewById(R.id.scan_card_item_send_to_friend);
        akcr.a(findViewById, "findViewById(R.id.scan_card_item_send_to_friend)");
        this.h = findViewById;
        findViewById = findViewById(R.id.scan_card_item_take_snap);
        akcr.a(findViewById, "findViewById(R.id.scan_card_item_take_snap)");
        this.i = findViewById;
        findViewById = findViewById(R.id.scan_card_item_more_lenses);
        akcr.a(findViewById, "findViewById(R.id.scan_card_item_more_lenses)");
        this.j = (SnapFontButton) findViewById;
        findViewById = findViewById(R.id.scan_card_item_remove_lens);
        akcr.a(findViewById, "findViewById(R.id.scan_card_item_remove_lens)");
        this.k = findViewById;
        findViewById = findViewById(R.id.scan_card_item_cancel);
        akcr.a(findViewById, "findViewById(R.id.scan_card_item_cancel)");
        this.l = findViewById;
    }
}
