package com.snap.ui.view.multisnap;

import android.view.View;
import android.widget.LinearLayout;
import com.google.common.base.Optional;
import com.snap.ui.view.multisnap.MultiSnapThumbnailView.ThumbnailTileResourceBundle;
import com.snap.ui.view.multisnap.MultiSnapThumbnailView.ThumbnailViewState;
import defpackage.abpf;
import defpackage.ajdp;
import defpackage.ajdx;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajfc;
import defpackage.ajvv;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxm;
import defpackage.ajxs;
import defpackage.ajxw;
import defpackage.ajyn;
import defpackage.ajyu;
import defpackage.ajyw;
import defpackage.ajzd;
import defpackage.akco;
import defpackage.akcr;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.jwj;
import defpackage.jxj.b;
import defpackage.kaz;
import defpackage.zfw;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Stack;

public final class MultiSnapThumbnailTilesViewController {
    static final /* synthetic */ aken[] $$delegatedProperties = new aken[]{new akdc(akde.a(MultiSnapThumbnailTilesViewController.class), "tileViews", "getTileViews()Ljava/util/List;"), new akdc(akde.a(MultiSnapThumbnailTilesViewController.class), "leftCornersOnlyRequestOptions", "getLeftCornersOnlyRequestOptions()Lcom/snap/imageloading/api/ViewBitmapLoader$RequestOptions;"), new akdc(akde.a(MultiSnapThumbnailTilesViewController.class), "rightCornersOnlyRequestOptions", "getRightCornersOnlyRequestOptions()Lcom/snap/imageloading/api/ViewBitmapLoader$RequestOptions;"), new akdc(akde.a(MultiSnapThumbnailTilesViewController.class), "noCornersRequestOptions", "getNoCornersRequestOptions()Lcom/snap/imageloading/api/ViewBitmapLoader$RequestOptions;"), new akdc(akde.a(MultiSnapThumbnailTilesViewController.class), "allCornersRequestOptions", "getAllCornersRequestOptions()Lcom/snap/imageloading/api/ViewBitmapLoader$RequestOptions;")};
    public static final Companion Companion = new Companion();
    private final ajxe allCornersRequestOptions$delegate;
    private final float borderRadius;
    private final ajei compositeDisposable;
    private final LinearLayout imageViewHolder;
    private final ajxe leftCornersOnlyRequestOptions$delegate;
    private final ajxe noCornersRequestOptions$delegate;
    private final ajxe rightCornersOnlyRequestOptions$delegate;
    private final zfw schedulers;
    private final WeakReference<MultiSnapThumbnailViewDelegate> thumbnailViewDelegate;
    private final ajxe tileViews$delegate = ajxh.a(MultiSnapThumbnailTilesViewController$tileViews$2.INSTANCE);
    private WeakReference<ThumbnailTrimmingPositionProvider> trimmingPositionProvider;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        private final <T> Integer getClosestThumbnailTimestamp(int i, NavigableMap<Integer, T> navigableMap) {
            if (navigableMap.isEmpty()) {
                return null;
            }
            Integer num = (Integer) navigableMap.ceilingKey(Integer.valueOf(i));
            Integer num2 = (Integer) navigableMap.floorKey(Integer.valueOf(i));
            return num == null ? num2 : (num2 != null && i <= (num.intValue() + num2.intValue()) / 2) ? num2 : num;
        }

        private final int getNumThumbnailsForSelectedSegment(int i, Integer num) {
            if (num == null) {
                return 1;
            }
            num.intValue();
            double intValue = (double) (num.intValue() - i);
            Double.isNaN(intValue);
            return abpf.a((int) Math.ceil(intValue / 1000.0d), 3, 6);
        }

        private final void hideOrRecycleTileView(MultiSnapThumbnailTileView multiSnapThumbnailTileView, int i, Stack<MultiSnapThumbnailTileView> stack, boolean z) {
            if (multiSnapThumbnailTileView != null) {
                if (multiSnapThumbnailTileView.getVisibility() == 0) {
                    multiSnapThumbnailTileView.setVisibility(8, z, i);
                } else {
                    stack.push(multiSnapThumbnailTileView);
                }
            }
        }

