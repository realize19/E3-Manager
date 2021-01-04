package cn.hujiaqi.e3mall.service;

import cn.hujiaqi.e3mall.pojo.TbOrderItem;

import java.util.List;


/**
 * (TbOrderItem)表服务接口
 *
 * @author makejava
 * @since 2021-01-01 20:10:29
 */
public interface TbOrderItemService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbOrderItem queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbOrderItem> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbOrderItem 实例对象
     * @return 实例对象
     */
    TbOrderItem insert(TbOrderItem tbOrderItem);

    /**
     * 修改数据
     *
     * @param tbOrderItem 实例对象
     * @return 实例对象
     */
    TbOrderItem update(TbOrderItem tbOrderItem);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}