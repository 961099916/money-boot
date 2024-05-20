package site.zhangjiahao.moneyboot.task;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author 张家豪
 */
//@Component
@Slf4j
@RequiredArgsConstructor
public class ZtTask {


    @Scheduled(cron = "")
    public void syncZt(){

    }
}
