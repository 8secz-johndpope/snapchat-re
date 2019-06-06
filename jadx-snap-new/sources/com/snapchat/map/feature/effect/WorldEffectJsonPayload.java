package com.snapchat.map.feature.effect;

import android.support.annotation.Keep;
import com.snapchat.map.ParticleSimulationPayload;
import defpackage.acpp;
import defpackage.akcr;

@Keep
public final class WorldEffectJsonPayload extends acpp {
    private final Double duration;
    private final ParticleSimulationPayload[] particles;

    public WorldEffectJsonPayload(Double d, ParticleSimulationPayload[] particleSimulationPayloadArr) {
        akcr.b(particleSimulationPayloadArr, "particles");
        super();
        this.duration = d;
        this.particles = particleSimulationPayloadArr;
    }

    public final Double getDuration() {
        return this.duration;
    }

    public final ParticleSimulationPayload[] getParticles() {
        return this.particles;
    }
}
