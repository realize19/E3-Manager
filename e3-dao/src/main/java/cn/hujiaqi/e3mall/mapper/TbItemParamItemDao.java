package cn.hujiaqi.e3mall.mapper;

import cn.hujiaqi.e3mall.pojo.TbItemParamItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;



/**
 * 商品规格和商品的关系表(TbItemParamItem)表数据库访问层
 *
 * @author makejava
 * @since 2021-01-01 20:10:27
 */
public interface TbItemParamItemDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbItemParamItem queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbItemParamItem> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbItemParamItem 实例对象
     * @return 对象列表
     */
    List<TbItemParamItem> queryAll(TbItemParamItem tbItemParamItem);

    /**
     * 新增数据
     *
     * @param tbItemParamItem 实例对象
     * @return 影响行数
     */
    int insert(TbItemParamItem tbItemParamItem);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbItemParamItem> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TbItemParamItem> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbItemParamItem> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TbItemParamItem> entities);

    /**
     * 修改数据
     *
     * @param tbItemParamItem 实例对象
     * @return 影响行数
     */
    int update(TbItemParamItem tbItemParamItem);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}