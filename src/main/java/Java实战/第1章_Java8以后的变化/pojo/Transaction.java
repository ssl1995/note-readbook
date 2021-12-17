package Java实战.第1章_Java8以后的变化.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author SongShengLin
 * @date 2021/12/16 4:42 PM
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    /**
     * 交易金额
     */
    private int price;
    /**
     * 货币
     */
    private int currency;
}
