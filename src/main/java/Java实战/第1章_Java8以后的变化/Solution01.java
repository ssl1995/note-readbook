package Java实战.第1章_Java8以后的变化;

import Java实战.第1章_Java8以后的变化.enums.AppleColorEnum;
import Java实战.第1章_Java8以后的变化.pojo.Apple;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author SongShengLin
 * @date 2021/12/16 2:46 PM
 * @description 初步认识：Java8带来的写法优化
 */
public class Solution01 {
    /**
     * 初步认识：Java8带来的写法优化
     */
    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(2, AppleColorEnum.GREEN.getDesc()));
        inventory.add(new Apple(3, AppleColorEnum.RED.getDesc()));
        inventory.add(new Apple(4, AppleColorEnum.GREEN.getDesc()));
        inventory.add(new Apple(1, AppleColorEnum.GREEN.getDesc()));

        // Java8之前：繁琐的排序写法
        inventory.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight() - o2.getWeight();
            }
        });

        // Java8之后:后续学习这样写法的原因？
        // 正序排序
        inventory.sort(Comparator.comparing(Apple::getWeight));
        inventory.forEach(apple -> System.out.print(apple.getWeight() + " "));
        // 倒序排序
        inventory.sort(Comparator.comparing(Apple::getWeight).reversed());
        inventory.forEach(apple -> System.out.print(apple.getWeight() + " "));


        // 串行
        List<Apple> collect1 = inventory.stream().filter(apple -> apple.getWeight() > 100).collect(Collectors.toList());
        // 并行
        List<Apple> collect2 = inventory.parallelStream().filter(apple -> apple.getWeight() > 100).collect(Collectors.toList());


    }
}
