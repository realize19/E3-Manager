package cn.hujiaqi.e3mall.service.impl;

import cn.hujiaqi.e3mall.mapper.TbContentCategoryDao;
import cn.hujiaqi.e3mall.pojo.TbContentCategory;
import org.springframework.stereotype.Service;
import cn.hujiaqi.e3mall.service.TbContentCategoryService;

import javax.annotation.Resource;
import java.util.List;


/**
 * 内容分类(TbContentCategory)表服务实现类
 *
 * @author makejava
 * @since 2021-01-01 20:10:22
 */
@Service("tbContentCategoryService")
public class TbContentCategoryServiceImpl implements TbContentCategoryService {
    @Resource
    private TbContentCategoryDao tbContentCategoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    public TbContentCategory queryById(Long id) {
        return this.tbContentCategoryDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TbContentCategory> queryAllByLimit(int offset, int limit) {
        return this.tbContentCategoryDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbContentCategory 实例对象
     * @return 实例对象
     */
    @Override
    public TbContentCategory insert(TbContentCategory tbContentCategory) {
        this.tbContentCategoryDao.insert(tbContentCategory);
        return tbContentCategory;
    }

    /**
     * 修改数据
     *
     * @param tbContentCategory 实例对象
     * @return 实例对象
     */
    @Override
    public TbContentCategory update(TbContentCategory tbContentCategory) {
        this.tbContentCategoryDao.update(tbContentCategory);
        return this.queryById(tbContentCategory.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tbContentCategoryDao.deleteById(id) > 0;
    }
}