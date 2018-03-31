package cn.edu.sysu.Dao;

import cn.edu.sysu.Entity.Room;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoomDao {

    void addRoom(Room room);

    void deleteRoom(Room room);

    int queryRoomStatus(@Param("id") int id, @Param("type") String type);

    List<Room> queryEmptyRoom();

    List<Room> queryEmptyRoomByType(String type);

}
