package com.xiaoweii.lambda.cart;

import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;

import java.util.List;

public class VersionThreeTest {

    @Test
    public void filterSkus(){
        List<Sku> cartSkuList = CartService.getCartSkuList();

        // 根据商品总价过滤超过2000元的商品列表
        List<Sku> result = CartService.filterSkus(
                cartSkuList,null,
                2000.00,false
        );

        System.out.println(JSON.toJSONString(result,true));
    }
}
