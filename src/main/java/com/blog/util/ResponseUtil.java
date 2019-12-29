package com.blog.util;

//import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

/**
 * 写入response（响应）的工具类
 * 
 */
public class ResponseUtil {
	public static void write(HttpServletResponse response,Object o) throws Exception {
		/*
		    用于定义网络文件的类型和网页的编码，决定浏览器将以什么形式、什么编码读取这个文件
          CharacterEncoding
                    作用是设置对客户端请求进行重新编码的编码
                    也就是说一个是设置读，一个是设置取
		 */
		response.setContentType("text/html;charset=utf-8");
		/*
		 *  java.io.PrintWriter是java中很常见的一个类，
		 *  该类可用来创建一个文件并向文本文件写入数据。
		 *  可以理解为java中的文件输出，java中的文件输入则是java.io.File
		 */
		PrintWriter out = response.getWriter();
		out.println(o.toString());
		// flush()表示强制将缓冲区中的数据发送出去,不必等到缓冲区满
		out.flush();
		//关闭
		out.close();
	}
}
