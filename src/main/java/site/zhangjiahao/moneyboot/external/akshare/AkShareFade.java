package site.zhangjiahao.moneyboot.external.akshare;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import site.zhangjiahao.moneyboot.config.AkShareConfig;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 张家豪
 */
@Component
@RequiredArgsConstructor
public class AkShareFade {
    private final AkShareConfig akShareConfig;

    public List<LocalDateTime> getTradeCalendar() {
        String res = HttpUtil.get(akShareConfig.getCalendarUrl());
        JSONArray tradeCalendars = JSONUtil.parseArray(res);
        List<LocalDateTime> tradeTime = new ArrayList<>();
        for (int i = 0; i < tradeCalendars.size(); i++) {
            LocalDateTime localDateTime = tradeCalendars.getJSONObject(i).getLocalDateTime("trade_date", null);
            tradeTime.add(localDateTime);
        }
        return tradeTime;
    }
}
