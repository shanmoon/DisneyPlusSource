package com.bamtech.sdk4.internal.account;

import com.bamtech.core.networking.Link;
import com.bamtech.sdk4.internal.configuration.Services;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u0005*\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "Lcom/bamtech/core/networking/Link;", "T", "Lcom/bamtech/sdk4/account/UserProfile;", "U", "V", "Lcom/bamtech/sdk4/internal/configuration/Services;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: UserProfileClient.kt */
final class DefaultUserProfileClient$createUserProfile$1 extends C12881k implements Function1<Services, Link> {
    public static final DefaultUserProfileClient$createUserProfile$1 INSTANCE = new DefaultUserProfileClient$createUserProfile$1();

    DefaultUserProfileClient$createUserProfile$1() {
        super(1);
    }

    public final Link invoke(Services services) {
        return services.getAccount().getCreateUserProfile();
    }
}
