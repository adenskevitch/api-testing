package com.solvd.apitesting;

import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import io.restassured.response.Response;
import org.skyscreamer.jsonassert.JSONAssert;
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
//        JSONAssert.assertEquals(expectedRs, actualRs, new JsonKeywordsComparator(JSONCompareMode.STRICT,
//                JsonCompareKeywords.ARRAY_CONTAINS.getKey() + "content"));
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
