package com.xiaoweii.lambda.cart;

/**
 * 商品类型枚举
 */
public enum SkuCategoryEnum {
    CLOTHING(10,"服装类"),
    ELECTRONICS(20,"数码类"),
    SPORTS(30,"运动类"),
    BOOKS(40,"图书类");

    /**
     * code 商品类型编号
     */
    private Integer code;
    /**
     * name 商品类型名称
     */
    private String name;

    /**
     * 构造方法
     * @param code
     * @param name
     */
    SkuCategoryEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
}
