package com.surenpi.autotest.github;

import com.surenpi.autotest.github.page.GithubPage;
import org.suren.autotest.web.framework.annotation.AutoApplication;
import org.suren.autotest.web.framework.settings.Phoenix;

@AutoApplication(name = "Phoenix平台自动化测试",
    scanBasePackages = "com.test.idea.github.page"
)
public class GithubTest
{
    public static void main(String[] args)
    {
        Phoenix phoenix = new Phoenix(com.surenpi.autotest.github.GithubTest.class);
        phoenix.init();

        GithubPage github = phoenix.getPage(GithubPage.class);
        github.open();
        github.getSearch().fillValue("phoenix.webui").performEnter();
        github.getSign().click();

        phoenix.shutdown();
    }
}