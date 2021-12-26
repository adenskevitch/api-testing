package com.solvd.apitesting;

import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import org.testng.annotations.Test;

import java.util.Base64;

public class TestAPI {

    @Test
    public void testPostRepo() {
        PostRepoMethod postRepoMethod = new PostRepoMethod();
        postRepoMethod.setHeaders(
                String.format("Authorization=%s", "token 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"));
        postRepoMethod.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        postRepoMethod.callAPI();
    }

    @Test(dependsOnMethods = "testPostRepo")
    public void testPutRepo() {
        PutRepoMethod putRepoMethod = new PutRepoMethod();
        putRepoMethod.setHeaders(
                String.format("Authorization=%s", "token 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"));
        String testText = "Test text";
        String encodeTestText = Base64.getEncoder().encodeToString(testText.getBytes());
        putRepoMethod.addProperty("content", encodeTestText);
        putRepoMethod.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        putRepoMethod.callAPI();
    }

    @Test(dependsOnMethods = "testPutRepo")
    public void testGetRepo() {
        GetRepoMethod getRepoMethod = new GetRepoMethod();
        getRepoMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getRepoMethod.callAPI();
    }

    @Test(dependsOnMethods = "testGetRepo")
    public void testPatchRepo() {
        PatchRepoMethod patchRepoMethod = new PatchRepoMethod();
        patchRepoMethod.setHeaders(
                String.format("Authorization=%s", "token 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"));
        patchRepoMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        patchRepoMethod.callAPI();
    }

    @Test(dependsOnMethods = "testPatchRepo")
    public void testDeleteRepo() {
        DeleteRepoMethod deleteRepoMethod = new DeleteRepoMethod();
        deleteRepoMethod.setHeaders(
                String.format("Authorization=%s", "token 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"));
        deleteRepoMethod.expectResponseStatus(HttpResponseStatusType.NO_CONTENT_204);
        deleteRepoMethod.callAPI();
    }
}
