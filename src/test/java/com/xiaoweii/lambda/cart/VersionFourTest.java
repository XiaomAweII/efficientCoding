package com.xiaoweii.lambda.cart;

import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;

import java.util.List;

public class VersionFourTest {

    @Test
    public void filterSkus(){
        List<Sku> cartSkuList = CartService.getCartSkuList();

        // 过滤商品总价大于2000元的商品
        List<Sku> result = CartService.filterSkus(
                cartSkuList,new SkuTotalPricePredicate());

        System.out.println(JSON.toJSONString(result, true));
    }
}
