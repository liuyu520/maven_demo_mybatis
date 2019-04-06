package com.kunlunsoft.wxcp.web.controller.convention;

import com.common.util.SystemHWUtil;
import com.io.hw.json.HWJacksonUtils;
import com.kunlunsoft.wxcp.entity.TestToBoy;
import com.kunlunsoft.wxcp.mapper.TestToBoyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 类描述: TODO 请添加注释. <br />
 *
 * @author hanjun.hw
 * @since 2018/9/28
 */
@RestController
@RequestMapping(value = "test", produces = SystemHWUtil.RESPONSE_CONTENTTYPE_JSON_UTF)
public class Test2boyController {
    @Autowired
    private TestToBoyMapper testToBoyMapper;

    @ResponseBody
    @RequestMapping(value = "/query/json", produces = SystemHWUtil.RESPONSE_CONTENTTYPE_JSON_UTF)
    public String json2(Model model, HttpServletRequest request, HttpServletResponse response
            , @RequestParam(required = false) Integer testId) {
        List<TestToBoy> tTestToBoys = testToBoyMapper.find(testId);
        return HWJacksonUtils.getJsonP(tTestToBoys);
    }
}
