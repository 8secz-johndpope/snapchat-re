package defpackage;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import com.snap.android.linearallocexpander.LaExpander;
import java.util.Set;
import net.sqlcipher.database.SQLiteDatabase;
import org.jcodec.containers.mp4.boxes.Box;
import org.opencv.imgproc.Imgproc;

/* renamed from: rgq */
public final class rgq {
    private final rgu A;
    private final Integer B;
    private final int C;
    private final Integer D;
    private final Drawable E;
    private final Drawable F;
    private final rhg G;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final Integer m;
    public final Integer n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final Integer r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    private final boolean v;
    private final boolean w;
    private final boolean x;
    private final boolean y;
    private final Set<String> z;

    public rgq() {
        this(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, null, null, null, null, null, null, false, false, false, null, false, false, false, -1, 1);
    }

    public /* synthetic */ rgq(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, Set set, Integer num, Integer num2, rgu rgu, Drawable drawable, Drawable drawable2, boolean z17, boolean z18, boolean z19, Integer num3, boolean z20, boolean z21, boolean z22, int i, int i2) {
        int i3 = i;
        this((i3 & 1) != 0 ? true : z, (i3 & 2) != 0 ? true : z2, (i3 & 4) != 0 ? true : z3, (i3 & 8) != 0 ? true : z4, (i3 & 16) != 0 ? true : z5, (i3 & 32) != 0 ? true : z6, (i3 & 64) != 0 ? false : z7, (i3 & 128) != 0 ? true : z8, (i3 & 256) != 0 ? true : z9, (i3 & RasterSource.DEFAULT_TILE_SIZE) != 0 ? true : z10, (i3 & Imgproc.INTER_TAB_SIZE2) != 0 ? true : z11, (i3 & ItemAnimator.FLAG_MOVED) != 0 ? true : z12, (i3 & 4096) != 0 ? true : z13, (i3 & 8192) != 0 ? false : z14, (i3 & 16384) != 0 ? true : z15, (32768 & i3) != 0 ? true : z16, (Imgproc.FLOODFILL_FIXED_RANGE & i3) != 0 ? ajyy.a : set, (Imgproc.FLOODFILL_MASK_ONLY & i3) != 0 ? null : num, (i3 & 262144) != 0 ? null : num2, (i3 & 524288) != 0 ? null : rgu, null, 0, null, (i3 & 8388608) != 0 ? null : drawable, (i3 & LaExpander.DEFAULT_KITKAT_LINEAR_ALLOC_SIZE) != 0 ? null : drawable2, null, (i3 & 67108864) != 0 ? false : z17, (Box.MAX_BOX_SIZE & i3) != 0 ? true : z18, (SQLiteDatabase.CREATE_IF_NECESSARY & i3) != 0 ? true : z19, (536870912 & i3) != 0 ? null : num3, (AudioPlayer.INFINITY_LOOP_COUNT & i3) != 0 ? true : z20, (i3 & Integer.MIN_VALUE) != 0 ? true : z21, (i2 & 1) != 0 ? true : z22);
    }

    private rgq(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, Set<String> set, Integer num, Integer num2, rgu rgu, Integer num3, int i, Integer num4, Drawable drawable, Drawable drawable2, rhg rhg, boolean z17, boolean z18, boolean z19, Integer num5, boolean z20, boolean z21, boolean z22) {
        Set<String> set2 = set;
        akcr.b(set2, "usernamesToHide");
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.v = z4;
        this.w = z5;
        this.x = z6;
        this.d = z7;
        this.y = z8;
        this.e = z9;
        this.f = z10;
        this.g = z11;
        this.h = z12;
        this.i = z13;
        this.j = z14;
        this.k = z15;
        this.l = z16;
        this.z = set2;
        this.m = num;
        this.n = num2;
        this.A = rgu;
        this.B = num3;
        this.C = i;
        this.D = num4;
        this.E = drawable;
        this.F = drawable2;
        this.G = rhg;
        this.o = z17;
        this.p = z18;
        this.q = z19;
        this.r = num5;
        this.s = z20;
        this.t = z21;
        this.u = z22;
    }

