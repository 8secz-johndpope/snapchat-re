package com.snapchat.map;

import android.support.annotation.Keep;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.acld;
import defpackage.acle;
import defpackage.akcr;

@Keep
public final class ParticleSimulationPayload {
    private Float alphaVariance;
    private Float angle;
    private Float angleVariance;
    private float[] color;
    private Integer count;
    private Float emissionBurst;
    private float[] emissionRect;
    private Float fadeInOverTime;
    private Float fadeOutOverTime;
    private Float flutterAmplitude;
    private Float flutterMaxPeriod;
    private Float flutterMinPeriod;
    private Integer frameCount;
    private Float frameDuration;
    private Float imageAspectRatio;
    private final String imageName;
    private Float particleLifetime;
    private Float particleLifetimeVariance;
    private Float rotateIn3D;
    private Float rotationsPerSecond;
    private Float rotationsPerSecondVariance;
    private Float scale;
    private Float scaleVariance;
    private Float skipParticleProbability;
    private Float velocity;
    private Float velocityVariance;

    public ParticleSimulationPayload(Integer num, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, float[] fArr, Float f7, Float f8, Float f9, Float f10, Float f11, Float f12, Float f13, Float f14, Float f15, Float f16, Float f17, Float f18, Float f19, float[] fArr2, Float f20, Integer num2, Float f21, String str) {
        String str2 = str;
        akcr.b(str2, "imageName");
        this.count = num;
        this.emissionBurst = f;
        this.skipParticleProbability = f2;
        this.fadeInOverTime = f3;
        this.fadeOutOverTime = f4;
        this.particleLifetime = f5;
        this.particleLifetimeVariance = f6;
        this.emissionRect = fArr;
        this.angle = f7;
        this.angleVariance = f8;
        this.velocity = f9;
        this.velocityVariance = f10;
        this.imageAspectRatio = f11;
        this.scale = f12;
        this.scaleVariance = f13;
        this.flutterAmplitude = f14;
        this.flutterMinPeriod = f15;
        this.flutterMaxPeriod = f16;
        this.rotationsPerSecond = f17;
        this.rotationsPerSecondVariance = f18;
        this.rotateIn3D = f19;
        this.color = fArr2;
        this.alphaVariance = f20;
        this.frameCount = num2;
        this.frameDuration = f21;
        this.imageName = str2;
    }

    public final Float getAlphaVariance() {
        return this.alphaVariance;
    }

    public final Float getAngle() {
        return this.angle;
    }

    public final Float getAngleVariance() {
        return this.angleVariance;
    }

    public final float[] getColor() {
        return this.color;
    }

    public final Integer getCount() {
        return this.count;
    }

    public final Float getEmissionBurst() {
        return this.emissionBurst;
    }

    public final float[] getEmissionRect() {
        return this.emissionRect;
    }

    public final Float getFadeInOverTime() {
        return this.fadeInOverTime;
    }

    public final Float getFadeOutOverTime() {
        return this.fadeOutOverTime;
    }

    public final Float getFlutterAmplitude() {
        return this.flutterAmplitude;
    }

    public final Float getFlutterMaxPeriod() {
        return this.flutterMaxPeriod;
    }

    public final Float getFlutterMinPeriod() {
        return this.flutterMinPeriod;
    }

    public final Integer getFrameCount() {
        return this.frameCount;
    }

    public final Float getFrameDuration() {
        return this.frameDuration;
    }

    public final Float getImageAspectRatio() {
        return this.imageAspectRatio;
    }

    public final String getImageName() {
        return this.imageName;
    }

    public final Float getParticleLifetime() {
        return this.particleLifetime;
    }

    public final Float getParticleLifetimeVariance() {
        return this.particleLifetimeVariance;
    }

    public final Float getRotateIn3D() {
        return this.rotateIn3D;
    }

    public final Float getRotationsPerSecond() {
        return this.rotationsPerSecond;
    }

    public final Float getRotationsPerSecondVariance() {
        return this.rotationsPerSecondVariance;
    }

    public final Float getScale() {
        return this.scale;
    }

    public final Float getScaleVariance() {
        return this.scaleVariance;
    }

    public final Float getSkipParticleProbability() {
        return this.skipParticleProbability;
    }

    public final Float getVelocity() {
        return this.velocity;
    }

    public final Float getVelocityVariance() {
        return this.velocityVariance;
    }

    public final void setAlphaVariance(Float f) {
        this.alphaVariance = f;
    }

    public final void setAngle(Float f) {
        this.angle = f;
    }

    public final void setAngleVariance(Float f) {
        this.angleVariance = f;
    }

    public final void setColor(float[] fArr) {
        this.color = fArr;
    }

    public final void setCount(Integer num) {
        this.count = num;
    }

    public final void setEmissionBurst(Float f) {
        this.emissionBurst = f;
    }

    public final void setEmissionRect(float[] fArr) {
        this.emissionRect = fArr;
    }

    public final void setFadeInOverTime(Float f) {
        this.fadeInOverTime = f;
    }

    public final void setFadeOutOverTime(Float f) {
        this.fadeOutOverTime = f;
    }

