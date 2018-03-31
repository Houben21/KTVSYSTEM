package cn.edu.sysu.Dao;

import cn.edu.sysu.Entity.VIP;

import java.util.List;

public interface VIPDao {

    void addVIP(VIP VIP);

    void deleteVIP(VIP VIP);

    List<VIP> queryVIPByName(String cname);

    List<VIP> queryVIPByPhone(String phone);

}
