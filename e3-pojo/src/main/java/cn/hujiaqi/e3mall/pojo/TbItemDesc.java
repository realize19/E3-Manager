package cn.hujiaqi.e3mall.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品描述表(TbItemDesc)实体类
 *
 * @author makejava
 * @since 2021-01-01 20:10:25
 */
public class TbItemDesc implements Serializable {
    private static final long serialVersionUID = 625481822241509615L;
    /**
     * 商品ID
     */
    private Long itemId;
    /**
     * 商品描述
     */
    private String itemDesc;
    /**
     * 创建时间
     */
    private Date created;
    /**
     * 更新时间
     */
    private Date updated;


    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
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