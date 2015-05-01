<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/4/29
  Time: 8:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <title><s:property value="#request.pageTitle eq null ? '斯卡雷特' : #request.pageTitle"/></title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/public/css/public.css"/>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/public/css/sidebar.css"/>