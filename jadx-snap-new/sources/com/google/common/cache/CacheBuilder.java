package com.google.common.cache;

import com.google.common.base.Ascii;
import com.google.common.base.Equivalence;
import com.google.common.base.MoreObjects;
import com.google.common.base.MoreObjects.ToStringHelper;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.base.Ticker;
import com.google.common.cache.AbstractCache.SimpleStatsCounter;
import com.google.common.cache.AbstractCache.StatsCounter;
import com.google.errorprone.annotations.CheckReturnValue;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class CacheBuilder<K, V> {
    static final Supplier<StatsCounter> CACHE_STATS_COUNTER = new Supplier<StatsCounter>() {
        public final StatsCounter get() {
            return new SimpleStatsCounter();
        }
    };
    static final CacheStats EMPTY_STATS = new CacheStats(0, 0, 0, 0, 0, 0);
    static final Supplier<? extends StatsCounter> NULL_STATS_COUNTER = Suppliers.ofInstance(new StatsCounter() {
        public final void recordEviction() {
        }

        public final void recordHits(int i) {
        }

        public final void recordLoadException(long j) {
        }

        public final void recordLoadSuccess(long j) {
        }

        public final void recordMisses(int i) {
        }
    });
    static final Ticker NULL_TICKER = new Ticker() {
        public final long read() {
            return 0;
        }
    };
    private static final Logger logger = Logger.getLogger(CacheBuilder.class.getName());
    int concurrencyLevel = -1;
    long expireAfterAccessNanos = -1;
    long expireAfterWriteNanos = -1;
    int initialCapacity = -1;
    Equivalence<Object> keyEquivalence;
    Strength keyStrength;
    long maximumSize = -1;
    long maximumWeight = -1;
    long refreshNanos = -1;
    RemovalListener<? super K, ? super V> removalListener;
    Supplier<? extends StatsCounter> statsCounterSupplier = NULL_STATS_COUNTER;
    boolean strictParsing = true;
    Ticker ticker;
    Equivalence<Object> valueEquivalence;
    Strength valueStrength;
    Weigher<? super K, ? super V> weigher;

    enum OneWeigher implements Weigher<Object, Object> {
        INSTANCE;

        public final int weigh(Object obj, Object obj2) {
            return 1;
        }
    }

    enum NullListener implements RemovalListener<Object, Object> {
        INSTANCE;

        public final void onRemoval(RemovalNotification<Object, Object> removalNotification) {
        }
    }

    private CacheBuilder() {
    }

    private void checkNonLoadingCache() {
        Preconditions.checkState(this.refreshNanos == -1, "refreshAfterWrite requires a LoadingCache");
    }

    private void checkWeightWithWeigher() {
        Object obj;
        boolean z = true;
        if (this.weigher == null) {
            if (this.maximumWeight != -1) {
                z = false;
            }
            obj = "maximumWeight requires weigher";
        } else if (this.strictParsing) {
            if (this.maximumWeight == -1) {
                z = false;
            }
            obj = "weigher requires maximumWeight";
        } else {
            if (this.maximumWeight == -1) {
                logger.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
            }
            return;
        }
        Preconditions.checkState(z, obj);
    }

    public static CacheBuilder<Object, Object> newBuilder() {
        return new CacheBuilder();
    }

    public final <K1 extends K, V1 extends V> Cache<K1, V1> build() {
        checkWeightWithWeigher();
        checkNonLoadingCache();
        return new LocalManualCache(this);
    }

    public final <K1 extends K, V1 extends V> LoadingCache<K1, V1> build(CacheLoader<? super K1, V1> cacheLoader) {
        checkWeightWithWeigher();
        return new LocalLoadingCache(this, cacheLoader);
    }

    public final CacheBuilder<K, V> concurrencyLevel(int i) {
        boolean z = true;
        Preconditions.checkState(this.concurrencyLevel == -1, "concurrency level was already set to %s", this.concurrencyLevel);
        if (i <= 0) {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.concurrencyLevel = i;
        return this;
    }

    public final CacheBuilder<K, V> expireAfterAccess(long j, TimeUnit timeUnit) {
        boolean z = true;
        Preconditions.checkState(this.expireAfterAccessNanos == -1, "expireAfterAccess was already set to %s ns", this.expireAfterAccessNanos);
        if (j < 0) {
            z = false;
        }
        Preconditions.checkArgument(z, "duration cannot be negative: %s %s", j, (Object) timeUnit);
        this.expireAfterAccessNanos = timeUnit.toNanos(j);
        return this;
    }

    public final CacheBuilder<K, V> expireAfterWrite(long j, TimeUnit timeUnit) {
        boolean z = true;
        Preconditions.checkState(this.expireAfterWriteNanos == -1, "expireAfterWrite was already set to %s ns", this.expireAfterWriteNanos);
        if (j < 0) {
            z = false;
        }
        Preconditions.checkArgument(z, "duration cannot be negative: %s %s", j, (Object) timeUnit);
        this.expireAfterWriteNanos = timeUnit.toNanos(j);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final int getConcurrencyLevel() {
        int i = this.concurrencyLevel;
        return i == -1 ? 4 : i;
    }

    /* Access modifiers changed, original: final */
    public final long getExpireAfterAccessNanos() {
        long j = this.expireAfterAccessNanos;
        return j == -1 ? 0 : j;
    }

    /* Access modifiers changed, original: final */
    public final long getExpireAfterWriteNanos() {
        long j = this.expireAfterWriteNanos;
        return j == -1 ? 0 : j;
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
    public final long getMaximumWeight() {
        return (this.expireAfterWriteNanos == 0 || this.expireAfterAccessNanos == 0) ? 0 : this.weigher == null ? this.maximumSize : this.maximumWeight;
    }

    /* Access modifiers changed, original: final */
    public final long getRefreshNanos() {
        long j = this.refreshNanos;
        return j == -1 ? 0 : j;
    }

    /* Access modifiers changed, original: final */
    public final <K1 extends K, V1 extends V> RemovalListener<K1, V1> getRemovalListener() {
        return (RemovalListener) MoreObjects.firstNonNull(this.removalListener, NullListener.INSTANCE);
    }

    /* Access modifiers changed, original: final */
    public final Supplier<? extends StatsCounter> getStatsCounterSupplier() {
        return this.statsCounterSupplier;
    }

    /* Access modifiers changed, original: final */
    public final Ticker getTicker(boolean z) {
        Ticker ticker = this.ticker;
        return ticker != null ? ticker : z ? Ticker.systemTicker() : NULL_TICKER;
    }

    /* Access modifiers changed, original: final */
    public final Equivalence<Object> getValueEquivalence() {
        return (Equivalence) MoreObjects.firstNonNull(this.valueEquivalence, getValueStrength().defaultEquivalence());
    }

    /* Access modifiers changed, original: final */
    public final Strength getValueStrength() {
        return (Strength) MoreObjects.firstNonNull(this.valueStrength, Strength.STRONG);
    }

    /* Access modifiers changed, original: final */
    public final <K1 extends K, V1 extends V> Weigher<K1, V1> getWeigher() {
        return (Weigher) MoreObjects.firstNonNull(this.weigher, OneWeigher.INSTANCE);
    }

    public final CacheBuilder<K, V> maximumSize(long j) {
        boolean z = true;
        Preconditions.checkState(this.maximumSize == -1, "maximum size was already set to %s", this.maximumSize);
        Preconditions.checkState(this.maximumWeight == -1, "maximum weight was already set to %s", this.maximumWeight);
        Preconditions.checkState(this.weigher == null, "maximum size can not be combined with weigher");
        if (j < 0) {
            z = false;
        }
        Preconditions.checkArgument(z, "maximum size must not be negative");
        this.maximumSize = j;
        return this;
    }

    @CheckReturnValue
    public final <K1 extends K, V1 extends V> CacheBuilder<K1, V1> removalListener(RemovalListener<? super K1, ? super V1> removalListener) {
        Preconditions.checkState(this.removalListener == null);
        this.removalListener = (RemovalListener) Preconditions.checkNotNull(removalListener);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final CacheBuilder<K, V> setKeyStrength(Strength strength) {
        Preconditions.checkState(this.keyStrength == null, "Key strength was already set to %s", this.keyStrength);
        this.keyStrength = (Strength) Preconditions.checkNotNull(strength);
        return this;
    }

    public final CacheBuilder<K, V> ticker(Ticker ticker) {
        Preconditions.checkState(this.ticker == null);
        this.ticker = (Ticker) Preconditions.checkNotNull(ticker);
        return this;
    }

    public final String toString() {
        StringBuilder stringBuilder;
        ToStringHelper toStringHelper = MoreObjects.toStringHelper((Object) this);
        int i = this.initialCapacity;
        if (i != -1) {
            toStringHelper.add("initialCapacity", i);
        }
        i = this.concurrencyLevel;
        if (i != -1) {
            toStringHelper.add("concurrencyLevel", i);
        }
        long j = this.maximumSize;
        if (j != -1) {
            toStringHelper.add("maximumSize", j);
        }
        j = this.maximumWeight;
        if (j != -1) {
            toStringHelper.add("maximumWeight", j);
        }
        String str = "ns";
        if (this.expireAfterWriteNanos != -1) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.expireAfterWriteNanos);
            stringBuilder.append(str);
            toStringHelper.add("expireAfterWrite", stringBuilder.toString());
        }
        if (this.expireAfterAccessNanos != -1) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.expireAfterAccessNanos);
            stringBuilder.append(str);
            toStringHelper.add("expireAfterAccess", stringBuilder.toString());
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
        if (this.valueEquivalence != null) {
            toStringHelper.addValue("valueEquivalence");
        }
        if (this.removalListener != null) {
            toStringHelper.addValue("removalListener");
        }
        return toStringHelper.toString();
    }

    public final CacheBuilder<K, V> weakKeys() {
        return setKeyStrength(Strength.WEAK);
    }
}
