package com.snap.ui.view.surfaceview;

import android.app.Activity;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.google.common.base.Preconditions;
import defpackage.abln.d;
import defpackage.ablx;
import defpackage.abmb;
import defpackage.absi;
import defpackage.abss;
import defpackage.absy;
import defpackage.absz.a;
import defpackage.abta;
import defpackage.abtl;
import defpackage.ajdp;
import defpackage.ajdw;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajek;
import defpackage.ajxm;
import defpackage.iib;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zgu;
import defpackage.zkq;
import java.util.ArrayList;

public class SurfaceViewManager implements Callback {
    private static final String TAG = "SurfaceViewManager";
    private final Activity activity;
    private SurfaceViewRequest currentRequest;
    private final zkq insetsDetector;
    private final ablx launchTracker;
    private SurfaceViewRequest pendingRequest;
    private final abss releaseManager;
    private final zfw schedulers = zgb.a(zgu.a.callsite(TAG));
    private final iib screenParameterProvider;
    private final absi softNavBarDetector;
    private ArrayList<String> stateHistory;
    protected abta<State> stateMachine;
    private Surface surface;
    private SurfaceView surfaceView;

    enum State {
        IDLE,
        ACTIVE,
        WAITING_FOR_SURFACE,
        SURFACE_AVAILABLE,
        SURFACE_IN_USE,
        MANAGER_REVOKING,
        SYSTEM_REVOKING
    }

    enum TakeSurfaceViewAction implements a<State, SurfaceView> {
        TAKE_SURFACE_VIEW
    }

    enum CheckOutAction implements a<State, SurfaceViewRequest> {
        CHECK_OUT_SURFACE
    }

    enum SurfaceCreatedAction implements a<State, Surface> {
        GET_SURFACE
    }

    enum CheckInAction implements a<State, SurfaceViewRequest> {
        CHECK_IN_SURFACE
    }

    enum Action implements a<State, absy> {
        LOSE_SURFACE,
        ACTIVITY_DESTROYED
    }

    public interface SurfaceViewRequest {
        String getTag();

        void onRequestIgnored();

        void onSurfaceChanged(Surface surface, abtl abtl);

        void onSurfaceGoingToRevoke(boolean z);

        void onSurfaceReady(Surface surface, abtl abtl);
    }

    public SurfaceViewManager(abss abss, Activity activity, ablx ablx, zkq zkq, iib iib, zgb zgb, absi absi) {
        this.releaseManager = abss;
        this.insetsDetector = zkq;
        this.activity = activity;
        this.screenParameterProvider = iib;
        this.launchTracker = ablx;
        this.softNavBarDetector = absi;
    }

    private ajej adjustSurfaceViewForTallDevice() {
        return ajdp.a(this.screenParameterProvider.b().i(), this.insetsDetector.c, -$$Lambda$KnFKs2hfwn-dyJ0Qq3FMgxac-Vc.INSTANCE).b((ajdw) this.schedulers.b()).a((ajdw) this.schedulers.l()).a(-$$Lambda$SurfaceViewManager$j7w6O01qyWnz-dqssNae9YnUN4g.INSTANCE).f(new -$$Lambda$SurfaceViewManager$bXLmKehlHcQQoAlN-UKEvSHtSOo(this));
    }

    private void cacheAndLendSurface(Surface surface) {
        cacheSurface(surface);
        lendSurface();
    }

    private void cacheSurface(Surface surface) {
        this.surface = surface;
    }

