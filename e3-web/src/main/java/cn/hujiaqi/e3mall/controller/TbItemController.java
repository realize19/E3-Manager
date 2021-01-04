package cn.hujiaqi.e3mall.controller;


import cn.hujiaqi.e3mall.pojo.TbItem;
import cn.hujiaqi.e3mall.service.TbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 * 商品表(TbItem)表控制层
 *
 * @author makejava
 * @since 2021-01-01 20:10:23
 */
@Controller
public class TbItemController {
    /**
     * 服务对象
     */
    @Autowired
    private TbItemService tbItemService;


    @RequestMapping("/")
    public String index(){

        return "index";
    }

    @RequestMapping("/item/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable long itemId){
        TbItem tbItem = tbItemService.getItemById(itemId);
        return tbItem;
    }

}