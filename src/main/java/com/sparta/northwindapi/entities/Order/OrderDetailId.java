package com.sparta.northwindapi.entities.Order;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrderDetailId implements Serializable {
    private static final long serialVersionUID = 2727546241833703683L;
    @NotNull
    @Column(name = "OrderID", nullable = false)
    private Integer orderID;

    @NotNull
    @Column(name = "ProductID", nullable = false)
    private Integer productID;

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        OrderDetailId entity = (OrderDetailId) o;
        return Objects.equals(this.productID, entity.productID) &&
                Objects.equals(this.orderID, entity.orderID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productID, orderID);
    }

}