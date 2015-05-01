<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/4/27
  Time: 8:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>index</title>
      <script type="text/javascript" src="public/js/jquery-1.8.2.min.js"></script>
      <link rel="stylesheet" href="/public/css/index.css"/>
  </head>
  <body>
    <div class="content">
        <a href="${pageContext.request.contextPath}/admin/home/onesManager.do">host</a>
        <div class="top-toolbar">
            <span><input type="radio" name="type" id="identity01">身份证正反面</span>
            <span><input type="radio" name="type" id="student01">学生证正反面</span>
            <span><input type="radio" name="type" id="other01">其他信息图片</span>
            <span><input type="radio" name="type" id="personal01">其他个人信息</span>
        </div>
        <div class="main-info">
            <div class="identity" id="identity">
                <form action="">
                    <div class="form-title">
                        <span><strong>身份证正反面</strong></span>
                    </div>
                    <div class="form-main">
                        <span>正面:</span> <span><input type="file" name="front"></span> <br/>
                        <span>反面:</span> <span><input type="file" name="reverse"></span><br/>
                        <span><button type="submit">提交</button></span><span><button type="reset">重置</button> </span>
                    </div>
                </form>
            </div>
            <div class="student" id="student" hidden="hidden">
                <form action="">
                    <div class="form-title">
                        <span><strong>学生证正反面</strong></span>
                    </div>
                    <div class="form-main">
                      <span>正面:</span> <span><input type="file" name="front"></span> <br/>
                      <span>反面:</span> <span><input type="file" name="reverse"></span><br/>
                      <span><button type="submit">提交</button></span><span><button type="reset">重置</button> </span>
                    </div>
                </form>
            </div>
            <div class="other" id="other" hidden="hidden">
                <form action="">
                    <div class="form-title">
                        <span><strong>其它图片</strong></span>
                    </div>
                    <div class="form-main">
                        <span>图片/照片:</span> <span><input type="file" name="front"></span> <br/>
                        <span><button type="submit">提交</button></span><span><button type="reset">重置</button> </span>
                    </div>
                </form>
            </div>
            <div class="personal" id="personal" hidden="hidden">
                <form action="">
                    <div class="form-title">
                        <span><strong>其他个人信息</strong></span>
                    </div>
                    <div class="form-main">
                        <span>身份证号:</span> <span><input type="text" name="identity"></span> <br/>
                        <span>手机号码:</span> <span><input type="text" name="cellphone"></span><br/>
                        <span>所在学校:</span> <span><input type="text" name="school"></span><br/>
                        <span>所在学院:</span> <span><input type="text" name="college"></span><br/>
                        <span><button type="submit">提交</button></span><span><button type="reset">重置</button> </span>
                    </div>
                </form>
            </div>
        </div>
    </div>
  <script type="text/javascript">
      $(function(){

          $(":radio").click(function(){

              var radio_01=document.getElementById("identity01").checked;
              var radio_02=document.getElementById("student01").checked;
              var radio_03=document.getElementById("other01").checked;
              var radio_04=document.getElementById("personal01").checked;
              var identity = $("#identity");
              var student = $("#student");
              var other = $("#other");
              var personal = $("#personal");
              if (radio_01==true) {
                  identity.show();
                  student.hide();
                  other.hide();
                  personal.hide();
              } else if (radio_02==true) {
                  identity.hide();
                  student.show();
                  other.hide();
                  personal.hide();
              } else if (radio_03==true) {
                  identity.hide();
                  student.hide();
                  other.show();
                  personal.hide();
              } else if (radio_04==true){
                  identity.hide();
                  student.hide();
                  other.hide();
                  personal.show();
              }
          });
      });
  </script>
  </body>
</html>
