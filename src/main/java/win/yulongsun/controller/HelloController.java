package win.yulongsun.controller;

import com.jfinal.core.Controller;

/**
 * Created by yulongsun on 2016/1/28.
 */
public class HelloController extends Controller {

    public void index() {
        renderText("Hello JFinal World.");
    }
}
