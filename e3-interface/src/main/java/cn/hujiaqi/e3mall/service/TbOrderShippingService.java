package cn.hujiaqi.e3mall.service;

import cn.hujiaqi.e3mall.pojo.TbOrderShipping;

import java.util.List;

/**
 * (TbOrderShipping)表服务接口
 *
 * @author makejava
 * @since 2021-01-01 20:10:30
 */
public interface TbOrderShippingService {

    /**
     * 通过ID查询单条数据
     *
     * @param orderId 主键
     * @return 实例对象
     */
    TbOrderShipping queryById(String orderId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbOrderShipping> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbOrderShipping 实例对象
     * @return 实例对象
     */
    TbOrderShipping insert(TbOrderShipping tbOrderShipping);

    /**
     * 修改数据
     *
     * @param tbOrderShipping 实例对象
     * @return 实例对象
     */
    TbOrderShipping update(TbOrderShipping tbOrderShipping);

    /**
     * 通过主键删除数据
     *
     * @param orderId 主键
     * @return 是否成功
     */
    boolean deleteById(String orderId);

}