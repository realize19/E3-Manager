package cn.hujiaqi.e3mall.service.impl;


import cn.hujiaqi.e3mall.mapper.TbItemDao;
import cn.hujiaqi.e3mall.pojo.TbItem;
import cn.hujiaqi.e3mall.service.TbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 商品表(TbItem)表服务实现类
 *
 * @author makejava
 * @since 2021-01-01 20:10:23
 */
@Service("tbItemServiceImpl")
@Repository
public class TbItemServiceImpl implements TbItemService {
    @Autowired
    private TbItemDao tbItemDao;

    @Override
    public TbItem getItemById(long itemId) {
        TbItem tbItem = tbItemDao.getItemById(itemId);
        return  tbItem;
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TbItem> queryAllByLimit(int offset, int limit) {
        return this.tbItemDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbItem 实例对象
     * @return 实例对象
     */
    @Override
    public TbItem insert(TbItem tbItem) {
        this.tbItemDao.insert(tbItem);
        return tbItem;
    }

    /**
     * 修改数据
     *
     * @param tbItem 实例对象
     * @return 实例对象
     */
    @Override
    public TbItem update(TbItem tbItem) {
        this.tbItemDao.update(tbItem);
        return this.getItemById(tbItem.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tbItemDao.deleteById(id) > 0;
    }


}