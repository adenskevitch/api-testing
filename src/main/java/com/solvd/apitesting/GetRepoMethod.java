package com.solvd.apitesting;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetRepoMethod extends AbstractApiMethodV2 {

    public GetRepoMethod() {
        super(null, "repositories/rs.json", "repositories/repository.properties");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
