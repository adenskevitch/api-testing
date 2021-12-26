package com.solvd.apitesting;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PatchRepoMethod extends AbstractApiMethodV2 {

    public PatchRepoMethod() {
        super("api/repos/_patch/rq.json", null);
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
