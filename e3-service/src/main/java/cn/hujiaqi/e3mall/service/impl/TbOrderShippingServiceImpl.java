package cn.hujiaqi.e3mall.service.impl;

import cn.hujiaqi.e3mall.mapper.TbOrderShippingDao;
import cn.hujiaqi.e3mall.pojo.TbOrderShipping;
import cn.hujiaqi.e3mall.service.TbOrderShippingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * (TbOrderShipping)表服务实现类
 *
 * @author makejava
 * @since 2021-01-01 20:10:30
 */
@Service("tbOrderShippingService")
public class TbOrderShippingServiceImpl implements TbOrderShippingService {
    @Resource
    private TbOrderShippingDao tbOrderShippingDao;

    /**
     * 通过ID查询单条数据
     *
     * @param orderId 主键
     * @return 实例对象
     */
    @Override
    public TbOrderShipping queryById(String orderId) {
        return this.tbOrderShippingDao.queryById(orderId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TbOrderShipping> queryAllByLimit(int offset, int limit) {
        return this.tbOrderShippingDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbOrderShipping 实例对象
     * @return 实例对象
     */
    @Override
    public TbOrderShipping insert(TbOrderShipping tbOrderShipping) {
        this.tbOrderShippingDao.insert(tbOrderShipping);
        return tbOrderShipping;
    }

    /**
     * 修改数据
     *
     * @param tbOrderShipping 实例对象
     * @return 实例对象
     */
    @Override
    public TbOrderShipping update(TbOrderShipping tbOrderShipping) {
        this.tbOrderShippingDao.update(tbOrderShipping);
        return this.queryById(tbOrderShipping.getOrderId());
    }

    /**
     * 通过主键删除数据
     *
     * @param orderId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String orderId) {
        return this.tbOrderShippingDao.deleteById(orderId) > 0;
    }
}