package com.addlive.shared_state.djinni;

import java.util.ArrayList;

public abstract class Delegate {
    public abstract void onClosed();

    public abstract void onConnectivityChanged(boolean z);

    public abstract void onMessage(StateUpdate stateUpdate);

    public abstract void onParticipantConnectivityChanged(long j, boolean z);

    public abstract void onStatesChanged(ArrayList<StateUpdate> arrayList);

    public abstract void refreshAuth();
}
