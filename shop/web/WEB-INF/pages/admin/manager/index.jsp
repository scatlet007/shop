<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/4/30
  Time: 12:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/pages/admin/header.jsp"%>
<%@include file="/WEB-INF/pages/admin/script_tpl.jsp"%>
    </head>
    <body>
        <div class="main">
            <div id="sidebar">
                <div class="sidebar_contet">
                    <div class="sidebar_contet_head" onclick="hidenDiv(document.getElementById('side_content_1'))">
            	        <span>
                	        <a href="javascript:void(0)">管理列表</a>
                        </span>
                    </div>
                    <div class="sidebar_contet_body" id="side_content_1">
                        <ul>
                            <li><a href="">上传的信息</a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="contet">
                <div class="contet_bar">
                    <span>>主页</span>
                </div>
                <div class="contet_info">
                    <span>
                        <select name="orderType">
                            <option value=" " selected>请选择</option>
                            <option value="all">全部</option>
                        </select>
                    </span>
                    <span>
                        <button type="submit" >查询</button>
                    </span>
                </div>
                <div class="contet_lower">
                    <div class="contet_bar">
                        <span>详细信息</span>
                        <div class="contet_bar_list">
                            <ul>
                                <li>
                                    <a href="">[站内信]</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <table cellpadding="0" cellspacing="0" class="contet_table">
                        <tr>
                            <td>正面</td>
                            <td>反面</td>
                            <td>类型</td>
                            <td>上传时间</td>
                            <td>联系邮箱</td>
                        </tr>
                    </table>
                    <div class="contet_lower_bottom">
                        共计0条&nbsp;总共0页&nbsp;&nbsp;
                        每页<select name="number">
                        <option value="1">1</option>
                        <option value="1">2</option>
                        <option value="1">3</option>
                        <option value="1">4</option>
                        <option value="1">5</option>
                        <option value="1">6</option>
                        <option value="1">7</option>
                        <option value="1">8</option>
                        <option value="1">9</option>
                        <option value="1">10</option>
                    </select>条&nbsp;&nbsp;
                        第<select name="number01">
                        <option value="1">1</option>
                        <option value="1">2</option>
                        <option value="1">3</option>
                        <option value="1">4</option>
                        <option value="1">5</option>
                        <option value="1">6</option>
                        <option value="1">7</option>
                        <option value="1">8</option>
                        <option value="1">9</option>
                        <option value="1">10</option>
                    </select>页
                    </div>
                </div>
            </div>
        </div>
        <script type="text/javascript">
            function hidenDiv(div){
                div.style.display=(div.style.display=='none'?'block':'none');
            }
        </script>
 <%@include file="/WEB-INF/pages/admin/foot_tpl.jsp"%>