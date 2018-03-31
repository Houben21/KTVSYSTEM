package cn.edu.sysu.Dao;

import cn.edu.sysu.Entity.VIP;

import java.util.List;

public interface VIPDao {

    /**
     * 商家添加会员顾客
     * @param VIP 将要添加的会员顾客
     */
    void addVIP(VIP VIP);

    void deleteVIP(VIP VIP);

    List<VIP> queryVIPByName(String cname);

    List<VIP> queryVIPByPhone(String phone);

}
