/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.ttu.websvc.order;

import ee.ttu.idu0075._2016.ws.order.GetOrdersResponse;
import ee.ttu.idu0075._2016.ws.order.OrderType;
import ee.ttu.idu0075._2016.ws.order.ProductType;

/**
 *
 * @author Sinegami
 */
public class TestResponses {
  
    public static ee.ttu.idu0075._2016.ws.order.GetOrdersResponse getOrders(java.lang.String parameter) {
        //TODO implement this method
        //throw new UnsupportedOperationException("Not implemented yet.");
        GetOrdersResponse r = new GetOrdersResponse();
        r.setOrders(new GetOrdersResponse.Orders());
        OrderType o = new OrderType();
        o.setId(1);
        o.setCompany("Metrosert AS");
        o.setAddress("Madara 14");
        o.setAccountNr("IBAN_EE045000502234234234");
        o.setProducts(new OrderType.Products());
        
        ProductType p = new ProductType();
        p.setId(1);
        p.setName("MLT-D111S");
        p.setDescription("something here");
        p.setPrice(5);
        p.setAmount(123);
        o.getProducts().getProduct().add(p);
        
        p = new ProductType();
        p.setId(2);
        p.setName("MLT-D116S");
        p.setDescription("something here22");
        p.setPrice(53);
        p.setAmount(23);
        o.getProducts().getProduct().add(p);
        
        p = new ProductType();
        p.setId(3);
        p.setName("MLT-D118S");
        p.setDescription("something here22sad");
        p.setPrice(51);
        p.setAmount(2223);
        o.getProducts().getProduct().add(p);
        
        r.getOrders().getOrder().add(o);
        
        return r;
        
    }
}

