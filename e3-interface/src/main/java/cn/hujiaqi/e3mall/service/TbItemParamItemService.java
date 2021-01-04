package cn.hujiaqi.e3mall.service;

import cn.hujiaqi.e3mall.pojo.TbItemParamItem;

import java.util.List;



/**
 * 商品规格和商品的关系表(TbItemParamItem)表服务接口
 *
 * @author makejava
 * @since 2021-01-01 20:10:27
 */
public interface TbItemParamItemService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbItemParamItem queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbItemParamItem> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbItemParamItem 实例对象
     * @return 实例对象
     */
    TbItemParamItem insert(TbItemParamItem tbItemParamItem);

    /**
     * 修改数据
     *
     * @param tbItemParamItem 实例对象
     * @return 实例对象
     */
    TbItemParamItem update(TbItemParamItem tbItemParamItem);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}