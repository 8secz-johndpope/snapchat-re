package com.snap.ui.view.scrollbar;

import com.snap.ui.view.scrollbar.SnapScrollBar.UniformContentHeightLookup;
import defpackage.akbk;
import defpackage.akcs;

final class SnapScrollBar$UniformContentHeightLookup$itemSize$2 extends akcs implements akbk<Integer> {
    final /* synthetic */ int $screenWidth;
    final /* synthetic */ UniformContentHeightLookup this$0;

    SnapScrollBar$UniformContentHeightLookup$itemSize$2(UniformContentHeightLookup uniformContentHeightLookup, int i) {
        this.this$0 = uniformContentHeightLookup;
        this.$screenWidth = i;
        super(0);
    }

    public final int invoke() {
        return (this.$screenWidth - (this.this$0.spacing * (this.this$0.columns + 1))) / this.this$0.columns;
    }
}