    public final void setFlutterAmplitude(Float f) {
        this.flutterAmplitude = f;
    }

    public final void setFlutterMaxPeriod(Float f) {
        this.flutterMaxPeriod = f;
    }

    public final void setFlutterMinPeriod(Float f) {
        this.flutterMinPeriod = f;
    }

    public final void setFrameCount(Integer num) {
        this.frameCount = num;
    }

    public final void setFrameDuration(Float f) {
        this.frameDuration = f;
    }

    public final void setImageAspectRatio(Float f) {
        this.imageAspectRatio = f;
    }

    public final void setParticleLifetime(Float f) {
        this.particleLifetime = f;
    }

    public final void setParticleLifetimeVariance(Float f) {
        this.particleLifetimeVariance = f;
    }

    public final void setRotateIn3D(Float f) {
        this.rotateIn3D = f;
    }

    public final void setRotationsPerSecond(Float f) {
        this.rotationsPerSecond = f;
    }

    public final void setRotationsPerSecondVariance(Float f) {
        this.rotationsPerSecondVariance = f;
    }

    public final void setScale(Float f) {
        this.scale = f;
    }

    public final void setScaleVariance(Float f) {
        this.scaleVariance = f;
    }

    public final void setSkipParticleProbability(Float f) {
        this.skipParticleProbability = f;
    }

    public final void setVelocity(Float f) {
        this.velocity = f;
    }

    public final void setVelocityVariance(Float f) {
        this.velocityVariance = f;
    }

    public final acld withDefaults() {
        Integer num = this.count;
        int intValue = num != null ? num.intValue() : 100;
        Float f = this.emissionBurst;
        float floatValue = f != null ? f.floatValue() : 1.0f;
        f = this.skipParticleProbability;
        float floatValue2 = f != null ? f.floatValue() : MapboxConstants.MINIMUM_ZOOM;
        f = this.fadeInOverTime;
        float floatValue3 = f != null ? f.floatValue() : MapboxConstants.MINIMUM_ZOOM;
        f = this.fadeOutOverTime;
        float floatValue4 = f != null ? f.floatValue() : MapboxConstants.MINIMUM_ZOOM;
        f = this.particleLifetime;
        float floatValue5 = f != null ? f.floatValue() : 2.0f;
        f = this.particleLifetimeVariance;
        float floatValue6 = f != null ? f.floatValue() : MapboxConstants.MINIMUM_ZOOM;
        float[] fArr = this.emissionRect;
        if (fArr == null) {
            fArr = acle.b;
        }
        float[] fArr2 = fArr;
        f = this.angle;
        float floatValue7 = f != null ? f.floatValue() : MapboxConstants.MINIMUM_ZOOM;
        f = this.angleVariance;
        float floatValue8 = f != null ? f.floatValue() : MapboxConstants.MINIMUM_ZOOM;
        f = this.velocity;
        float floatValue9 = f != null ? f.floatValue() : MapboxConstants.MINIMUM_ZOOM;
        f = this.velocityVariance;
        float floatValue10 = f != null ? f.floatValue() : MapboxConstants.MINIMUM_ZOOM;
        f = this.imageAspectRatio;
        float floatValue11 = f != null ? f.floatValue() : 1.0f;
        f = this.scale;
        float floatValue12 = f != null ? f.floatValue() : 0.05f;
        f = this.scaleVariance;
        float floatValue13 = f != null ? f.floatValue() : 0.04f;
        f = this.flutterAmplitude;
        float floatValue14 = f != null ? f.floatValue() : MapboxConstants.MINIMUM_ZOOM;
        f = this.flutterMinPeriod;
        float floatValue15 = f != null ? f.floatValue() : 0.4f;
        f = this.flutterMaxPeriod;
        float floatValue16 = f != null ? f.floatValue() : 0.5f;
        f = this.rotationsPerSecond;
        float floatValue17 = f != null ? f.floatValue() : MapboxConstants.MINIMUM_ZOOM;
        f = this.rotationsPerSecondVariance;
        float floatValue18 = f != null ? f.floatValue() : MapboxConstants.MINIMUM_ZOOM;
        f = this.rotateIn3D;
        float floatValue19 = f != null ? f.floatValue() : MapboxConstants.MINIMUM_ZOOM;
        fArr = this.color;
        if (fArr == null) {
            fArr = acle.a;
        }
        float[] fArr3 = fArr;
        f = this.alphaVariance;
        float floatValue20 = f != null ? f.floatValue() : MapboxConstants.MINIMUM_ZOOM;
        num = this.frameCount;
        int intValue2 = num != null ? num.intValue() : 1;
        f = this.frameDuration;
        return new acld(intValue, floatValue, floatValue2, floatValue3, floatValue4, floatValue5, floatValue6, fArr2, floatValue7, floatValue8, floatValue9, floatValue10, floatValue11, floatValue12, floatValue13, floatValue14, floatValue15, floatValue16, floatValue17, floatValue18, floatValue19, fArr3, floatValue20, intValue2, f != null ? f.floatValue() : 1.0f, this.imageName);
    }
}
