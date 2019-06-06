package com.snap.ui.avatar;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.snapchat.android.framework.ui.animations.ArcView;
import defpackage.akcr;
import defpackage.idl;
import defpackage.jxj.a;
import java.util.List;

public final class AvatarRendererController {
    private final ArcRenderer arcRenderer;
    private final BitmojiArmRenderer bitmojiArmRenderer;
    private final BitmojisRenderer bitmojisRenderer;
    private final NewFriendEmojiRenderer newFriendEmojiRenderer;
    private final RingRenderer ringRenderer;
    private final SharedRenderData sharedRenderData;
    private final StoryReplayRenderer storyReplayRenderer;
    private final StoryViewRenderer storyViewRenderer;
    private final AvatarView view;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[State.NO_RING_STORY.ordinal()] = 1;
            $EnumSwitchMapping$0[State.REPLAY_STORY.ordinal()] = 2;
            $EnumSwitchMapping$0[State.UNREAD_STORY.ordinal()] = 3;
            $EnumSwitchMapping$0[State.FAILED_STORY.ordinal()] = 4;
            $EnumSwitchMapping$0[State.EMPTY_STORY.ordinal()] = 5;
            $EnumSwitchMapping$0[State.NO_STORY.ordinal()] = 6;
            $EnumSwitchMapping$0[State.NO_STORY_TYPING.ordinal()] = 7;
            $EnumSwitchMapping$0[State.NEW_FRIEND_EMOJI.ordinal()] = 8;
        }
    }

    public AvatarRendererController(AvatarView avatarView, SharedRenderData sharedRenderData, RingRenderer ringRenderer, NewFriendEmojiRenderer newFriendEmojiRenderer, ArcRenderer arcRenderer, StoryViewRenderer storyViewRenderer, StoryReplayRenderer storyReplayRenderer, BitmojiArmRenderer bitmojiArmRenderer, BitmojisRenderer bitmojisRenderer) {
        akcr.b(avatarView, "view");
        akcr.b(sharedRenderData, "sharedRenderData");
        akcr.b(ringRenderer, "ringRenderer");
        akcr.b(newFriendEmojiRenderer, "newFriendEmojiRenderer");
        akcr.b(arcRenderer, "arcRenderer");
        akcr.b(storyViewRenderer, "storyViewRenderer");
        akcr.b(storyReplayRenderer, "storyReplayRenderer");
        akcr.b(bitmojiArmRenderer, "bitmojiArmRenderer");
        akcr.b(bitmojisRenderer, "bitmojisRenderer");
        this.view = avatarView;
        this.sharedRenderData = sharedRenderData;
        this.ringRenderer = ringRenderer;
        this.newFriendEmojiRenderer = newFriendEmojiRenderer;
        this.arcRenderer = arcRenderer;
        this.storyViewRenderer = storyViewRenderer;
        this.storyReplayRenderer = storyReplayRenderer;
        this.bitmojiArmRenderer = bitmojiArmRenderer;
        this.bitmojisRenderer = bitmojisRenderer;
    }

    private final void initBitmojiViewPositionsBasedOnSize(int i, boolean z, boolean z2) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException("Invalid size for the feed avatar view.");
        } else if (this.sharedRenderData.getCurrentSize() != i || this.sharedRenderData.getCurrentlyHasActiveTyping() != z || z2) {
            this.sharedRenderData.setCurrentSize(i);
            this.sharedRenderData.setCurrentlyHasActiveTyping(z);
            float width = this.sharedRenderData.getDrawRectF().width() - ((float) (this.sharedRenderData.imagePadding() << 1));
            float height = (this.sharedRenderData.getDrawRectF().height() - ((float) this.sharedRenderData.imagePadding())) - ((float) this.sharedRenderData.imagePaddingBottom());
            if (i > 0) {
                this.bitmojisRenderer.setForSize(z, i, width, height);
                if (z) {
                    this.bitmojiArmRenderer.setForSize(width, height, i);
                }
            }
        }
    }

    private final void setCurrentState(State state) {
        switch (WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                if (state == State.EMPTY_STORY) {
                    this.storyViewRenderer.setEmptyStoryImageResource();
                }
                this.bitmojisRenderer.hide();
                this.arcRenderer.show();
                this.storyViewRenderer.show();
                if (state == State.REPLAY_STORY) {
                    this.storyReplayRenderer.show();
                } else {
                    this.storyReplayRenderer.hide();
                }
                this.bitmojiArmRenderer.hide();
                this.newFriendEmojiRenderer.hide();
                if (this.sharedRenderData.getCurrentState() != state) {
                    this.ringRenderer.setToColor(state);
                    break;
                }
                break;
            case 6:
            case 7:
                this.bitmojisRenderer.showSize(this.sharedRenderData.getCurrentSize());
                this.arcRenderer.hide();
                this.storyViewRenderer.hide();
                if (state == State.NO_STORY_TYPING) {
                    this.bitmojiArmRenderer.show();
                } else {
                    this.bitmojiArmRenderer.hide();
                }
                this.storyReplayRenderer.hide();
                this.newFriendEmojiRenderer.hide();
                break;
            case 8:
                this.bitmojisRenderer.hide();
                this.arcRenderer.hide();
                this.storyViewRenderer.hide();
                this.storyReplayRenderer.hide();
                this.bitmojiArmRenderer.hide();
                this.newFriendEmojiRenderer.show();
                break;
        }
        if (this.sharedRenderData.getCurrentState() != state) {
            this.sharedRenderData.setCurrentState(state);
            this.view.invalidate();
        }
    }

    public final ArcView archView() {
        return this.arcRenderer.archView();
    }

    public final void dispatchDraw(Canvas canvas) {
        akcr.b(canvas, "canvas");
        this.ringRenderer.dispatchDraw(this.view, canvas, this.sharedRenderData.getCurrentState());
    }

    public final void draw(Canvas canvas) {
        akcr.b(canvas, "canvas");
    }

    public final void hideCircle() {
        if (this.sharedRenderData.getCurrentState() == State.UNREAD_STORY) {
            setCurrentState(State.NO_RING_STORY);
        }
    }

    public final void onAttachedToWindow() {
        this.ringRenderer.onAttachedToWindow(this.view);
    }

    public final void onMeasure() {
        if (this.sharedRenderData.onMeasure((float) this.view.getMeasuredWidth(), (float) this.view.getMeasuredHeight())) {
            this.ringRenderer.resetPathsAndPaints();
            this.bitmojisRenderer.resetPivots();
            initBitmojiViewPositionsBasedOnSize(this.sharedRenderData.getCurrentSize(), this.sharedRenderData.getCurrentlyHasActiveTyping(), true);
        }
    }

    public final void recycle() {
        this.storyViewRenderer.recycle();
        this.storyReplayRenderer.recycle();
        this.bitmojiArmRenderer.recycle();
        this.bitmojisRenderer.recycle();
    }

    public final void setAvatarsInfo(List<Avatar> list, FeedStoryInfo feedStoryInfo, boolean z, boolean z2, idl idl) {
        State state;
        akcr.b(list, "avatars");
        akcr.b(idl, "uiPage");
        initBitmojiViewPositionsBasedOnSize(list.size(), z2, true);
        Object obj = (feedStoryInfo == null || !feedStoryInfo.shouldShowStory()) ? null : 1;
        Object obj2 = (feedStoryInfo == null || !feedStoryInfo.isStoryMuted()) ? null : 1;
        Object obj3 = (feedStoryInfo == null || !feedStoryInfo.isEmptyStory()) ? null : 1;
        if (obj != null) {
            if (feedStoryInfo == null) {
                akcr.a();
            }
            Object thumbnailUri = feedStoryInfo.getThumbnailUri();
            if ((akcr.a(thumbnailUri, Uri.EMPTY) ^ 1) != 0) {
                this.storyViewRenderer.setImageUri(thumbnailUri, idl);
            }
            AvatarView avatarView = this.view;
            avatarView.setClickable(avatarView.hasOnClickListeners());
            state = feedStoryInfo.isStoryViewedLast() ? State.REPLAY_STORY : State.NO_RING_STORY;
            if (feedStoryInfo.isStoryLoading()) {
                if (!feedStoryInfo.isStoryViewCompleted()) {
                    state = State.NO_RING_STORY;
                }
                setCurrentState(state);
                return;
            } else if (feedStoryInfo.isStoryFailed()) {
                state = State.FAILED_STORY;
            } else if (obj2 != null) {
                if (!feedStoryInfo.isStoryViewCompleted()) {
                    state = State.NO_RING_STORY;
                }
                setCurrentState(state);
                return;
            } else if (obj3 != null) {
                state = State.EMPTY_STORY;
            } else {
                if (!feedStoryInfo.isStoryViewCompleted()) {
                    state = State.UNREAD_STORY;
                }
                setCurrentState(state);
                return;
            }
        } else if (z && list.size() == 1 && ((Avatar) list.get(0)).getBitmojiUri() == null) {
            this.storyViewRenderer.recycle();
            state = State.NEW_FRIEND_EMOJI;
        } else {
            this.storyViewRenderer.recycle();
            this.bitmojisRenderer.setAvatars(list, idl);
            Uri bitmojiArmUri = (!z2 || list.isEmpty()) ? null : ((Avatar) list.get(0)).getBitmojiArmUri();
            if (bitmojiArmUri != null) {
                this.bitmojiArmRenderer.setArm(bitmojiArmUri, idl);
            } else {
                this.bitmojiArmRenderer.clearArm();
            }
            state = bitmojiArmUri != null ? State.NO_STORY_TYPING : State.NO_STORY;
        }
        setCurrentState(state);
    }

    public final void setAvatarsInfo(List<Avatar> list, boolean z, Drawable drawable, boolean z2, idl idl) {
        State state;
        akcr.b(list, "avatars");
        akcr.b(idl, "uiPage");
        initBitmojiViewPositionsBasedOnSize(list.size(), false, false);
        if (z2) {
            this.storyViewRenderer.setDrawable(drawable);
            state = z ? State.UNREAD_STORY : State.NO_RING_STORY;
        } else {
            this.storyViewRenderer.recycle();
            this.bitmojisRenderer.setAvatars(list, idl);
            state = State.NO_STORY;
        }
        setCurrentState(state);
    }

    public final void setReplayBackground(int i) {
        this.storyReplayRenderer.setReplayBackground(i);
    }

    public final void setStoryThumbnailRequestListener(a aVar) {
        akcr.b(aVar, "requestListener");
        this.storyViewRenderer.setStoryThumbnailRequestListener(aVar);
    }

    public final void setup(AvatarView avatarView) {
        akcr.b(avatarView, "view");
        int imagePadding = this.sharedRenderData.imagePadding();
        avatarView.setPadding(imagePadding, imagePadding, imagePadding, this.sharedRenderData.imagePaddingBottom());
        this.arcRenderer.addTo(avatarView);
        this.storyViewRenderer.addTo(avatarView);
        this.bitmojisRenderer.addTo(avatarView);
    }

    public final ImageView storyView() {
        return this.storyViewRenderer.storyView();
    }
}
