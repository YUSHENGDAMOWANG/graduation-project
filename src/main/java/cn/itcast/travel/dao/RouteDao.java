package cn.itcast.travel.dao;

import cn.itcast.travel.domain.Route;

import java.util.List;

public interface RouteDao {

    /**
     * 根据cid总记录数
     */

    public int getTotalCount(int cid, String rname);

    /**
     * 根据cid start pageSize查询当前页的数据集合
     *
     * @return
     */
    public List<Route> findByPage(int cid, int start, int pageSize, String rname);

    public Route findOne(int rid);

    int getTotalCountNull(int cid);

    List<Route> findByPageNull(int cid, int start, int pageSize);
}
