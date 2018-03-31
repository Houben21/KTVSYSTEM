package cn.edu.sysu.Dao;

import cn.edu.sysu.Entity.Customer;

public interface CustomerDao {

    /**
     * 添加普通顾客
     * @param customer 将要添加的顾客
     */
    void addCustomer(Customer customer);
    
}
