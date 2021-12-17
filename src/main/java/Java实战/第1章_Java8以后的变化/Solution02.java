package Java实战.第1章_Java8以后的变化;

import Java实战.第1章_Java8以后的变化.pojo.Transaction;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author SongShengLin
 * @date 2021/12/16 3:10 PM
 * @description
 */
public class Solution02 {
    public static void main(String[] args) {

        List<Transaction> transactions = Lists.newArrayList(
                new Transaction(1, 1), new Transaction(1000, 1), new Transaction(12312, 2)
        );

        Map<Integer, List<Transaction>> transactionsByCurrencies = transactions.stream()
                .filter(transaction -> transaction.getPrice() > 1000)
                // 按照方法引用中的个数分组成map
                .collect(Collectors.groupingBy(Transaction::getCurrency));

    }
}
