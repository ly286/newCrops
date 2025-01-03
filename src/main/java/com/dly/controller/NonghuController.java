package com.dly.controller;


import com.dly.annotation.IgnoreAuth;
import com.dly.entity.NonghuEntity;
import com.dly.service.NonghuService;
import com.dly.service.TokenService;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

/**
 * 农户
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-17 16:47:13
 */
@RestController
@RequestMapping("/nonghu")
public class NonghuController {
    @Autowired
    private NonghuService nonghuService;


    
	@Autowired
	private TokenService tokenService;
	
	/**
	 * 登录
	 */
	
	@RequestMapping(value = "/login")
	public R login(String username, String password, String captcha, HttpServletRequest request) {
		NonghuEntity user = nonghuService.selectOne(new EntityWrapper<NonghuEntity>().eq("nonghuzhanghao", username));
		if(user==null || !user.getMima().equals(MD5Util.md5(password))) {
			return R.error("账号或密码不正确");
		}
		String token = tokenService.generateToken(user.getId(), username,"nonghu",  "农户" );
		return R.ok().put("token", token);
	}
	
	/**
     * 注册
     */
	
    @RequestMapping("/register")
    public R register(@RequestBody NonghuEntity nonghu){
    	//ValidatorUtils.validateEntity(nonghu);
    	NonghuEntity user = nonghuService.selectOne(new EntityWrapper<NonghuEntity>().eq("nonghuzhanghao", nonghu.getNonghuzhanghao()));
		if(user!=null) {
			return R.error("注册用户已存在");
		}
		Long uId = new Date().getTime();
		nonghu.setId(uId);
                nonghu.setMima(MD5Util.md5(nonghu.getMima()));
        nonghuService.insert(nonghu);
        return R.ok();
    }

	
	/**
	 * 退出
	 */
	@RequestMapping("/logout")
	public R logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return R.ok("退出成功");
	}
	
	/**
     * 获取用户的session用户信息
     */
    @RequestMapping("/session")
    public R getCurrUser(HttpServletRequest request){
    	Long id = (Long)request.getSession().getAttribute("userId");
        NonghuEntity user = nonghuService.selectById(id);
        return R.ok().put("data", user);
    }
    
    /**
     * 密码重置
     */
    
	@RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request){
    	NonghuEntity user = nonghuService.selectOne(new EntityWrapper<NonghuEntity>().eq("nonghuzhanghao", username));
    	if(user==null) {
    		return R.error("账号不存在");
    	}
        user.setMima(MD5Util.md5("123456"));
        nonghuService.updateById(user);
        return R.ok("密码已重置为：123456");
    }


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,NonghuEntity nonghu,
		HttpServletRequest request){
        EntityWrapper<NonghuEntity> ew = new EntityWrapper<NonghuEntity>();
		PageUtils page = nonghuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, nonghu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,NonghuEntity nonghu, 
		HttpServletRequest request){
        EntityWrapper<NonghuEntity> ew = new EntityWrapper<NonghuEntity>();
		PageUtils page = nonghuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, nonghu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( NonghuEntity nonghu){
       	EntityWrapper<NonghuEntity> ew = new EntityWrapper<NonghuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( nonghu, "nonghu")); 
        return R.ok().put("data", nonghuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(NonghuEntity nonghu){
        EntityWrapper< NonghuEntity> ew = new EntityWrapper< NonghuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( nonghu, "nonghu")); 
		NonghuView nonghuView =  nonghuService.selectView(ew);
		return R.ok("查询农户成功").put("data", nonghuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        NonghuEntity nonghu = nonghuService.selectById(id);
        return R.ok().put("data", nonghu);
    }

    /**
     * 前端详情
     */
	
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        NonghuEntity nonghu = nonghuService.selectById(id);
        return R.ok().put("data", nonghu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody NonghuEntity nonghu, HttpServletRequest request){
    	nonghu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(nonghu);
    	NonghuEntity user = nonghuService.selectOne(new EntityWrapper<NonghuEntity>().eq("nonghuzhanghao", nonghu.getNonghuzhanghao()));
		if(user!=null) {
			return R.error("用户已存在");
		}
		nonghu.setId(new Date().getTime());
                nonghu.setMima(MD5Util.md5(nonghu.getMima())); 
        nonghuService.insert(nonghu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody NonghuEntity nonghu, HttpServletRequest request){
    	nonghu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(nonghu);
    	NonghuEntity user = nonghuService.selectOne(new EntityWrapper<NonghuEntity>().eq("nonghuzhanghao", nonghu.getNonghuzhanghao()));
		if(user!=null) {
			return R.error("用户已存在");
		}
		nonghu.setId(new Date().getTime());
                nonghu.setMima(MD5Util.md5(nonghu.getMima()));
        nonghuService.insert(nonghu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody NonghuEntity nonghu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(nonghu);
	NonghuEntity nonghuEntity = nonghuService.selectById(nonghu.getId());
        if(StringUtils.isNotBlank(nonghu.getMima()) && !nonghu.getMima().equals(nonghuEntity.getMima())) {
                nonghu.setMima(MD5Util.md5(nonghu.getMima()));
        }
        nonghuService.updateById(nonghu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        nonghuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<NonghuEntity> wrapper = new EntityWrapper<NonghuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = nonghuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
