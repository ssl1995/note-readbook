package Java实战.第1章_Java8以后的变化.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


/**
 * @author SongShengLin
 * @date 2021/12/16 7:20 PM
 * @description
 */
@Getter
@AllArgsConstructor
public enum AppleColorEnum {
    /**
     * 红色
     */
    RED("red"),
    /**
     * 绿色
     */
    GREEN("green"),
    ;

    private final String desc;
}
