package site.zhangjiahao.moneyboot.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author www.javacoder.top
 * @since 2024-05-20
 */
public class Top implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private BigDecimal changeAmount;

    private BigDecimal newPrice;

    private BigDecimal turnover;

    private BigDecimal floatMarketCapitalization;

    private BigDecimal marketCapitalization;

    private BigDecimal turnoverRate;

    private BigDecimal sealingFund;

    private LocalDateTime startSealing;

    private LocalDateTime endSealing;

    private Integer boomCount;

    private String topCount;

    private Integer connectTopCount;

    private String plate;

    private LocalDateTime dateTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getChangeAmount() {
        return changeAmount;
    }

    public void setChangeAmount(BigDecimal changeAmount) {
        this.changeAmount = changeAmount;
    }

    public BigDecimal getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(BigDecimal newPrice) {
        this.newPrice = newPrice;
    }

    public BigDecimal getTurnover() {
        return turnover;
    }

    public void setTurnover(BigDecimal turnover) {
        this.turnover = turnover;
    }

    public BigDecimal getFloatMarketCapitalization() {
        return floatMarketCapitalization;
    }

    public void setFloatMarketCapitalization(BigDecimal floatMarketCapitalization) {
        this.floatMarketCapitalization = floatMarketCapitalization;
    }

    public BigDecimal getMarketCapitalization() {
        return marketCapitalization;
    }

    public void setMarketCapitalization(BigDecimal marketCapitalization) {
        this.marketCapitalization = marketCapitalization;
    }

    public BigDecimal getTurnoverRate() {
        return turnoverRate;
    }

    public void setTurnoverRate(BigDecimal turnoverRate) {
        this.turnoverRate = turnoverRate;
    }

    public BigDecimal getSealingFund() {
        return sealingFund;
    }

    public void setSealingFund(BigDecimal sealingFund) {
        this.sealingFund = sealingFund;
    }

    public LocalDateTime getStartSealing() {
        return startSealing;
    }

    public void setStartSealing(LocalDateTime startSealing) {
        this.startSealing = startSealing;
    }

    public LocalDateTime getEndSealing() {
        return endSealing;
    }

    public void setEndSealing(LocalDateTime endSealing) {
        this.endSealing = endSealing;
    }

    public Integer getBoomCount() {
        return boomCount;
    }

    public void setBoomCount(Integer boomCount) {
        this.boomCount = boomCount;
    }

    public String getTopCount() {
        return topCount;
    }

    public void setTopCount(String topCount) {
        this.topCount = topCount;
    }

    public Integer getConnectTopCount() {
        return connectTopCount;
    }

    public void setConnectTopCount(Integer connectTopCount) {
        this.connectTopCount = connectTopCount;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Top{" +
        "id=" + id +
        ", name=" + name +
        ", changeAmount=" + changeAmount +
        ", newPrice=" + newPrice +
        ", turnover=" + turnover +
        ", floatMarketCapitalization=" + floatMarketCapitalization +
        ", marketCapitalization=" + marketCapitalization +
        ", turnoverRate=" + turnoverRate +
        ", sealingFund=" + sealingFund +
        ", startSealing=" + startSealing +
        ", endSealing=" + endSealing +
        ", boomCount=" + boomCount +
        ", topCount=" + topCount +
        ", connectTopCount=" + connectTopCount +
        ", plate=" + plate +
        ", dateTime=" + dateTime +
        "}";
    }
}
