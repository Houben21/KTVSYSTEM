package cn.edu.sysu.Dao;

import cn.edu.sysu.Entity.Room;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoomDao {

    /**
     * 商家向数据库中添加房间
     * @param room 将要被添加的房间
     */
    void addRoom(Room room);

    /**
     * 商家删除数据库中的房间
     * @param room 将要删除的房间
     */
    void deleteRoom(Room room);

    /**
     * 根据给定的房间类型和房间编号查询房间的状态
     * @param id 房间编号
     * @param type 房间类型
     * @return 返回该房间的状态
     */
    int queryRoomStatus(@Param("id") int id, @Param("type") String type);

    /**
     * 查询状态为空的房间
     * @return 状态为空的房间列表
     */
    List<Room> queryEmptyRoom();

    /**
     * 根据给定房间类型查询状态为空的房间
     * @param type 房间类型
     * @return 给定类型状态为空的房间
     */
    List<Room> queryEmptyRoomByType(String type);

}
