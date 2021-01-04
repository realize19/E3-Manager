package cn.hujiaqi.e3mall.service.impl;

import cn.hujiaqi.e3mall.mapper.TbOrderItemDao;
import cn.hujiaqi.e3mall.pojo.TbOrderItem;
import cn.hujiaqi.e3mall.service.TbOrderItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;



/**
 * (TbOrderItem)表服务实现类
 *
 * @author makejava
 * @since 2021-01-01 20:10:29
 */
@Service("tbOrderItemService")
public class TbOrderItemServiceImpl implements TbOrderItemService {
    @Resource
    private TbOrderItemDao tbOrderItemDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbOrderItem queryById(String id) {
        return this.tbOrderItemDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TbOrderItem> queryAllByLimit(int offset, int limit) {
        return this.tbOrderItemDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbOrderItem 实例对象
     * @return 实例对象
     */
    @Override
    public TbOrderItem insert(TbOrderItem tbOrderItem) {
        this.tbOrderItemDao.insert(tbOrderItem);
        return tbOrderItem;
    }

    /**
     * 修改数据
     *
     * @param tbOrderItem 实例对象
     * @return 实例对象
     */
    @Override
    public TbOrderItem update(TbOrderItem tbOrderItem) {
        this.tbOrderItemDao.update(tbOrderItem);
        return this.queryById(tbOrderItem.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.tbOrderItemDao.deleteById(id) > 0;
    }
}