    private void checkInSurfaceAfterRevoking(SurfaceViewRequest surfaceViewRequest) {
        if (surfaceViewRequest == this.pendingRequest) {
            surfaceViewRequest.onRequestIgnored();
            this.pendingRequest = null;
        } else if (surfaceViewRequest == this.currentRequest) {
            lendSurface();
        } else {
            StringBuilder stringBuilder = new StringBuilder("non current or pending request checked in");
            stringBuilder.append(surfaceViewRequest);
            stringBuilder.append(". history: ");
            stringBuilder.append(this.stateHistory);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    private void lendSurface() {
        this.currentRequest = this.pendingRequest;
        this.pendingRequest = null;
        this.currentRequest.onSurfaceReady(this.surface, new abtl(this.surfaceView.getWidth(), this.surfaceView.getHeight()));
    }

    private void logging(a<?, ?> aVar) {
    }

    private synchronized void onActivityDestroyed() {
        if (this.releaseManager.b() && this.stateMachine.a.p() != State.ACTIVE) {
            if (this.stateMachine.a.p() != State.SURFACE_AVAILABLE) {
                StringBuilder stringBuilder = new StringBuilder("Attempting to release manager resources from an inappropriate state: ");
                stringBuilder.append(this.stateHistory);
                throw new RuntimeException(stringBuilder.toString());
            }
        }
        this.stateMachine.a(Action.ACTIVITY_DESTROYED);
        logging(Action.ACTIVITY_DESTROYED);
    }

    private void onActivityDestroyedInternal() {
        reset();
        this.surfaceView = null;
    }

    private void removeCurrentRequest(SurfaceViewRequest surfaceViewRequest) {
        if (surfaceViewRequest.equals(this.currentRequest)) {
            this.currentRequest = null;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("non current request checked in ");
        stringBuilder.append(surfaceViewRequest.getTag());
        stringBuilder.append(". history: ");
        stringBuilder.append(this.stateHistory);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private void removePendingRequest(SurfaceViewRequest surfaceViewRequest) {
        if (surfaceViewRequest.equals(this.pendingRequest)) {
            this.pendingRequest = null;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("non pending request checked in ");
        stringBuilder.append(surfaceViewRequest.getTag());
        stringBuilder.append(". history: ");
        stringBuilder.append(this.stateHistory);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private void reset() {
        this.surface = null;
        this.pendingRequest = null;
        this.currentRequest = null;
    }

    private void revokeSurfaceSync() {
        SurfaceViewRequest surfaceViewRequest = this.pendingRequest;
        if (surfaceViewRequest != null) {
            surfaceViewRequest.onRequestIgnored();
            this.pendingRequest = null;
        }
        this.currentRequest.onSurfaceGoingToRevoke(true);
    }

    private void updatePendingClientAndRevokeSurfaceAsync(SurfaceViewRequest surfaceViewRequest) {
        if (surfaceViewRequest == this.currentRequest) {
            if (this.releaseManager.f()) {
                Toast.makeText(this.activity, String.format("Looks like %s does bad thing to SurfaceViewManager. Please S2R to help debug :)", new Object[]{surfaceViewRequest.getTag()}), 1).show();
            } else {
                StringBuilder stringBuilder = new StringBuilder("current client attempts to check out surface ");
                stringBuilder.append(surfaceViewRequest.getTag());
                stringBuilder.append(". history: ");
                stringBuilder.append(this.stateHistory);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        updatePendingRequest(surfaceViewRequest);
        this.currentRequest.onSurfaceGoingToRevoke(false);
    }

    private void updatePendingRequest(SurfaceViewRequest surfaceViewRequest) {
        SurfaceViewRequest surfaceViewRequest2 = this.pendingRequest;
        if (surfaceViewRequest2 != null) {
            surfaceViewRequest2.onRequestIgnored();
        }
        this.pendingRequest = surfaceViewRequest;
    }

    private void updatePendingRequestAndLendSurface(SurfaceViewRequest surfaceViewRequest) {
        updatePendingRequest(surfaceViewRequest);
        lendSurface();
    }

    private void updateSurfaceView(SurfaceView surfaceView) {
        this.surfaceView = surfaceView;
        surfaceView.getHolder().addCallback(this);
    }

    private void updateSurfaceViewLayoutParams(LayoutParams layoutParams) {
        this.surfaceView.setLayoutParams(layoutParams);
    }

    public synchronized void checkIn(SurfaceViewRequest surfaceViewRequest) {
        Preconditions.checkNotNull(surfaceViewRequest);
        this.stateMachine.b(CheckInAction.CHECK_IN_SURFACE, surfaceViewRequest);
        logging(CheckInAction.CHECK_IN_SURFACE);
    }

    public synchronized void checkOut(SurfaceViewRequest surfaceViewRequest) {
        Preconditions.checkNotNull(surfaceViewRequest);
        this.stateMachine.b(CheckOutAction.CHECK_OUT_SURFACE, surfaceViewRequest);
        logging(CheckOutAction.CHECK_OUT_SURFACE);
    }

    public synchronized abtl getSurfaceViewResolution() {
        return new abtl(this.surfaceView.getWidth(), this.surfaceView.getHeight());
    }

    public synchronized ajej initialize(ViewStub viewStub) {
        ajei ajei;
        ajei = new ajei();
        this.surfaceView = (SurfaceView) viewStub.inflate();
        ajei.a(adjustSurfaceViewForTallDevice());
        Object obj = State.IDLE;
        ajei.getClass();
        abta.a a = abta.a(obj, new -$$Lambda$mel42v5AXbZcvAypz7TBWMcjMnk(ajei));
        a.a(State.IDLE, TakeSurfaceViewAction.TAKE_SURFACE_VIEW, State.ACTIVE).a(new -$$Lambda$SurfaceViewManager$o_N6z1Sd-EmsHhhdSwDSURuamgY(this));
        a.a(State.ACTIVE, CheckOutAction.CHECK_OUT_SURFACE, State.WAITING_FOR_SURFACE).a(new -$$Lambda$SurfaceViewManager$PQ4Xg-X6PwXAzsNTKNJXCqKI9Uw(this));
        a.a(State.ACTIVE, SurfaceCreatedAction.GET_SURFACE, State.SURFACE_AVAILABLE).a(new -$$Lambda$SurfaceViewManager$08ybhr_RqrFuseKeiiYgndiC-yY(this));
        a.a(State.WAITING_FOR_SURFACE, SurfaceCreatedAction.GET_SURFACE, State.SURFACE_IN_USE).a(new -$$Lambda$SurfaceViewManager$GckUDfTqNEXa6F2dUhiGXnd_wDU(this));
        a.a(State.WAITING_FOR_SURFACE, CheckOutAction.CHECK_OUT_SURFACE, State.WAITING_FOR_SURFACE).a(new -$$Lambda$SurfaceViewManager$PQ4Xg-X6PwXAzsNTKNJXCqKI9Uw(this));
        a.a(State.WAITING_FOR_SURFACE, CheckInAction.CHECK_IN_SURFACE, State.ACTIVE).a(new -$$Lambda$SurfaceViewManager$F41AA2XAF-D9t86bMwTK4D9WeZQ(this));
        a.a(State.SURFACE_AVAILABLE, CheckOutAction.CHECK_OUT_SURFACE, State.SURFACE_IN_USE).a(new -$$Lambda$SurfaceViewManager$TBqfbKI0K6tZXUEuv9WDUt0OkZo(this));
        a.a(State.SURFACE_AVAILABLE, Action.LOSE_SURFACE, State.ACTIVE).a(new -$$Lambda$SurfaceViewManager$CFCThzqVtOsOWOZOjf5_9KguSgk(this));
        a.a(State.SURFACE_IN_USE, CheckInAction.CHECK_IN_SURFACE, State.SURFACE_AVAILABLE).a(new -$$Lambda$SurfaceViewManager$5dWCK6uScPJU6ihwo0pZRWKrOJg(this));
        a.a(State.SURFACE_IN_USE, CheckOutAction.CHECK_OUT_SURFACE, State.MANAGER_REVOKING).a(new -$$Lambda$SurfaceViewManager$hpvgP82HkQpWOgC_NHn816sBAus(this));
        a.a(State.SURFACE_IN_USE, Action.LOSE_SURFACE, State.SYSTEM_REVOKING).a(new -$$Lambda$SurfaceViewManager$WbE0UnAEnXzzcqOG2G4c-aBDDpM(this));
        a.a(State.MANAGER_REVOKING, CheckInAction.CHECK_IN_SURFACE, State.SURFACE_IN_USE).a(new -$$Lambda$SurfaceViewManager$xDVmC-zvRbNAI5NuVJ5EI_F4n3c(this));
        a.a(State.MANAGER_REVOKING, Action.LOSE_SURFACE, State.SYSTEM_REVOKING).a(new -$$Lambda$SurfaceViewManager$WbE0UnAEnXzzcqOG2G4c-aBDDpM(this));
        a.a(State.MANAGER_REVOKING, CheckOutAction.CHECK_OUT_SURFACE, State.MANAGER_REVOKING).a(new -$$Lambda$SurfaceViewManager$PQ4Xg-X6PwXAzsNTKNJXCqKI9Uw(this));
        a.a(State.SYSTEM_REVOKING, CheckInAction.CHECK_IN_SURFACE, State.ACTIVE).a(new -$$Lambda$SurfaceViewManager$CFCThzqVtOsOWOZOjf5_9KguSgk(this));
        a.a(State.ACTIVE, Action.ACTIVITY_DESTROYED, State.IDLE).a(new -$$Lambda$SurfaceViewManager$81pRLbV7_OKafffB3RasAvrRtbA(this));
        a.a(State.SURFACE_AVAILABLE, Action.ACTIVITY_DESTROYED, State.IDLE).a(new -$$Lambda$SurfaceViewManager$81pRLbV7_OKafffB3RasAvrRtbA(this));
        this.stateMachine = a.a(TAG);
        this.stateMachine.b(TakeSurfaceViewAction.TAKE_SURFACE_VIEW, this.surfaceView);
        logging(TakeSurfaceViewAction.TAKE_SURFACE_VIEW);
        ajei.a(ajek.a(new -$$Lambda$SurfaceViewManager$4J6z6hmeJic-lDiSqwa0YULbVvQ(this)));
        return ajei;
    }

    public /* synthetic */ void lambda$adjustSurfaceViewForTallDevice$1$SurfaceViewManager(ajxm ajxm) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.bottomMargin = ((Rect) ajxm.b).bottom;
        if (this.softNavBarDetector.d() == 0) {
            layoutParams.bottomMargin = 0;
        }
        updateSurfaceViewLayoutParams(layoutParams);
    }

    public synchronized void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (this.currentRequest != null) {
            this.currentRequest.onSurfaceChanged(this.surface, new abtl(this.surfaceView.getWidth(), this.surfaceView.getHeight()));
            return;
        }
        this.stateMachine.b(SurfaceCreatedAction.GET_SURFACE, surfaceHolder.getSurface());
        logging(SurfaceCreatedAction.GET_SURFACE);
    }

    public synchronized void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.launchTracker.a((d) abmb.SHARED_SURFACE_CREATED);
    }

    public synchronized void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.stateMachine.a(Action.LOSE_SURFACE);
        logging(Action.LOSE_SURFACE);
    }
}
