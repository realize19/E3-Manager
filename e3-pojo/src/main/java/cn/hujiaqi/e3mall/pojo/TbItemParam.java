package cn.hujiaqi.e3mall.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品规则参数(TbItemParam)实体类
 *
 * @author makejava
 * @since 2021-01-01 20:10:25
 */
public class TbItemParam implements Serializable {
    private static final long serialVersionUID = -82663242763799179L;

    private Long id;
    /**
     * 商品类目ID
     */
    private Long itemCatId;
    /**
     * 参数数据，格式为json格式
     */
    private String paramData;

    private Date created;

    private Date updated;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getItemCatId() {
        return itemCatId;
    }

    public void setItemCatId(Long itemCatId) {
        this.itemCatId = itemCatId;
    }

    public String getParamData() {
        return paramData;
    }

    public void setParamData(String paramData) {
        this.paramData = paramData;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

}