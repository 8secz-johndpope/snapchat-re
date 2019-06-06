package com.google.common.collect;

import com.google.common.base.Ascii;
import com.google.common.base.Equivalence;
import com.google.common.base.MoreObjects;
import com.google.common.base.MoreObjects.ToStringHelper;
import com.google.common.base.Preconditions;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class MapMaker {
    int concurrencyLevel = -1;
    int initialCapacity = -1;
    Equivalence<Object> keyEquivalence;
    Strength keyStrength;
    boolean useCustomMap;
    Strength valueStrength;

    /* Access modifiers changed, original: final */
    public final int getConcurrencyLevel() {
        int i = this.concurrencyLevel;
        return i == -1 ? 4 : i;
    }

    /* Access modifiers changed, original: final */
    public final int getInitialCapacity() {
        int i = this.initialCapacity;
        return i == -1 ? 16 : i;
    }

    /* Access modifiers changed, original: final */
    public final Equivalence<Object> getKeyEquivalence() {
        return (Equivalence) MoreObjects.firstNonNull(this.keyEquivalence, getKeyStrength().defaultEquivalence());
    }

    /* Access modifiers changed, original: final */
    public final Strength getKeyStrength() {
        return (Strength) MoreObjects.firstNonNull(this.keyStrength, Strength.STRONG);
    }

    /* Access modifiers changed, original: final */
    public final Strength getValueStrength() {
        return (Strength) MoreObjects.firstNonNull(this.valueStrength, Strength.STRONG);
    }

    public final <K, V> ConcurrentMap<K, V> makeMap() {
        return !this.useCustomMap ? new ConcurrentHashMap(getInitialCapacity(), 0.75f, getConcurrencyLevel()) : MapMakerInternalMap.create(this);
    }

    /* Access modifiers changed, original: final */
    public final MapMaker setValueStrength(Strength strength) {
        Preconditions.checkState(this.valueStrength == null, "Value strength was already set to %s", this.valueStrength);
        this.valueStrength = (Strength) Preconditions.checkNotNull(strength);
        if (strength != Strength.STRONG) {
            this.useCustomMap = true;
        }
        return this;
    }

    public final String toString() {
        ToStringHelper toStringHelper = MoreObjects.toStringHelper((Object) this);
        int i = this.initialCapacity;
        if (i != -1) {
            toStringHelper.add("initialCapacity", i);
        }
        i = this.concurrencyLevel;
        if (i != -1) {
            toStringHelper.add("concurrencyLevel", i);
        }
        Strength strength = this.keyStrength;
        if (strength != null) {
            toStringHelper.add("keyStrength", Ascii.toLowerCase(strength.toString()));
        }
        strength = this.valueStrength;
        if (strength != null) {
            toStringHelper.add("valueStrength", Ascii.toLowerCase(strength.toString()));
        }
        if (this.keyEquivalence != null) {
            toStringHelper.addValue("keyEquivalence");
        }
        return toStringHelper.toString();
    }

    public final MapMaker weakValues() {
        return setValueStrength(Strength.WEAK);
    }
}
