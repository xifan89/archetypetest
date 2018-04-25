package com.surenpi.autotest.osc;

import com.surenpi.autotest.osc.page.OSCPage;
import org.suren.autotest.web.framework.annotation.AutoApplication;
import org.suren.autotest.web.framework.settings.Phoenix;

@AutoApplication(name = "Phoenix平台自动化测试",
        scanBasePackages = "com.test.idea.osc.page"
)
public class OSCTest
{
    public static void main(String[] args)
    {
        Phoenix phoenix = new Phoenix(com.surenpi.autotest.osc.OSCTest.class);
        phoenix.init();

        OSCPage page = phoenix.getPage(OSCPage.class);
        page.open();

        phoenix.shutdown();
    }
}