<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="../header.jsp" %>
<%
	if(loginid != null){
		out.print("<script>alert('로그인이 되어 있습니다'); </script>");
		out.print("<script>location.href='../main.jsp';</script>");
	}
%>

	<div class="container">
    <div class="input-form-backgroud row">
      <div class="input-form col-md- mx-auto">
        <h4 class="mb-3">로그인</h4>
        <form action="../../controller/logincontroller.jsp" method="post">
          <div class="row">
            <div class="col-md-6 mb-3">
              <label for="name">아이디</label>
              <input type="text" class="form-control" id="name">
              <div class="invalid-feedback">
                아이디를 입력해주세요.
              </div>
            </div>
            <div class="col-md-6 mb-3">
              <label for="nickname">비밀번호</label>
              <input type="password" class="form-control" id="nickname">
              <div class="invalid-feedback">
                비밀번호를 입력해주세요.
              </div>
            </div>
          </div>
          <%
			String result=request.getParameter("result");
				if(result!=null){
			%>
			<div>
				<span> 회원정보가 올바르지 않습니다. </span>
			</div>
		<% } %>
          <div class="mb-4"></div>
          <button class="btn btn-primary btn-lg btn-block" type="submit">가입 완료</button>
        </form>
      </div>
    </div>
    <footer class="my-3 text-center text-small">
      <p class="mb-1">&copy; 2021</p>
    </footer>
  </div>
</body>
</html>