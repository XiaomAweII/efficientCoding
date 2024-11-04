package com.xiaoweii.lambda.cart;

import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;

import java.util.List;

public class VersionOneTest {

    @Test
    public void filterElectronicSkus() {
        List<Sku> cartSkuList = CartService.getCartSkuList();

        // 查找购物车中数码类商品
        List<Sku> result =
                CartService.filterElectronicSkus(cartSkuList);

        // JSON.toJSONString(result, true)
        /**
         * 第二个参数是格式化标记:
         * 如果为true则将JSON数据格式化输出,
         * 如果为false则将JSON数据一行输出
         */
        System.out.println(JSON.toJSONString(result, true));
    }
}
