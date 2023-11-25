package org.panda.business.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.panda.tech.core.CoreModule;
import org.panda.tech.security.SecurityModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Application启动类 commit01 commit02 commit02 commit03 commit033333
 *
 *
 * @author fangen
 */
@SpringBootApplication
@Import({CoreModule.class, SecurityModule.class})
@EnableScheduling
@EnableTransactionManagement
@MapperScan("org.panda.business.admin.modules.*.service.repository")
public class AdminApplication {
    public static void main(String[] args) {
         System.out.println("wangshaoyou-test1");
        System.out.println("wsy-test2");
        SpringApplication.run(AdminApplication.class,args);

        /*
        * 这里是测试分支功能
        * */

        System.out.println("测试分支开始");
        System.out.println("业务处理");
        System.out.println("测试分支结束");
        System.out.println("测试分支01");

        // 测试分支正常提交代码
        System.out.println("测试分支02");
        System.out.println("测试分支03");


    }
}
