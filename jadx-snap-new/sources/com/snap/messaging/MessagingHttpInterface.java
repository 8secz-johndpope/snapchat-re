package com.snap.messaging;

import defpackage.aecw;
import defpackage.aecy;
import defpackage.aedh;
import defpackage.aefk;
import defpackage.aegt;
import defpackage.aehf;
import defpackage.aehx;
import defpackage.aehz;
import defpackage.aeqh;
import defpackage.aeqj;
import defpackage.aeql;
import defpackage.aesz;
import defpackage.aeut;
import defpackage.aewv;
import defpackage.aewx;
import defpackage.aexb;
import defpackage.aexd;
import defpackage.afcb;
import defpackage.afei;
import defpackage.afek;
import defpackage.agye;
import defpackage.agyg;
import defpackage.ahai;
import defpackage.ahbn;
import defpackage.ahbp;
import defpackage.ahgy;
import defpackage.ahha;
import defpackage.ahhe;
import defpackage.ahhg;
import defpackage.ahho;
import defpackage.ahhq;
import defpackage.ajdx;
import defpackage.akhw;
import defpackage.akxa;
import defpackage.akxk;
import defpackage.akxs;
import defpackage.akxu;
import defpackage.akxy;
import defpackage.gjh;

public interface MessagingHttpInterface {

    public static final class DefaultImpls {
        @akxy(a = "/loq/gateway_auth_token")
        public static /* synthetic */ ajdx fetchGatewayAuthToken$default(MessagingHttpInterface messagingHttpInterface, aedh aedh, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    aedh = new aedh();
                }
                return messagingHttpInterface.fetchGatewayAuthToken(aedh);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchGatewayAuthToken");
        }
    }

    @akxy(a = "/loq/clear_conversation")
    ajdx<akxa<akhw>> clearConversation(@akxk aehf aehf);

    @akxy(a = "/loq/clear_mischief_conversation")
    ajdx<akxa<akhw>> clearGroupConversation(@akxk aehf aehf);

    @akxy(a = "/loq/mischiefs_create")
    ajdx<akxa<agyg>> createGroupConversation(@akxk agye agye);

    @akxu(a = {"__authorization: content"})
    @akxy(a = "/loq/conversation_auth_token")
    ajdx<aehz> fetchConversationAuthToken(@akxk aehx aehx);

    @akxy(a = "/loq/gateway_auth_token")
    ajdx<akxa<aesz>> fetchGatewayAuthToken(@akxk aedh aedh);

    @akxy(a = "/loq/conversations")
    ajdx<akxa<aecy>> fetchOlderConversations(@akxk aeql aeql);

    @akxu(a = {"__authorization: content"})
    @akxy(a = "/bq/story_element")
    ajdx<akxa<ahha>> getStoryShareMetadata(@akxk ahgy ahgy);

    @akxy(a = "/loq/conversation")
    ajdx<akxa<aeqj>> loadConversation(@akxk aeqh aeqh);

    @akxy(a = "/loq/mischief_conversation")
    ajdx<akxa<ahai>> loadGroupConversation(@akxk ahbn ahbn);

    @akxy(a = "/map/story_element")
    ajdx<akxa<ahhq>> mapStoryLookup(@akxk ahho ahho);

    @akxy(a = "/loq/conversation_actions")
    ajdx<akxa<akhw>> modifyDirectConversationSettings(@akxk aefk aefk);

    @akxy(a = "/loq/mischief_action")
    ajdx<akxa<ahbp>> modifyGroupConversation(@akxk ahbn ahbn);

    @akxu(a = {"__authorization: user"})
    @gjh
    @akxy(a = "/bq/post_story")
    ajdx<akxa<aeut>> postStory(@akxk afcb afcb, @akxs(a = "__xsc_local__:capture_media_id") String str, @akxs(a = "__xsc_local__:send_message_attempt_id") String str2);

    @akxy(a = "/loq/conversations")
    ajdx<akxa<aecy>> refreshConversations(@akxk aecw aecw);

    @akxy(a = "/loq/create_chat_media")
    ajdx<akxa<ahhg>> sendChatMedia(@akxk ahhe ahhe);

    @akxu(a = {"__authorization: content"})
    @akxy(a = "/loq/send")
    ajdx<akxa<aewv>> sendSnap(@akxk aewx aewx, @akxs(a = "__xsc_local__:capture_media_id") String str, @akxs(a = "__xsc_local__:send_message_attempt_id") String str2);

    @akxu(a = {"__authorization: content"})
    @akxy(a = "/loq/story_reply")
    ajdx<akxa<aexd>> sendStoryReply(@akxk aexb aexb);

    @akxy(a = "/bq/chat_typing")
    ajdx<akxa<akhw>> sendTypingNotification(@akxk aegt aegt);

    @akxy(a = "/bq/update_snaps")
    ajdx<afek> updateSnap(@akxk afei afei);
}
