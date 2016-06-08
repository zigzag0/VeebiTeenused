/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.ttu.websvc.order;

import ee.ttu.idu0075._2016.ws.order.GetOrdersResponse;
import ee.ttu.idu0075._2016.ws.order.OrderType;
import ee.ttu.idu0075._2016.ws.order.ProductType;
import javax.jws.WebService;

/**
 *
 * @author Sinegami
 */
@WebService(serviceName = "orders", portName = "ordersSOAP", endpointInterface = "ee.ttu.idu0075._2016.ws.order.Orders", targetNamespace = "http://www.ttu.ee/idu0075/2016/ws/order", wsdlLocation = "WEB-INF/wsdl/OrderWebService/orders.wsdl")
public class OrderWebService {

    public ee.ttu.idu0075._2016.ws.order.OrderType addOrder(ee.ttu.idu0075._2016.ws.order.AddOrderRequest parameter) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public ee.ttu.idu0075._2016.ws.order.OrderType updateOrder(ee.ttu.idu0075._2016.ws.order.OrderType parameter) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String deleteOrder(ee.ttu.idu0075._2016.ws.order.DeleteOrderRequest parameter) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

      
    public ee.ttu.idu0075._2016.ws.order.GetOrdersResponse getOrders(java.lang.String parameter) {
        //TODO implement this method
        //throw new UnsupportedOperationException("Not implemented yet.");
        return TestResponses.getOrders(parameter);
        
    }
}

