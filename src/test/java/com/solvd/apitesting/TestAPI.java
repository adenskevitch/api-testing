package com.solvd.apitesting;

import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import org.testng.annotations.Test;

import java.util.Base64;

public class TestAPI {

    @Test(groups = "create")
    public void testPostRepo() {
        PostRepoMethod postRepoMethod = new PostRepoMethod();
        postRepoMethod.setHeaders(
                String.format("Authorization=%s", "token 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"));
        postRepoMethod.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        postRepoMethod.callAPI();
        postRepoMethod.validateResponse();
    }

    @Test(groups = "update")
    public void testPutRepo() {
        PutRepoMethod putRepoMethod = new PutRepoMethod();
        putRepoMethod.setHeaders(
                String.format("Authorization=%s", "token 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"));
        String testText = "Test text";
        String encodeTestText = Base64.getEncoder().encodeToString(testText.getBytes());
        putRepoMethod.addProperty("content", encodeTestText);
        putRepoMethod.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        putRepoMethod.callAPI();
        putRepoMethod.validateResponse();
    }

    @Test(groups = "select")
    public void testGetRepo() {
        GetRepoMethod getRepoMethod = new GetRepoMethod();
        getRepoMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getRepoMethod.callAPI();
        getRepoMethod.validateResponse();
    }

    @Test(groups = "update")
    public void testPatchRepo() {
        PatchRepoMethod patchRepoMethod = new PatchRepoMethod();
        patchRepoMethod.setHeaders(
                String.format("Authorization=%s", "token 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"));
        patchRepoMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        patchRepoMethod.callAPI();
        patchRepoMethod.validateResponse();
    }

    @Test(groups = "delete")
    public void testDeleteRepo() {
        DeleteRepoMethod deleteRepoMethod = new DeleteRepoMethod();
        deleteRepoMethod.setHeaders(
                String.format("Authorization=%s", "token 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"));
        deleteRepoMethod.expectResponseStatus(HttpResponseStatusType.NO_CONTENT_204);
        deleteRepoMethod.callAPI();
    }
}
