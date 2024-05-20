package site.zhangjiahao.moneyboot.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.MediaType;
import org.springframework.http.codec.ServerSentEvent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import site.zhangjiahao.moneyboot.external.akshare.AkShareFade;
import site.zhangjiahao.moneyboot.service.TopService;

import java.time.Duration;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author www.javacoder.top
 * @since 2024-05-20
 */
@RestController
@RequestMapping("/top")
@RequiredArgsConstructor

public class TopController {

    private final TopService topService;
    private final RedisTemplate redisTemplate;
    private final AkShareFade akShareFade;



    @GetMapping("/")
    public Object save(){
       return akShareFade.getTradeCalendar();
    }

    @GetMapping(value="/stream",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @ResponseBody
    public Flux<ServerSentEvent<Object>> countDown() {
        //每一秒钟推送一次
        return Flux.interval(Duration.ofSeconds(1))
                .map(seq -> ServerSentEvent.<Object>builder()
                        .event("countDown") //和前端addEventListener监听的事件一一对应
                        .id(Long.toString(seq))  //为每次发送设置一个id
                        .data(seq.toString())
                        .build());
    }


}