        public final <T> List<Integer> getStateThumbnailTimestamps(ThumbnailViewState thumbnailViewState, NavigableMap<Integer, T> navigableMap, boolean z, int i, Integer num) {
            List g;
            akcr.b(navigableMap, "thumbnailBitmaps");
            if (num == null || num.intValue() == 0) {
                Object g2 = navigableMap.keySet();
                akcr.a(g2, "thumbnailBitmaps.keys");
            } else {
                ArrayList arrayList = new ArrayList();
                if (thumbnailViewState == ThumbnailViewState.SINGLE_DEMOTED) {
                    while (akcr.a(i, num.intValue()) < 0) {
                        arrayList.add(z ? getClosestThumbnailTimestamp(i, navigableMap) : Integer.valueOf(i));
                        i += 10000;
                    }
                } else {
                    Companion companion = this;
                    int numThumbnailsForSelectedSegment = companion.getNumThumbnailsForSelectedSegment(i, num);
                    int i2 = 1;
                    int i3 = thumbnailViewState == ThumbnailViewState.SELECTED ? numThumbnailsForSelectedSegment : 1;
                    if (i3 > 0) {
                        int i4 = i;
                        while (true) {
                            arrayList.add(z ? companion.getClosestThumbnailTimestamp(i4, navigableMap) : Integer.valueOf(i4));
                            i4 = (((num.intValue() - i) / numThumbnailsForSelectedSegment) * i2) + i;
                            if (i2 == i3) {
                                break;
                            }
                            i2++;
                        }
                    }
                }
                g2 = ajyu.g((Iterable) arrayList);
            }
            return ajyu.h((Collection) g2);
        }
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThumbnailViewState.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[ThumbnailViewState.SELECTED.ordinal()] = 1;
            $EnumSwitchMapping$0[ThumbnailViewState.SINGLE_DEMOTED.ordinal()] = 2;
            $EnumSwitchMapping$0[ThumbnailViewState.DEMOTED.ordinal()] = 3;
            $EnumSwitchMapping$0[ThumbnailViewState.NEUTRAL.ordinal()] = 4;
        }
    }

    public MultiSnapThumbnailTilesViewController(LinearLayout linearLayout, MultiSnapThumbnailViewDelegate multiSnapThumbnailViewDelegate, float f, zfw zfw) {
        akcr.b(linearLayout, "imageViewHolder");
        akcr.b(multiSnapThumbnailViewDelegate, "multiSnapThumbnailViewDelegate");
        akcr.b(zfw, "schedulers");
        this.imageViewHolder = linearLayout;
        this.borderRadius = f;
        this.schedulers = zfw;
        this.thumbnailViewDelegate = new WeakReference(multiSnapThumbnailViewDelegate);
        this.leftCornersOnlyRequestOptions$delegate = ajxh.a(new MultiSnapThumbnailTilesViewController$leftCornersOnlyRequestOptions$2(this));
        this.rightCornersOnlyRequestOptions$delegate = ajxh.a(new MultiSnapThumbnailTilesViewController$rightCornersOnlyRequestOptions$2(this));
        this.noCornersRequestOptions$delegate = ajxh.a(MultiSnapThumbnailTilesViewController$noCornersRequestOptions$2.INSTANCE);
        this.allCornersRequestOptions$delegate = ajxh.a(new MultiSnapThumbnailTilesViewController$allCornersRequestOptions$2(this));
        this.compositeDisposable = new ajei();
    }

    private final List<ajxm<ThumbnailTileResourceBundle, MultiSnapThumbnailTileView>> fillInMissingThumbnailTiles(Map<Integer, ThumbnailTileResourceBundle> map, List<Integer> list, Stack<MultiSnapThumbnailTileView> stack, boolean z) {
        Object obj = (MultiSnapThumbnailViewDelegate) this.thumbnailViewDelegate.get();
        if (obj == null) {
            return ajyw.a;
        }
        akcr.a(obj, "thumbnailViewDelegate.get() ?: return emptyList()");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Number intValue : list) {
            int intValue2 = intValue.intValue();
            while (i < getTileViews().size()) {
                Integer timestamp = ((MultiSnapThumbnailTileView) getTileViews().get(i)).getTimestamp();
                Object obj2 = (timestamp == null || timestamp.intValue() >= intValue2) ? null : 1;
                if (obj2 == null) {
                    break;
                }
                i++;
            }
            ThumbnailTileResourceBundle thumbnailTileResourceBundle = (ThumbnailTileResourceBundle) map.get(Integer.valueOf(intValue2));
            if (thumbnailTileResourceBundle != null) {
                Object createSnapThumbnailTileView;
                if (stack.isEmpty()) {
                    createSnapThumbnailTileView = obj.createSnapThumbnailTileView();
                } else {
                    createSnapThumbnailTileView = stack.pop();
                    akcr.a(createSnapThumbnailTileView, "tileViewsToRecycle.pop()");
                    createSnapThumbnailTileView = (MultiSnapThumbnailTileView) createSnapThumbnailTileView;
                    createSnapThumbnailTileView.dispose();
                    getTileViews().remove(createSnapThumbnailTileView);
                    this.imageViewHolder.removeView((View) createSnapThumbnailTileView);
                    Integer timestamp2 = createSnapThumbnailTileView.getTimestamp();
                    if (timestamp2 != null && timestamp2.intValue() < intValue2) {
                        i--;
                    }
                }
                LinearLayout linearLayout = this.imageViewHolder;
                linearLayout.addView((View) createSnapThumbnailTileView, linearLayout.getChildCount() - i);
                getTileViews().add(i, createSnapThumbnailTileView);
                i++;
                createSnapThumbnailTileView.setTimestamp(Integer.valueOf(intValue2));
                createSnapThumbnailTileView.setVisibility(0, z, i);
                arrayList.add(ajxs.a(thumbnailTileResourceBundle, createSnapThumbnailTileView));
            }
        }
        while (!stack.empty()) {
            ((MultiSnapThumbnailTileView) stack.pop()).dispose();
        }
        return arrayList;
    }

    private final b getAllCornersRequestOptions() {
        return (b) this.allCornersRequestOptions$delegate.b();
    }

    private final ajdx<Optional<kaz<jwj>>> getCompositeBitmap(ThumbnailTileResourceBundle thumbnailTileResourceBundle, ThumbnailComposingOperation thumbnailComposingOperation, boolean z) {
        Object b;
        String str;
        if (!z || thumbnailComposingOperation == null) {
            b = ajdx.b(Optional.fromNullable(thumbnailTileResourceBundle.getBaseBitmap()));
            str = "Single.just(Optional.fro…sourceBundle.baseBitmap))";
        } else {
            kaz compositedBitmap = thumbnailTileResourceBundle.getCompositedBitmap();
            if (compositedBitmap == null || compositedBitmap.isDisposed()) {
                b = thumbnailComposingOperation.getCompositeBitmap(thumbnailTileResourceBundle.getBaseBitmap()).f(new MultiSnapThumbnailTilesViewController$getCompositeBitmap$1(thumbnailTileResourceBundle));
                str = "composingOperation.getCo…     it\n                }";
            } else {
                b = ajdx.b(Optional.fromNullable(thumbnailTileResourceBundle.getCompositedBitmap()));
                str = "Single.just(Optional.fro…Bundle.compositedBitmap))";
            }
        }
        akcr.a(b, str);
        return b;
    }

    private final b getLeftCornersOnlyRequestOptions() {
        return (b) this.leftCornersOnlyRequestOptions$delegate.b();
    }

    private final b getNoCornersRequestOptions() {
        return (b) this.noCornersRequestOptions$delegate.b();
    }

    private final b getRightCornersOnlyRequestOptions() {
        return (b) this.rightCornersOnlyRequestOptions$delegate.b();
    }

    private final List<Integer> getStateThumbnailTimestamps(ThumbnailViewState thumbnailViewState, NavigableMap<Integer, ThumbnailTileResourceBundle> navigableMap, boolean z) {
        Object obj = (MultiSnapThumbnailViewDelegate) this.thumbnailViewDelegate.get();
        if (obj == null) {
            return new ArrayList();
        }
        akcr.a(obj, "thumbnailViewDelegate.ge…?: return mutableListOf()");
        return Companion.getStateThumbnailTimestamps(thumbnailViewState, navigableMap, z, obj.getStartingTimestamp(), obj.getEndingTimestamp());
    }

    private final List<MultiSnapThumbnailTileView> getTileViews() {
        return (List) this.tileViews$delegate.b();
    }

    private final List<ajxm<ThumbnailTileResourceBundle, MultiSnapThumbnailTileView>> setupCompatibleThumbnailTiles(List<Integer> list, NavigableMap<Integer, ThumbnailTileResourceBundle> navigableMap, List<Integer> list2, Stack<MultiSnapThumbnailTileView> stack, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        MultiSnapThumbnailTileView multiSnapThumbnailTileView = null;
        Integer num = multiSnapThumbnailTileView;
        int i = 0;
        while (true) {
            if (i >= getTileViews().size() && multiSnapThumbnailTileView == null && !it.hasNext() && num == null) {
                return arrayList;
            }
            if (multiSnapThumbnailTileView == null && i < getTileViews().size()) {
                multiSnapThumbnailTileView = (MultiSnapThumbnailTileView) getTileViews().get(i);
                i++;
            }
            if (num == null && it.hasNext()) {
                num = (Integer) it.next();
            }
            Integer timestamp = multiSnapThumbnailTileView != null ? multiSnapThumbnailTileView.getTimestamp() : null;
            if (num == null || !(multiSnapThumbnailTileView == null || timestamp == null || akcr.a(timestamp.intValue(), num.intValue()) >= 0)) {
                Companion.hideOrRecycleTileView(multiSnapThumbnailTileView, i, stack, z);
                multiSnapThumbnailTileView = null;
            } else if (multiSnapThumbnailTileView == null || (timestamp != null && akcr.a(timestamp.intValue(), num.intValue()) > 0)) {
                list2.add(num);
                num = null;
            } else {
                ThumbnailTileResourceBundle thumbnailTileResourceBundle = (ThumbnailTileResourceBundle) navigableMap.get(num);
                if (thumbnailTileResourceBundle != null) {
                    multiSnapThumbnailTileView.setVisibility(0, z, i);
                    arrayList.add(ajxs.a(thumbnailTileResourceBundle, multiSnapThumbnailTileView));
                    multiSnapThumbnailTileView = null;
                    num = multiSnapThumbnailTileView;
                }
            }
        }
    }

    private final void updateCornerRadii() {
        Object obj;
        Object obj2;
        Iterable n = ajyu.n(getTileViews());
        Iterator it = n.iterator();
        do {
            obj2 = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
        } while (!((MultiSnapThumbnailTileView) ((ajzd) obj).b).isActive());
        ajzd ajzd = (ajzd) obj;
        Object valueOf = ajzd != null ? Integer.valueOf(ajzd.a) : null;
        obj = null;
        for (Object next : n) {
            if (((MultiSnapThumbnailTileView) ((ajzd) next).b).isActive()) {
                obj = next;
            }
        }
        ajzd = (ajzd) obj;
        if (ajzd != null) {
            obj2 = Integer.valueOf(ajzd.a);
        }
        ajxm a = ajxs.a(valueOf, obj2);
        valueOf = (Integer) a.a;
        Object obj3 = (Integer) a.b;
        if (!(valueOf == null || obj3 == null)) {
            if (akcr.a(valueOf, obj3)) {
                MultiSnapThumbnailTileView multiSnapThumbnailTileView = (MultiSnapThumbnailTileView) getTileViews().get(valueOf.intValue());
                valueOf = getAllCornersRequestOptions();
                akcr.a(valueOf, "allCornersRequestOptions");
                multiSnapThumbnailTileView.setRequestOptionsAndReload(valueOf);
                return;
            }
            MultiSnapThumbnailTileView multiSnapThumbnailTileView2 = (MultiSnapThumbnailTileView) getTileViews().get(valueOf.intValue());
            obj2 = getLeftCornersOnlyRequestOptions();
            akcr.a(obj2, "leftCornersOnlyRequestOptions");
            multiSnapThumbnailTileView2.setRequestOptionsAndReload(obj2);
            multiSnapThumbnailTileView2 = (MultiSnapThumbnailTileView) getTileViews().get(obj3.intValue());
            obj2 = getRightCornersOnlyRequestOptions();
            akcr.a(obj2, "rightCornersOnlyRequestOptions");
            multiSnapThumbnailTileView2.setRequestOptionsAndReload(obj2);
            Collection arrayList = new ArrayList();
            for (Object next2 : ajyu.n(getTileViews())) {
                ajzd ajzd2 = (ajzd) next2;
                Object obj4 = (valueOf.intValue() >= ajzd2.a || akcr.a(ajzd2.a, obj3.intValue()) >= 0) ? null : 1;
                if (obj4 != null) {
                    arrayList.add(next2);
                }
            }
            Iterable<ajzd> iterable = (List) arrayList;
            Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (ajzd ajzd3 : iterable) {
                multiSnapThumbnailTileView2 = (MultiSnapThumbnailTileView) ajzd3.b;
                obj2 = getNoCornersRequestOptions();
                akcr.a(obj2, "noCornersRequestOptions");
                multiSnapThumbnailTileView2.setRequestOptionsAndReload(obj2);
                arrayList2.add(ajxw.a);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0087  */
    public final void animateInThumbnailTile(int r5, defpackage.kaz<defpackage.jwj> r6) {
        /*
        r4 = this;
        r0 = "thumbnailBitmap";
        defpackage.akcr.b(r6, r0);
        r0 = r4.thumbnailViewDelegate;
        r0 = r0.get();
        r0 = (com.snap.ui.view.multisnap.MultiSnapThumbnailViewDelegate) r0;
        if (r0 != 0) goto L_0x0010;
    L_0x000f:
        return;
    L_0x0010:
        r1 = "thumbnailViewDelegate.get() ?: return";
        defpackage.akcr.a(r0, r1);
        r0 = r0.createSnapThumbnailTileView();
        r1 = r4.imageViewHolder;
        r2 = r0;
        r2 = (android.view.View) r2;
        r3 = 0;
        r1.addView(r2, r3);
        r5 = java.lang.Integer.valueOf(r5);
        r0.setTimestamp(r5);
        r5 = r4.getTileViews();
        r5 = r5.isEmpty();
        r1 = 1;
        r5 = r5 ^ r1;
        r2 = r4.getTileViews();
        r2 = r2.size();
        r0.setVisibility(r3, r5, r2);
        r5 = r4.getTileViews();
        r5 = r5.size();
        if (r5 != r1) goto L_0x005f;
    L_0x0048:
        r5 = r4.getTileViews();
        r5 = defpackage.ajyu.f(r5);
        r5 = (com.snap.ui.view.multisnap.MultiSnapThumbnailTileView) r5;
        r1 = r4.getLeftCornersOnlyRequestOptions();
        r2 = "leftCornersOnlyRequestOptions";
    L_0x0058:
        defpackage.akcr.a(r1, r2);
        r5.setRequestOptionsAndReload(r1);
        goto L_0x007d;
    L_0x005f:
        r5 = r4.getTileViews();
        r5 = (java.util.Collection) r5;
        r5 = r5.isEmpty();
        r5 = r5 ^ r1;
        if (r5 == 0) goto L_0x007d;
    L_0x006c:
        r5 = r4.getTileViews();
        r5 = defpackage.ajyu.h(r5);
        r5 = (com.snap.ui.view.multisnap.MultiSnapThumbnailTileView) r5;
        r1 = r4.getNoCornersRequestOptions();
        r2 = "noCornersRequestOptions";
        goto L_0x0058;
    L_0x007d:
        r5 = r4.getTileViews();
        r5 = r5.isEmpty();
        if (r5 == 0) goto L_0x008c;
    L_0x0087:
        r5 = r4.getAllCornersRequestOptions();
        goto L_0x0090;
    L_0x008c:
        r5 = r4.getRightCornersOnlyRequestOptions();
    L_0x0090:
        r1 = "if (tileViews.isEmpty())…yRequestOptions\n        }";
        defpackage.akcr.a(r5, r1);
        r0.setRequestOptions(r5);
        r0.setImage(r6);
        r5 = r4.getTileViews();
        r5.add(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewController.animateInThumbnailTile(int, kaz):void");
    }

    public final void clear() {
        for (MultiSnapThumbnailTileView dispose : getTileViews()) {
            dispose.dispose();
        }
        getTileViews().clear();
        this.imageViewHolder.removeAllViews();
        this.compositeDisposable.a();
    }

    public final void configureStateLayout(ThumbnailViewState thumbnailViewState, NavigableMap<Integer, ThumbnailTileResourceBundle> navigableMap, ThumbnailComposingOperation thumbnailComposingOperation, boolean z, boolean z2) {
        akcr.b(thumbnailViewState, "targetState");
        akcr.b(navigableMap, "thumbnailBitmaps");
        if (!navigableMap.isEmpty()) {
            boolean z3 = true;
            List stateThumbnailTimestamps = getStateThumbnailTimestamps(thumbnailViewState, navigableMap, true);
            if (z2) {
                stateThumbnailTimestamps = ajyu.h((Collection) ajyu.c((Iterable) stateThumbnailTimestamps, 1));
            }
            List list = stateThumbnailTimestamps;
            if (thumbnailViewState == ThumbnailViewState.SELECTED) {
                z3 = false;
            }
            ArrayList arrayList = new ArrayList();
            Stack stack = new Stack();
            List list2 = arrayList;
            list2 = ajyu.d((Collection) setupCompatibleThumbnailTiles(list, navigableMap, list2, stack, z), (Iterable) fillInMissingThumbnailTiles(navigableMap, list2, stack, z));
            updateCornerRadii();
            ajej e = ajdp.b((Iterable) list2).a((ajfc) new MultiSnapThumbnailTilesViewController$configureStateLayout$1(this, thumbnailComposingOperation, z3), false).e();
            akcr.a((Object) e, "Observable.fromIterable(…             .subscribe()");
            ajvv.a(e, this.compositeDisposable);
        }
    }

    /* JADX WARNING: Missing block: B:17:0x003e, code skipped:
            if (r1 == null) goto L_0x0040;
     */
    public final int getVisibleTileCount(com.snap.ui.view.multisnap.MultiSnapThumbnailView.ThumbnailViewState r6, boolean r7) {
        /*
        r5 = this;
        r0 = 1;
        if (r7 == 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r7 = r5.thumbnailViewDelegate;
        r7 = r7.get();
        r7 = (com.snap.ui.view.multisnap.MultiSnapThumbnailViewDelegate) r7;
        if (r7 != 0) goto L_0x0017;
    L_0x000e:
        r6 = r5.getTileViews();
        r6 = r6.size();
        return r6;
    L_0x0017:
        r1 = "thumbnailViewDelegate.ge… ?: return tileViews.size";
        defpackage.akcr.a(r7, r1);
        r1 = r5.trimmingPositionProvider;
        if (r1 == 0) goto L_0x0027;
    L_0x0020:
        r1 = r1.get();
        r1 = (com.snap.ui.view.multisnap.ThumbnailTrimmingPositionProvider) r1;
        goto L_0x0028;
    L_0x0027:
        r1 = 0;
    L_0x0028:
        r2 = r7.getStartingTimestamp();
        r7 = r7.getEndingTimestamp();
        if (r1 == 0) goto L_0x0037;
    L_0x0032:
        r3 = r1.getTrimmingStartTimestamp();
        goto L_0x0038;
    L_0x0037:
        r3 = r2;
    L_0x0038:
        if (r1 == 0) goto L_0x0040;
    L_0x003a:
        r1 = r1.getTrimmingEndTimestamp();
        if (r1 != 0) goto L_0x0041;
    L_0x0040:
        r1 = r7;
    L_0x0041:
        if (r7 != 0) goto L_0x004c;
    L_0x0043:
        r6 = r5.getTileViews();
        r6 = r6.size();
        return r6;
    L_0x004c:
        if (r6 != 0) goto L_0x004f;
    L_0x004e:
        goto L_0x0069;
    L_0x004f:
        r4 = com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewController.WhenMappings.$EnumSwitchMapping$0;
        r6 = r6.ordinal();
        r6 = r4[r6];
        if (r6 == r0) goto L_0x007d;
    L_0x0059:
        r7 = 2;
        if (r6 == r7) goto L_0x006a;
    L_0x005c:
        r7 = 3;
        if (r6 == r7) goto L_0x0069;
    L_0x005f:
        r7 = 4;
        if (r6 != r7) goto L_0x0063;
    L_0x0062:
        goto L_0x0069;
    L_0x0063:
        r6 = new ajxk;
        r6.<init>();
        throw r6;
    L_0x0069:
        return r0;
    L_0x006a:
        r6 = 6;
        if (r1 == 0) goto L_0x007c;
    L_0x006d:
        r1 = (java.lang.Number) r1;
        r7 = r1.intValue();
        r7 = r7 - r3;
        r7 = r7 - r0;
        r7 = r7 / 10000;
        r7 = r7 + r0;
        r6 = java.lang.Math.min(r6, r7);
    L_0x007c:
        return r6;
    L_0x007d:
        r6 = Companion;
        r6 = r6.getNumThumbnailsForSelectedSegment(r2, r7);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewController.getVisibleTileCount(com.snap.ui.view.multisnap.MultiSnapThumbnailView$ThumbnailViewState, boolean):int");
    }

    public final void setTrimmingPositionProvider(ThumbnailTrimmingPositionProvider thumbnailTrimmingPositionProvider) {
        akcr.b(thumbnailTrimmingPositionProvider, "trimmingPositionProvider");
        this.trimmingPositionProvider = new WeakReference(thumbnailTrimmingPositionProvider);
    }
}
