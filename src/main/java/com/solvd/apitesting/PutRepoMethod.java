package com.solvd.apitesting;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PutRepoMethod extends AbstractApiMethodV2 {

    public PutRepoMethod() {
        super("api/repos/_put/rq.json", "api/repos/_put/rs.json", "api/repos/repos.properties");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
