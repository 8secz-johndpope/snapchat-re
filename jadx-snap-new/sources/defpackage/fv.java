package defpackage;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManagerImpl;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import defpackage.j.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

/* renamed from: fv */
public class fv implements ComponentCallbacks, OnCreateContextMenuListener, l {
    static final int ACTIVITY_CREATED = 2;
    static final int CREATED = 1;
    static final int INITIALIZING = 0;
    static final int RESUMED = 5;
    static final int STARTED = 4;
    static final int STOPPED = 3;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    private static final jh<String, Class<?>> sClassMap = new jh();
    boolean mAdded;
    a mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mCalled;
    ga mChildFragmentManager;
    gb mChildNonConfig;
    ViewGroup mContainer;
    public int mContainerId;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    ga mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    protected fy mHost;
    boolean mInLayout;
    int mIndex = -1;
    View mInnerView;
    boolean mIsCreated;
    boolean mIsNewlyAdded;
    LayoutInflater mLayoutInflater;
    public m mLifecycleRegistry = new m(this);
    LoaderManagerImpl mLoaderManager;
    boolean mMenuVisible = true;
    fv mParentFragment;
    boolean mPerformedCreateView;
    float mPostponedAlpha;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetaining;
    Bundle mSavedFragmentState;
    Boolean mSavedUserVisibleHint;
    SparseArray<Parcelable> mSavedViewState;
    int mState = 0;
    String mTag;
    fv mTarget;
    int mTargetIndex = -1;
    int mTargetRequestCode;
    boolean mUserVisibleHint = true;
    View mView;
    y mViewModelStore;
    public String mWho;

    /* renamed from: fv$2 */
    class 2 extends fw {
        2() {
        }

        public final View a(int i) {
            if (fv.this.mView != null) {
                return fv.this.mView.findViewById(i);
            }
            throw new IllegalStateException("Fragment does not have a view");
        }

        public final fv a(Context context, String str, Bundle bundle) {
            return fv.this.mHost.a(context, str, bundle);
        }

        public final boolean a() {
            return fv.this.mView != null;
        }
    }

    /* renamed from: fv$c */
    interface c {
        void a();

        void b();
    }

    /* renamed from: fv$a */
    static class a {
        View a;
        Animator b;
        int c;
        int d;
        int e;
        int f;
        Object g = null;
        Object h = fv.USE_DEFAULT_TRANSITION;
        Object i = null;
        Object j = fv.USE_DEFAULT_TRANSITION;
        Object k = null;
        Object l = fv.USE_DEFAULT_TRANSITION;
        Boolean m;
        Boolean n;
        gu o = null;
        gu p = null;
        boolean q;
        c r;
        boolean s;

        a() {
        }
    }

    /* renamed from: fv$d */
    public static class d implements Parcelable {
        public static final Creator<d> CREATOR = new 1();
        final Bundle a;

        /* renamed from: fv$d$1 */
        static class 1 implements Creator<d> {
            1() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new d[i];
            }
        }

        d(Bundle bundle) {
            this.a = bundle;
        }

