package gpx.com.wechatpush;

import gpx.com.wechatpush.common.Pusher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author g p x
 */
@EnableScheduling
@SpringBootApplication
public class WechatpushApplication {

    public static void main(String[] args) {
        SpringApplication.run(WechatpushApplication.class, args);
    }

//    // 定时每天8点执行一次
//    @Scheduled(cron = "0 0 8 * * ?")
//    // 定时每天5秒执行一次
//    @Scheduled(cron = "*/5 * * * * ?")
//    // 定时每天5分钟执行一次
//    @Scheduled(cron = "0 0/5 * * * ?")
//    //每天晚上19-21点期间，每隔5分钟推送一条
//    @Scheduled(cron = "0 0/5 20,21 * * ?")
    /**
     * 描述:  每天晚上19-21点期间，每隔5分钟推送一条
     * @param
     * @return void
     * @author g p x
     * @date 2022/8/22 23:13
     */
//    @Scheduled(cron = "0 0 7 * * ?")
//    @Scheduled(cron = "0 0/5 20,21 * * ?")
    @Scheduled(cron = "*/5 * * * * ?")
    public void goodMorning(){
        Pusher.push();
    }

}
