package com.google.common.base;

import defpackage.ppy;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

public final class Suppliers {

    static class NonSerializableMemoizingSupplier<T> implements Supplier<T> {
        volatile Supplier<T> delegate;
        volatile boolean initialized;
        T value;

        NonSerializableMemoizingSupplier(Supplier<T> supplier) {
            this.delegate = (Supplier) Preconditions.checkNotNull(supplier);
        }

        public T get() {
            if (!this.initialized) {
                synchronized (this) {
                    if (!this.initialized) {
                        Object obj = this.delegate.get();
                        this.value = obj;
                        this.initialized = true;
                        this.delegate = null;
                        return obj;
                    }
                }
            }
            return this.value;
        }

        public String toString() {
            Object obj = this.delegate;
            StringBuilder stringBuilder = new StringBuilder("Suppliers.memoize(");
            if (obj == null) {
                StringBuilder stringBuilder2 = new StringBuilder("<supplier that returned ");
                stringBuilder2.append(this.value);
                stringBuilder2.append(">");
                obj = stringBuilder2.toString();
            }
            stringBuilder.append(obj);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    static class MemoizingSupplier<T> implements Supplier<T>, Serializable {
        final Supplier<T> delegate;
        volatile transient boolean initialized;
        transient T value;

        MemoizingSupplier(Supplier<T> supplier) {
            this.delegate = (Supplier) Preconditions.checkNotNull(supplier);
        }

        public T get() {
            if (!this.initialized) {
                synchronized (this) {
                    if (!this.initialized) {
                        Object obj = this.delegate.get();
                        this.value = obj;
                        this.initialized = true;
                        return obj;
                    }
                }
            }
            return this.value;
        }

        public String toString() {
            Object stringBuilder;
            StringBuilder stringBuilder2 = new StringBuilder("Suppliers.memoize(");
            if (this.initialized) {
                StringBuilder stringBuilder3 = new StringBuilder("<supplier that returned ");
                stringBuilder3.append(this.value);
                stringBuilder3.append(">");
                stringBuilder = stringBuilder3.toString();
            } else {
                stringBuilder = this.delegate;
            }
            stringBuilder2.append(stringBuilder);
            stringBuilder2.append(")");
            return stringBuilder2.toString();
        }
    }

    static class SupplierOfInstance<T> implements Supplier<T>, Serializable {
        final T instance;

        SupplierOfInstance(T t) {
            this.instance = t;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof SupplierOfInstance)) {
                return false;
            }
            return Objects.equal(this.instance, ((SupplierOfInstance) obj).instance);
        }

        public T get() {
            return this.instance;
        }

        public int hashCode() {
            return Objects.hashCode(this.instance);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("Suppliers.ofInstance(");
            stringBuilder.append(this.instance);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    static class SupplierComposition<F, T> implements Supplier<T>, Serializable {
        final Function<? super F, T> function;
        final Supplier<F> supplier;

        SupplierComposition(Function<? super F, T> function, Supplier<F> supplier) {
            this.function = (Function) Preconditions.checkNotNull(function);
            this.supplier = (Supplier) Preconditions.checkNotNull(supplier);
        }

        public boolean equals(Object obj) {
            if (obj instanceof SupplierComposition) {
                SupplierComposition supplierComposition = (SupplierComposition) obj;
                if (this.function.equals(supplierComposition.function) && this.supplier.equals(supplierComposition.supplier)) {
                    return true;
                }
            }
            return false;
        }

        public T get() {
            return this.function.apply(this.supplier.get());
        }

        public int hashCode() {
            return Objects.hashCode(this.function, this.supplier);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("Suppliers.compose(");
            stringBuilder.append(this.function);
            stringBuilder.append(ppy.d);
            stringBuilder.append(this.supplier);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    static class ExpiringMemoizingSupplier<T> implements Supplier<T>, Serializable {
        final Supplier<T> delegate;
        final long durationNanos;
        volatile transient long expirationNanos;
        volatile transient T value;

        ExpiringMemoizingSupplier(Supplier<T> supplier, long j, TimeUnit timeUnit) {
            this.delegate = (Supplier) Preconditions.checkNotNull(supplier);
            this.durationNanos = timeUnit.toNanos(j);
            Preconditions.checkArgument(j > 0, "duration (%s %s) must be > 0", j, (Object) timeUnit);
        }

        public T get() {
            long j = this.expirationNanos;
            long systemNanoTime = Platform.systemNanoTime();
            if (j == 0 || systemNanoTime - j >= 0) {
                synchronized (this) {
                    if (j == this.expirationNanos) {
                        Object obj = this.delegate.get();
                        this.value = obj;
                        systemNanoTime += this.durationNanos;
                        if (systemNanoTime == 0) {
                            systemNanoTime = 1;
                        }
                        this.expirationNanos = systemNanoTime;
                        return obj;
                    }
                }
            }
            return this.value;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("Suppliers.memoizeWithExpiration(");
            stringBuilder.append(this.delegate);
            stringBuilder.append(ppy.d);
            stringBuilder.append(this.durationNanos);
            stringBuilder.append(", NANOS)");
            return stringBuilder.toString();
        }
    }

    public static <F, T> Supplier<T> compose(Function<? super F, T> function, Supplier<F> supplier) {
        return new SupplierComposition(function, supplier);
    }

    public static <T> Supplier<T> memoize(Supplier<T> supplier) {
        return ((supplier instanceof NonSerializableMemoizingSupplier) || (supplier instanceof MemoizingSupplier)) ? supplier : supplier instanceof Serializable ? new MemoizingSupplier(supplier) : new NonSerializableMemoizingSupplier(supplier);
    }

    public static <T> Supplier<T> memoizeWithExpiration(Supplier<T> supplier, long j, TimeUnit timeUnit) {
        return new ExpiringMemoizingSupplier(supplier, j, timeUnit);
    }

    public static <T> Supplier<T> ofInstance(T t) {
        return new SupplierOfInstance(t);
    }
}
