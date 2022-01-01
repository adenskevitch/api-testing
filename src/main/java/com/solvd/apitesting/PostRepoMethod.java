package com.solvd.apitesting;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostRepoMethod extends AbstractApiMethodV2 {

    public PostRepoMethod() {
        super("api/repos/_post/rq.json", "api/repos/_post/rs.json", "api/repos/repos.properties");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
