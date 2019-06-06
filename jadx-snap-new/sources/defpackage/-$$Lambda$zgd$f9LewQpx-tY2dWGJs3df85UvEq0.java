package defpackage;

import com.google.common.base.Supplier;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: lambda */
/* renamed from: -$$Lambda$zgd$f9LewQpx-tY2dWGJs3df85UvEq0 */
public final /* synthetic */ class -$$Lambda$zgd$f9LewQpx-tY2dWGJs3df85UvEq0 implements Supplier {
	public static final /* synthetic */ -$$Lambda$zgd$f9LewQpx-tY2dWGJs3df85UvEq0 INSTANCE = new -$$Lambda$zgd$f9LewQpx-tY2dWGJs3df85UvEq0();

	private /* synthetic */ -$$Lambda$zgd$f9LewQpx-tY2dWGJs3df85UvEq0() {
	}

	public final Object get() {
		// create a ui bg task
		return new ScheduledThreadPoolExecutor(zgd.v, zgd.a("ui_bg", -2));
	}
}