    public static /* synthetic */ rgq a(rgq rgq) {
        rgq rgq2 = rgq;
        boolean z = rgq2.a;
        boolean z2 = rgq2.b;
        boolean z3 = rgq2.c;
        boolean z4 = rgq2.v;
        boolean z5 = rgq2.w;
        boolean z6 = rgq2.x;
        boolean z7 = rgq2.d;
        boolean z8 = rgq2.y;
        boolean z9 = rgq2.e;
        boolean z10 = rgq2.f;
        boolean z11 = rgq2.g;
        boolean z12 = rgq2.h;
        boolean z13 = rgq2.i;
        boolean z14 = rgq2.j;
        boolean z15 = rgq2.k;
        boolean z16 = rgq2.l;
        Set set = rgq2.z;
        Set set2 = set;
        boolean z17 = z;
        Integer num = rgq2.m;
        Integer num2 = rgq2.n;
        rgu rgu = rgq2.A;
        Integer num3 = rgq2.B;
        int i = rgq2.C;
        Integer num4 = rgq2.D;
        Drawable drawable = rgq2.E;
        Drawable drawable2 = rgq2.F;
        rhg rhg = rgq2.G;
        boolean z18 = rgq2.p;
        boolean z19 = rgq2.q;
        Integer num5 = rgq2.r;
        boolean z20 = rgq2.s;
        boolean z21 = rgq2.t;
        boolean z22 = rgq2.u;
        akcr.b(set, "usernamesToHide");
        return new rgq(z17, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, set2, num, num2, rgu, num3, i, num4, drawable, drawable2, rhg, true, z18, z19, num5, z20, z21, z22);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof rgq) {
                rgq rgq = (rgq) obj;
                if ((this.a == rgq.a ? 1 : null) != null) {
                    if ((this.b == rgq.b ? 1 : null) != null) {
                        if ((this.c == rgq.c ? 1 : null) != null) {
                            if ((this.v == rgq.v ? 1 : null) != null) {
                                if ((this.w == rgq.w ? 1 : null) != null) {
                                    if ((this.x == rgq.x ? 1 : null) != null) {
                                        if ((this.d == rgq.d ? 1 : null) != null) {
                                            if ((this.y == rgq.y ? 1 : null) != null) {
                                                if ((this.e == rgq.e ? 1 : null) != null) {
                                                    if ((this.f == rgq.f ? 1 : null) != null) {
                                                        if ((this.g == rgq.g ? 1 : null) != null) {
                                                            if ((this.h == rgq.h ? 1 : null) != null) {
                                                                if ((this.i == rgq.i ? 1 : null) != null) {
                                                                    if ((this.j == rgq.j ? 1 : null) != null) {
                                                                        if ((this.k == rgq.k ? 1 : null) != null) {
                                                                            if ((this.l == rgq.l ? 1 : null) != null && akcr.a(this.z, rgq.z) && akcr.a(this.m, rgq.m) && akcr.a(this.n, rgq.n) && akcr.a(this.A, rgq.A) && akcr.a(this.B, rgq.B)) {
                                                                                if ((this.C == rgq.C ? 1 : null) != null && akcr.a(this.D, rgq.D) && akcr.a(this.E, rgq.E) && akcr.a(this.F, rgq.F) && akcr.a(this.G, rgq.G)) {
                                                                                    if ((this.o == rgq.o ? 1 : null) != null) {
                                                                                        if ((this.p == rgq.p ? 1 : null) != null) {
                                                                                            if ((this.q == rgq.q ? 1 : null) != null && akcr.a(this.r, rgq.r)) {
                                                                                                if ((this.s == rgq.s ? 1 : null) != null) {
                                                                                                    if ((this.t == rgq.t ? 1 : null) != null) {
                                                                                                        if ((this.u == rgq.u ? 1 : null) != null) {
                                                                                                            return true;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = 1;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        int i3 = this.b;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.c;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.v;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.w;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.x;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.d;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.y;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.e;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.f;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.g;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.h;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.i;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.j;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.k;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.l;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        Set set = this.z;
        int i4 = 0;
        i = (i + (set != null ? set.hashCode() : 0)) * 31;
        Integer num = this.m;
        i = (i + (num != null ? num.hashCode() : 0)) * 31;
        num = this.n;
        i = (i + (num != null ? num.hashCode() : 0)) * 31;
        rgu rgu = this.A;
        i = (i + (rgu != null ? rgu.hashCode() : 0)) * 31;
        num = this.B;
        i = (((i + (num != null ? num.hashCode() : 0)) * 31) + this.C) * 31;
        num = this.D;
        i = (i + (num != null ? num.hashCode() : 0)) * 31;
        Drawable drawable = this.E;
        i = (i + (drawable != null ? drawable.hashCode() : 0)) * 31;
        drawable = this.F;
        i = (i + (drawable != null ? drawable.hashCode() : 0)) * 31;
        rhg rhg = this.G;
        i = (i + (rhg != null ? rhg.hashCode() : 0)) * 31;
        i3 = this.o;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.p;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.q;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        num = this.r;
        if (num != null) {
            i4 = num.hashCode();
        }
        i = (i + i4) * 31;
        i3 = this.s;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.t;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        boolean z = this.u;
        if (!z) {
            i2 = z;
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SendToConfig(showStoriesSection=");
        stringBuilder.append(this.a);
        stringBuilder.append(", showBestFriendsSection=");
        stringBuilder.append(this.b);
        stringBuilder.append(", showRecentsSection=");
        stringBuilder.append(this.c);
        stringBuilder.append(", showSuggestedSection=");
        stringBuilder.append(this.v);
        stringBuilder.append(", showAddFriendsButton=");
        stringBuilder.append(this.w);
        stringBuilder.append(", showGroupButton=");
        stringBuilder.append(this.x);
        stringBuilder.append(", showCognacPlayWithTheme=");
        stringBuilder.append(this.d);
        stringBuilder.append(", showNavInsetView=");
        stringBuilder.append(this.y);
        stringBuilder.append(", showGroupsSection=");
        stringBuilder.append(this.e);
        stringBuilder.append(", showAllFriendsSection=");
        stringBuilder.append(this.f);
        stringBuilder.append(", showQuickAddSection=");
        stringBuilder.append(this.g);
        stringBuilder.append(", showAddFriendsSection=");
        stringBuilder.append(this.h);
        stringBuilder.append(", showSearchSectionHeader=");
        stringBuilder.append(this.i);
        stringBuilder.append(", showOnlyIndividualFriendsInSearchResults=");
        stringBuilder.append(this.j);
        stringBuilder.append(", showBottomPanel=");
        stringBuilder.append(this.k);
        stringBuilder.append(", canShowFooter=");
        stringBuilder.append(this.l);
        stringBuilder.append(", usernamesToHide=");
        stringBuilder.append(this.z);
        stringBuilder.append(", sendToSearchBarHintResId=");
        stringBuilder.append(this.m);
        stringBuilder.append(", allFriendsHeaderSubtitleResId=");
        stringBuilder.append(this.n);
        stringBuilder.append(", selectedFriendConfig=");
        stringBuilder.append(this.A);
        stringBuilder.append(", sendToSendButtonResId=");
        stringBuilder.append(this.B);
        stringBuilder.append(", minimumFriendsSelectionCountForGroup=");
        stringBuilder.append(this.C);
        stringBuilder.append(", lessThanMinimumSelectionsAlertResId=");
        stringBuilder.append(this.D);
        stringBuilder.append(", backgroundDrawable=");
        stringBuilder.append(this.E);
        stringBuilder.append(", bottomViewPanelDrawable=");
        stringBuilder.append(this.F);
        stringBuilder.append(", selectionStateCallback=");
        stringBuilder.append(this.G);
        stringBuilder.append(", showSnappablePrivacyPrompt=");
        stringBuilder.append(this.o);
        stringBuilder.append(", showAttachmentsSection=");
        stringBuilder.append(this.p);
        stringBuilder.append(", showNewGroupButton=");
        stringBuilder.append(this.q);
        stringBuilder.append(", maxNumNonStoryRecipientsOverride=");
        stringBuilder.append(this.r);
        stringBuilder.append(", showSendToSearchV2=");
        stringBuilder.append(this.s);
        stringBuilder.append(", showNewGroupSection=");
        stringBuilder.append(this.t);
        stringBuilder.append(", showMyFriendsSection=");
        stringBuilder.append(this.u);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
