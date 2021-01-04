package cn.hujiaqi.e3mall.service.impl;

import cn.hujiaqi.e3mall.mapper.TbItemParamDao;
import cn.hujiaqi.e3mall.pojo.TbItemParam;
import cn.hujiaqi.e3mall.service.TbItemParamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * 商品规则参数(TbItemParam)表服务实现类
 *
 * @author makejava
 * @since 2021-01-01 20:10:26
 */
@Service("tbItemParamService")
public class TbItemParamServiceImpl implements TbItemParamService {
    @Resource
    private TbItemParamDao tbItemParamDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbItemParam queryById(Long id) {
        return this.tbItemParamDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TbItemParam> queryAllByLimit(int offset, int limit) {
        return this.tbItemParamDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbItemParam 实例对象
     * @return 实例对象
     */
    @Override
    public TbItemParam insert(TbItemParam tbItemParam) {
        this.tbItemParamDao.insert(tbItemParam);
        return tbItemParam;
    }

    /**
     * 修改数据
     *
     * @param tbItemParam 实例对象
     * @return 实例对象
     */
    @Override
    public TbItemParam update(TbItemParam tbItemParam) {
        this.tbItemParamDao.update(tbItemParam);
        return this.queryById(tbItemParam.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tbItemParamDao.deleteById(id) > 0;
    }
}