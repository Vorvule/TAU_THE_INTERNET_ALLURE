package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload() {
        FileUploadPage fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile("C:/Users/USER/Google Drive/TAU_THE_INTERNET/src/test/resources/chromedriver.exe");
        Assert.assertEquals(fileUploadPage.getUploadFiles(), "chromedriver.exe", "Wrong upload");
    }
}
