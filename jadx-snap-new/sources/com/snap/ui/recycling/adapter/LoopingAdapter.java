package com.snap.ui.recycling.adapter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.AdapterDataObserver;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.State;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.ViewGroup;
import defpackage.ajej;
import java.util.concurrent.atomic.AtomicBoolean;

public final class LoopingAdapter<T extends ViewHolder> extends Adapter<T> implements ajej {
    final Adapter a;
    boolean b = false;
    private final LoopingLayoutManager c;
    private int d;
    private int e;
    private final AdapterDataObserver f = new AdapterDataObserver() {
        private final Object a = new Object();

        public final void onItemRangeChanged(int i, int i2) {
            synchronized (this.a) {
                LoopingAdapter.a(LoopingAdapter.this, LoopingAdapter.a(LoopingAdapter.this));
                LoopingAdapter.this.notifyItemRangeChanged(LoopingAdapter.a(LoopingAdapter.this.a.getItemCount(), i), i2);
            }
        }

        public final void onItemRangeInserted(int i, int i2) {
            synchronized (this.a) {
                int a = LoopingAdapter.a(LoopingAdapter.this);
                if (i <= a) {
                    a += i2;
                }
                LoopingAdapter.a(LoopingAdapter.this, a);
                LoopingAdapter.this.notifyItemRangeInserted(LoopingAdapter.a(LoopingAdapter.this.a.getItemCount(), i), i2);
            }
        }

        public final void onItemRangeMoved(int i, int i2, int i3) {
            synchronized (this.a) {
                int a = LoopingAdapter.a(LoopingAdapter.this);
                if (i < a && i2 > a) {
                    a -= i3;
                } else if (i > a && i2 < a) {
                    a += i3;
                }
                LoopingAdapter.a(LoopingAdapter.this, a);
                if (i3 == 1) {
                    LoopingAdapter.this.notifyItemMoved(LoopingAdapter.a(LoopingAdapter.this.a.getItemCount(), i), LoopingAdapter.a(LoopingAdapter.this.a.getItemCount(), i2));
                } else {
                    LoopingAdapter.this.notifyDataSetChanged();
                }
            }
        }

        public final void onItemRangeRemoved(int i, int i2) {
            synchronized (this.a) {
                int a = LoopingAdapter.a(LoopingAdapter.this);
                if (i + i2 <= a) {
                    a -= i2;
                } else if (i <= a) {
                    LoopingAdapter.this.b = true;
                }
                LoopingAdapter.a(LoopingAdapter.this, a);
                LoopingAdapter.this.notifyItemRangeRemoved(LoopingAdapter.a(LoopingAdapter.this.a.getItemCount(), i), i2);
            }
        }
    };
    private boolean g;
    private final AtomicBoolean h = new AtomicBoolean(false);
    private int i;

    public static class LoopingLayoutManager extends LinearLayoutManager {
        int a = -1;
        boolean b = false;

        public LoopingLayoutManager(Context context, int i, boolean z) {
            super(context, i, z);
        }

        public boolean canScrollHorizontally() {
            return super.canScrollHorizontally() && !this.b;
        }

        public void onLayoutCompleted(State state) {
            super.onLayoutCompleted(state);
            this.a = -1;
            this.b = false;
            setItemPrefetchEnabled(true);
        }

        public void scrollToPosition(int i) {
            super.scrollToPosition(i);
            this.a = i;
        }

        public void scrollToPositionWithOffset(int i, int i2) {
            super.scrollToPositionWithOffset(i, i2);
            this.a = i;
        }
    }

    private LoopingAdapter(Adapter adapter, LoopingLayoutManager loopingLayoutManager) {
        this.a = adapter;
        this.c = loopingLayoutManager;
    }

    public static int a(int i, int i2) {
        return i == 0 ? 0 : (((Integer.MAX_VALUE / i) / 2) * i) + i2;
    }

    private synchronized ajej a() {
        this.g = true;
        this.a.registerAdapterDataObserver(this.f);
        return this;
    }

    public static ajej a(RecyclerView recyclerView, Adapter adapter) {
        LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || !(layoutManager instanceof LoopingLayoutManager)) {
            throw new IllegalArgumentException("Only LinearLayoutManager is supported for a LoopingAdapter.");
        }
        LoopingAdapter loopingAdapter = new LoopingAdapter(adapter, (LoopingLayoutManager) layoutManager);
        recyclerView.setAdapter(loopingAdapter);
        return loopingAdapter.a();
    }

    public final void a(boolean z) {
        this.b = z;
    }

    public final synchronized void dispose() {
        if (this.h.compareAndSet(false, true)) {
            this.a.unregisterAdapterDataObserver(this.f);
            this.g = false;
        }
    }

    public final int getItemCount() {
        return this.a.getItemCount() > 0 ? Integer.MAX_VALUE : 0;
    }

    public final long getItemId(int i) {
        return this.a.getItemId(i % this.a.getItemCount());
    }

    public final int getItemViewType(int i) {
        return this.a.getItemViewType(i % this.a.getItemCount());
    }

    public final synchronized boolean isDisposed() {
        return this.h.get();
    }

    public final void onBindViewHolder(T t, int i) {
        this.a.onBindViewHolder(t, i % this.a.getItemCount());
    }

    public final T onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.a.onCreateViewHolder(viewGroup, i);
    }

    public final void onViewRecycled(T t) {
        this.a.onViewRecycled(t);
    }
}
