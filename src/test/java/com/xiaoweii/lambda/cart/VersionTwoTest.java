package com.xiaoweii.lambda.cart;

import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;

import java.util.List;

public class VersionTwoTest {

    @Test
    public void filterSkuByCategory() {
        List<Sku> cartSkuList = CartService.getCartSkuList();

        // 查找购物车中图书类商品集合
        List<Sku> result = CartService.filterSkuByCategory(
                cartSkuList, SkuCategoryEnum.BOOKS);

        System.out.println(JSON.toJSONString(result, true));
    }
}