        d(Parcel parcel) {
            this.a = parcel.readBundle();
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.a);
        }
    }

    /* renamed from: fv$1 */
    class 1 implements Runnable {
        1() {
        }

        public final void run() {
            fv.this.callStartTransitionListener();
        }
    }

    /* renamed from: fv$b */
    public static class b extends RuntimeException {
        public b(String str, Exception exception) {
            super(str, exception);
        }
    }

    private void callStartTransitionListener() {
        c cVar;
        a aVar = this.mAnimationInfo;
        if (aVar == null) {
            cVar = null;
        } else {
            aVar.q = false;
            cVar = aVar.r;
            this.mAnimationInfo.r = null;
        }
        if (cVar != null) {
            cVar.a();
        }
    }

    private a ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new a();
        }
        return this.mAnimationInfo;
    }

    public static fv instantiate(Context context, String str) {
        return fv.instantiate(context, str, null);
    }

    public static fv instantiate(Context context, String str, Bundle bundle) {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2;
        String str2 = ": make sure class name exists, is public, and has an empty constructor that is public";
        String str3 = "Unable to instantiate fragment ";
        try {
            Class cls = (Class) sClassMap.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                sClassMap.put(str, cls);
            }
            fv fvVar = (fv) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fvVar.getClass().getClassLoader());
                fvVar.setArguments(bundle);
            }
            return fvVar;
        } catch (ClassNotFoundException e) {
            stringBuilder = new StringBuilder(str3);
            stringBuilder.append(str);
            stringBuilder.append(str2);
            throw new b(stringBuilder.toString(), e);
        } catch (InstantiationException e2) {
            stringBuilder = new StringBuilder(str3);
            stringBuilder.append(str);
            stringBuilder.append(str2);
            throw new b(stringBuilder.toString(), e2);
        } catch (IllegalAccessException e3) {
            stringBuilder = new StringBuilder(str3);
            stringBuilder.append(str);
            stringBuilder.append(str2);
            throw new b(stringBuilder.toString(), e3);
        } catch (NoSuchMethodException e4) {
            stringBuilder2 = new StringBuilder(str3);
            stringBuilder2.append(str);
            stringBuilder2.append(": could not find Fragment constructor");
            throw new b(stringBuilder2.toString(), e4);
        } catch (InvocationTargetException e5) {
            stringBuilder2 = new StringBuilder(str3);
            stringBuilder2.append(str);
            stringBuilder2.append(": calling Fragment constructor caused an exception");
            throw new b(stringBuilder2.toString(), e5);
        }
    }

    static boolean isSupportFragmentClass(Context context, String str) {
        try {
            Class cls = (Class) sClassMap.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                sClassMap.put(str, cls);
            }
            return fv.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        StringBuilder stringBuilder;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mIndex=");
        printWriter.print(this.mIndex);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mRetaining=");
        printWriter.print(this.mRetaining);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mTarget != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.mTarget);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        if (getNextAnim() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(getNextAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (this.mInnerView != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(getStateAfterAnimating());
        }
        String str2 = "  ";
        if (this.mLoaderManager != null) {
            printWriter.print(str);
            printWriter.println("Loader Manager:");
            LoaderManagerImpl loaderManagerImpl = this.mLoaderManager;
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(str2);
            loaderManagerImpl.a(stringBuilder.toString(), fileDescriptor, printWriter, strArr);
        }
        if (this.mChildFragmentManager != null) {
            printWriter.print(str);
            StringBuilder stringBuilder2 = new StringBuilder("Child ");
            stringBuilder2.append(this.mChildFragmentManager);
            stringBuilder2.append(":");
            printWriter.println(stringBuilder2.toString());
            ga gaVar = this.mChildFragmentManager;
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(str2);
            gaVar.a(stringBuilder.toString(), fileDescriptor, printWriter, strArr);
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* Access modifiers changed, original: 0000 */
    public fv findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        ga gaVar = this.mChildFragmentManager;
        return gaVar != null ? gaVar.b(str) : null;
    }

    public final FragmentActivity getActivity() {
        fy fyVar = this.mHost;
        return fyVar == null ? null : (FragmentActivity) fyVar.a;
    }

    public boolean getAllowEnterTransitionOverlap() {
        a aVar = this.mAnimationInfo;
        return (aVar == null || aVar.n == null) ? true : this.mAnimationInfo.n.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        a aVar = this.mAnimationInfo;
        return (aVar == null || aVar.m == null) ? true : this.mAnimationInfo.m.booleanValue();
    }

    /* Access modifiers changed, original: 0000 */
    public View getAnimatingAway() {
        a aVar = this.mAnimationInfo;
        return aVar == null ? null : aVar.a;
    }

    /* Access modifiers changed, original: 0000 */
    public Animator getAnimator() {
        a aVar = this.mAnimationInfo;
        return aVar == null ? null : aVar.b;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final fz getChildFragmentManager() {
        if (this.mChildFragmentManager == null) {
            instantiateChildFragmentManager();
            int i = this.mState;
            if (i >= 5) {
                this.mChildFragmentManager.m();
            } else if (i >= 4) {
                this.mChildFragmentManager.l();
            } else if (i >= 2) {
                this.mChildFragmentManager.k();
            } else if (i > 0) {
                this.mChildFragmentManager.j();
            }
        }
        return this.mChildFragmentManager;
    }

    public Context getContext() {
        fy fyVar = this.mHost;
        return fyVar == null ? null : fyVar.b;
    }

    public Object getEnterTransition() {
        a aVar = this.mAnimationInfo;
        return aVar == null ? null : aVar.g;
    }

    /* Access modifiers changed, original: 0000 */
    public gu getEnterTransitionCallback() {
        a aVar = this.mAnimationInfo;
        return aVar == null ? null : aVar.o;
    }

    public Object getExitTransition() {
        a aVar = this.mAnimationInfo;
        return aVar == null ? null : aVar.i;
    }

    /* Access modifiers changed, original: 0000 */
    public gu getExitTransitionCallback() {
        a aVar = this.mAnimationInfo;
        return aVar == null ? null : aVar.p;
    }

    public final fz getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        fy fyVar = this.mHost;
        return fyVar == null ? null : fyVar.g();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        fy fyVar = this.mHost;
        if (fyVar != null) {
            LayoutInflater c = fyVar.c();
            getChildFragmentManager();
            jq.b(c, this.mChildFragmentManager);
            return c;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public j getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public gl getLoaderManager() {
        LoaderManagerImpl loaderManagerImpl = this.mLoaderManager;
        if (loaderManagerImpl != null) {
            return loaderManagerImpl;
        }
        this.mLoaderManager = new LoaderManagerImpl(this, getViewModelStore());
        return this.mLoaderManager;
    }

    /* Access modifiers changed, original: 0000 */
    public int getNextAnim() {
        a aVar = this.mAnimationInfo;
        return aVar == null ? 0 : aVar.d;
    }

    /* Access modifiers changed, original: 0000 */
    public int getNextTransition() {
        a aVar = this.mAnimationInfo;
        return aVar == null ? 0 : aVar.e;
    }

    /* Access modifiers changed, original: 0000 */
    public int getNextTransitionStyle() {
        a aVar = this.mAnimationInfo;
        return aVar == null ? 0 : aVar.f;
    }

    public final fv getParentFragment() {
        return this.mParentFragment;
    }

    public Object getReenterTransition() {
        a aVar = this.mAnimationInfo;
        return aVar == null ? null : aVar.j == USE_DEFAULT_TRANSITION ? getExitTransition() : this.mAnimationInfo.j;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        a aVar = this.mAnimationInfo;
        return aVar == null ? null : aVar.h == USE_DEFAULT_TRANSITION ? getEnterTransition() : this.mAnimationInfo.h;
    }

    public Object getSharedElementEnterTransition() {
        a aVar = this.mAnimationInfo;
        return aVar == null ? null : aVar.k;
    }

    public Object getSharedElementReturnTransition() {
        a aVar = this.mAnimationInfo;
        return aVar == null ? null : aVar.l == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : this.mAnimationInfo.l;
    }

    /* Access modifiers changed, original: 0000 */
    public int getStateAfterAnimating() {
        a aVar = this.mAnimationInfo;
        return aVar == null ? 0 : aVar.c;
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final String getTag() {
        return this.mTag;
    }

    public final fv getTargetFragment() {
        return this.mTarget;
    }

    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public y getViewModelStore() {
        if (getContext() != null) {
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new y();
            }
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* Access modifiers changed, original: 0000 */
    public void initState() {
        this.mIndex = -1;
        this.mWho = null;
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = null;
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
        this.mRetaining = false;
    }

    /* Access modifiers changed, original: 0000 */
    public void instantiateChildFragmentManager() {
        if (this.mHost != null) {
            this.mChildFragmentManager = new ga();
            this.mChildFragmentManager.a(this.mHost, new 2(), this);
            return;
        }
        throw new IllegalStateException("Fragment has not been attached yet.");
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean isHideReplaced() {
        a aVar = this.mAnimationInfo;
        return aVar == null ? false : aVar.s;
    }

    /* Access modifiers changed, original: final */
    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        return this.mMenuVisible;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean isPostponed() {
        a aVar = this.mAnimationInfo;
        return aVar == null ? false : aVar.q;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 5;
    }

    public final boolean isStateSaved() {
        ga gaVar = this.mFragmentManager;
        return gaVar == null ? false : gaVar.e();
    }

    public final boolean isVisible() {
        if (isAdded() && !isHidden()) {
            View view = this.mView;
            if (!(view == null || view.getWindowToken() == null || this.mView.getVisibility() != 0)) {
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public void noteStateNotSaved() {
        ga gaVar = this.mChildFragmentManager;
        if (gaVar != null) {
            gaVar.i();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        fy fyVar = this.mHost;
        Activity activity = fyVar == null ? null : fyVar.a;
        if (activity != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    public void onAttachFragment(fv fvVar) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        boolean z = true;
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        ga gaVar = this.mChildFragmentManager;
        if (gaVar != null) {
            if (gaVar.d <= 0) {
                z = false;
            }
            if (!z) {
                this.mChildFragmentManager.j();
            }
        }
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        getActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
        if (this.mViewModelStore != null && !this.mHost.d.h) {
            this.mViewModelStore.a();
        }
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z) {
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        fy fyVar = this.mHost;
        Activity activity = fyVar == null ? null : fyVar.a;
        if (activity != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public fz peekChildFragmentManager() {
        return this.mChildFragmentManager;
    }

    /* Access modifiers changed, original: 0000 */
    public void performActivityCreated(Bundle bundle) {
        ga gaVar = this.mChildFragmentManager;
        if (gaVar != null) {
            gaVar.i();
        }
        this.mState = 2;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            ga gaVar2 = this.mChildFragmentManager;
            if (gaVar2 != null) {
                gaVar2.k();
                return;
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onActivityCreated()");
        throw new gv(stringBuilder.toString());
    }

    /* Access modifiers changed, original: 0000 */
    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        ga gaVar = this.mChildFragmentManager;
        if (gaVar != null) {
            gaVar.a(configuration);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean performContextItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (onContextItemSelected(menuItem)) {
                return true;
            }
            ga gaVar = this.mChildFragmentManager;
            if (gaVar != null && gaVar.b(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public void performCreate(Bundle bundle) {
        ga gaVar = this.mChildFragmentManager;
        if (gaVar != null) {
            gaVar.i();
        }
        this.mState = 1;
        this.mCalled = false;
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.a(a.ON_CREATE);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onCreate()");
        throw new gv(stringBuilder.toString());
    }

    /* Access modifiers changed, original: 0000 */
    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        int i = 0;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            i = 1;
        }
        ga gaVar = this.mChildFragmentManager;
        return gaVar != null ? i | gaVar.a(menu, menuInflater) : i;
    }

    /* Access modifiers changed, original: 0000 */
    public View performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ga gaVar = this.mChildFragmentManager;
        if (gaVar != null) {
            gaVar.i();
        }
        this.mPerformedCreateView = true;
        return onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* Access modifiers changed, original: 0000 */
    public void performDestroy() {
        this.mLifecycleRegistry.a(a.ON_DESTROY);
        ga gaVar = this.mChildFragmentManager;
        if (gaVar != null) {
            gaVar.o();
        }
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            this.mChildFragmentManager = null;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onDestroy()");
        throw new gv(stringBuilder.toString());
    }

    /* Access modifiers changed, original: 0000 */
    public void performDestroyView() {
        ga gaVar = this.mChildFragmentManager;
        if (gaVar != null) {
            gaVar.b(1);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            LoaderManagerImpl loaderManagerImpl = this.mLoaderManager;
            if (loaderManagerImpl != null) {
                loaderManagerImpl.a.c();
            }
            this.mPerformedCreateView = false;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onDestroyView()");
        throw new gv(stringBuilder.toString());
    }

    /* Access modifiers changed, original: 0000 */
    public void performDetach() {
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        StringBuilder stringBuilder;
        if (this.mCalled) {
            ga gaVar = this.mChildFragmentManager;
            if (gaVar == null) {
                return;
            }
            if (this.mRetaining) {
                gaVar.o();
                this.mChildFragmentManager = null;
                return;
            }
            stringBuilder = new StringBuilder("Child FragmentManager of ");
            stringBuilder.append(this);
            stringBuilder.append(" was not  destroyed and this fragment is not retaining instance");
            throw new IllegalStateException(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onDetach()");
        throw new gv(stringBuilder.toString());
    }

    /* Access modifiers changed, original: 0000 */
    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        this.mLayoutInflater = onGetLayoutInflater(bundle);
        return this.mLayoutInflater;
    }

    /* Access modifiers changed, original: 0000 */
    public void performLowMemory() {
        onLowMemory();
        ga gaVar = this.mChildFragmentManager;
        if (gaVar != null) {
            gaVar.p();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        ga gaVar = this.mChildFragmentManager;
        if (gaVar != null) {
            gaVar.a(z);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
                return true;
            }
            ga gaVar = this.mChildFragmentManager;
            if (gaVar != null && gaVar.a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            ga gaVar = this.mChildFragmentManager;
            if (gaVar != null) {
                gaVar.b(menu);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void performPause() {
        this.mLifecycleRegistry.a(a.ON_PAUSE);
        ga gaVar = this.mChildFragmentManager;
        if (gaVar != null) {
            gaVar.b(4);
        }
        this.mState = 4;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            StringBuilder stringBuilder = new StringBuilder("Fragment ");
            stringBuilder.append(this);
            stringBuilder.append(" did not call through to super.onPause()");
            throw new gv(stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        ga gaVar = this.mChildFragmentManager;
        if (gaVar != null) {
            gaVar.b(z);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean performPrepareOptionsMenu(Menu menu) {
        int i = 0;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            i = 1;
        }
        ga gaVar = this.mChildFragmentManager;
        return gaVar != null ? i | gaVar.a(menu) : i;
    }

    /* Access modifiers changed, original: 0000 */
    public void performReallyStop() {
        ga gaVar = this.mChildFragmentManager;
        if (gaVar != null) {
            gaVar.b(2);
        }
        this.mState = 2;
    }

    /* Access modifiers changed, original: 0000 */
    public void performResume() {
        ga gaVar = this.mChildFragmentManager;
        if (gaVar != null) {
            gaVar.i();
            this.mChildFragmentManager.g();
        }
        this.mState = 5;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            gaVar = this.mChildFragmentManager;
            if (gaVar != null) {
                gaVar.m();
                this.mChildFragmentManager.g();
            }
            this.mLifecycleRegistry.a(a.ON_RESUME);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onResume()");
        throw new gv(stringBuilder.toString());
    }

    /* Access modifiers changed, original: 0000 */
    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        ga gaVar = this.mChildFragmentManager;
        if (gaVar != null) {
            Parcelable h = gaVar.h();
            if (h != null) {
                bundle.putParcelable("android:support:fragments", h);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void performStart() {
        ga gaVar = this.mChildFragmentManager;
        if (gaVar != null) {
            gaVar.i();
            this.mChildFragmentManager.g();
        }
        this.mState = 4;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            gaVar = this.mChildFragmentManager;
            if (gaVar != null) {
                gaVar.l();
            }
            this.mLifecycleRegistry.a(a.ON_START);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onStart()");
        throw new gv(stringBuilder.toString());
    }

    /* Access modifiers changed, original: 0000 */
    public void performStop() {
        this.mLifecycleRegistry.a(a.ON_STOP);
        ga gaVar = this.mChildFragmentManager;
        if (gaVar != null) {
            gaVar.n();
        }
        this.mState = 3;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            StringBuilder stringBuilder = new StringBuilder("Fragment ");
            stringBuilder.append(this);
            stringBuilder.append(" did not call through to super.onStop()");
            throw new gv(stringBuilder.toString());
        }
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().q = true;
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public final void requestPermissions(String[] strArr, int i) {
        fy fyVar = this.mHost;
        if (fyVar != null) {
            fyVar.a(this, strArr, i);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" not attached to Activity");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        StringBuilder stringBuilder = new StringBuilder("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" not attached to an activity.");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        StringBuilder stringBuilder = new StringBuilder("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" not attached to a context.");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final fz requireFragmentManager() {
        fz fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            return fragmentManager;
        }
        StringBuilder stringBuilder = new StringBuilder("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" not associated with a fragment manager.");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        StringBuilder stringBuilder = new StringBuilder("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" not attached to a host.");
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* Access modifiers changed, original: 0000 */
    public void restoreChildFragmentState(Bundle bundle) {
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                if (this.mChildFragmentManager == null) {
                    instantiateChildFragmentManager();
                }
                this.mChildFragmentManager.a(parcelable, this.mChildNonConfig);
                this.mChildNonConfig = null;
                this.mChildFragmentManager.j();
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void restoreViewState(Bundle bundle) {
        SparseArray sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mInnerView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            StringBuilder stringBuilder = new StringBuilder("Fragment ");
            stringBuilder.append(this);
            stringBuilder.append(" did not call through to super.onViewStateRestored()");
            throw new gv(stringBuilder.toString());
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().n = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().m = Boolean.valueOf(z);
    }

    /* Access modifiers changed, original: 0000 */
    public void setAnimatingAway(View view) {
        ensureAnimationInfo().a = view;
    }

    /* Access modifiers changed, original: 0000 */
    public void setAnimator(Animator animator) {
        ensureAnimationInfo().b = animator;
    }

    public void setArguments(Bundle bundle) {
        if (this.mIndex < 0 || !isStateSaved()) {
            this.mArguments = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already active and state has been saved");
    }

    public void setEnterSharedElementCallback(gu guVar) {
        ensureAnimationInfo().o = guVar;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().g = obj;
    }

    public void setExitSharedElementCallback(gu guVar) {
        ensureAnimationInfo().p = guVar;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().i = obj;
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                this.mHost.d();
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void setHideReplaced(boolean z) {
        ensureAnimationInfo().s = z;
    }

    /* Access modifiers changed, original: final */
    public final void setIndex(int i, fv fvVar) {
        StringBuilder stringBuilder;
        this.mIndex = i;
        if (fvVar != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(fvVar.mWho);
            stringBuilder.append(":");
        } else {
            stringBuilder = new StringBuilder("android:fragment:");
        }
        stringBuilder.append(this.mIndex);
        this.mWho = stringBuilder.toString();
    }

    public void setInitialSavedState(d dVar) {
        if (this.mIndex < 0) {
            Bundle bundle = (dVar == null || dVar.a == null) ? null : dVar.a;
            this.mSavedFragmentState = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already active");
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.d();
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void setNextAnim(int i) {
        if (this.mAnimationInfo != null || i != 0) {
            ensureAnimationInfo().d = i;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void setNextTransition(int i, int i2) {
        if (this.mAnimationInfo != null || i != 0 || i2 != 0) {
            ensureAnimationInfo();
            a aVar = this.mAnimationInfo;
            aVar.e = i;
            aVar.f = i2;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void setOnStartEnterTransitionListener(c cVar) {
        ensureAnimationInfo();
        if (cVar != this.mAnimationInfo.r) {
            if (cVar == null || this.mAnimationInfo.r == null) {
                if (this.mAnimationInfo.q) {
                    this.mAnimationInfo.r = cVar;
                }
                if (cVar != null) {
                    cVar.b();
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on ".concat(String.valueOf(this)));
        }
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().j = obj;
    }

    public void setRetainInstance(boolean z) {
        this.mRetainInstance = z;
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().h = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().k = obj;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().l = obj;
    }

    /* Access modifiers changed, original: 0000 */
    public void setStateAfterAnimating(int i) {
        ensureAnimationInfo().c = i;
    }

    public void setTargetFragment(fv fvVar, int i) {
        fz fragmentManager = getFragmentManager();
        fz fragmentManager2 = fvVar != null ? fvVar.getFragmentManager() : null;
        StringBuilder stringBuilder;
        if (fragmentManager == null || fragmentManager2 == null || fragmentManager == fragmentManager2) {
            fv fvVar2 = fvVar;
            while (fvVar2 != null) {
                if (fvVar2 != this) {
                    fvVar2 = fvVar2.getTargetFragment();
                } else {
                    stringBuilder = new StringBuilder("Setting ");
                    stringBuilder.append(fvVar);
                    stringBuilder.append(" as the target of ");
                    stringBuilder.append(this);
                    stringBuilder.append(" would create a target cycle");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            this.mTarget = fvVar;
            this.mTargetRequestCode = i;
            return;
        }
        stringBuilder = new StringBuilder("Fragment ");
        stringBuilder.append(fvVar);
        stringBuilder.append(" must share the same FragmentManager to be set as a target fragment");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void setUserVisibleHint(boolean z) {
        if (!this.mUserVisibleHint && z && this.mState < 4 && this.mFragmentManager != null && isAdded()) {
            this.mFragmentManager.b(this);
        }
        this.mUserVisibleHint = z;
        z = this.mState < 4 && !z;
        this.mDeferStart = z;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(this.mUserVisibleHint);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        fy fyVar = this.mHost;
        return fyVar != null ? fyVar.a(str) : false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        fy fyVar = this.mHost;
        if (fyVar != null) {
            fyVar.a(this, intent, -1, bundle);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" not attached to Activity");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        fy fyVar = this.mHost;
        if (fyVar != null) {
            fyVar.a(this, intent, i, bundle);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" not attached to Activity");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        fy fyVar = this.mHost;
        if (fyVar != null) {
            fyVar.a(this, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" not attached to Activity");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void startPostponedEnterTransition() {
        ga gaVar = this.mFragmentManager;
        if (gaVar == null || gaVar.e == null) {
            ensureAnimationInfo().q = false;
        } else if (Looper.myLooper() != this.mFragmentManager.e.c.getLooper()) {
            this.mFragmentManager.e.c.postAtFrontOfQueue(new 1());
        } else {
            callStartTransitionListener();
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        iy.a(this, stringBuilder);
        if (this.mIndex >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.mIndex);
        }
        if (this.mFragmentId != 0) {
            stringBuilder.append(" id=0x");
            stringBuilder.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.mTag);
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }
}
