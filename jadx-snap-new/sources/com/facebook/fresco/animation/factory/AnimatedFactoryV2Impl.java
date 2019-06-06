package com.facebook.fresco.animation.factory;

import android.graphics.Bitmap.Config;
import android.graphics.Rect;
import com.facebook.common.time.RealtimeSinceBootClock;
import defpackage.atv;
import defpackage.atw;
import defpackage.aub;
import defpackage.aue;
import defpackage.aui;
import defpackage.auz;
import defpackage.avb;
import defpackage.ave;
import defpackage.avn;
import defpackage.avq;
import defpackage.avt;
import defpackage.avv;
import defpackage.avw;
import defpackage.ayc;
import defpackage.ayg;
import defpackage.ayx;
import defpackage.aza;
import defpackage.azb;
import defpackage.azc;
import defpackage.azg;
import defpackage.azh;
import defpackage.azp;

@aue
public class AnimatedFactoryV2Impl implements ayx {
    final avn a;
    aza b;
    private final atw c;
    private final avq<auz, avb> d;
    private azh e;
    private azp f;
    private avw g;

    @aue
    public AnimatedFactoryV2Impl(avn avn, atw atw, avq<auz, avb> avq) {
        this.a = avn;
        this.c = atw;
        this.d = avq;
    }

    public final avv a(final Config config) {
        return new avv() {
            public final avb a(ave ave, avt avt) {
                AnimatedFactoryV2Impl animatedFactoryV2Impl = AnimatedFactoryV2Impl.this;
                if (animatedFactoryV2Impl.b == null) {
                    animatedFactoryV2Impl.b = new azb(new azh() {
                        public final ayc a(ayg ayg, Rect rect) {
                            return new azg(AnimatedFactoryV2Impl.a(AnimatedFactoryV2Impl.this), ayg, rect);
                        }
                    }, animatedFactoryV2Impl.a);
                }
                return animatedFactoryV2Impl.b.a(ave, avt, config);
            }
        };
    }

    public final avw a() {
        if (this.g == null) {
            AnonymousClass2 anonymousClass2 = new aui<Integer>() {
                public final /* synthetic */ Object get() {
                    return Integer.valueOf(2);
                }
            };
            atv atv = new atv(this.c.a());
            if (this.e == null) {
                this.e = new azh() {
                    public final ayc a(ayg ayg, Rect rect) {
                        return new azg(AnimatedFactoryV2Impl.a(AnimatedFactoryV2Impl.this), ayg, rect);
                    }
                };
            }
            this.g = new azc(this.e, aub.a(), atv, RealtimeSinceBootClock.get(), this.a, this.d, anonymousClass2);
        }
        return this.g;
    }
}
