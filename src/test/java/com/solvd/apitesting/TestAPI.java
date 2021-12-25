package com.solvd.apitesting;

import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import org.testng.annotations.Test;

public class TestAPI {

    @Test()
    public void testGetRepos() {
        GetRepoMethod getRepoMethod = new GetRepoMethod();
        getRepoMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getRepoMethod.callAPI();
        getRepoMethod.validateResponse();
    }
}
