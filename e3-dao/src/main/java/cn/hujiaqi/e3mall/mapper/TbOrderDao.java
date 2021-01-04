package cn.hujiaqi.e3mall.mapper;

import cn.hujiaqi.e3mall.pojo.TbOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * (TbOrder)表数据库访问层
 *
 * @author makejava
 * @since 2021-01-01 20:10:28
 */
public interface TbOrderDao {

    /**
     * 通过ID查询单条数据
     *
     * @param orderId 主键
     * @return 实例对象
     */
    TbOrder queryById(String orderId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbOrder> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbOrder 实例对象
     * @return 对象列表
     */
    List<TbOrder> queryAll(TbOrder tbOrder);

    /**
     * 新增数据
     *
     * @param tbOrder 实例对象
     * @return 影响行数
     */
    int insert(TbOrder tbOrder);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbOrder> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TbOrder> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbOrder> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TbOrder> entities);

    /**
     * 修改数据
     *
     * @param tbOrder 实例对象
     * @return 影响行数
     */
    int update(TbOrder tbOrder);

    /**
     * 通过主键删除数据
     *
     * @param orderId 主键
     * @return 影响行数
     */
    int deleteById(String orderId);

}