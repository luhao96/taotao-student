/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-06-12 13:44:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class course_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("   <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>课程管理</title>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navigate.jsp", out, false);
      out.write("\r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"layui/css/layui.css\" media=\"all\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"layui/css/ycl.css\" media=\"all\">\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write(" <div class=\"layui-body admin-body\">\r\n");
      out.write("        <div class=\"layui-main\">\r\n");
      out.write("              <div class=\"layui-tab layui-tab-brief\">\r\n");
      out.write("                  <ul class=\"layui-tab-title\">\r\n");
      out.write("                       <li class=\"layui-this\">课程列表</li>\r\n");
      out.write("                       <li>添加课程</li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("                  <div class=\"layui-tab-content\">\r\n");
      out.write("                     <div class=\"layui-tab-item layui-show\">\r\n");
      out.write("                <form method=\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/course/select\" class=\"layui-form\">\r\n");
      out.write("                <div class=\"layui-form-item\">\r\n");
      out.write("                    <div class=\"layui-input-inline\">\r\n");
      out.write("                        <input class=\"layui-input\" type=\"text\" id=\"name\" name=\"name\"  placeholder=\"课程名称\" >\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"layui-input-inline\">\r\n");
      out.write("                        <input class=\"layui-input\" type=\"text\" id=\"min\" name=\"min\"  placeholder=\"最小实选人数\" >\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"layui-input-inline\">\r\n");
      out.write("                        <input class=\"layui-input\" type=\"text\" id=\"max\" name=\"max\"  placeholder=\"最大实选人数\" >\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"layui-input-inline\">\r\n");
      out.write("                        <button class=\"layui-btn\" lay-submit=\"\" lay-filter=\"userFilter\">筛选</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("            <table class=\"layui-table\" lay-even=\"\" lay-skin=\"row\">\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr>\r\n");
      out.write("   \r\n");
      out.write("                        <th style=\"text-align: center;width:80px;\">编号</th>\r\n");
      out.write("                        <th style=\"text-align: center;width:130px;\">课程名称</th>\r\n");
      out.write("                        <th style=\"text-align: center;width:110px;\">公选课</th>\r\n");
      out.write("                         <th style=\"text-align: center;width:80px;\">教师</th>\r\n");
      out.write("                          <th style=\"text-align: center;width:80px;\">时间</th>\r\n");
      out.write("                          <th style=\"text-align: center;width:80px;\">地点</th>\r\n");
      out.write("                          <th style=\"text-align: center;width:80px;\">应选人数</th>\r\n");
      out.write("                            <th style=\"text-align: center;width:80px;\">实选人数</th>\r\n");
      out.write("                        <th style=\"text-align: center;width:130px;\">操作</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("                   ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                 </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("              <div id=\"page\" style=\"float:right\"></div>\r\n");
      out.write("        \r\n");
      out.write("             <input id=\"iframe_status\" value=\"\" hidden=\"hidden\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("             <div class=\"layui-tab-item\"  style=\"min-height:350px\">\r\n");
      out.write("           <form class=\"layui-form\" id=\"courseform\">\r\n");
      out.write("    <div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">课程名称</label>\r\n");
      out.write("    <div class=\"layui-input-inline\">\r\n");
      out.write("      <input type=\"text\" name=\"name\" lay-verify=\"name\" autocomplete=\"off\" placeholder=\"请输入课程名称\" class=\"layui-input\" value=\"\">\r\n");
      out.write("      <input type=\"hidden\" name=\"id\" lay-verify=\"id\" autocomplete=\"off\" placeholder=\"\" class=\"layui-input\" value=\"\">\r\n");
      out.write("    </div>\r\n");
      out.write("   </div>\r\n");
      out.write("   \r\n");
      out.write("   <div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">公选课</label>\r\n");
      out.write("    <div class=\"layui-input-inline\">\r\n");
      out.write("      \t<input id=\"public\" type=\"button\" class=\"layui-btn\" value=\"非公选课\"/>\r\n");
      out.write("      \t<input id=\"pubclass\" type=\"hidden\" value=\"0\" name=\"ispublic\">\r\n");
      out.write("    </div>\r\n");
      out.write("   </div>\r\n");
      out.write("   \r\n");
      out.write("   <div id=\"major\" class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">选修专业</label>\r\n");
      out.write("    <div class=\"layui-input-inline\">\r\n");
      out.write("     <input type=\"checkbox\" name=\"major\" title=\"软件工程\" value=\"软件工程\">\r\n");
      out.write("     <input type=\"checkbox\" name=\"major\" title=\"数字媒体\" value=\"数字媒体\">\r\n");
      out.write("       <input type=\"checkbox\" name=\"major\" title=\"计算机科学与技术\" value=\"计算机科学与技术\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"layui-input-inline\">\r\n");
      out.write("     <input type=\"checkbox\" name=\"major\" title=\"物联网\" value=\"物联网\">\r\n");
      out.write("     <input type=\"checkbox\" name=\"major\" title=\"网络工程\" value=\"网络工程\">\r\n");
      out.write("    </div>\r\n");
      out.write("   </div>\r\n");
      out.write("   \r\n");
      out.write("   <div class=\"layui-form-item\" >\r\n");
      out.write("                 <label class=\"layui-form-label\">学分</label>\r\n");
      out.write("                  <div class=\"layui-input-inline\">\r\n");
      out.write("                   <select name=\"credit\" lay-filter=\"session\" lay-verify=\"session\">\r\n");
      out.write("                        <option value=\"\">学分</option>\r\n");
      out.write("                        <option value=\"0.5\">0.5</option>\r\n");
      out.write("                        <option value=\"1\">1</option> \r\n");
      out.write("                        <option value=\"1.5\">1.5</option> \r\n");
      out.write("                        <option value=\"2\">2</option> \r\n");
      out.write("                  </select>\r\n");
      out.write("               </div>\r\n");
      out.write("           </div>\r\n");
      out.write("   \r\n");
      out.write("   <div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">上课老师</label>\r\n");
      out.write("    <div class=\"layui-input-inline\">\r\n");
      out.write("      <input type=\"text\" name=\"teacher\" lay-verify=\"teacher\" autocomplete=\"off\" placeholder=\"请输入上课老师\" class=\"layui-input\" >\r\n");
      out.write("    </div>\r\n");
      out.write("   </div>\r\n");
      out.write("   \r\n");
      out.write("    <div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">上课时间</label>\r\n");
      out.write("    <div class=\"layui-input-inline\" style=\"width: 100px;\">\r\n");
      out.write("      <input type=\"text\" name=\"start\" placeholder=\"开始周\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"layui-form-mid\">-</div>\r\n");
      out.write("    <div class=\"layui-input-inline\" style=\"width: 100px;\">\r\n");
      out.write("      <input type=\"text\" name=\"end\" placeholder=\"结束周\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("    </div>\r\n");
      out.write("   </div>\r\n");
      out.write(" \t\r\n");
      out.write(" \t<div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">上课地点</label>\r\n");
      out.write("    <div class=\"layui-input-inline\">\r\n");
      out.write("      <input type=\"text\" name=\"place\" lay-verify=\"place\" autocomplete=\"off\" placeholder=\"请输入上课地点\" class=\"layui-input\" >\r\n");
      out.write("    </div>\r\n");
      out.write("   </div>\r\n");
      out.write("   \r\n");
      out.write("   <div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">可选人数</label>\r\n");
      out.write("    <div class=\"layui-input-inline\">\r\n");
      out.write("      <input type=\"text\" name=\"studentnum\" lay-verify=\"place\" autocomplete=\"off\" placeholder=\"请输入人数\" class=\"layui-input\" >\r\n");
      out.write("    </div>\r\n");
      out.write("   </div>\r\n");
      out.write("   \r\n");
      out.write("  <div class=\"layui-form-item\">\r\n");
      out.write("    <div class=\"layui-input-block\">\r\n");
      out.write("      <input type=\"button\" id=\"courseButton\" class=\"layui-btn\" value=\"提交\"/>\r\n");
      out.write("      <button id=\"reset\" type=\"reset\" class=\"layui-btn layui-btn-primary\">重置</button>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</form>\r\n");
      out.write("              </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("             </div> \r\n");
      out.write("      </div>            \r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"layui/jquery-2.0.0.min.js\" charset=\"utf-8\"></script>\r\n");
      out.write("<script src=\"layui/layui.js\" charset=\"utf-8\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    layui.use(['laypage', 'layer','element','form'], function(){\r\n");
      out.write("    \t\r\n");
      out.write("        var $ = layui.jquery;\r\n");
      out.write("        var laypage = layui.laypage;\r\n");
      out.write("        var layer = layui.layer;\r\n");
      out.write("        var form = layui.form();\r\n");
      out.write("        form.verify({\r\n");
      out.write("        \t  name: function(value){\r\n");
      out.write("              if(value.length < 2){\r\n");
      out.write("                return '课程名称至少得2个字符';\r\n");
      out.write("              }\r\n");
      out.write("            },\r\n");
      out.write("            major: function(value){\r\n");
      out.write("                if(value==''){\r\n");
      out.write("                  return '专业没有选择';\r\n");
      out.write("                }\r\n");
      out.write("              }\r\n");
      out.write("          });  \r\n");
      out.write("        $(\".layui-nav-item\").each(function(){\r\n");
      out.write("        \tif($(this).find(\"a\").attr(\"href\")=='course!list.action'){\r\n");
      out.write("        \t\t$(this).addClass(\"layui-this\");\r\n");
      out.write("        \t}else{\r\n");
      out.write("        \t\t$(this).removeClass(\"layui-this\");\r\n");
      out.write("        \t}\r\n");
      out.write("        });\r\n");
      out.write("        $(\"#courseButton\").click(function(){\r\n");
      out.write("       \t $.ajax({\r\n");
      out.write("                cache: true,\r\n");
      out.write("                type: \"POST\",\r\n");
      out.write("                url:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/course/addCourse\",\r\n");
      out.write("                data:$('#courseform').serialize(),// 你的formid\r\n");
      out.write("                async: false,\r\n");
      out.write("                success: function(data) {\r\n");
      out.write("               \t if(data==\"success\")\r\n");
      out.write("               \t \tlayer.msg('添加成功！', {icon: 1,time: 1000,shade: 0.1,offset:'200px'}, function(){});\r\n");
      out.write("               \t else\r\n");
      out.write("               \t\tlayer.msg('添加失败！', {icon: 2,time: 1000,shade: 0.1,offset:'200px'}, function(){}); \r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("        var pageinfo = {\"pages\":'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${page.totolNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("',\"curr\":'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${page.pageNo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("',\"limit\":10};\r\n");
      out.write("        var c_pages = pageinfo.pages;\r\n");
      out.write("        var c_curr = pageinfo.curr;\r\n");
      out.write("        var c_limit = pageinfo.limit;\r\n");
      out.write("        //调用分页\r\n");
      out.write("        laypage({\r\n");
      out.write("            cont: 'page',\r\n");
      out.write("            pages: Math.ceil(c_pages/c_limit), //得到总页数\r\n");
      out.write("            groups: 5,\r\n");
      out.write("            curr: c_curr, //当前分页\r\n");
      out.write("            first: false,\r\n");
      out.write("            last: false,\r\n");
      out.write("            skip: true,\r\n");
      out.write("            jump: function(obj, first){\r\n");
      out.write("                var curr = obj.curr;\r\n");
      out.write("                if(!first){ //一定要加此判断，否则初始时会无限刷新\r\n");
      out.write("                    location.href = 'course!list.action?pageNo='+curr;                }\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("\t\t$(\"#public\").click(function(){\r\n");
      out.write("\t\t \t$(\"#major\").slideToggle(\"slow\");\r\n");
      out.write("\t\t\tvar val=$(\"#public\").val();\r\n");
      out.write("\t\t\tif(val==\"公选课\") {\r\n");
      out.write("\t\t\t\t$(\"#public\").val(\"非公选课\");\r\n");
      out.write("\t\t\t\t$(\"#pubclass\").val(\"0\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse {\r\n");
      out.write("\t\t\t\t$(\"#public\").val(\"公选课\");\r\n");
      out.write("\t\t\t\t$(\"#pubclass\").val(\"1\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("        $(\"#page\").prepend('<span>共 ' + c_pages + ' 条&nbsp;&nbsp;</span>');\r\n");
      out.write("        //监听提交\r\n");
      out.write("        form.on('submit(sumbitBtn)', function(data){\r\n");
      out.write("        \t  layer.msg('添加成功！', {icon: 1,time: 1000,shade: 0.1,offset:'200px'}, function(){\r\n");
      out.write("                \r\n");
      out.write("              });\r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("    });\r\n");
      out.write("    function courseEdit(uid){\r\n");
      out.write("    \t  window.location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/main';\r\n");
      out.write("    }\r\n");
      out.write("    function forAddScore(uid){\r\n");
      out.write("  \t  window.location.href='score?courseId=' + uid;\r\n");
      out.write("  }\r\n");
      out.write("    function courseDel(uid){\r\n");
      out.write("        layui.use(['layer'],function(){\r\n");
      out.write("            var $ = layui.jquery;\r\n");
      out.write("            var layer = layui.layer;\r\n");
      out.write("\r\n");
      out.write("            layer.confirm('确定删除此课程?', {icon: 3, title:'课程删除',offset: '200px'}, function(index){\r\n");
      out.write("                $.ajax({    \r\n");
      out.write("                    type: \"post\",   \r\n");
      out.write("                    url: 'course/delete?id=' + uid,\r\n");
      out.write("                    dataType: 'text',\r\n");
      out.write("                    success: function(data){\r\n");
      out.write("                    \tlayer.close(index);\r\n");
      out.write("                    \tif(data==\"success\")\r\n");
      out.write("                    \t \tlayer.msg('删除成功！', {icon: 1,time: 1000,shade: 0.1,offset: '200px'}, function(){\t  \r\n");
      out.write("                         });\r\n");
      out.write("                    \telse\r\n");
      out.write("                    \t\tlayer.msg('删除失败！', {icon: 1,time: 1000,shade: 0.1,offset: '200px'}, function(){\r\n");
      out.write("     \r\n");
      out.write("                           });\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("               \r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /course.jsp(67,19) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("list");
    // /course.jsp(67,19) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/course.jsp(67,19) '${courselist}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${courselist}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                       <tr>\r\n");
          out.write("                        <td style=\"text-align: center;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                        <td style=\"text-align: center;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                        <td style=\"text-align: center;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.ispublic==\"1\"?\"是\":\"否\"}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                        <td style=\"text-align: center;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.teacher}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                        <td style=\"text-align: center;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.start}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('-');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.end}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("周</td>\r\n");
          out.write("                        <td style=\"text-align: center;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.place}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                        <td style=\"text-align: center;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.studentnum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                        <td style=\"text-align: center;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.realnum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                        <td>\r\n");
          out.write("                            <button class=\"layui-btn layui-btn-mini layui-btn-warm\" edit-uid=\"1\" onclick=\"forAddScore('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("');\">录入/修改成绩</button>\r\n");
          out.write("                            <button class=\"layui-btn layui-btn-mini\" edit-uid=\"1\" onclick=\"courseEdit('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("');\">修改</button>\r\n");
          out.write("                            <button class=\"layui-btn layui-btn-danger layui-btn-mini\" del-uid=\"1\" onclick=\"courseDel('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("');\">删除</button>\r\n");
          out.write("                        </td>\r\n");
          out.write("                    </tr>\r\n");
          out.write("                   ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
